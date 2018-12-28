package testcore.pages;

import agent.IAgent;
import central.Configuration;

import java.util.Map;

public class PaymentPage extends FullPage {

    public PaymentPage(Configuration conf, IAgent agent, Map<String, String> testData) throws Exception {
        super(conf, agent, testData);
        assertPageLoad();
    }

    @Override
    public String pageName()
    {
        return PaymentPage.class.getSimpleName();
    }

    public void makePayment() throws Exception{
        getControl("btnProceedToPayment").click();
        getControl("btnMakePayment").click();
        logger.info("Amount to be paid "+getControl("txtAmount").getText());
        getControl("txtCardNumber").enterText(getTestData().get("CardNumber"));
        getControl("txtCardMonth").enterText(getTestData().get("CardMonth"));
        getControl("txtCardYear").enterText(getTestData().get("CardYear"));
        getControl("btnPayNow").click();
    }
}