xquery version "1.0";
declare copy-namespaces no-preserve, inherit;
<SORTED_CUSTOMER_LIST>
{
	for $customer in doc("src/xquerysample/customer.xml")/customers/customer
	order by $customer/lastName/text() ascending (:descending :)
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
}</SORTED_CUSTOMER_LIST>