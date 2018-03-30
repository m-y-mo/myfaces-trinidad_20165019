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
 * UIXProgress is a base abstraction for 
 *           components that implement ActionSource and 
 *           indicate the progress of tasks running in
 * 	    the server, typically navigating to a special
 *           page once the task is complete.
 * 	    When the task is complete, an ActionEvent is
 * 	    delivered.
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
 * <td valign="top" nowrap>Any Phase<br>Invoke Application</td>
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
public class UIXProgress extends UIXComponentBase
                         implements ActionSource
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final PropertyKey VALUE_KEY =
    TYPE.registerKey("value");
  static public final PropertyKey ACTION_KEY =
    TYPE.registerKey("action", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey ACTION_LISTENER_KEY =
    TYPE.registerKey("actionListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey IMMEDIATE_KEY =
    TYPE.registerKey("immediate", Boolean.class, Boolean.FALSE);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Progress";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.Progress";

  /**
   * Construct an instance of the UIXProgress.
   */
  public UIXProgress()
  {
    super("org.apache.myfaces.trinidad.Indicator");
  }
  	
  @Override
  public void queueEvent(FacesEvent e)
  {
    if (e.getSource() == this && e instanceof ActionEvent)
    {
      if (isImmediate())
        e.setPhaseId(PhaseId.ANY_PHASE);
      else
        e.setPhaseId(PhaseId.INVOKE_APPLICATION);
    }

    super.queueEvent(e);
  }

  @Override
  public void broadcast(FacesEvent event) throws AbortProcessingException
  {
    super.broadcast(event);

    // Notify the specified action listener method (if any),
    // and the default action listener
    if (event instanceof ActionEvent)
    {
      FacesContext context = getFacesContext();
      MethodBinding mb = getActionListener();
      if (mb != null)
        mb.invoke(context, new Object[] { event });

      ActionListener defaultActionListener =
        context.getApplication().getActionListener();
      if (defaultActionListener != null)
      {
        defaultActionListener.processAction((ActionEvent) event);
      }
    }
  }

  /**
   * Gets The data model being used by this progress component.
   *               The model should be of type 
   *               org.apache.myfaces.trinidad.model.BoundedRangeModel.
   *
   * @return  the new value value
   */
  final public Object getValue()
  {
    return getProperty(VALUE_KEY);
  }

  /**
   * Sets The data model being used by this progress component.
   *               The model should be of type 
   *               org.apache.myfaces.trinidad.model.BoundedRangeModel.
   * 
   * @param value  the new value value
   */
  final public void setValue(Object value)
  {
    setProperty(VALUE_KEY, (value));
  }

  /**
   * Gets A reference to an action method sent by the progress component, 
   *               or the static outcome of an action. This is invoked when the task
   *               under progress is complete.
   *
   * @return  the new action value
   */
  final public MethodBinding getAction()
  {
    return (MethodBinding)getProperty(ACTION_KEY);
  }

  /**
   * Sets A reference to an action method sent by the progress component, 
   *               or the static outcome of an action. This is invoked when the task
   *               under progress is complete.
   * 
   * @param action  the new action value
   */
  final public void setAction(MethodBinding action)
  {
    setProperty(ACTION_KEY, (action));
  }

  /**
   * Gets A method reference to an action listener.
   *             This is invoked after the task in progress is complete.
   *
   * @return  the new actionListener value
   */
  final public MethodBinding getActionListener()
  {
    return (MethodBinding)getProperty(ACTION_LISTENER_KEY);
  }

  /**
   * Sets A method reference to an action listener.
   *             This is invoked after the task in progress is complete.
   * 
   * @param actionListener  the new actionListener value
   */
  final public void setActionListener(MethodBinding actionListener)
  {
    setProperty(ACTION_LISTENER_KEY, (actionListener));
  }

  /**
   * Gets whether data validation - client-side or
   *             server-side -
   *           will be skipped when
   *           events are generated by this component.
   * 
   *           When immediate is true, the command's action and
   *           ActionListeners, including the default ActionListener
   *           provided by the JavaServer Faces implementation,
   *           will be executed during Apply Request Values phase
   *           of the request processing lifecycle, rather than
   *           waiting until the Invoke Application phase.  Because
   *           validation runs during Process Validators (after
   *           Apply Request Values, but before Invoke Application),
   *           setting immediate to true will skip validation.
   *
   * @return  the new immediate value
   */
  final public boolean isImmediate()
  {
    return ComponentUtils.resolveBoolean(getProperty(IMMEDIATE_KEY), false);
  }

  /**
   * Sets whether data validation - client-side or
   *             server-side -
   *           will be skipped when
   *           events are generated by this component.
   * 
   *           When immediate is true, the command's action and
   *           ActionListeners, including the default ActionListener
   *           provided by the JavaServer Faces implementation,
   *           will be executed during Apply Request Values phase
   *           of the request processing lifecycle, rather than
   *           waiting until the Invoke Application phase.  Because
   *           validation runs during Process Validators (after
   *           Apply Request Values, but before Invoke Application),
   *           setting immediate to true will skip validation.
   * 
   * @param immediate  the new immediate value
   */
  final public void setImmediate(boolean immediate)
  {
    setProperty(IMMEDIATE_KEY, immediate ? Boolean.TRUE : Boolean.FALSE);
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
   * Construct an instance of the UIXProgress.
   */
  protected UIXProgress(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Progress","org.apache.myfaces.trinidad.Indicator");
  }
}
