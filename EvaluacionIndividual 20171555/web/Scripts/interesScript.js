$(document).ready(function () {
    $("#myform").validate({
        rules: {
            cliente: "required",
            tasa: {
                min:1,
                max:10,
                required:true
            },

            capital: {
                min: 100,
                max: 500000,
                required: true
            },

            tiempo: {
                min: 2,
                max: 8,
                required: true
            }
        },
        
        messages:{
            cliente:" El cliente es requerido",
            tasa: " La tasa es requerida",
            capital: " El capital inicial es requerido",
            tiempo: "El tiempo es requerido"
        }
    });
});