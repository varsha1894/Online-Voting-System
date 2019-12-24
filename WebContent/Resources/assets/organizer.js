
function pname() 
{
    var x = document.getElementById('f').value;
    var match= /^[a-zA-Z ]+$/;
    if (x == null || x == "") 
    {   
	    document.getElementById("demo").innerHTML="First Name must be filled out";
        return false;
    }
    else if (x.search(match)!=0 )
    {    
             document.getElementById("demo").innerHTML="Invalid Character"; 
              return false;
    }
    else if (x.length > 35) 
    {
       document.getElementById("demo").innerHTML="Enter less than 35 characters"; 
       return false;
    }
	else
  {
      document.getElementById("demo").innerHTML=null;
      return true;    
   }     
}
function org() 
{
    var x = document.getElementById('organisation').value;
    var match= /^[a-zA-Z0-9 ]+$/;
    if (x == null || x == "") 
    {   
	    document.getElementById("og").innerHTML="Organization must be filled out";
        return false;
    }
    else if (x.search(match)!=0 )
    {    
             document.getElementById("og").innerHTML="Invalid Character"; 
              return false;
    }
    else if (x.length > 35) 
    {
       document.getElementById("og").innerHTML="Enter less than 35 characters"; 
       return false;
    }
	else
  {
      document.getElementById("og").innerHTML=null;
      return true;    
   }     
}

function validateph()
{
  var x=document.getElementById('ph').value;
  var match=/^[0-9]+$/;

  if(x.search(match)!=0 )
  {
    document.getElementById("pph").innerHTML="It must have numbers only";
    return false;
        }
   else {
      document.getElementById("pph").innerHTML=null;
    
   }     
  
  if(x.length!=10)
  {
    document.getElementById("pph").innerHTML="It must contain number of length 10 ";
    return false;
        }
else {
      document.getElementById("pph").innerHTML=null;
    
   }     
}
function validatewebsite() 
{
    var x = document.getElementById('web').value;
    var match= /^[a-zA-Z0-9]+$/;
    if (x == null || x == "") 
    {   
	    document.getElementById("w").innerHTML="Organization must be filled out";
        return false;
    }
    else if (x.search(match)!=0 )
    {    
             document.getElementById("w").innerHTML="Invalid Character"; 
              return false;
    }
    else if (x.length > 35) 
    {
       document.getElementById("w").innerHTML="Enter less than 35 characters"; 
       return false;
    }
	else
  {
      document.getElementById("w").innerHTML=null;
      return true;    
   }     
}

function validate()
{
  var password = document.getElementById("txtpwd").value;
  var confirmpassword = document.getElementById("txtcpwd").value;
  if(password != confirmpassword)
	  {
	  document.getElementById("cpwd").innerHTML="*Password and confirm Password are different"; 
      return false;
	  }
  else
  { 
	  document.getElementById("cpwd").innerHTML=null;
       return true;
  }

}