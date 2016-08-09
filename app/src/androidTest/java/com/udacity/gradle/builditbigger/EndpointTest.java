package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import org.junit.Test;

import java.util.concurrent.ExecutionException;

/**
 * Created by PadzMJ on 08/08/2016.
 */

public class EndpointTest extends AndroidTestCase{

    EndPointsAsyncTask endPointsAsyncTask;
    @Test
    public void verifyStringResponse() throws ExecutionException, InterruptedException {

        endPointsAsyncTask = new EndPointsAsyncTask();
        String testResult = endPointsAsyncTask.execute().get();

        assertNotNull(testResult);
    }

}
