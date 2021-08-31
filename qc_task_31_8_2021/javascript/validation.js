function login()
	{
		var name = document.getElementById("name").value;
        var email = document.getElementById("email").value;
        var mobileNo = document.getElementById("mobileNo").value;
		var pwd1 = document.getElementById("pwd1").value;
        var pwd2 = document.getElementById("pwd2").value;
		var mailFormat = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
        var pFormat= /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{7,15}$/;
        var mobileNoFormat= /^[0-9]{10}$/;
		if(name =='')
		{
			alert("please enter the name.");
		}
        else if(email=='')
		{
        	alert("enter the email id");
		}
        else if(mobileNo=='')
		{
        	alert("enter the mobile No");
		}
		else if(pwd1=='')
		{
        	alert("enter the password");
		}
        else if(pwd2=='')
		{
        	alert("re enter the password");
		}
        else if(pwd1!=pwd2)
		{
        	alert("Password not matching");
		}
        else if(!mobileNo.match(mobileNoFormat))
		{
        	alert("Invalid Mobile Number ");
		}
        else if(!pwd1.match(pFormat))
		{
        	alert("Invalid password .It Must contail 1 lowercase 1 uppercase, 1 numeric,\n at least one special character and must be eight characters or longer" );
		}
        else if(!email.match(mailFormat))
		{
        	alert("Invalid email id " );
		}
		else
		{
	        alert("New Account Created ");
		}
	}	
	