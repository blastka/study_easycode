package com.example.myapplication2.Java.lesson25Example2;

public class Solution {
    CachedDataSource cache = new CachedDataSource();
    CloudDataSource cloud = new CloudDataSource();
    Repository repository = new Repository(cache, cloud);
}
