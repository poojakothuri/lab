/*
3.Case study : Tax fraud detection
Define package audit.
Include following functionalities as abstract methods in an interface.
abstract XXX taxChecker (XXX);
abstract XXX taxPaid(XXX);
abstract XXX homeExpenditure(XXX);
abstract XXX healthExpenditure(XXX);
abstract XXX vehicleExpenditure(XXX);
abstract XXX personalFamilyExpenditure(XXX);
abstract XXX miscellaneousExpenditure(XXX);
Inputs : all the above expenditures, TotalIncome and Taxpaid
He/She has to pay 10% of ( TotalIncome- (all other expenditures)) on mismatch
throw an exception as fraud and display message, how much he/she has to pay
*/

package audit;

public interface auditFunctions{
 String taxChecker () throws Exception;
 void taxPaid(double tax);
 void homeExpenditure(double homeExp);
 void healthExpenditure(double healthExp);
 void vehicleExpenditure(double vehicleExp);
void personalFamilyExpenditure(double personalExp);
 void miscellaneousExpenditure(double otherExp);
}