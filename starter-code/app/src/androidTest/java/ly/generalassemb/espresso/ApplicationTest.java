package ly.generalassemb.espresso;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import static android.support.test.espresso.Espresso.onView;

import android.app.Application;
import android.test.ApplicationTestCase;

import android.support.test.espresso.Espresso;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasErrorText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

//@RunWith(AndroidJUnit4.class)


/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
//public class ApplicationTest extends ApplicationTestCase<Application> {
//    public ApplicationTest() {
//        super(Application.class);
//    }
//
//    @Rule
//    public ActivityTestRule<BalanceActivity> mainActivityActivityTestRule =
//            new ActivityTestRule<BalanceActivity>(BalanceActivity.class);
//
//    @Test
//    public void testCurrentBalanceDisplayed() throws Exception {
//        onView(withId(R.id.balanceTextView))
//                .check(matches(isDisplayed()));
//    }
//
//    @Test
//    public void testWithdrawWorks() throws Exception {
//        String testWithdrawDescription = "Wat";
//        String testWithdrawValue1 = "5.25";
//        String testWithdrawValue2 = "1.25";
//        String expectedBalance = "$4.00";
//
//        //onView(withId(R.id.balanceTextView))
//        //        .perform(clearText());
//        //onView(withId(R.id.balanceTextView))
//        //        .perform(typeText(testWithdrawValue1));
//        onView(withId(R.id.newTransactionButton))
//                .perform(click());
//        onView(withId(R.id.descriptionEditText))
//                .perform(typeText(testWithdrawDescription));
//        onView(withId(R.id.amountEditText))
//                .perform(typeText(testWithdrawValue2));
//        onView(withId(R.id.withdrawButton))
//                .perform(click());
//        onView(withId(R.id.balanceTextView))
//                .check(matches(withText(expectedBalance)));
//
//
////now do something for the next view in the process of making a withdrawal
//
//        //onView(withId(R.id.balanceTextView));
//    }
//
//
//}