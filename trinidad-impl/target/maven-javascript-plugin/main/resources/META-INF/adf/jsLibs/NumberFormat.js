function TrNumberFormat(a0)
{
if(!a0)
alert("type for TrNumberFormat not defined!");
this._type=a0;
this._pPre=getLocaleSymbols().getPositivePrefix();
this._pSuf=getLocaleSymbols().getPositiveSuffix();
this._nPre=getLocaleSymbols().getNegativePrefix();
this._nSuf=getLocaleSymbols().getNegativeSuffix();
this._maxFractionDigits=3;
this._maxIntegerDigits=40;
this._minFractionDigits=0;
this._minIntegerDigits=1;
this._groupingUsed=true;
}
TrNumberFormat.getNumberInstance=function()
{
return new TrNumberFormat("number");
}
TrNumberFormat.getCurrencyInstance=function()
{
return new TrNumberFormat("currency");
}
TrNumberFormat.getPercentInstance=function()
{
return new TrNumberFormat("percent");
}
TrNumberFormat.prototype.setGroupingUsed=function(a1)
{
this._groupingUsed=a1;
}
TrNumberFormat.prototype.isGroupingUsed=function()
{
return this._groupingUsed;
}
TrNumberFormat.prototype.setMaximumIntegerDigits=function(a2)
{
if(a2)
{
this._maxIntegerDigits=a2<0?0:a2;
if(this._minIntegerDigits>this._maxIntegerDigits)
{
this._minIntegerDigits=this._maxIntegerDigits;
}
}
}
TrNumberFormat.prototype.getMaximumIntegerDigits=function()
{
return this._maxIntegerDigits;
}
TrNumberFormat.prototype.setMaximumFractionDigits=function(a3)
{
if(a3)
{
this._maxFractionDigits=a3<0?0:a3;
if(this._maxFractionDigits<this._minFractionDigits)
{
this._minFractionDigits=this._maxFractionDigits;
}
}
}
TrNumberFormat.prototype.getMaximumFractionDigits=function()
{
return this._maxFractionDigits;
}
TrNumberFormat.prototype.setMinimumIntegerDigits=function(a4)
{
if(a4)
{
this._minIntegerDigits=a4<0?0:a4;
if(this._minIntegerDigits>this._maxIntegerDigits)
{
this._maxIntegerDigits=this._minIntegerDigits;
}
}
}
TrNumberFormat.prototype.getMinimumIntegerDigits=function()
{
return this._minIntegerDigits;
}
TrNumberFormat.prototype.setMinimumFractionDigits=function(a5)
{
if(a5)
{
this._minFractionDigits=a5<0?0:a5;
if(this._maxFractionDigits<this._minFractionDigits)
{
this._maxFractionDigits=this._minFractionDigits;
}
}
}
TrNumberFormat.prototype.getMinimumFractionDigits=function()
{
return this._minFractionDigits;
}
TrNumberFormat.prototype.format=function(a6)
{
if(this._type=="percent")
return this.percentageToString(a6);
else if(this._type=="currency")
return this.currencyToString(a6);
else if(this._type=="number")
return this.numberToString(a6);
}
TrNumberFormat.prototype.parse=function(a7)
{
if(this._type=="percent")
return this.stringToPercentage(a7);
else if(this._type=="currency")
return this.stringToCurrency(a7);
return this.stringToNumber(a7);
}
TrNumberFormat.prototype.stringToNumber=function(a8)
{
a8=parseFloat(a8);
if(isNaN(a8))
{
throw new TrParseException("not able to parse number");
}
return a8;
}
TrNumberFormat.prototype.stringToCurrency=function(a9)
{
var a10=a9.indexOf(this._nPre);
if(a10!=-1)
{
a9=a9.substr(this._nPre.length,a9.length);
var a11=a9.indexOf(this._nSuf);
if(a11!=-1)
{
a9=a9.substr(0,a9.length-this._nSuf.length);
return(parseFloat(a9)*-1);
}
else
{
throw new TrParseException("not able to parse number");
}
}
else
{
var a12=a9.indexOf(this._pPre);
if(a12!=-1)
{
a9=a9.substr(this._pPre.length,a9.length);
var a13=a9.indexOf(this._pSuf);
if(a13!=-1)
{
a9=a9.substr(0,a9.length-this._pSuf.length);
a9=parseFloat(a9);
}
else
{
throw new TrParseException("not able to parse number");
}
return a9;
}
else
{
throw new TrParseException("not able to parse number");
}
}
}
TrNumberFormat.prototype.stringToPercentage=function(a14)
{
var a15=(a14.indexOf('%')!=-1);
var a16=a14.replace(/\%/g,'');
a16=parseFloat(a16);
if(!a15||isNaN(a16))
{
throw new TrParseException("not able to parse number");
}
return a16;
}
TrNumberFormat.prototype.numberToString=function(a17)
{
var a18=a17<0;
if(a18)
a17=(a17*-1);
var a19=a17+"";
var a20=a19.indexOf(".");
var a21=a19.length;
var a22;
var a23;
if(a20!=-1)
{
a22=a19.substring(0,a20);
a23=a19.substring(a20+1,a21);
}
else
{
a22=a19;
a23="";
}
a22=this._formatIntegers(a22);
a23=this._formatFractions(a23)
var a24=getLocaleSymbols().getDecimalSeparator();
if(a23!="")
a19=(a22+a24+a23);
else
a19=(a22);
if(a18)
a19="-"+a19;
return a19;
}
TrNumberFormat.prototype.currencyToString=function(a25)
{
if(a25<0)
{
a25=(a25*-1)+"";
a25=this.numberToString(a25);
return this._nPre+a25+this._nSuf;
}
else
{
a25=this.numberToString(a25);
return this._pPre+a25+this._pSuf;
}
}
TrNumberFormat.prototype.percentageToString=function(a26)
{
a26=a26*100;
a26=this.getRounded(a26);
if(isNaN(a26))
{
throw new TrParseException("not able to parse number");
}
var a27=getLocaleSymbols().getPercentSuffix();
if(!a27||a27=="")
{
throw new TrParseException("percent suffix undefined or empty");
}
a26=this.numberToString(a26);
return a26+a27;
}
TrNumberFormat.prototype.getRounded=function(a28)
{
a28=this.moveDecimalRight(a28);
a28=Math.round(a28);
a28=this.moveDecimalLeft(a28);
return a28;
}
TrNumberFormat.prototype.moveDecimalRight=function(a29)
{
var a30='';
a30=this.moveDecimal(a29,false);
return a30;
}
TrNumberFormat.prototype.moveDecimalLeft=function(a31)
{
var a32='';
a32=this.moveDecimal(a31,true);
return a32;
}
TrNumberFormat.prototype.moveDecimal=function(a33,a34)
{
var a35='';
a35=this.moveDecimalAsString(a33,a34);
return parseFloat(a35);
}
TrNumberFormat.prototype.moveDecimalAsString=function(a36,a37)
{
var a38=2;
if(a38<=0)
return a36;
var a39=a36+'';
var a40=this.getZeros(a38);
var a41=new RegExp('([0-9.]+)');
if(a37)
{
a39=a39.replace(a41,a40+'$1');
var a42=new RegExp('(-?)([0-9]*)([0-9]{'+a38+'})(\\.?)');
a39=a39.replace(a42,'$1$2.$3');
}
else
{
var a43=a41.exec(a39);
if(a43!=null)
{
a39=a39.substring(0,a43.index)+a43[1]+a40+a39.substring(a43.index+a43[0].length);
}
var a42=new RegExp('(-?)([0-9]*)(\\.?)([0-9]{'+a38+'})');
a39=a39.replace(a42,'$1$2$4.');
}
a39=a39.replace(/\.$/,'');
return a39;
}
TrNumberFormat.prototype.getZeros=function(a44)
{
var a45='';
var a46;
for(a46=0;a46<a44;a46++){
a45+='0';
}
return a45;
}
TrNumberFormat.prototype._formatIntegers=function(a47)
{
var a48=a47.length;
var a49=this.getMaximumIntegerDigits();
var a50=this.getMinimumIntegerDigits();
var a51;
if(a48>a49)
{
a51=a48-a49;
a47=a47.substring(a51,a48);
}
else if(a48<a50)
{
a51=a50-a48;
var a52="";
while(a51>0)
{
a52="0"+a52;
--a51;
}
a47=a52+a47;
}
if(this.isGroupingUsed())
{
a47=this._addGroupingSeparators(a47);
}
return a47;
}
TrNumberFormat.prototype._formatFractions=function(a53)
{
var a54=a53.length;
var a55=this.getMaximumFractionDigits();
var a56=this.getMinimumFractionDigits();
if(a54>a55&&a55>a56)
{
a53=a53.substring(0,a55);
}
if(a54<a56)
{
var a57=a56-a54;
while(a57>0)
{
a53=a53+"0";
--a57;
}
}
return a53;
}
TrNumberFormat.prototype._addGroupingSeparators=function(a58)
{
var a59=a58.length;
var a60=a59%3;
var a61;
var a62;
var a63="";
if(a60>0)
{
a61=a58.substring(0,a60);
a62=a58.substring(a60,a59);
}
else
{
a61="";
a62=a58;
}
var a64=getLocaleSymbols().getGroupingSeparator();
for(i=0;i<a62.length;i++)
{
if(i%3==0&&i!=0)
{
a63+=a64;
}
a63+=a62.charAt(i);
}
a58=a61+a63;
return a58;
}
function TrParseException(
a0
)
{
this._message=a0;
}
TrParseException.prototype.getMessage=function()
{
return this._message;
}
