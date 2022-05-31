function emailCheck () {
    var emailStr=document.all.form1.tel.value;
    alert(emailStr);
    var emailPat=/^(.+)@(.+)$/;
    var matchArray=emailStr.match(emailPat);
    if (matchArray==null) {
        alert("电子邮件地址必须包括 ( @ 和 . )")
        return false;
    }
    return true;
}

function isPhone(phone) {
    var myreg=/^[1][3,4,5,6,7,8,9][0-9]{9}$/;
    if (!myreg.test(phone)) {
        return false;
    } else {
        return true;
    }
}