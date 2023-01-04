/**
 * 
 */

 function verification(){
	var name = document.forms.memRegistration.uname;
	var email = document.forms.memRegistration.email;
    var password = document.forms.memRegistration.password;
    const regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[-+_!@#$%^&*., ?]).+$/;
    if(name.value == null || name.value == ""){
		window.alert("Username is empty");
		name.focus();
		return false;
	}
	else if(password.value.length <= 8){
		window.alert("Password length is small.\nPassword should be atleast of 8 characters.");
		password.focus();
		return false;
	}
	else if(email.value == null || email.value == ""){
		window.alert("please enter email");
		email.focus();
		return false;
	}
	
	else if(regex.test(password.value)){
		window.alert("Password should contain 1 uppercase, 1 lowercase and 1 specail character..");
		password.focus();
		return false;
	}
	else{
    	return true;
	}
}