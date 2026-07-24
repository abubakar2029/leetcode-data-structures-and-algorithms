# Write your MySQL query statement below

SELECT A.product_id,
ROUND(
    IFNULL(
    SUM(A.price*B.units)/SUM(B.units),
        0
        ),  
    2
) as average_price 
FROM Prices as A
LEFT JOIN UnitsSold as B
ON A.product_id = B.product_id
AND B.purchase_date BETWEEN A.start_date AND A.end_date
GROUP BY A.product_id