saveContact = function(){
    let data = {
        email: $("#email").val() ,
        name: $("#name").val(),
        subject: $("#subject").val(),
        message: $("#message").val()
    }
    $.ajax({
        url: "/contact-ajax",
        type: "post",
        contentType: "application/json",
        data: JSON.stringify(data),
        dataType: "json",
        success: function(jsonResult) {
          //  alert(jsonResult.code + " _ " + jsonResult.successMessage);
            $("#successMessage").html(jsonResult.successMessage);
        },
        error: function(jqXhr, textStatus, errorMessage) {
            //error callback
        }
    });
    
}

