$(document).ready(function () {
    var addressId;
    $("[name='changeAddr']").click(function () {
        $("#update-addr").modal({
            backdrop: 'static'
        });

        $("#name").val($(this).parents("#parent").find("#conname").text());
        $("#telephone").val($(this).parents("#parent").find("#contel").text());
        $("#detailaddress").val($(this).parents("#parent").find("#detailaddr").text());
        addressId = $(this).parents("#parent").find("#table").attr("address-id");

    });


    $("#saveAddr").click(function () {
        var saveAddr = {};
        saveAddr.addressid = addressId;
        saveAddr.province = $("#provinceUpdate").val();
        saveAddr.city = $("#cityUpdate").val();
        saveAddr.county = $("#countyUpdate").val();
        saveAddr.detailaddr = $("#detailaddress").val();
        saveAddr.conname = $("#name").val();
        saveAddr.contel = $("#telephone").val();

        $.ajax({
            type: "POST",
            url: "/saveAddr",
            contentType: "application/x-www-form-urlencoded; charset=utf-8",
            data: saveAddr,
            dateType: "json",
            success: function (result) {
                if (result.msg == "更新失败") {
                    swal(result.msg);
                }
                else {
                    $("#update-info").modal('hide');
                    swal("修改成功", "", "success");
                    $("button").click(function () {
                        location.reload();
                    });
                }
            },
            error: function () {
                alert("更新失败");
            }
        });
    });

    $("[name='deleteAddr']").click(function () {
        addressId = $(this).parents("#parent").find("#table").attr("address-id");
        var address = {};
        address.addressid = addressId;
        $.ajax({
            type: "POST",
            url: "/deleteAddr",
            contentType: "application/x-www-form-urlencoded; charset=utf-8",
            data: address,
            dateType: "json",
            success: function (result) {
                swal(result.msg);
                $("button").click(function () {
                    location.reload();
                });
            },
            error: function () {
                alert("删除失败");
            }
        });
    });

    $("[name='insertAddr']").click(function () {
        $("#insert-addr").modal({
            backdrop: 'static'
        });
    });

    $("#insertAddr").click(function () {
        var insertAddr = {};
        insertAddr.addressid = {};
        insertAddr.userid = {};
        insertAddr.province = $("#provinceInsert").val();
        insertAddr.city = $("#cityInsert").val();
        insertAddr.county = $("#countyInsert").val();
        insertAddr.detailaddr = $("#detailaddressInsert").val();
        insertAddr.conname = $("#nameInsert").val();
        insertAddr.contel = $("#telephoneInsert").val();
        $.ajax({
            type: "POST",
            url: "/insertAddr",
            contentType: "application/x-www-form-urlencoded; charset=utf-8",
            data: insertAddr,
            dataType: "json",
            success: function (result) {
                swal(result.msg);
                $("button").click(function () {
                    location.reload();
                });
            },
            error: function () {
               alert("添加失败");
            }
        });
    });
});