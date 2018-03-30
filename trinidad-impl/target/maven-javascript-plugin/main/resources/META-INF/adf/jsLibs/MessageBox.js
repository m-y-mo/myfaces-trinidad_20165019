TrMessageBox._registerMessageBox=function(a0)
{
if(!TrMessageBox._MESSAGE_BOX)
TrMessageBox._MESSAGE_BOX=new TrMessageBox(a0);
}
TrMessageBox.addMessage=function(a1,a2,a3)
{
var a4=TrMessageBox._MESSAGE_BOX;
if(!a4)
return;
a4.addMessage(a1,a2,a3);
}
TrMessageBox.removeMessages=function(a5)
{
var a6=TrMessageBox._MESSAGE_BOX;
if(!a6)
return;
a6.removeMessages(a5);
}
TrMessageBox.isPresent=function()
{
return(TrMessageBox._MESSAGE_BOX)?true:false;
}
function TrMessageBox(a0)
{
if(a0==undefined)
return;
this._messageBoxId=a0;
TrMessageBox._LINK_STYLE=TrPage.getInstance().getStyleClass("OraLink");
TrMessageBox._LIST_STYLE=TrPage.getInstance().getStyleClass("af|messages::list");
TrMessageBox._LIST_SINGLE_STYLE=TrPage.getInstance().getStyleClass("af|messages::list-single");
}
TrMessageBox.prototype.addMessage=function(a1,a2,a3)
{
var a4=this._getMessageList();
var a5=document.createElement("li");
if(a1)
{
if(!a2)
a2=a3.getSummary();
var a6;
if(a2&&a2.length>0)
{
var a7=document.createElement("a");
a7.className=TrMessageBox._LINK_STYLE;
a7.href="#"+a1;
a7.innerHTML=a2;
a5.appendChild(a7);
a6=document.createTextNode(" - "+a3.getSummary());
}
else
{
a6=document.createTextNode(a3.getSummary());
}
a5.name=this._getMessageNameForInput(a1);
a5.appendChild(a6);
}
else
{
var a8=a3.getSummary();
var a6;
if(a8&&a8.length>0)
a6=document.createTextNode(a8+" - "+a3.getDetail());
else
a6=document.createTextNode(a3.getDetail());
a5.appendChild(a6);
}
a4.appendChild(a5);
if(a4.hasChildNodes())
{
var a9=a4.getElementsByTagName("li");
if(a9.length==1)
a4.className=TrMessageBox._LIST_SINGLE_STYLE;
else
a4.className=TrMessageBox._LIST_STYLE;
}
this._showMessageBox();
}
TrMessageBox.prototype.removeMessages=function(a10)
{
var a11=this._getMessageList();
if(!a11||!a11.hasChildNodes())
return;
var a12=this._getMessageNameForInput(a10);
var a13=a11.getElementsByTagName("li");
for(var a14=0;a14<a13.length;)
{
var a15=a13[a14];
if(a15.name&&a15.name==a12)
{
a11.removeChild(a15);
continue;
}
a14++;
}
if(a13.length==0)
this._hideMessageBox();
else if(a13.length==1)
a11.className=TrMessageBox._LIST_SINGLE_STYLE;
else
a11.className=TrMessageBox._LIST_STYLE;
}
TrMessageBox.prototype._getMessageBox=function()
{
if(this._messageBoxId==null)
return null;
return _getElementById(document,this._messageBoxId);
}
TrMessageBox.prototype._getMessageList=function()
{
if(this._messageBoxId==null)
return null;
return _getElementById(document,this._messageBoxId+"__LIST__");
}
TrMessageBox.prototype._showMessageBox=function()
{
var a16=this._getMessageBox();
if(!a16)
return;
a16.style.display="";
}
TrMessageBox.prototype._hideMessageBox=function()
{
var a17=this._getMessageBox();
if(!a17)
return;
a17.style.display="none";
}
TrMessageBox.prototype._getMessageNameForInput=function(a18)
{
if(!this._messageBoxId||!a18)
return null;
return this._messageBoxId+"__"+a18+"__";
}
