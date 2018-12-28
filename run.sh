#!/bin/bash
mvn -Dplatform=DESKTOP_WEB -Dappium_url=http://127.0.0.1:13001/wd/hub -Dapp_browser_url="https://egov-micro-qa.egovernments.org/employee/user/login" -Dbrowser_bin_path=/usr/bin/google-chrome -Dbrowser_driver_path="/usr/bin/chromedriver" -Dbrowser="Chrome" -Dbrowser_resolution_width=1920 -Dbrowser_resolution_height=1080 -Dscreenshot_path="screenshots/" -Dtest="testcore.scenarios.ScriptFlows#approveTradeLicenseApprover" test