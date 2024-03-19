package com.bajaj;

public class Main {
    public static void main(String[] args) {

        ClientConfiguration clientConfig = new ClientConfiguration();

        GetBucketOperations bucketOps = new GetBucketOperations(clientConfig);

        bucketOps.getAllBucket();

    }
}