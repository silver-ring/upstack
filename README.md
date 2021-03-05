# Problem Description

Given an  stream of integers as input , convert into a format as below, basically for the repeating integers we are replace it with the format <INTEGER> FOR <NUMBER OF OCCURRENCE>
Please note the sequence is very important . Prefer this to be done in a functional way using Java.

| Input  | Output |
|:-------|:-------|
| 2,2,0,0,0,0,0,1 | 2 FOR 2 0 FOR 5 1 |
| 1,1,1,1,1,0 | 1 for 5  0 |
| 1,2,3,4,6,5,5,5,5,5,5,5,5,5,5 | 1 2 3 4 6 5 for 10 |


# Solution Description

Solution is based on the divide and concert concept by splitting the problem to sub problems and marge the result, by using this approach complexity drop from (n) to (logn)


# Run the solution
project based on gradle so you can run the project using normal gradle commands as following
```
gradlew clean test
```
