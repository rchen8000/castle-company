"# castle-company" 


Solution:

•	Using two pointers: uptrend pointer and downtrend pointer. set both pointers to -1 initially.

•	uptrend pointer indicates the location of the land when current stretch of the land is greater than the previous stretch.

•	downtrend pointer indicates the location of the land when current stretch of the land is less than the previous stretch.

•	going through each stretch of the land literately and update the uptrend and downtrend pointer accordingly. 

•	After uptrend or downtrend pointer is updated, if uptrend pointer is greater than downtrend pointer, and downtrend pointer is not -1, then a valley castle can be built on the location of the downtrend pointer, if there’s no castle yet.

•	After uptrend or downtrend pointer is updated, if downtrend pointer is greater than uptrend pointer, and uptrend pointer is not -1, then a peak castle can be built on the location of the uptrend pointer, if there’s no castle yet.
