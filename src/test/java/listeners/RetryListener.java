package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer {
    private int count = 0;
    private int maxTry = 2;

    @Override
    public boolean retry(ITestResult iTestResult) {
        //Proverava da li je test pao
        if (!iTestResult.isSuccess()) {
            //Ukoliko je test pao, proverava se da li je ispunjen max broj pokusaja
            if (count < maxTry) {
                //Ukoliko je test pao, a broj pokusaja je manji od max
                count++;
                iTestResult.setStatus(ITestResult.FAILURE);
                return true;
            } else {
                //Ukoliko je test pao, a broj pokusaja nije manji od max
                iTestResult.setStatus(ITestResult.FAILURE);
            }
        } else {
            //Ukoliko je test prosao
            iTestResult.setStatus(ITestResult.SUCCESS);
        }
        return false;
    }


}
