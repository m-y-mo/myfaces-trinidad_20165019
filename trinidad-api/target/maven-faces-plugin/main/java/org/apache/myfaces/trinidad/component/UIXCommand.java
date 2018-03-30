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
import org.apache.myfaces.trinidad.context.RequestContext;
import org.apache.myfaces.trinidad.event.LaunchEvent;
import org.apache.myfaces.trinidad.event.LaunchListener;
import org.apache.myfaces.trinidad.event.ReturnEvent;
import org.apache.myfaces.trinidad.event.ReturnListener;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
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
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.ReturnEvent</code></td>
 * <td valign="top" nowrap>Apply Request Values</td>
 * <td valign="top">Event delivered when the dialog has completed successfully.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.LaunchEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to prompt the command to launch a dialog.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class UIXCommand extends UIXComponentBase
                        implements DialogSource,
                                   ActionSource
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final PropertyKey ACTION_KEY =
    TYPE.registerKey("action", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey ACTION_LISTENER_KEY =
    TYPE.registerKey("actionListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey RETURN_LISTENER_KEY =
    TYPE.registerKey("returnListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey LAUNCH_LISTENER_KEY =
    TYPE.registerKey("launchListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);
  static public final PropertyKey IMMEDIATE_KEY =
    TYPE.registerKey("immediate", Boolean.class, Boolean.FALSE);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Command";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.Command";

  /**
   * Construct an instance of the UIXCommand.
   */
  public UIXCommand()
  {
    super("org.apache.myfaces.trinidad.Button");
  }
  
  /**
   * <p>Intercept <code>queueEvent</code> and mark the phaseId for the
   * event to be <code>PhaseId.APPLY_REQUEST_VALUES</code> if the
   * <code>immediate</code> flag is true,
   * <code>PhaseId.INVOKE_APPLICATION</code> otherwise.</p>
   */
  @Override
  public void queueEvent(FacesEvent e)
  {
      if (this == e.getComponent() && ((e instanceof ActionEvent) || (e instanceof ReturnEvent)))
    {
      if (isImmediate())
      {
        e.setPhaseId(PhaseId.ANY_PHASE);
      }
      else
      {
        e.setPhaseId(PhaseId.INVOKE_APPLICATION);
      }
    }

    super.queueEvent(e);
  }

  @Override
  public void broadcast(FacesEvent event) throws AbortProcessingException
  {
    // Perform special processing for ActionEvents:  tell
    // the RequestContext to remember this command instance
    // so that the NavigationHandler can locate us to queue
    // a LaunchEvent.
    if (event instanceof ActionEvent)
    {
      RequestContext afContext = RequestContext.getCurrentInstance();
      afContext.getDialogService().setCurrentLaunchSource(this);

      try
      {
        // Perform standard superclass processing
        super.broadcast(event);

        // Notify the specified action listener method (if any),
        // and the default action listener
        broadcastToMethodBinding(event, getActionListener());

        FacesContext context = getFacesContext();
        ActionListener defaultActionListener =
          context.getApplication().getActionListener();
        if (defaultActionListener != null)
        {
          defaultActionListener.processAction((ActionEvent) event);
        }
      }
      finally
      {
        afContext.getDialogService().setCurrentLaunchSource(null);
      }
    }
    else
    {
      // Perform standard superclass processing
      super.broadcast(event);

      if (event instanceof LaunchEvent)
      {
        broadcastToMethodBinding(event, getLaunchListener());
        boolean useWindow = 
          Boolean.TRUE.equals(getAttributes().get("useWindow"));

        ((LaunchEvent) event).launchDialog(useWindow);
      }
      else if (event instanceof ReturnEvent)
      {
        broadcastToMethodBinding(event, getReturnListener());
        // =-=AEW: always jump to render response???  Seems the safest
        // option, because we don't want to immediately update a model
        // or really perform any validation.
        getFacesContext().renderResponse();
      }
    }
  }

  /**
   * Gets a reference to an action method sent by the command component,
   *               or the static outcome of an action. If the action starts with "dialog:",
   *               useWindow attribute must be set to true.
   *
   * @return  the new action value
   */
  final public MethodBinding getAction()
  {
    return (MethodBinding)getProperty(ACTION_KEY);
  }

  /**
   * Sets a reference to an action method sent by the command component,
   *               or the static outcome of an action. If the action starts with "dialog:",
   *               useWindow attribute must be set to true.
   * 
   * @param action  the new action value
   */
  final public void setAction(MethodBinding action)
  {
    setProperty(ACTION_KEY, (action));
  }

  /**
   * Gets a method reference to an action listener
   *
   * @return  the new actionListener value
   */
  final public MethodBinding getActionListener()
  {
    return (MethodBinding)getProperty(ACTION_LISTENER_KEY);
  }

  /**
   * Sets a method reference to an action listener
   * 
   * @param actionListener  the new actionListener value
   */
  final public void setActionListener(MethodBinding actionListener)
  {
    setProperty(ACTION_LISTENER_KEY, (actionListener));
  }

  /**
   * Gets a method reference to a return listener.This method
   *       is used to process dialog returnEvents which are generated as a result of either
   *       calling org.apache.myfaces.trinidad.context.RequestContext.returnFromDialog
   *       directly or declaratively through the use of a returnActionListener tag.
   *
   * @return  the new returnListener value
   */
  final public MethodBinding getReturnListener()
  {
    return (MethodBinding)getProperty(RETURN_LISTENER_KEY);
  }

  /**
   * Sets a method reference to a return listener.This method
   *       is used to process dialog returnEvents which are generated as a result of either
   *       calling org.apache.myfaces.trinidad.context.RequestContext.returnFromDialog
   *       directly or declaratively through the use of a returnActionListener tag.
   * 
   * @param returnListener  the new returnListener value
   */
  final public void setReturnListener(MethodBinding returnListener)
  {
    setProperty(RETURN_LISTENER_KEY, (returnListener));
  }

  /**
   * Gets a method reference to a launch listener
   *
   * @return  the new launchListener value
   */
  final public MethodBinding getLaunchListener()
  {
    return (MethodBinding)getProperty(LAUNCH_LISTENER_KEY);
  }

  /**
   * Sets a method reference to a launch listener
   * 
   * @param launchListener  the new launchListener value
   */
  final public void setLaunchListener(MethodBinding launchListener)
  {
    setProperty(LAUNCH_LISTENER_KEY, (launchListener));
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

  /**
   * Adds a return listener.
   *
   * @param listener  the return listener to add
   */
  final public void addReturnListener(
    ReturnListener listener)
  {
    addFacesListener(listener);
  }

  /**
   * Removes a return listener.
   *
   * @param listener  the return listener to remove
   */
  final public void removeReturnListener(
    ReturnListener listener)
  {
    removeFacesListener(listener);
  }

  /**
   * Returns an array of attached return listeners.
   *
   * @return  an array of attached return listeners.
   */
  final public ReturnListener[] getReturnListeners()
  {
    return (ReturnListener[])getFacesListeners(ReturnListener.class);
  }

  /**
   * Adds a launch listener.
   *
   * @param listener  the launch listener to add
   */
  final public void addLaunchListener(
    LaunchListener listener)
  {
    addFacesListener(listener);
  }

  /**
   * Removes a launch listener.
   *
   * @param listener  the launch listener to remove
   */
  final public void removeLaunchListener(
    LaunchListener listener)
  {
    removeFacesListener(listener);
  }

  /**
   * Returns an array of attached launch listeners.
   *
   * @return  an array of attached launch listeners.
   */
  final public LaunchListener[] getLaunchListeners()
  {
    return (LaunchListener[])getFacesListeners(LaunchListener.class);
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
   * Construct an instance of the UIXCommand.
   */
  protected UIXCommand(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Command","org.apache.myfaces.trinidad.Button");
  }
}
