package com.bajaj;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class ClientConfiguration {

    private AmazonS3 amazonS3;
    public ClientConfiguration(){
        amazonS3 = AmazonS3ClientBuilder.standard().withRegion(Regions.DEFAULT_REGION).build();
    }

    public AmazonS3 getS3Client() {
        return amazonS3;
    }
}
