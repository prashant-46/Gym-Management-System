import React from "react";
import { Link } from "react-router-dom";

const ForgotPassword = () => {
  return (
    <div
      className="col-sm-6 offset-sm-3"
      style={{
        color: "orange",
        backgroundColor: "black",
        display: "flex",
        flexDirection: "column",
        alignItems: "center",
        justifyContent: "center",
        minHeight: "100vh",
      }}
    >
      <h2>Forgot Password</h2>
      <p style={{ textAlign: "center" }}>
        Please contact an admin to reset your password.
      </p>
      <div className="mb-3">
        <Link to="/login" className="btn btn-primary">
          Back to Login
        </Link>
      </div>
      <div>
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
      </div>
    </div>
  );
};

export default ForgotPassword;
