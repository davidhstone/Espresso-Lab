package ly.generalassemb.espresso;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasErrorText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withChild;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import android.app.Application;
import android.support.test.espresso.Espresso;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)

/**
 * Created by davidstone on 7/21/16.
 */
public class MyTests  {



    @Rule
    public ActivityTestRule<BalanceActivity> mActivityTestRule =
            new ActivityTestRule<BalanceActivity>(BalanceActivity.class);

   @Test
   public void testCurrentBalanceDisplayed() throws Exception {
       onView(withId(R.id.balanceTextView))
               .check(matches(isDisplayed()));
   }
//
   @Test
   public void testWithdrawWorks() throws Exception {
       String testWithdrawDescription = "Wat";
       String testWithdrawValue1 = "5.25";
       //  String testWithdrawValue2 = "1.25";
       String expectedBalance = "-$5.25";
//
       //  onView(withId(R.id.balanceTextView))
       //          .perform(clearText());
       //  onView(withId(R.id.balanceTextView))
       //          .perform(typeText(testWithdrawValue1));
       onView(withId(R.id.newTransactionButton))
               .perform(click());
       onView(withId(R.id.descriptionEditText))
               .perform(typeText(testWithdrawDescription));
       onView(withId(R.id.amountEditText))
               .perform(typeText(testWithdrawValue1));
       //  onView(withId(R.id.amountEditText))
       //          .perform(typeText(testWithdrawValue2));
       onView(withId(R.id.withdrawButton))
               .perform(click());
       onView(withId(R.id.balanceTextView))
               .check(matches(withText(expectedBalance)));
   }
//
//
//now do something for the next view in the process of making a withdrawal
//
       //onView(withId(R.id.balanceTextView));
//
       @Test
       public void testDepositWorks() throws Exception {
           String testDepositDescription = "Wat";
           String testDepositValue = "5.25";
           String expectedBalance = "$5.25";
//
           onView(withId(R.id.newTransactionButton))
                   .perform(click());
           onView(withId(R.id.descriptionEditText))
                   .perform(typeText(testDepositDescription));
           onView(withId(R.id.amountEditText))
                   .perform(typeText(testDepositValue));
           onView(withId(R.id.depositButton))
                   .perform(click());
           onView(withId(R.id.balanceTextView))
                   .check(matches(withText(expectedBalance)));

       }
        @Test
        public void testBackToBackDepositWithdrawal() throws Exception {
            String testDepositDescription = "Wat";
            String testWithdrawDescription = "Hey";
            String testDepositValue = "5.25";
            String testWithdrawValue = "1.00";
            String expectedBalance1 = "$5.25";
            String expectedBalance2 = "$4.25";

            onView(withId(R.id.newTransactionButton))
                    .perform(click());
            onView(withId(R.id.descriptionEditText))
                    .perform(typeText(testDepositDescription));
            onView(withId(R.id.amountEditText))
                    .perform(typeText(testDepositValue));
            onView(withId(R.id.depositButton))
                    .perform(click());
            onView(withId(R.id.balanceTextView))
                    .check(matches(withText(expectedBalance1)));

            onView(withId(R.id.newTransactionButton))
                    .perform(click());
            onView(withId(R.id.descriptionEditText))
                    .perform(typeText(testWithdrawDescription));
            onView(withId(R.id.amountEditText))
                    .perform(typeText(testWithdrawValue));
            onView(withId(R.id.withdrawButton))
                    .perform(click());
            onView(withId(R.id.balanceTextView))
                    .check(matches(withText(expectedBalance2)));

        }
    }

