xquery version "1.0";
declare copy-namespaces no-preserve, inherit;
<GOLD_Level_CUSTOMERS>{
    for $customer in doc("src/xquerysample/customer.xml")/customers/customer[level=1]
    return 
     <customer>
       {
            $customer/id,
            $customer/firstName,
            $customer/lastName,
            $customer/level,
            $customer/mobile,
            $customer/email,
            $customer/city,
            $customer/state,
            $customer/zip,
            $customer/allowUpgrade
       }  
     </customer>
}</GOLD_Level_CUSTOMERS>

