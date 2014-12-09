Times for different sort methods:

isort:					\n
real	0m0.064s			\n
user	0m0.055s			\n
sys	0m0.013s			\n

ssort:					\n
real	0m0.058s			\n
user	0m0.050s			\n
sys	0m0.008s			\n

bsort:					\n
real	0m0.056s			\n
user	0m0.047s			\n
sys	0m0.008s			\n

builtinsort:				\n
real	0m0.061s			\n
user	0m0.050s			\n
sys	0m0.011s			\n

bsort seems to be the most efficient method. I think this is because it only looks at two consecutive items and compares them, instead of going through the entire array and looking for a specific item or comparing items.
