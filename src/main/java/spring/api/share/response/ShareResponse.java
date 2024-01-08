package spring.api.share.response;

import lombok.Data;
import spring.api.share.consts.ApiConsts;

@Data
public class ShareResponse {
    private String code;
    private String message;
    private Object data;

    public ShareResponse Success(){
        ShareResponse response = new ShareResponse();
        response.setCode(ApiConsts.Success.OK.code);
        response.setMessage(ApiConsts.Success.OK.message);
        return  response;
    }

    public ShareResponse SuccessWithData(Object data) {
        ShareResponse response = new ShareResponse();
        response.setCode(ApiConsts.Success.OK.code);
        response.setMessage(ApiConsts.Success.OK.message);
        response.setData(data);
        return response;
    }

}
