$(function () {
  // Register validation function
  var $userRegister = $("#userRegister");

  $userRegister.validate({
    rules: {
      name: {
        required: true,
        lettersonly: true,
      },
      email: {
        required: true,
        space: true,
        email: true,
      },
      mobileNumber: {
        required: true,
        space: true,
        numericonly: true,
        minlength: 10,
        maxlength: 12,
      },
      password: {
        required: true,
        space: true,
      },
      cPassword: {
        required: true,
        space: true,
        equalTo: "#pass",
      },
      address: {
        required: true,
        all: true,
      },
      city: {
        required: true,
        space: true,
      },
      state: {
        required: true,
      },
      pincode: {
        required: true,
        space: true,
        numericonly: true,
      },
      img: {
        required: true,
      },
    },
    messages: {
      name: {
        required: "name required",
        lettersonly: "invalid name",
      },
      email: {
        required: "email must be required",
        space: "space not allowed",
        email: "invalid email",
      },
      mobileNumber: {
        required: "mobile number must be required",
        space: "space not allowed",
        numericonly: "invalid mobile number",
        minlength: "min 10 digits required",
        maxlength: "max 12 digits required",
      },
      password: {
        required: "password must be required",
        space: "space not allowed",
      },
      cPassword: {
        required: "confirm password must be required",
        space: "space not allowed",
        equalTo: "password mismatch",
      },
      address: {
        required: "address must be required",
        all: "invalid",
      },
      city: {
        required: "city must be required",
        space: "space not allowed",
      },
      state: {
        required: "state must be required",
        space: "space not allowed",
      },
      pincode: {
        required: "pincode must be required",
        space: "space not allowed",
        numericonly: "invalid pincode",
      },
      img: {
        required: "image required",
      },
    },
  });

  // Reset password validation function
  var $resetPassword = $("#resetPassword");

  $resetPassword.validate({
    rules: {
      password: {
        required: true,
        space: true,
      },
      cPassword: {
        required: true,
        space: true,
        equalTo: "#pass",
      },
    },
    messages: {
      password: {
        required: "password must be required",
        space: "space not allowed",
      },
      cPassword: {
        required: "confirm password must be required",
        space: "space not allowed",
        equalTo: "password mismatch",
      },
    },
  });

  // Billing address validation function
  var $orders = $("#orders");

  $orders.validate({
    rules: {
      firstName: {
        required: true,
        lettersonly: true,
      },
      lastName: {
        required: true,
        lettersonly: true,
      },
      email: {
        required: true,
        space: true,
        email: true,
      },
      mobileNo: {
        required: true,
        space: true,
        numericonly: true,
        minlength: 10,
        maxlength: 12,
      },
      address: {
        required: true,
        all: true,
      },
      city: {
        required: true,
        space: true,
      },
      state: {
        required: true,
      },
      pincode: {
        required: true,
        space: true,
        numericonly: true,
      },
      paymentType: {
        required: true,
      },
    },
    messages: {
      firstName: {
        required: "first name required",
        lettersonly: "invalid name",
      },
      lastName: {
        required: "last name required",
        lettersonly: "invalid name",
      },
      email: {
        required: "email must be required",
        space: "space not allowed",
        email: "invalid email",
      },
      mobileNo: {
        required: "mobile number must be required",
        space: "space not allowed",
        numericonly: "invalid mobile number",
        minlength: "min 10 digits required",
        maxlength: "max 12 digits required",
      },
      address: {
        required: "address must be required",
        all: "invalid",
      },
      city: {
        required: "city must be required",
        space: "space not allowed",
      },
      state: {
        required: "state must be required",
        space: "space not allowed",
      },
      pincode: {
        required: "pincode must be required",
        space: "space not allowed",
        numericonly: "invalid pincode",
      },
      paymentType: {
        required: "select payment type",
      },
    },
  });
  // Add product validation function
  var $addProduct = $("#addProduct");

  $addProduct.validate({
    rules: {
      title: {
        required: true,
      },
      description: {
        required: true,
      },
      category: {
        required: true,
      },
      price: {
        required: true,
        numericonly: true,
      },
      stock: {
        required: true,
        numericonly: true,
      },
      file: {
        required: true,
      },
    },
    messages: {
      title: {
        required: "product title required",
      },
      description: {
        required: "product description required",
      },
      category: {
        required: "select product category",
      },
      price: {
        required: "price required",
        numericonly: "invalid input",
      },
      stock: {
        required: "stock required",
        numericonly: "invalid input",
      },
      file: {
        required: "image required",
      },
    },
  });
});

jQuery.validator.addMethod("lettersonly", function (value, element) {
  return /^[^-\s][a-zA-Z_\s-]+$/.test(value);
});

jQuery.validator.addMethod("space", function (value, element) {
  return /^[^-\s]+$/.test(value);
});

jQuery.validator.addMethod("all", function (value, element) {
  return /^[^-\s][a-zA-Z0-9_,.\s-]+$/.test(value);
});

jQuery.validator.addMethod("numericonly", function (value, element) {
  return /^[0-9]+$/.test(value);
});
