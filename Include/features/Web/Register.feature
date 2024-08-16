Feature: User Registration

  Scenario: User success fill data diri with valid data
    Given user is on registration page
    When user enters valid Nama Depan
    And user enters valid Nama Belakang
    And user enters valid Tempat Lahir
    And user enters valid Tanggal Lahir
    And user enters valid Nomor KTP
    And user enters valid Image KTP
    And user enters valid Masa Berlaku KTP
    And user choose valid Kewarganegaraan
    And user enters valid Provinsi
    And user enters valid Kota
    And user enters valid Alamat Domisili
    And user enters valid Nomor Telepon
    And user choose valid Pekerjaan
    And user enters valid Nama Perusahaan
    And user enters valid Alamat Perusahaan
    And user enters valid Nomor Telepon Perusahaan
    And user choose not have NPWP
    And user choose Jenis Kendaraan
    And user choose Kendaraan yang dicari
    And user choose Tujuan Pembelian
    And user enters valid Email
    And user enters valid Password
    And user enters valid Konfirmasi Password
    And user click button Selanjutnya
    Then user will redirect to Data Pembayaran page
  
  Scenario: User success registration after fill data pembayaran
    Given user already fill data diri
    And 	user on data pembayaran page
    When 	user enters Nomor Rekening
    And 	user choose Bank
    And 	user enters Nama Pemilik Rekening
    And 	user choose Sumber Dana
    And 	user choose Metode Pembayaran
    And 	user click button Daftar
    Then 	user will redirect to login page
    And 	user will get pop up that success registration
 	
 	Scenario: User register with invalid email format
    Given user is on registration page
    When user enters valid Nama Depan
    And user enters valid Nama Belakang
    And user enters valid Tempat Lahir
    And user enters valid Tanggal Lahir
    And user enters valid Nomor KTP
    And user enters valid Image KTP
    And user enters valid Masa Berlaku KTP
    And user choose valid Kewarganegaraan
    And user enters valid Provinsi
    And user enters valid Kota
    And user enters valid Alamat Domisili
    And user enters valid Nomor Telepon
    And user choose valid Pekerjaan
    And user enters valid Nama Perusahaan
    And user enters valid Alamat Perusahaan
    And user enters valid Nomor Telepon Perusahaan
    And user choose not have NPWP
    And user choose Jenis Kendaraan
    And user choose Kendaraan yang dicari
    And user choose Tujuan Pembelian
    And user enters invalid Email Format
    And user enters valid Password
    And user enters valid Konfirmasi Password
    And user click button Selanjutnya
    Then user will get error that email is required
  
  Scenario: User register with empty field format
  	Given user is on registration page
  	When user let the field empty
  	And user click button Selanjutnya
  	Then user will get error on all required field
  
  Scenario: User register with email that already registered
  	Given user is on registration page
  	When user fill all field using valid data
  	And user fill email data with data already registered
  	And user click button Selanjutnya
  	Then user will get error field email that email already exist
  	
  Scenario: User register with password not matching
  	Given user is on registration page
  	When user fill all field using valid data
  	And user enters password field
  	And user enters confirm password with a different value
  	And user click button Selanjutnya
  	Then user will get error that password are not match