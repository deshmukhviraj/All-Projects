$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/Personal_Car_Loan3.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# 06.Data driven test in Cucumber with Multi data table"
    }
  ],
  "line": 2,
  "name": "Calculate EMI for Home loan, Car loan and Personal loan",
  "description": "",
  "id": "calculate-emi-for-home-loan,-car-loan-and-personal-loan",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Calculate EMI for Personal and Car loan",
  "description": "",
  "id": "calculate-emi-for-home-loan,-car-loan-and-personal-loan;calculate-emi-for-personal-and-car-loan",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on the Emi calculator page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on the Personal Loan tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters Personal_Loan_Amount and Personal_Interest_Rate and Personal_Loan_Tenure",
  "rows": [
    {
      "cells": [
        "Personal_Loan_Amount",
        "Personal_Interest_Rate",
        "Personal_Loan_Tenure"
      ],
      "line": 8
    },
    {
      "cells": [
        "1000000",
        "7.5",
        "08"
      ],
      "line": 9
    },
    {
      "cells": [
        "2000000",
        "8.5",
        "09"
      ],
      "line": 10
    },
    {
      "cells": [
        "4000000",
        "9.5",
        "10"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "clicks Enter",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Loan EMI is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Total Interest Payable is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Total Payment is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User clicks on the Car Loan tab",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User enters Car_Loan_Amount and Car_Interest_Rate and Car_Loan_Tenure",
  "rows": [
    {
      "cells": [
        "Car_Loan_Amount",
        "Car_Interest_Rate",
        "Car_Loan_Tenure"
      ],
      "line": 20
    },
    {
      "cells": [
        "1000000",
        "16.5",
        "08"
      ],
      "line": 21
    },
    {
      "cells": [
        "2000000",
        "17.5",
        "10"
      ],
      "line": 22
    },
    {
      "cells": [
        "4000000",
        "18.5",
        "12"
      ],
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "clicks Enter",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Car Loan EMI is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Car Interest Payable is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Car Payment is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "HomeLoanSteps.user_is_already_on_the_Emi_calculator_page()"
});
formatter.result({
  "duration": 5434433700,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoanSteps.user_clicks_on_the_Personal_Loan_tab()"
});
formatter.result({
  "duration": 108624500,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoanSteps.user_enters_Personal_Loan_Amount_and_Personal_Interest_Rate_and_Personal_Loan_Tenure(DataTable)"
});
formatter.result({
  "duration": 1823325700,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoanSteps.clicks_Enter()"
});
formatter.result({
  "duration": 34858300,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoanSteps.loan_EMI_is_displayed()"
});
formatter.result({
  "duration": 89065600,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoanSteps.total_Interest_Payable_is_displayed()"
});
formatter.result({
  "duration": 31158800,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoanSteps.total_Payment_is_displayed()"
});
formatter.result({
  "duration": 26115600,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoanSteps.user_clicks_on_the_Car_Loan_tab()"
});
formatter.result({
  "duration": 67869800,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoanSteps.user_enters_Car_Loan_Amount_and_Car_Interest_Rate_and_Car_Loan_Tenure(DataTable)"
});
formatter.result({
  "duration": 1729312900,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoanSteps.clicks_Enter()"
});
formatter.result({
  "duration": 36140300,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoanSteps.car_Loan_EMI_is_displayed()"
});
formatter.result({
  "duration": 90692700,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoanSteps.car_Interest_Payable_is_displayed()"
});
formatter.result({
  "duration": 20187800,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoanSteps.car_Payment_is_displayed()"
});
formatter.result({
  "duration": 151336300,
  "status": "passed"
});
});