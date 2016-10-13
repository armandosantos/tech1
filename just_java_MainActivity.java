package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int global_quantity = 0;
    String customer_name = "Patrick Star";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = calculatePrice();
        displayMessage(createOrderSummary(price, OrderButtonClicked(view),
                ChocolateClicked(view), getText(view)));
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.order_summary_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        global_quantity += 1;
        display(global_quantity);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        global_quantity -= 1;
        display(global_quantity);
    }

    /**
     * This method displays messages on the screen.
     */
    private void displayMessage(String message) {
        /**
         * Should pass a string by reference.
         */
        TextView priceTextView = (TextView) findViewById(R.id.order_summary_text_view);
        priceTextView.setText(message);
    }

    /**
     * This method calculates the price of the coffee order based on @quantity.
     */
    private int calculatePrice() {
        return global_quantity * 5;
    }

    /**
     * This method creates a summary of everything I did in the app.
     */
    private String createOrderSummary(int priceOfTheOrder, boolean hasWhippedCream,
                                      boolean hasChocolate, String customer_name) {
        String message = "Name: " + customer_name
                + "\nAdd whipped cream? " + hasWhippedCream
                + "\nAdd chocolate?" + hasChocolate
                + "\nQuantity: " + global_quantity
                + "\nTotal: $" + priceOfTheOrder
                + "\nThank you!";
        return message;
    }

    public boolean OrderButtonClicked(View view) {
        CheckBox checkbox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        boolean boxIsChecked = checkbox.isChecked();
        Log.i("" + boxIsChecked, "OrderButtonClicked");
        return boxIsChecked;
    }

    public boolean ChocolateClicked(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        boolean boxIsChecked = checkBox.isChecked();
        Log.i("" + boxIsChecked, "ChocolateButton");
        return boxIsChecked;
    }

    public String getText(View view) {
        EditText nameEditText = (EditText) findViewById(R.id.edit_text);
        return nameEditText.getText().toString();
    }
}