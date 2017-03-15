package com.project.todoapptest.util;

import android.support.test.espresso.IdlingResource;

/**
 * @author shaomiao
 * @Date 2017/3/15
 * @Time 10:49
 */

public class EspressoIdlingResource {

    private static final String RESOURCE = "GLOBAL";

    private static SimpleCountingIdlingResource mCountingIdlingResource =
            new SimpleCountingIdlingResource(RESOURCE);

    public static void increment() {
        mCountingIdlingResource.increment();
    }

    public static void decrement() {
        mCountingIdlingResource.decrement();
    }

    public static IdlingResource getIdlinResource() {
        return mCountingIdlingResource;
    }
}
