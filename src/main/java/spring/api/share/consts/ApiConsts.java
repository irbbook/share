package spring.api.share.consts;

public interface ApiConsts {
    interface Success {
        interface OK {
            String code = "200";
            String message = "OK";
        }

        interface Created {
            String code = "201";
            String message = "Created";
        }
    }

    interface Error {
        interface Bad_Request {
            String code = "400";
            String message = "Bad Request";
        }
    }
}
