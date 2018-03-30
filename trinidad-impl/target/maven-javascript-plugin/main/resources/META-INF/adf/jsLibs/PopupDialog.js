function TrPopupDialog()
{
var a0=TrPage.getInstance();
var a1=document.createElement("div");
a1.style.cssText="visibility:hidden; position: absolute;";
a1.className=a0.getStyleClass("af|dialog::container");
var a2=document.createElement("div");
a2.className=a0.getStyleClass("af|dialog::title-bar");
a1.appendChild(a2);
var a3=document.createElement("div");
a3.style.cssText="float:left;";
a3.className=a0.getStyleClass("af|dialog::title-text");
a2.appendChild(a3);
var a4=document.createElement("div");
a4.style.cssText="float:right;";
a4.className=a0.getStyleClass("af|dialog::close-icon");
_addEvent(a4,"click",TrPopupDialog._returnFromDialog);
a2.appendChild(a4);
var a5=document.createElement("div");
a5.style.cssText="clear:both;";
a2.appendChild(a5);
var a6=document.createElement("iframe");
a6.name="_blank";
a6.frameBorder="0";
a6.className=a0.getStyleClass("af|dialog::content");
a1.appendChild(a6);
this._iframe=a6;
this._outerDiv=a1;
this._titleTextDiv=a3;
document.body.appendChild(a1);
TrPanelPopup.call(this);
this.setModal(true);
this.setCentered(true);
this.setContent(a1);
this._fixedSize=false;
}
TrPopupDialog.prototype=new TrPanelPopup();
TrPopupDialog.prototype.setTitle=function(a7)
{
if(a7)
{
this._titleTextDiv.innerHTML=a7;
}
else
{
this._titleTextDiv.innerHTML="";
}
}
TrPopupDialog.prototype.setDestination=function(a8)
{
this._iframe.src=a8;
}
TrPopupDialog.prototype.setSize=function(a9,a10)
{
this._resizeIFrame(a9,a10);
if(a9==null)
{
this._variableWidth=true;
}
else
{
this._variableWidth=false;
this._fixedSize=true;
}
if(a10==null)
{
this._variableHeight=true;
}
else
{
this._variableHeight=false;
this._fixedSize=true;
}
}
TrPopupDialog.getInstance=function()
{
return TrPopupDialog.DIALOG;
}
TrPopupDialog.prototype._destroy=function()
{
var a11=this._outerDiv;
if(a11)
{
delete this._outerDiv;
a11.parentNode.removeChild(a11);
}
if(this._iframe)
delete this._iframe;
if(this._titleTextDiv)
delete this._titleTextDiv;
}
TrPopupDialog.prototype._resizeIFrame=function(a12,a13)
{
if(a13!=null)
{
this._iframe.height=a13+"px";
}
if(a12!=null)
{
this._iframe.width="100%";
this._outerDiv.style.width=a12+"px";
}
this._calcPosition(false);
}
TrPopupDialog._initDialogPage=function()
{
var a14;
try
{
a14=parent.TrPopupDialog.DIALOG;
}
catch(err)
{
}
if(!a14)
return;
a14.setTitle(document.title);
if(a14.isVisible())
return;
if(!a14._fixedSize)
{
if(_agent.isIE)
{
a14._resizeIFrame(
a14._iframe.Document.body.scrollWidth+40,
a14._iframe.Document.body.scrollHeight+40);
}
else
{
a14._resizeIFrame(
a14._iframe.contentDocument.body.offsetWidth+40,
a14._iframe.contentDocument.body.offsetHeight+40);
}
}
else if(a14._variableWidth||a14._variableHeight)
{
if(a14._variableWidth)
{
if(_agent.isIE)
{
a14._resizeIFrame(a14._iframe.Document.body.scrollWidth+40,null);
}
else
{
a14._resizeIFrame(a14._iframe.contentDocument.body.offsetWidth+40,null);
}
}
if(a14._variableHeight)
{
if(_agent.isIE)
{
a14._resizeIFrame(null,a14._iframe.Document.body.scrollHeight+40);
}
else
{
a14._resizeIFrame(null,a14._iframe.contentDocument.body.offsetHeight+40);
}
}
}
a14.show();
}
TrPopupDialog._returnFromDialog=function()
{
var a15=TrPopupDialog.DIALOG;
if(a15)
{
a15.hide();
window.setTimeout(TrUIUtils.createCallback(
a15,TrPopupDialog.prototype._destroy),100);
TrPopupDialog.DIALOG=undefined;
}
else
{
alert("returnFromDialog(): Error - Current popup is not a dialog");
}
}
TrPopupDialog._returnFromDialogAndSubmit=function(a16,a17)
{
if(a16)
{
var a18=a16['formName'];
var a19=a16['postback'];
_submitPartialChange(a18,0,{rtrn:a19});
}
}
TrPopupDialog._launchDialog=function(
a20,
a21,
a22,
a23)
{
var a24=TrPopupDialog.DIALOG;
if(!a24)
{
a24=TrPopupDialog.DIALOG=new TrPopupDialog();
}
a24.callback=a22;
a24.callbackProps=a23;
if(a21&&a21['width']&&a21['height'])
{
a24.setSize(a21['width'],a21['height']);
}
else if(a21&&a21['width'])
{
a24.setSize(a21['width'],null);
}
else if(a21&&a21['height'])
{
a24.setSize(null,a21['height']);
}
a24.setDestination(a20);
}
