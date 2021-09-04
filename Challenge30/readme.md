# Hashtables

Hashtables are a data structure that utilize key value pairs. This means every Node or Bucket has both a key, and a value.

## Challenge

Implement a Hashtable Class with the following methods:

1. add

    - Arguments: key, value
    - Returns: nothing
    - This method should hash the key, and add the key and value pair to the table, handling collisions as needed.

2. get

    - Arguments: key
    - Returns: Value associated with that key in the table

3. contains

    - Arguments: key
    - Returns: Boolean, indicating if the key exists in the table already.

4. hash

    - Arguments: key
    - Returns: Index in the collection for that key

## Approach & Efficiency

space complexity of O(n)
time  complexity of O(1)
