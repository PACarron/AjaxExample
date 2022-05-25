
function test(){
    var data = [1, 2, 3];
    var url = "/testcontroller/toto";

    $.ajax({
      type: "POST",
      url: url,
      data: JSON.stringify(data),
      contentType: "application/json",
      dataType: "json",
      success: true
    });
}