package com.daybison.socialnetwork.utils.validation;

public class UserValidator {
    public static boolean isNameValid(String name){
        return name != null && !name.trim().isEmpty();
    }
    public static boolean isPasswordValid(String password) {
        return password.length() >= 8 || password != null && !password.trim().isEmpty();
    }

    public static boolean isEmailValid(String email) {
        return email != null && !email.trim().isEmpty();
    }

   /* public class ValidationResult {
        private final String errorMessage;

        public ValidationResult(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public boolean isValid() {
            return errorMessage == null;
        }

        public String getErrorMessage() {
            return errorMessage;
        } */
}
