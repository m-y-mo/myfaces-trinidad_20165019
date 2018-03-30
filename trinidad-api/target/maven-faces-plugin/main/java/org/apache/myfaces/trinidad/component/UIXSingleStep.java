// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
*/
package org.apache.myfaces.trinidad.component;

import javax.faces.component.ActionSource;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.faces.event.FacesEvent;
import javax.faces.event.PhaseId;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * UIXSingleStep is a base abstraction for components
 *           that implement ActionSource and 
 *           navigate back and forth through a sequence of known steps.
 *           <section name="Events and Listeners">
 *             UIXSingleStep implements javax.faces.component.ActionSource, which
 *             means it is a source of javax.faces.event.ActionEvents.
 *             <p>
 *             The ActionEvent is delivered during the Apply Request Values phase 
 *             when navigating back, and during the 
 *             Invoke Application phase when navigating forward.
 *             </p>
 *             <p>
 *             The nextAction/previousAction attributes are of type MethodBinding
 *             and must (if non-null) point to an action method. The nextAction
 *             method will be called when navigating forward, and the previousAction
 *             method will be called when navigating back with a singleStep
 *             component.
 *             </p>
 *             <p>
 *             JSF has a default javax.faces.event.ActionListener that passes the
 *             nextAction or previousAction outcome to the NavigationHandler.
 *             </p>              
 *             <p>
 *             The nextActionListener/previousActionListener attributes are of 
 *             type MethodBinding and must (in non-null) point to a method 
 *             accepting an ActionEvent, with a return type of void.
 *             When navigating to the previous step, then the previousActionListener
 *             method is called. When navigating to the next step, the nextActionListener
 *             method is called.
 *             </p>       
 *           </section>
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>javax.faces.event.ActionEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered when the "action" of the component has been
invoked;  for example, by clicking on a button.  The action may result
in page navigation.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class UIXSingleStep extends UIXComponentBase
                           implements ActionSource
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final PropertyKey SELECTED_STEP_KEY =
    TYPE.registerKey("selectedStep", Integer.class, Integer.valueOf(1));
  static public final PropertyKey MAX_STEP_KEY =
    TYPE.registerKey("maxStep", Integer.class, Integer.valueOf(-1));
  static public final PropertyKey PREVIOUS_ACTION_LISTENER_KEY =
    TYPE.registerKey("previousActionListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey NEXT_ACTION_LISTENER_KEY =
    TYPE.registerKey("nextActionListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey NEXT_ACTION_KEY =
    TYPE.registerKey("nextAction", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey PREVIOUS_ACTION_KEY =
    TYPE.registerKey("previousAction", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.SingleStep";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.SingleStep";

  /**
   * Construct an instance of the UIXSingleStep.
   */
  public UIXSingleStep()
  {
    super("org.apache.myfaces.trinidad.ButtonBar");
  }
  
  @Override
  public void queueEvent(FacesEvent e)
  {
    if (e.getSource() == this)
    {
      if (getActionType() == PREVIOUS_ACTION_TYPE)
        e.setPhaseId(PhaseId.APPLY_REQUEST_VALUES);
      else
        e.setPhaseId(PhaseId.INVOKE_APPLICATION);
    }

    super.queueEvent(e);
  }

  // TODO Store as transient PropertyKey
  public Object getActionType()
  {
    return _actionType;
  }


  public void setActionType(Object actionType)
  {
    _actionType = actionType;
  }


  // TODO if I have default listeners, then should
  // remove (then restore) default Listeners before saving state -
  // this note copied from form.submitButtonBase.saveState....
  @Override
  public Object saveState(FacesContext context)
  {
    return super.saveState(context);
  }

  @Override
  public void broadcast(FacesEvent event) throws AbortProcessingException
  {
    // Perform standard superclass processing
    super.broadcast(event);


    FacesContext context = getFacesContext();

    // Notify the specified listener method (if any)
    if (event instanceof ActionEvent)
    {
      if (getActionType() == PREVIOUS_ACTION_TYPE)
      {
        broadcastToMethodBinding(event, getPreviousActionListener());
      }
      else
      {
        broadcastToMethodBinding(event, getNextActionListener());
      }

      ActionListener defaultActionListener =
                             context.getApplication().getActionListener();

      if (defaultActionListener != null)
        defaultActionListener.processAction((ActionEvent) event);
    }
  }

  public MethodBinding getAction()
  {
    if ( getActionType() == PREVIOUS_ACTION_TYPE)
      return getPreviousAction();

    return getNextAction();
  }

  // TODO  Either make this throw an exception, or make it
  //  execute on both back and next.
  public void setAction(MethodBinding action)
  {
    if ( getActionType() == PREVIOUS_ACTION_TYPE)
      setPreviousAction(action);
    else
      setNextAction(action);
  }

  public MethodBinding getActionListener()
  {
    if ( getActionType() == PREVIOUS_ACTION_TYPE)
      return getPreviousActionListener();

    return getNextActionListener();
  }

  // TODO  Either make this throw an exception, or make it
  //  execute on both back and next.
  public void setActionListener(MethodBinding listener)
  {
    if ( getActionType() == PREVIOUS_ACTION_TYPE)
      setPreviousActionListener(listener);
    else
      setNextActionListener(listener);
  }

  /**
   * returns true if the actionType is PREVIOUS_ACTION_TYPE
   */
  public boolean isImmediate()
  {
    return  (getActionType() == PREVIOUS_ACTION_TYPE);
  }
  /**
   * no-op.
   * For UIXSingleStep components, even though it implements ActionSource,
   * we do no have an immediate attribute.
   * By default, if actionType is PREVIOUS_ACTION_TYPE,
   * we set the phase to PhaseId.APPLY_REQUEST_VALUES, else we set the
   * phase to PhaseId.INVOKE_APPLICATION.
   */
  public void setImmediate(boolean immediate)
  {
    // do nothing
  }

  private Object _actionType = NEXT_ACTION_TYPE;

  public static final Object NEXT_ACTION_TYPE = new Object();
  public static final Object PREVIOUS_ACTION_TYPE = new Object();
  // Someday we might add a cancel button?
  // public static final Object CANCEL_ACTION_TYPE = new Object();



  /**
   * Gets the current step. The valid range is 1 to maxStep.
   *               It defaults to 1.
   *
   * @return  the new selectedStep value
   */
  final public int getSelectedStep()
  {
    return ComponentUtils.resolveInteger(getProperty(SELECTED_STEP_KEY), 1);
  }

  /**
   * Sets the current step. The valid range is 1 to maxStep.
   *               It defaults to 1.
   * 
   * @param selectedStep  the new selectedStep value
   */
  final public void setSelectedStep(int selectedStep)
  {
    setProperty(SELECTED_STEP_KEY, Integer.valueOf(selectedStep));
  }

  /**
   * Sets the current step. The valid range is 1 to maxStep.
   *               It defaults to 1.
   * 
   * @param selectedStep  the new selectedStep value
   */
  final public void setSelectedStep(long selectedStep)
  {
    setProperty(SELECTED_STEP_KEY, Long.valueOf(selectedStep));
  }

  /**
   * Gets the last possible step. If this value is not known, 
   *               it should be set to
   *               MAX_VALUE_UNKNOWN (-1),
   *               which is also the default value. If maxStep is
   *               MAX_VALUE_UNKNOWN, then no text is rendered between the Back/Next
   *               buttons. When maxStep is 2 and selectedStep
   *               is 1, then only a Continue button is rendered.
   *
   * @return  the new maxStep value
   */
  final public int getMaxStep()
  {
    return ComponentUtils.resolveInteger(getProperty(MAX_STEP_KEY), -1);
  }

  /**
   * Sets the last possible step. If this value is not known, 
   *               it should be set to
   *               MAX_VALUE_UNKNOWN (-1),
   *               which is also the default value. If maxStep is
   *               MAX_VALUE_UNKNOWN, then no text is rendered between the Back/Next
   *               buttons. When maxStep is 2 and selectedStep
   *               is 1, then only a Continue button is rendered.
   * 
   * @param maxStep  the new maxStep value
   */
  final public void setMaxStep(int maxStep)
  {
    setProperty(MAX_STEP_KEY, Integer.valueOf(maxStep));
  }

  /**
   * Sets the last possible step. If this value is not known, 
   *               it should be set to
   *               MAX_VALUE_UNKNOWN (-1),
   *               which is also the default value. If maxStep is
   *               MAX_VALUE_UNKNOWN, then no text is rendered between the Back/Next
   *               buttons. When maxStep is 2 and selectedStep
   *               is 1, then only a Continue button is rendered.
   * 
   * @param maxStep  the new maxStep value
   */
  final public void setMaxStep(long maxStep)
  {
    setProperty(MAX_STEP_KEY, Long.valueOf(maxStep));
  }

  /**
   * Gets a method reference to an action listener 
   *              that will be called when the singleStep component navigates
   *              to the previous step.
   *
   * @return  the new previousActionListener value
   */
  final public MethodBinding getPreviousActionListener()
  {
    return (MethodBinding)getProperty(PREVIOUS_ACTION_LISTENER_KEY);
  }

  /**
   * Sets a method reference to an action listener 
   *              that will be called when the singleStep component navigates
   *              to the previous step.
   * 
   * @param previousActionListener  the new previousActionListener value
   */
  final public void setPreviousActionListener(MethodBinding previousActionListener)
  {
    setProperty(PREVIOUS_ACTION_LISTENER_KEY, (previousActionListener));
  }

  /**
   * Gets a method reference to an action listener  
   *              that will be called when the singleStep component navigates
   *              to the next step.
   *
   * @return  the new nextActionListener value
   */
  final public MethodBinding getNextActionListener()
  {
    return (MethodBinding)getProperty(NEXT_ACTION_LISTENER_KEY);
  }

  /**
   * Sets a method reference to an action listener  
   *              that will be called when the singleStep component navigates
   *              to the next step.
   * 
   * @param nextActionListener  the new nextActionListener value
   */
  final public void setNextActionListener(MethodBinding nextActionListener)
  {
    setProperty(NEXT_ACTION_LISTENER_KEY, (nextActionListener));
  }

  /**
   * Gets a reference to an action method  
   *              that will be called when the singleStep component navigates
   *              to the next step, or the static outcome of the action.
   *
   * @return  the new nextAction value
   */
  final public MethodBinding getNextAction()
  {
    return (MethodBinding)getProperty(NEXT_ACTION_KEY);
  }

  /**
   * Sets a reference to an action method  
   *              that will be called when the singleStep component navigates
   *              to the next step, or the static outcome of the action.
   * 
   * @param nextAction  the new nextAction value
   */
  final public void setNextAction(MethodBinding nextAction)
  {
    setProperty(NEXT_ACTION_KEY, (nextAction));
  }

  /**
   * Gets a reference to an action method  
   *              that will be called when the singleStep component navigates
   *              to the previous step, or the static outcome of the action.
   *
   * @return  the new previousAction value
   */
  final public MethodBinding getPreviousAction()
  {
    return (MethodBinding)getProperty(PREVIOUS_ACTION_KEY);
  }

  /**
   * Sets a reference to an action method  
   *              that will be called when the singleStep component navigates
   *              to the previous step, or the static outcome of the action.
   * 
   * @param previousAction  the new previousAction value
   */
  final public void setPreviousAction(MethodBinding previousAction)
  {
    setProperty(PREVIOUS_ACTION_KEY, (previousAction));
  }

  /**
   * Adds a action listener.
   *
   * @param listener  the action listener to add
   */
  final public void addActionListener(
    ActionListener listener)
  {
    addFacesListener(listener);
  }

  /**
   * Removes a action listener.
   *
   * @param listener  the action listener to remove
   */
  final public void removeActionListener(
    ActionListener listener)
  {
    removeFacesListener(listener);
  }

  /**
   * Returns an array of attached action listeners.
   *
   * @return  an array of attached action listeners.
   */
  final public ActionListener[] getActionListeners()
  {
    return (ActionListener[])getFacesListeners(ActionListener.class);
  }

  @Override
  public String getFamily()
  {
    return COMPONENT_FAMILY;
  }

  @Override
  protected FacesBean.Type getBeanType()
  {
    return TYPE;
  }

  /**
   * Construct an instance of the UIXSingleStep.
   */
  protected UIXSingleStep(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.SingleStep","org.apache.myfaces.trinidad.ButtonBar");
  }
}
