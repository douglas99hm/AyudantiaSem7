$(document).ready(function(){
    $("#myform").validate({
        rules: {
            nombre:'required',
            apellido:'required',
            edad:{
                required:true,
                min:18,
                max:100
            },
            cargo:'required',
            salario:{
                required:true,
                min:300,
                max:5000
            }
        
            
        }

        
    });
});


