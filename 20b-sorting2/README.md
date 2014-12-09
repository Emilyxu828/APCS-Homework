<h2>Times for different sort methods:</h2>

<b>isort:</b>					<br>
real	0m0.064s			<br>
user	0m0.055s			<br>
sys	0m0.013s			<br>

<b>ssort:</b>					<br>
real	0m0.058s			<br>
user	0m0.050s			<br>
sys	0m0.008s			<br>

<b>bsort:</b>					<br>
real	0m0.056s			<br>
user	0m0.047s			<br>
sys	0m0.008s			<br>

<b>builtinsort:</b>				<br>
real	0m0.061s			<br>
user	0m0.050s			<br>
sys	0m0.011s			<br>

<h2>Conclusion:</h2>
bsort seems to be the most efficient method. I think this is because it only looks at two consecutive items and compares them, instead of going through the entire array and looking for a specific item or comparing items.
