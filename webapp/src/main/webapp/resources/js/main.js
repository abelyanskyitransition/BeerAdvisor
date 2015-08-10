/**
 * Created by Alexander Beliansky.
 */
var table;

$(function () {
    initUIBtns();
    $('[name=color]').selectmenu();
    $('[name=price]').selectmenu();
});

var initUIBtns = function () {
    $('button')
        .button()
        .click(function (event) {
            event.preventDefault();
        });
};

var getAdvise = function () {
    var color = $('[name=color]').eq(0).val();
    var price = $('[name=price]').eq(0).val();

    $.ajax({
        type: 'post',
        url: 'service/brands',
        data: JSON.stringify({color: color, price: price}),
        contentType: 'application/json',
        cache: false,
        success: function (data) {
            initAdviseTable(data);
            showResultDlg();
        }
    });
};

var initAdviseTable = function(data) {
    table = $('#brands').DataTable({
        "data":data,
        "columns": [
            {"data": "name"},
            {"data": "color"},
            {"data": "price"}
        ]
    });
};

var showResultDlg = function () {
    $("#dialog").dialog({width: 1000, close: function( event, ui ) {table.destroy()}});
};