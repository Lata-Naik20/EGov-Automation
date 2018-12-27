package testcore.scenarios;


import org.testng.annotations.Test;
import testcore.pages.HomePage;
import testcore.pages.PropertyTax;

public class ScriptFlows extends SupportTest {

    @Test
    public void createTradeLicenseCitizen() throws Exception{
        logger.debug(this.getTestStartInfoMessage("testScript"));
        home.loginCitizen()
                .navigateToTradeLicense()
                .applyTradeLicense()
                .fillTradeLicenseForm()
                .makePayment();
    }

    @Test
    public void fileComplaintCitizen() throws Exception{
        logger.debug(this.getTestStartInfoMessage("fileComplaintCitizen"));
        home.loginCitizen()
                .navigateToComplaints()
                .createComplaint()
                .isComplaintRegistered();
    }

    @Test
    public void assignComplaintGRO() throws Exception{
        logger.debug(this.getTestStartInfoMessage("assignComplaintGRO"));
        home.loginEmployee()
                .navigateToComplaints()
                .assignComplaintToLME()
                .isComplaintAssigned();
    }

    @Test
    public void resolveComplaintLME() throws Exception{
        logger.debug(this.getTestStartInfoMessage("resolveComplaintLME"));
        home.loginEmployee()
                .navigateToComplaints()
                .searchAndResolveComplaint()
                .isComplaintResolved();
    }

    @Test
    public void rejectComplaintGRO() throws Exception{
        logger.debug(this.getTestStartInfoMessage("rejectComplaintGRO"));
        home.loginEmployee()
                .navigateToComplaints()
                .rejectComplaint()
                .isComplaintRejected();
    }

    @Test
    public void createPropertyTaxCitizen() throws Exception{
        logger.debug(this.getTestStartInfoMessage("createPropertyTaxCitizen"));
        home.loginCitizen()
                .navigateToPropertyTax()
                .applyPropertyTaxCitizen()
                .fillPropertyTaxForm()
                .PTmakePayment()
                .getDataAfterPaymentSucessfull();
        Thread.sleep(9000);



    }

}