package org.azd.distributedtask.types;
/**
----------------------------------------------------------
	GENERATED FILE, should be edited to suit the purpose.
----------------------------------------------------------
**/

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.azd.enums.TaskAgentUpdateReasonType;

/**
 * None 
**/
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaskAgentUpdateReason {

	@JsonProperty("code")
	private TaskAgentUpdateReasonType code;

	public TaskAgentUpdateReasonType getCode() { return code; }

	public void setCode(TaskAgentUpdateReasonType code) { this.code = code; }

	@Override
	public String toString() {
		return "TaskAgentUpdateReason{" +
				"code=" + code +
				'}';
	}
}