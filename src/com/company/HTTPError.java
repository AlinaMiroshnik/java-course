package com.company;

public enum HTTPError {
    Ok(200),
    Created(201),
    Accepted(202),
    NoContent(204),
    PartialContent(206),
    MultiStatus(207),
    AlreadyReported(208),
    IMUsed(226);
    int error;
    HTTPError( int error){
        this.error = error;
    }

    public int getError() {
        return error;
    }
}
