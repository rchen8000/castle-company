# castle-company

Let’s say you have an array of integers that describes a stretch of land, where each integer represents the

current height of the land. Can you write a function that reads that array and returns the number of

castles that Aequilibrium should build on that stretch of land? You can write this solution in whatever

language you like.


You can make the following assumptions:

● You can always build a castle at the start of the array, provided it is non-empty

● We only want to build one castle per peak or valley.

● A peak is an integer or series of integers that is above the immediately preceding and following

ints. For example, in the sequence [2,6,6,6,3] the sequence of 3 6s is a peak.

● A valley is an integer or series of integers that is below the immediately preceding and

following ints. For example, in the sequence [6,1,4] the "1" would be a valley.

==================================================

Solution:

•	Using two pointers: uptrend pointer and downtrend pointer. set both pointers to -1 initially.

•	uptrend pointer indicates the location of the land when current stretch of the land is greater than the previous stretch.

•	downtrend pointer indicates the location of the land when current stretch of the land is less than the previous stretch.

•	going through each stretch of the land literately and update the uptrend and downtrend pointer accordingly. 

•	After uptrend or downtrend pointer is updated, if uptrend pointer is greater than downtrend pointer, and downtrend pointer is not -1, then a valley castle can be built on the location of the downtrend pointer, if there’s no castle yet.

•	After uptrend or downtrend pointer is updated, if downtrend pointer is greater than uptrend pointer, and uptrend pointer is not -1, then a peak castle can be built on the location of the uptrend pointer, if there’s no castle yet.
