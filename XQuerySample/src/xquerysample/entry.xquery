xquery version "1.0";
declare copy-namespaces no-preserve, inherit;
<ENTRY_LEVEL_CUSTOMERS>{
    for $customer in doc("src/xquerysample/customer.xml")/customers/customer[level=0]
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
}</ENTRY_LEVEL_CUSTOMERS>

