# tools-of-wizardry
This is a library project. It is supposed to offer all the logic for a "Tools of Wizardy"-App.
"Tools of Wizardry" strives to become a helpful Tool for Wizards in RPG-Games like 
Pathfinder or Dungeons &amp; Dragons. So far, the library contains the following features:

1. a Sacred Geometry solver
2. an Arithmancy solver
3. a few Util-classes like DiceUtil or PermutationUtil

### Sacred Geometry solver

Sacred Geometry is a feat designed in a Pathfinder campaign, you might find a 
description [here](http://www.d20pfsrd.com/feats/general-feats/sacred-geometry). 
The game mechanics are pretty flawed, however from a computational point of view,
it is very interesting to find a correct and efficient algorithm. 

All algorithms for solving this problem I know of are brute force algorithms. 
This one is no different, it is a recursive brute force algorithm. 
At first, I order the values and build all unique pairs within the values. 
For each pair, I execute a relevant operation, reduce the n values to n-1 values 
and repeat recursively, e.g.:

- values: (1, 1, 2, 5)
- all pairs: (1, 1), (1, 2), (1, 5), (2, 5)
- execute algebraic operations recursively:
    - addition on (1, 1) leads to (2, 2, 5)
    - multiplication on (2, 5) leads to (2, 10)
    - subtraction on (2, 10) leads to (8).
    
The recursion stops when no pairs can be built. You might notice that for 
more elements the recursion tree grows exponentially which makes determining
of the result slow and slower.

However, there are a few optimizations.

##### Optimization 1: Precalculation of Failures
 
Failures are precalculated and stored in the code (look for [FailureResultSets](./src/main/java/de/rge/data/FailureResultSets.java)). 
For a higher number of values the number of failures at any spell level reduce very fast, 
therefore it is feasible to store these failures. The failures help us
to tighten the recursion tree.

Alternatively, instead of precalculating I could implement kind of dynamic programming
algorithm where failures are kept in memory. 

##### Optimization 2: Heuristic choice of pair combinations

I have noticed that the number 3 is the backbone of any minimal solution.
Therefore, if a pair sums up to 3 I give it higher  priority than other pairs.

##### Optimization 3: Heuristic choice of algebraic operations

I have implemented a heuristic choice of algebraic operations.
 1. prioritize multiplication over addition 
    if the sum is less than the lowest target and
    sum is less than the product. 
 2. allow subtraction for a twin pair, e.g. (3,3) only, if there is no 0 in the values yet
 3. allow divison for a pair if there is no division by zero and the values are dividable without a residual.

### Arithmancy solver

Arithmancy is another feat designed in a Pathfinder campaign, again you might find a
description [here](http://www.d20pfsrd.com/feats/general-feats/arithmancy).
The computational algorithm is very straight forward and I don't think 
that I have to add any further information.

### Util-classes

So far, there were 3 util-classes introduced:
1. DiceUtil
2. PermutationUtil
3. FileUtil

All of the util-classes are very basic and hopefully self-explanatory.
The PermutationUtil is helpful for creating all combinations 
in the performance test or for determining a permutation regarding the the failure sets.

