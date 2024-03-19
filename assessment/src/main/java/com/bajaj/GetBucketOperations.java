package com.bajaj;

import com.amazonaws.services.s3.model.Bucket;

import java.util.List;

public class GetBucketOperations {

    private ClientConfiguration clientConfiguration;


    public GetBucketOperations(ClientConfiguration clientConfiguration) {
        this.clientConfiguration = clientConfiguration;
    }

    public void getAllBucket() {
        List<Bucket> bucketList = this.clientConfiguration.getS3Client().listBuckets();
        bucketList.forEach((bucket) -> {
            System.out.println(bucket);
        });

    }

}
