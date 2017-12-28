package com.binktec.sprint;


import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.binktec.sprint.auth.AuthActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class LoginUiTest {
    @Rule public ActivityTestRule<AuthActivity> login = new ActivityTestRule<>(AuthActivity.class);

    @Test public void viewTest(){
       onView(withText("Username")).check(ViewAssertions.matches(isDisplayed()));
       onView(withText("Password")).check(ViewAssertions.matches(isDisplayed()));
    }

    @Test public void checkInvalidInput() {

    }
}
