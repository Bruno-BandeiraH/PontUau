
# PontUau

PontUau is a flight punctuality prediction system that uses machine learning and statistical analysis to predict whether a flight will be delayed or not.

## Main goals
- Predict flight delays in advance 
- Identify ponctuality patterns by airline
- Analyse historical statistics of specifics routes
- Provide insights for operational improvement

## Endpoints
![endpoints](./flight-prediction-api/src/main/resources/static/img/endpoints.jpeg)

## Project Structure
```
PontUau/
├── flight-prediction-api/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   ├── com/
│   │   │   │       ├── flightontime/
│   │   │   │           ├── api/
│   │   │   │               ├── config/
│   │   │   │               │   ├── CorsConfig.java
│   │   │   │               │   └── WebClientConfig.java
│   │   │   │               ├── controller/
│   │   │   │               │   ├── FlightController.java
│   │   │   │               │   └── PredictionController.java
│   │   │   │               ├── domain/
│   │   │   │               │   ├── Flight.java
│   │   │   │               │   └── FlightRepository.java
│   │   │   │               ├── dto/
│   │   │   │               │   ├── AirlineDelayedData.java
│   │   │   │               │   ├── AirlineOnTimeData.java
│   │   │   │               │   ├── FlightDTO.java
│   │   │   │               │   ├── PredictionRequestDTO.java
│   │   │   │               │   ├── PredictionResponseDTO.java
│   │   │   │               │   ├── RouteDelayedData.java
│   │   │   │               │   ├── RouteOnTimeData.java
│   │   │   │               │   ├── StatisticsByYearData.java
│   │   │   │               │   └── StatisticsData.java
│   │   │   │               ├── infra/
│   │   │   │               │   ├── exception/
│   │   │   │               │   │   ├── ResourceNotFoundException.java
│   │   │   │               │   │   └── RestExceptionHandler.java
│   │   │   │               │   ├── validations/
│   │   │   │               │   │   ├── time/
│   │   │   │               │   │   │   └── ExpectedTime.java
│   │   │   │               │   │   └── RepositoryValidator.java
│   │   │   │               │   └── ValidatorException.java
│   │   │   │               ├── service/
│   │   │   │               │   ├── FlightService.java
│   │   │   │               │   └── PredictionService.java
│   │   │   │               └── FlightPredictionApiApplication.java
│   │   │   ├── resources/
│   │   │       ├── static/
│   │   │       │   ├── img/
│   │   │       │       └── endpoints.jpeg
│   │   │       ├── templates/
│   │   │       └── application.properties
│   │   ├── test/
│   │       ├── java/
│   │           ├── com/
│   │               ├── flightontime/
│   │                   ├── api/
│   │                       ├── controller/
│   │                       │   └── PredictionControllerTest.java
│   │                       ├── domain/
│   │                       │   └── FlightTest.java
│   │                       ├── infra/
│   │                       │   ├── validations/
│   │                       │       ├── time/
│   │                       │           └── ExpectedTimeTest.java
│   │                       ├── service/
│   │                       │   └── PredictionServiceTest.java
│   │                       └── FlightPredictionApiApplicationTests.java
│   ├── target/
│   │   ├── classes/
│   │   │   ├── com/
│   │   │   │   ├── flightontime/
│   │   │   │       ├── api/
│   │   │   │           ├── config/
│   │   │   │           │   ├── CorsConfig.class
│   │   │   │           │   └── WebClientConfig.class
│   │   │   │           ├── controller/
│   │   │   │           │   ├── FlightController.class
│   │   │   │           │   └── PredictionController.class
│   │   │   │           ├── domain/
│   │   │   │           │   ├── Flight$FlightBuilder.class
│   │   │   │           │   ├── Flight.class
│   │   │   │           │   └── FlightRepository.class
│   │   │   │           ├── dto/
│   │   │   │           │   ├── AirlineDelayedData.class
│   │   │   │           │   ├── AirlineOnTimeData.class
│   │   │   │           │   ├── FlightDTO.class
│   │   │   │           │   ├── PredictionRequestDTO.class
│   │   │   │           │   ├── PredictionResponseDTO.class
│   │   │   │           │   ├── RouteDelayedData.class
│   │   │   │           │   ├── RouteOnTimeData.class
│   │   │   │           │   ├── StatisticsByYearData.class
│   │   │   │           │   └── StatisticsData.class
│   │   │   │           ├── infra/
│   │   │   │           │   ├── exception/
│   │   │   │           │   │   ├── ResourceNotFoundException.class
│   │   │   │           │   │   ├── RestExceptionHandler$ValidationError.class
│   │   │   │           │   │   └── RestExceptionHandler.class
│   │   │   │           │   ├── validations/
│   │   │   │           │   │   ├── time/
│   │   │   │           │   │   │   └── ExpectedTime.class
│   │   │   │           │   │   └── RepositoryValidator.class
│   │   │   │           │   └── ValidatorException.class
│   │   │   │           ├── service/
│   │   │   │           │   ├── FlightService.class
│   │   │   │           │   └── PredictionService.class
│   │   │   │           └── FlightPredictionApiApplication.class
│   │   │   ├── static/
│   │   │   │   ├── img/
│   │   │   │       └── endpoint.png
│   │   │   └── application.properties
│   │   ├── generated-sources/
│   │   │   ├── annotations/
│   │   ├── generated-test-sources/
│   │   │   ├── test-annotations/
│   │   ├── maven-archiver/
│   │   │   └── pom.properties
│   │   ├── maven-status/
│   │   │   ├── maven-compiler-plugin/
│   │   │       ├── compile/
│   │   │       │   ├── default-compile/
│   │   │       │       ├── createdFiles.lst
│   │   │       │       └── inputFiles.lst
│   │   │       ├── testCompile/
│   │   │           ├── default-testCompile/
│   │   │               ├── createdFiles.lst
│   │   │               └── inputFiles.lst
│   │   ├── test-classes/
│   │   │   ├── com/
│   │   │       ├── flightontime/
│   │   │           ├── api/
│   │   │               ├── controller/
│   │   │               │   └── PredictionControllerTest.class
│   │   │               ├── domain/
│   │   │               │   └── FlightTest.class
│   │   │               ├── infra/
│   │   │               │   ├── validations/
│   │   │               │       ├── time/
│   │   │               │           └── ExpectedTimeTest.class
│   │   │               ├── service/
│   │   │               │   └── PredictionServiceTest.class
│   │   │               └── FlightPredictionApiApplicationTests.class
│   │   ├── flight-prediction-api-0.0.1-SNAPSHOT.jar
│   │   └── flight-prediction-api-0.0.1-SNAPSHOT.jar.original
│   ├── Dockerfile
│   ├── HELP.md
│   ├── README.md
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── flight-prediction-model/
│   ├── __pycache__/
│   │   ├── app.cpython-311.pyc
│   │   ├── app.cpython-312.pyc
│   │   ├── app.cpython-314.pyc
│   │   └── main.cpython-314.pyc
│   ├── app/
│   │   ├── __pycache__/
│   │   │   ├── __init__.cpython-312.pyc
│   │   │   └── main.cpython-312.pyc
│   │   ├── api/
│   │   │   ├── __pycache__/
│   │   │   │   ├── __init__.cpython-312.pyc
│   │   │   │   └── routes.cpython-312.pyc
│   │   │   ├── __init__.py
│   │   │   └── routes.py
│   │   ├── config/
│   │   │   ├── __pycache__/
│   │   │   │   ├── __init__.cpython-312.pyc
│   │   │   │   └── settings.cpython-312.pyc
│   │   │   ├── __init__.py
│   │   │   └── settings.py
│   │   ├── models/
│   │   │   ├── __pycache__/
│   │   │   │   ├── __init__.cpython-312.pyc
│   │   │   │   └── schemas.cpython-312.pyc
│   │   │   ├── __init__.py
│   │   │   └── schemas.py
│   │   ├── services/
│   │   │   ├── __pycache__/
│   │   │   │   ├── __init__.cpython-312.pyc
│   │   │   │   ├── feature_engineering.cpython-312.pyc
│   │   │   │   └── prediction_service.cpython-312.pyc
│   │   │   ├── __init__.py
│   │   │   ├── feature_engineering.py
│   │   │   └── prediction_service.py
│   │   ├── __init__.py
│   │   └── main.py
│   ├── model/
│   │   └── modelo_previsao_atraso_voos_v2.pkl
│   ├── venv/
│   │   ├── Include/
│   │   ├── Lib/
│   │   │   ├── site-packages/
│   │   │       ├── PIL/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── AvifImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── BdfFontFile.cpython-312.pyc
│   │   │       │   │   ├── BlpImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── BmpImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── BufrStubImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── ContainerIO.cpython-312.pyc
│   │   │       │   │   ├── CurImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── DcxImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── DdsImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── EpsImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── ExifTags.cpython-312.pyc
│   │   │       │   │   ├── FitsImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── FliImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── FontFile.cpython-312.pyc
│   │   │       │   │   ├── FpxImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── FtexImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── GbrImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── GdImageFile.cpython-312.pyc
│   │   │       │   │   ├── GifImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── GimpGradientFile.cpython-312.pyc
│   │   │       │   │   ├── GimpPaletteFile.cpython-312.pyc
│   │   │       │   │   ├── GribStubImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── Hdf5StubImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── IcnsImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── IcoImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── ImImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── Image.cpython-312.pyc
│   │   │       │   │   ├── ImageChops.cpython-312.pyc
│   │   │       │   │   ├── ImageCms.cpython-312.pyc
│   │   │       │   │   ├── ImageColor.cpython-312.pyc
│   │   │       │   │   ├── ImageDraw.cpython-312.pyc
│   │   │       │   │   ├── ImageDraw2.cpython-312.pyc
│   │   │       │   │   ├── ImageEnhance.cpython-312.pyc
│   │   │       │   │   ├── ImageFile.cpython-312.pyc
│   │   │       │   │   ├── ImageFilter.cpython-312.pyc
│   │   │       │   │   ├── ImageFont.cpython-312.pyc
│   │   │       │   │   ├── ImageGrab.cpython-312.pyc
│   │   │       │   │   ├── ImageMath.cpython-312.pyc
│   │   │       │   │   ├── ImageMode.cpython-312.pyc
│   │   │       │   │   ├── ImageMorph.cpython-312.pyc
│   │   │       │   │   ├── ImageOps.cpython-312.pyc
│   │   │       │   │   ├── ImagePalette.cpython-312.pyc
│   │   │       │   │   ├── ImagePath.cpython-312.pyc
│   │   │       │   │   ├── ImageQt.cpython-312.pyc
│   │   │       │   │   ├── ImageSequence.cpython-312.pyc
│   │   │       │   │   ├── ImageShow.cpython-312.pyc
│   │   │       │   │   ├── ImageStat.cpython-312.pyc
│   │   │       │   │   ├── ImageText.cpython-312.pyc
│   │   │       │   │   ├── ImageTk.cpython-312.pyc
│   │   │       │   │   ├── ImageTransform.cpython-312.pyc
│   │   │       │   │   ├── ImageWin.cpython-312.pyc
│   │   │       │   │   ├── ImtImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── IptcImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── Jpeg2KImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── JpegImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── JpegPresets.cpython-312.pyc
│   │   │       │   │   ├── McIdasImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── MicImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── MpegImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── MpoImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── MspImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── PSDraw.cpython-312.pyc
│   │   │       │   │   ├── PaletteFile.cpython-312.pyc
│   │   │       │   │   ├── PalmImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── PcdImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── PcfFontFile.cpython-312.pyc
│   │   │       │   │   ├── PcxImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── PdfImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── PdfParser.cpython-312.pyc
│   │   │       │   │   ├── PixarImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── PngImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── PpmImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── PsdImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── QoiImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── SgiImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── SpiderImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── SunImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── TarIO.cpython-312.pyc
│   │   │       │   │   ├── TgaImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── TiffImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── TiffTags.cpython-312.pyc
│   │   │       │   │   ├── WalImageFile.cpython-312.pyc
│   │   │       │   │   ├── WebPImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── WmfImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── XVThumbImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── XbmImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── XpmImagePlugin.cpython-312.pyc
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   ├── _binary.cpython-312.pyc
│   │   │       │   │   ├── _deprecate.cpython-312.pyc
│   │   │       │   │   ├── _tkinter_finder.cpython-312.pyc
│   │   │       │   │   ├── _typing.cpython-312.pyc
│   │   │       │   │   ├── _util.cpython-312.pyc
│   │   │       │   │   ├── _version.cpython-312.pyc
│   │   │       │   │   ├── features.cpython-312.pyc
│   │   │       │   │   └── report.cpython-312.pyc
│   │   │       │   ├── AvifImagePlugin.py
│   │   │       │   ├── BdfFontFile.py
│   │   │       │   ├── BlpImagePlugin.py
│   │   │       │   ├── BmpImagePlugin.py
│   │   │       │   ├── BufrStubImagePlugin.py
│   │   │       │   ├── ContainerIO.py
│   │   │       │   ├── CurImagePlugin.py
│   │   │       │   ├── DcxImagePlugin.py
│   │   │       │   ├── DdsImagePlugin.py
│   │   │       │   ├── EpsImagePlugin.py
│   │   │       │   ├── ExifTags.py
│   │   │       │   ├── FitsImagePlugin.py
│   │   │       │   ├── FliImagePlugin.py
│   │   │       │   ├── FontFile.py
│   │   │       │   ├── FpxImagePlugin.py
│   │   │       │   ├── FtexImagePlugin.py
│   │   │       │   ├── GbrImagePlugin.py
│   │   │       │   ├── GdImageFile.py
│   │   │       │   ├── GifImagePlugin.py
│   │   │       │   ├── GimpGradientFile.py
│   │   │       │   ├── GimpPaletteFile.py
│   │   │       │   ├── GribStubImagePlugin.py
│   │   │       │   ├── Hdf5StubImagePlugin.py
│   │   │       │   ├── IcnsImagePlugin.py
│   │   │       │   ├── IcoImagePlugin.py
│   │   │       │   ├── ImImagePlugin.py
│   │   │       │   ├── Image.py
│   │   │       │   ├── ImageChops.py
│   │   │       │   ├── ImageCms.py
│   │   │       │   ├── ImageColor.py
│   │   │       │   ├── ImageDraw.py
│   │   │       │   ├── ImageDraw2.py
│   │   │       │   ├── ImageEnhance.py
│   │   │       │   ├── ImageFile.py
│   │   │       │   ├── ImageFilter.py
│   │   │       │   ├── ImageFont.py
│   │   │       │   ├── ImageGrab.py
│   │   │       │   ├── ImageMath.py
│   │   │       │   ├── ImageMode.py
│   │   │       │   ├── ImageMorph.py
│   │   │       │   ├── ImageOps.py
│   │   │       │   ├── ImagePalette.py
│   │   │       │   ├── ImagePath.py
│   │   │       │   ├── ImageQt.py
│   │   │       │   ├── ImageSequence.py
│   │   │       │   ├── ImageShow.py
│   │   │       │   ├── ImageStat.py
│   │   │       │   ├── ImageText.py
│   │   │       │   ├── ImageTk.py
│   │   │       │   ├── ImageTransform.py
│   │   │       │   ├── ImageWin.py
│   │   │       │   ├── ImtImagePlugin.py
│   │   │       │   ├── IptcImagePlugin.py
│   │   │       │   ├── Jpeg2KImagePlugin.py
│   │   │       │   ├── JpegImagePlugin.py
│   │   │       │   ├── JpegPresets.py
│   │   │       │   ├── McIdasImagePlugin.py
│   │   │       │   ├── MicImagePlugin.py
│   │   │       │   ├── MpegImagePlugin.py
│   │   │       │   ├── MpoImagePlugin.py
│   │   │       │   ├── MspImagePlugin.py
│   │   │       │   ├── PSDraw.py
│   │   │       │   ├── PaletteFile.py
│   │   │       │   ├── PalmImagePlugin.py
│   │   │       │   ├── PcdImagePlugin.py
│   │   │       │   ├── PcfFontFile.py
│   │   │       │   ├── PcxImagePlugin.py
│   │   │       │   ├── PdfImagePlugin.py
│   │   │       │   ├── PdfParser.py
│   │   │       │   ├── PixarImagePlugin.py
│   │   │       │   ├── PngImagePlugin.py
│   │   │       │   ├── PpmImagePlugin.py
│   │   │       │   ├── PsdImagePlugin.py
│   │   │       │   ├── QoiImagePlugin.py
│   │   │       │   ├── SgiImagePlugin.py
│   │   │       │   ├── SpiderImagePlugin.py
│   │   │       │   ├── SunImagePlugin.py
│   │   │       │   ├── TarIO.py
│   │   │       │   ├── TgaImagePlugin.py
│   │   │       │   ├── TiffImagePlugin.py
│   │   │       │   ├── TiffTags.py
│   │   │       │   ├── WalImageFile.py
│   │   │       │   ├── WebPImagePlugin.py
│   │   │       │   ├── WmfImagePlugin.py
│   │   │       │   ├── XVThumbImagePlugin.py
│   │   │       │   ├── XbmImagePlugin.py
│   │   │       │   ├── XpmImagePlugin.py
│   │   │       │   ├── __init__.py
│   │   │       │   ├── __main__.py
│   │   │       │   ├── _avif.cp312-win_amd64.pyd
│   │   │       │   ├── _avif.pyi
│   │   │       │   ├── _binary.py
│   │   │       │   ├── _deprecate.py
│   │   │       │   ├── _imaging.cp312-win_amd64.pyd
│   │   │       │   ├── _imaging.pyi
│   │   │       │   ├── _imagingcms.cp312-win_amd64.pyd
│   │   │       │   ├── _imagingcms.pyi
│   │   │       │   ├── _imagingft.cp312-win_amd64.pyd
│   │   │       │   ├── _imagingft.pyi
│   │   │       │   ├── _imagingmath.cp312-win_amd64.pyd
│   │   │       │   ├── _imagingmath.pyi
│   │   │       │   ├── _imagingmorph.cp312-win_amd64.pyd
│   │   │       │   ├── _imagingmorph.pyi
│   │   │       │   ├── _imagingtk.cp312-win_amd64.pyd
│   │   │       │   ├── _imagingtk.pyi
│   │   │       │   ├── _tkinter_finder.py
│   │   │       │   ├── _typing.py
│   │   │       │   ├── _util.py
│   │   │       │   ├── _version.py
│   │   │       │   ├── _webp.cp312-win_amd64.pyd
│   │   │       │   ├── _webp.pyi
│   │   │       │   ├── features.py
│   │   │       │   ├── py.typed
│   │   │       │   └── report.py
│   │   │       ├── __pycache__/
│   │   │       │   ├── pylab.cpython-312.pyc
│   │   │       │   ├── six.cpython-312.pyc
│   │   │       │   ├── threadpoolctl.cpython-312.pyc
│   │   │       │   └── typing_extensions.cpython-312.pyc
│   │   │       ├── _distutils_hack/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   └── override.cpython-312.pyc
│   │   │       │   ├── __init__.py
│   │   │       │   └── override.py
│   │   │       ├── annotated_types/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   └── test_cases.cpython-312.pyc
│   │   │       │   ├── __init__.py
│   │   │       │   ├── py.typed
│   │   │       │   └── test_cases.py
│   │   │       ├── annotated_types-0.7.0.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   └── WHEEL
│   │   │       ├── anyio/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── from_thread.cpython-312.pyc
│   │   │       │   │   ├── functools.cpython-312.pyc
│   │   │       │   │   ├── lowlevel.cpython-312.pyc
│   │   │       │   │   ├── pytest_plugin.cpython-312.pyc
│   │   │       │   │   ├── to_interpreter.cpython-312.pyc
│   │   │       │   │   ├── to_process.cpython-312.pyc
│   │   │       │   │   └── to_thread.cpython-312.pyc
│   │   │       │   ├── _backends/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _asyncio.cpython-312.pyc
│   │   │       │   │   │   └── _trio.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _asyncio.py
│   │   │       │   │   └── _trio.py
│   │   │       │   ├── _core/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _asyncio_selector_thread.cpython-312.pyc
│   │   │       │   │   │   ├── _contextmanagers.cpython-312.pyc
│   │   │       │   │   │   ├── _eventloop.cpython-312.pyc
│   │   │       │   │   │   ├── _exceptions.cpython-312.pyc
│   │   │       │   │   │   ├── _fileio.cpython-312.pyc
│   │   │       │   │   │   ├── _resources.cpython-312.pyc
│   │   │       │   │   │   ├── _signals.cpython-312.pyc
│   │   │       │   │   │   ├── _sockets.cpython-312.pyc
│   │   │       │   │   │   ├── _streams.cpython-312.pyc
│   │   │       │   │   │   ├── _subprocesses.cpython-312.pyc
│   │   │       │   │   │   ├── _synchronization.cpython-312.pyc
│   │   │       │   │   │   ├── _tasks.cpython-312.pyc
│   │   │       │   │   │   ├── _tempfile.cpython-312.pyc
│   │   │       │   │   │   ├── _testing.cpython-312.pyc
│   │   │       │   │   │   └── _typedattr.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _asyncio_selector_thread.py
│   │   │       │   │   ├── _contextmanagers.py
│   │   │       │   │   ├── _eventloop.py
│   │   │       │   │   ├── _exceptions.py
│   │   │       │   │   ├── _fileio.py
│   │   │       │   │   ├── _resources.py
│   │   │       │   │   ├── _signals.py
│   │   │       │   │   ├── _sockets.py
│   │   │       │   │   ├── _streams.py
│   │   │       │   │   ├── _subprocesses.py
│   │   │       │   │   ├── _synchronization.py
│   │   │       │   │   ├── _tasks.py
│   │   │       │   │   ├── _tempfile.py
│   │   │       │   │   ├── _testing.py
│   │   │       │   │   └── _typedattr.py
│   │   │       │   ├── abc/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _eventloop.cpython-312.pyc
│   │   │       │   │   │   ├── _resources.cpython-312.pyc
│   │   │       │   │   │   ├── _sockets.cpython-312.pyc
│   │   │       │   │   │   ├── _streams.cpython-312.pyc
│   │   │       │   │   │   ├── _subprocesses.cpython-312.pyc
│   │   │       │   │   │   ├── _tasks.cpython-312.pyc
│   │   │       │   │   │   └── _testing.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _eventloop.py
│   │   │       │   │   ├── _resources.py
│   │   │       │   │   ├── _sockets.py
│   │   │       │   │   ├── _streams.py
│   │   │       │   │   ├── _subprocesses.py
│   │   │       │   │   ├── _tasks.py
│   │   │       │   │   └── _testing.py
│   │   │       │   ├── streams/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── buffered.cpython-312.pyc
│   │   │       │   │   │   ├── file.cpython-312.pyc
│   │   │       │   │   │   ├── memory.cpython-312.pyc
│   │   │       │   │   │   ├── stapled.cpython-312.pyc
│   │   │       │   │   │   ├── text.cpython-312.pyc
│   │   │       │   │   │   └── tls.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── buffered.py
│   │   │       │   │   ├── file.py
│   │   │       │   │   ├── memory.py
│   │   │       │   │   ├── stapled.py
│   │   │       │   │   ├── text.py
│   │   │       │   │   └── tls.py
│   │   │       │   ├── __init__.py
│   │   │       │   ├── from_thread.py
│   │   │       │   ├── functools.py
│   │   │       │   ├── lowlevel.py
│   │   │       │   ├── py.typed
│   │   │       │   ├── pytest_plugin.py
│   │   │       │   ├── to_interpreter.py
│   │   │       │   ├── to_process.py
│   │   │       │   └── to_thread.py
│   │   │       ├── anyio-4.12.0.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── WHEEL
│   │   │       │   ├── entry_points.txt
│   │   │       │   └── top_level.txt
│   │   │       ├── category_encoders/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── backward_difference.cpython-312.pyc
│   │   │       │   │   ├── base_contrast_encoder.cpython-312.pyc
│   │   │       │   │   ├── basen.cpython-312.pyc
│   │   │       │   │   ├── binary.cpython-312.pyc
│   │   │       │   │   ├── cat_boost.cpython-312.pyc
│   │   │       │   │   ├── count.cpython-312.pyc
│   │   │       │   │   ├── glmm.cpython-312.pyc
│   │   │       │   │   ├── gray.cpython-312.pyc
│   │   │       │   │   ├── hashing.cpython-312.pyc
│   │   │       │   │   ├── helmert.cpython-312.pyc
│   │   │       │   │   ├── james_stein.cpython-312.pyc
│   │   │       │   │   ├── leave_one_out.cpython-312.pyc
│   │   │       │   │   ├── m_estimate.cpython-312.pyc
│   │   │       │   │   ├── one_hot.cpython-312.pyc
│   │   │       │   │   ├── ordinal.cpython-312.pyc
│   │   │       │   │   ├── polynomial.cpython-312.pyc
│   │   │       │   │   ├── quantile_encoder.cpython-312.pyc
│   │   │       │   │   ├── rankhot.cpython-312.pyc
│   │   │       │   │   ├── sum_coding.cpython-312.pyc
│   │   │       │   │   ├── target_encoder.cpython-312.pyc
│   │   │       │   │   ├── utils.cpython-312.pyc
│   │   │       │   │   ├── woe.cpython-312.pyc
│   │   │       │   │   └── wrapper.cpython-312.pyc
│   │   │       │   ├── datasets/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   └── _base.cpython-312.pyc
│   │   │       │   │   ├── data/
│   │   │       │   │   │   ├── compass.csv
│   │   │       │   │   │   └── postcode_dataset_100.csv
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   └── _base.py
│   │   │       │   ├── __init__.py
│   │   │       │   ├── backward_difference.py
│   │   │       │   ├── base_contrast_encoder.py
│   │   │       │   ├── basen.py
│   │   │       │   ├── binary.py
│   │   │       │   ├── cat_boost.py
│   │   │       │   ├── count.py
│   │   │       │   ├── glmm.py
│   │   │       │   ├── gray.py
│   │   │       │   ├── hashing.py
│   │   │       │   ├── helmert.py
│   │   │       │   ├── james_stein.py
│   │   │       │   ├── leave_one_out.py
│   │   │       │   ├── m_estimate.py
│   │   │       │   ├── one_hot.py
│   │   │       │   ├── ordinal.py
│   │   │       │   ├── polynomial.py
│   │   │       │   ├── quantile_encoder.py
│   │   │       │   ├── rankhot.py
│   │   │       │   ├── sum_coding.py
│   │   │       │   ├── target_encoder.py
│   │   │       │   ├── utils.py
│   │   │       │   ├── woe.py
│   │   │       │   └── wrapper.py
│   │   │       ├── category_encoders-2.8.1.dist-info/
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── LICENSE.md
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── REQUESTED
│   │   │       │   └── WHEEL
│   │   │       ├── click/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── _compat.cpython-312.pyc
│   │   │       │   │   ├── _termui_impl.cpython-312.pyc
│   │   │       │   │   ├── _textwrap.cpython-312.pyc
│   │   │       │   │   ├── _utils.cpython-312.pyc
│   │   │       │   │   ├── _winconsole.cpython-312.pyc
│   │   │       │   │   ├── core.cpython-312.pyc
│   │   │       │   │   ├── decorators.cpython-312.pyc
│   │   │       │   │   ├── exceptions.cpython-312.pyc
│   │   │       │   │   ├── formatting.cpython-312.pyc
│   │   │       │   │   ├── globals.cpython-312.pyc
│   │   │       │   │   ├── parser.cpython-312.pyc
│   │   │       │   │   ├── shell_completion.cpython-312.pyc
│   │   │       │   │   ├── termui.cpython-312.pyc
│   │   │       │   │   ├── testing.cpython-312.pyc
│   │   │       │   │   ├── types.cpython-312.pyc
│   │   │       │   │   └── utils.cpython-312.pyc
│   │   │       │   ├── __init__.py
│   │   │       │   ├── _compat.py
│   │   │       │   ├── _termui_impl.py
│   │   │       │   ├── _textwrap.py
│   │   │       │   ├── _utils.py
│   │   │       │   ├── _winconsole.py
│   │   │       │   ├── core.py
│   │   │       │   ├── decorators.py
│   │   │       │   ├── exceptions.py
│   │   │       │   ├── formatting.py
│   │   │       │   ├── globals.py
│   │   │       │   ├── parser.py
│   │   │       │   ├── py.typed
│   │   │       │   ├── shell_completion.py
│   │   │       │   ├── termui.py
│   │   │       │   ├── testing.py
│   │   │       │   ├── types.py
│   │   │       │   └── utils.py
│   │   │       ├── click-8.3.1.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE.txt
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   └── WHEEL
│   │   │       ├── colorama/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── ansi.cpython-312.pyc
│   │   │       │   │   ├── ansitowin32.cpython-312.pyc
│   │   │       │   │   ├── initialise.cpython-312.pyc
│   │   │       │   │   ├── win32.cpython-312.pyc
│   │   │       │   │   └── winterm.cpython-312.pyc
│   │   │       │   ├── tests/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── ansi_test.cpython-312.pyc
│   │   │       │   │   │   ├── ansitowin32_test.cpython-312.pyc
│   │   │       │   │   │   ├── initialise_test.cpython-312.pyc
│   │   │       │   │   │   ├── isatty_test.cpython-312.pyc
│   │   │       │   │   │   ├── utils.cpython-312.pyc
│   │   │       │   │   │   └── winterm_test.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── ansi_test.py
│   │   │       │   │   ├── ansitowin32_test.py
│   │   │       │   │   ├── initialise_test.py
│   │   │       │   │   ├── isatty_test.py
│   │   │       │   │   ├── utils.py
│   │   │       │   │   └── winterm_test.py
│   │   │       │   ├── __init__.py
│   │   │       │   ├── ansi.py
│   │   │       │   ├── ansitowin32.py
│   │   │       │   ├── initialise.py
│   │   │       │   ├── win32.py
│   │   │       │   └── winterm.py
│   │   │       ├── colorama-0.4.6.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE.txt
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   └── WHEEL
│   │   │       ├── contourpy/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── _version.cpython-312.pyc
│   │   │       │   │   ├── array.cpython-312.pyc
│   │   │       │   │   ├── chunk.cpython-312.pyc
│   │   │       │   │   ├── convert.cpython-312.pyc
│   │   │       │   │   ├── dechunk.cpython-312.pyc
│   │   │       │   │   ├── enum_util.cpython-312.pyc
│   │   │       │   │   ├── typecheck.cpython-312.pyc
│   │   │       │   │   └── types.cpython-312.pyc
│   │   │       │   ├── util/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _build_config.cpython-312.pyc
│   │   │       │   │   │   ├── bokeh_renderer.cpython-312.pyc
│   │   │       │   │   │   ├── bokeh_util.cpython-312.pyc
│   │   │       │   │   │   ├── data.cpython-312.pyc
│   │   │       │   │   │   ├── mpl_renderer.cpython-312.pyc
│   │   │       │   │   │   ├── mpl_util.cpython-312.pyc
│   │   │       │   │   │   └── renderer.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _build_config.py
│   │   │       │   │   ├── bokeh_renderer.py
│   │   │       │   │   ├── bokeh_util.py
│   │   │       │   │   ├── data.py
│   │   │       │   │   ├── mpl_renderer.py
│   │   │       │   │   ├── mpl_util.py
│   │   │       │   │   └── renderer.py
│   │   │       │   ├── __init__.py
│   │   │       │   ├── _contourpy.cp312-win_amd64.lib
│   │   │       │   ├── _contourpy.cp312-win_amd64.pyd
│   │   │       │   ├── _contourpy.pyi
│   │   │       │   ├── _version.py
│   │   │       │   ├── array.py
│   │   │       │   ├── chunk.py
│   │   │       │   ├── convert.py
│   │   │       │   ├── dechunk.py
│   │   │       │   ├── enum_util.py
│   │   │       │   ├── py.typed
│   │   │       │   ├── typecheck.py
│   │   │       │   └── types.py
│   │   │       ├── contourpy-1.3.3.dist-info/
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── LICENSE
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   └── WHEEL
│   │   │       ├── cycler/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   └── __init__.cpython-312.pyc
│   │   │       │   ├── __init__.py
│   │   │       │   └── py.typed
│   │   │       ├── cycler-0.12.1.dist-info/
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── LICENSE
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── WHEEL
│   │   │       │   └── top_level.txt
│   │   │       ├── dateutil/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── _common.cpython-312.pyc
│   │   │       │   │   ├── _version.cpython-312.pyc
│   │   │       │   │   ├── easter.cpython-312.pyc
│   │   │       │   │   ├── relativedelta.cpython-312.pyc
│   │   │       │   │   ├── rrule.cpython-312.pyc
│   │   │       │   │   ├── tzwin.cpython-312.pyc
│   │   │       │   │   └── utils.cpython-312.pyc
│   │   │       │   ├── parser/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _parser.cpython-312.pyc
│   │   │       │   │   │   └── isoparser.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _parser.py
│   │   │       │   │   └── isoparser.py
│   │   │       │   ├── tz/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _common.cpython-312.pyc
│   │   │       │   │   │   ├── _factories.cpython-312.pyc
│   │   │       │   │   │   ├── tz.cpython-312.pyc
│   │   │       │   │   │   └── win.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _common.py
│   │   │       │   │   ├── _factories.py
│   │   │       │   │   ├── tz.py
│   │   │       │   │   └── win.py
│   │   │       │   ├── zoneinfo/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   └── rebuild.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── dateutil-zoneinfo.tar.gz
│   │   │       │   │   └── rebuild.py
│   │   │       │   ├── __init__.py
│   │   │       │   ├── _common.py
│   │   │       │   ├── _version.py
│   │   │       │   ├── easter.py
│   │   │       │   ├── relativedelta.py
│   │   │       │   ├── rrule.py
│   │   │       │   ├── tzwin.py
│   │   │       │   └── utils.py
│   │   │       ├── fastapi/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── _compat.cpython-312.pyc
│   │   │       │   │   ├── applications.cpython-312.pyc
│   │   │       │   │   ├── background.cpython-312.pyc
│   │   │       │   │   ├── concurrency.cpython-312.pyc
│   │   │       │   │   ├── datastructures.cpython-312.pyc
│   │   │       │   │   ├── encoders.cpython-312.pyc
│   │   │       │   │   ├── exception_handlers.cpython-312.pyc
│   │   │       │   │   ├── exceptions.cpython-312.pyc
│   │   │       │   │   ├── logger.cpython-312.pyc
│   │   │       │   │   ├── param_functions.cpython-312.pyc
│   │   │       │   │   ├── params.cpython-312.pyc
│   │   │       │   │   ├── requests.cpython-312.pyc
│   │   │       │   │   ├── responses.cpython-312.pyc
│   │   │       │   │   ├── routing.cpython-312.pyc
│   │   │       │   │   ├── staticfiles.cpython-312.pyc
│   │   │       │   │   ├── templating.cpython-312.pyc
│   │   │       │   │   ├── testclient.cpython-312.pyc
│   │   │       │   │   ├── types.cpython-312.pyc
│   │   │       │   │   ├── utils.cpython-312.pyc
│   │   │       │   │   └── websockets.cpython-312.pyc
│   │   │       │   ├── dependencies/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── models.cpython-312.pyc
│   │   │       │   │   │   └── utils.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── models.py
│   │   │       │   │   └── utils.py
│   │   │       │   ├── middleware/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── cors.cpython-312.pyc
│   │   │       │   │   │   ├── gzip.cpython-312.pyc
│   │   │       │   │   │   ├── httpsredirect.cpython-312.pyc
│   │   │       │   │   │   ├── trustedhost.cpython-312.pyc
│   │   │       │   │   │   └── wsgi.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── cors.py
│   │   │       │   │   ├── gzip.py
│   │   │       │   │   ├── httpsredirect.py
│   │   │       │   │   ├── trustedhost.py
│   │   │       │   │   └── wsgi.py
│   │   │       │   ├── openapi/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── constants.cpython-312.pyc
│   │   │       │   │   │   ├── docs.cpython-312.pyc
│   │   │       │   │   │   ├── models.cpython-312.pyc
│   │   │       │   │   │   └── utils.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── constants.py
│   │   │       │   │   ├── docs.py
│   │   │       │   │   ├── models.py
│   │   │       │   │   └── utils.py
│   │   │       │   ├── security/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── api_key.cpython-312.pyc
│   │   │       │   │   │   ├── base.cpython-312.pyc
│   │   │       │   │   │   ├── http.cpython-312.pyc
│   │   │       │   │   │   ├── oauth2.cpython-312.pyc
│   │   │       │   │   │   ├── open_id_connect_url.cpython-312.pyc
│   │   │       │   │   │   └── utils.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── api_key.py
│   │   │       │   │   ├── base.py
│   │   │       │   │   ├── http.py
│   │   │       │   │   ├── oauth2.py
│   │   │       │   │   ├── open_id_connect_url.py
│   │   │       │   │   └── utils.py
│   │   │       │   ├── __init__.py
│   │   │       │   ├── _compat.py
│   │   │       │   ├── applications.py
│   │   │       │   ├── background.py
│   │   │       │   ├── concurrency.py
│   │   │       │   ├── datastructures.py
│   │   │       │   ├── encoders.py
│   │   │       │   ├── exception_handlers.py
│   │   │       │   ├── exceptions.py
│   │   │       │   ├── logger.py
│   │   │       │   ├── param_functions.py
│   │   │       │   ├── params.py
│   │   │       │   ├── py.typed
│   │   │       │   ├── requests.py
│   │   │       │   ├── responses.py
│   │   │       │   ├── routing.py
│   │   │       │   ├── staticfiles.py
│   │   │       │   ├── templating.py
│   │   │       │   ├── testclient.py
│   │   │       │   ├── types.py
│   │   │       │   ├── utils.py
│   │   │       │   └── websockets.py
│   │   │       ├── fastapi-0.110.0.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── REQUESTED
│   │   │       │   └── WHEEL
│   │   │       ├── fontTools/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   ├── afmLib.cpython-312.pyc
│   │   │       │   │   ├── agl.cpython-312.pyc
│   │   │       │   │   ├── annotations.cpython-312.pyc
│   │   │       │   │   ├── fontBuilder.cpython-312.pyc
│   │   │       │   │   ├── help.cpython-312.pyc
│   │   │       │   │   ├── tfmLib.cpython-312.pyc
│   │   │       │   │   ├── ttx.cpython-312.pyc
│   │   │       │   │   └── unicode.cpython-312.pyc
│   │   │       │   ├── cffLib/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── CFF2ToCFF.cpython-312.pyc
│   │   │       │   │   │   ├── CFFToCFF2.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── specializer.cpython-312.pyc
│   │   │       │   │   │   ├── transforms.cpython-312.pyc
│   │   │       │   │   │   └── width.cpython-312.pyc
│   │   │       │   │   ├── CFF2ToCFF.py
│   │   │       │   │   ├── CFFToCFF2.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── specializer.py
│   │   │       │   │   ├── transforms.py
│   │   │       │   │   └── width.py
│   │   │       │   ├── colorLib/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── builder.cpython-312.pyc
│   │   │       │   │   │   ├── errors.cpython-312.pyc
│   │   │       │   │   │   ├── geometry.cpython-312.pyc
│   │   │       │   │   │   ├── table_builder.cpython-312.pyc
│   │   │       │   │   │   └── unbuilder.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── builder.py
│   │   │       │   │   ├── errors.py
│   │   │       │   │   ├── geometry.py
│   │   │       │   │   ├── table_builder.py
│   │   │       │   │   └── unbuilder.py
│   │   │       │   ├── config/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   └── __init__.py
│   │   │       │   ├── cu2qu/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   ├── benchmark.cpython-312.pyc
│   │   │       │   │   │   ├── cli.cpython-312.pyc
│   │   │       │   │   │   ├── cu2qu.cpython-312.pyc
│   │   │       │   │   │   ├── errors.cpython-312.pyc
│   │   │       │   │   │   └── ufo.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __main__.py
│   │   │       │   │   ├── benchmark.py
│   │   │       │   │   ├── cli.py
│   │   │       │   │   ├── cu2qu.c
│   │   │       │   │   ├── cu2qu.cp312-win_amd64.pyd
│   │   │       │   │   ├── cu2qu.py
│   │   │       │   │   ├── errors.py
│   │   │       │   │   └── ufo.py
│   │   │       │   ├── designspaceLib/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   ├── split.cpython-312.pyc
│   │   │       │   │   │   ├── statNames.cpython-312.pyc
│   │   │       │   │   │   └── types.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __main__.py
│   │   │       │   │   ├── split.py
│   │   │       │   │   ├── statNames.py
│   │   │       │   │   └── types.py
│   │   │       │   ├── encodings/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── MacRoman.cpython-312.pyc
│   │   │       │   │   │   ├── StandardEncoding.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   └── codecs.cpython-312.pyc
│   │   │       │   │   ├── MacRoman.py
│   │   │       │   │   ├── StandardEncoding.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   └── codecs.py
│   │   │       │   ├── feaLib/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   ├── ast.cpython-312.pyc
│   │   │       │   │   │   ├── builder.cpython-312.pyc
│   │   │       │   │   │   ├── error.cpython-312.pyc
│   │   │       │   │   │   ├── lexer.cpython-312.pyc
│   │   │       │   │   │   ├── location.cpython-312.pyc
│   │   │       │   │   │   ├── lookupDebugInfo.cpython-312.pyc
│   │   │       │   │   │   ├── parser.cpython-312.pyc
│   │   │       │   │   │   └── variableScalar.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __main__.py
│   │   │       │   │   ├── ast.py
│   │   │       │   │   ├── builder.py
│   │   │       │   │   ├── error.py
│   │   │       │   │   ├── lexer.c
│   │   │       │   │   ├── lexer.cp312-win_amd64.pyd
│   │   │       │   │   ├── lexer.py
│   │   │       │   │   ├── location.py
│   │   │       │   │   ├── lookupDebugInfo.py
│   │   │       │   │   ├── parser.py
│   │   │       │   │   └── variableScalar.py
│   │   │       │   ├── merge/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   ├── base.cpython-312.pyc
│   │   │       │   │   │   ├── cmap.cpython-312.pyc
│   │   │       │   │   │   ├── layout.cpython-312.pyc
│   │   │       │   │   │   ├── options.cpython-312.pyc
│   │   │       │   │   │   ├── tables.cpython-312.pyc
│   │   │       │   │   │   ├── unicode.cpython-312.pyc
│   │   │       │   │   │   └── util.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __main__.py
│   │   │       │   │   ├── base.py
│   │   │       │   │   ├── cmap.py
│   │   │       │   │   ├── layout.py
│   │   │       │   │   ├── options.py
│   │   │       │   │   ├── tables.py
│   │   │       │   │   ├── unicode.py
│   │   │       │   │   └── util.py
│   │   │       │   ├── misc/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── arrayTools.cpython-312.pyc
│   │   │       │   │   │   ├── bezierTools.cpython-312.pyc
│   │   │       │   │   │   ├── classifyTools.cpython-312.pyc
│   │   │       │   │   │   ├── cliTools.cpython-312.pyc
│   │   │       │   │   │   ├── configTools.cpython-312.pyc
│   │   │       │   │   │   ├── cython.cpython-312.pyc
│   │   │       │   │   │   ├── dictTools.cpython-312.pyc
│   │   │       │   │   │   ├── eexec.cpython-312.pyc
│   │   │       │   │   │   ├── encodingTools.cpython-312.pyc
│   │   │       │   │   │   ├── enumTools.cpython-312.pyc
│   │   │       │   │   │   ├── etree.cpython-312.pyc
│   │   │       │   │   │   ├── filenames.cpython-312.pyc
│   │   │       │   │   │   ├── fixedTools.cpython-312.pyc
│   │   │       │   │   │   ├── intTools.cpython-312.pyc
│   │   │       │   │   │   ├── iterTools.cpython-312.pyc
│   │   │       │   │   │   ├── lazyTools.cpython-312.pyc
│   │   │       │   │   │   ├── loggingTools.cpython-312.pyc
│   │   │       │   │   │   ├── macCreatorType.cpython-312.pyc
│   │   │       │   │   │   ├── macRes.cpython-312.pyc
│   │   │       │   │   │   ├── psCharStrings.cpython-312.pyc
│   │   │       │   │   │   ├── psLib.cpython-312.pyc
│   │   │       │   │   │   ├── psOperators.cpython-312.pyc
│   │   │       │   │   │   ├── py23.cpython-312.pyc
│   │   │       │   │   │   ├── roundTools.cpython-312.pyc
│   │   │       │   │   │   ├── sstruct.cpython-312.pyc
│   │   │       │   │   │   ├── symfont.cpython-312.pyc
│   │   │       │   │   │   ├── testTools.cpython-312.pyc
│   │   │       │   │   │   ├── textTools.cpython-312.pyc
│   │   │       │   │   │   ├── timeTools.cpython-312.pyc
│   │   │       │   │   │   ├── transform.cpython-312.pyc
│   │   │       │   │   │   ├── treeTools.cpython-312.pyc
│   │   │       │   │   │   ├── vector.cpython-312.pyc
│   │   │       │   │   │   ├── visitor.cpython-312.pyc
│   │   │       │   │   │   ├── xmlReader.cpython-312.pyc
│   │   │       │   │   │   └── xmlWriter.cpython-312.pyc
│   │   │       │   │   ├── filesystem/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _base.cpython-312.pyc
│   │   │       │   │   │   │   ├── _copy.cpython-312.pyc
│   │   │       │   │   │   │   ├── _errors.cpython-312.pyc
│   │   │       │   │   │   │   ├── _info.cpython-312.pyc
│   │   │       │   │   │   │   ├── _osfs.cpython-312.pyc
│   │   │       │   │   │   │   ├── _path.cpython-312.pyc
│   │   │       │   │   │   │   ├── _subfs.cpython-312.pyc
│   │   │       │   │   │   │   ├── _tempfs.cpython-312.pyc
│   │   │       │   │   │   │   ├── _tools.cpython-312.pyc
│   │   │       │   │   │   │   ├── _walk.cpython-312.pyc
│   │   │       │   │   │   │   └── _zipfs.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _base.py
│   │   │       │   │   │   ├── _copy.py
│   │   │       │   │   │   ├── _errors.py
│   │   │       │   │   │   ├── _info.py
│   │   │       │   │   │   ├── _osfs.py
│   │   │       │   │   │   ├── _path.py
│   │   │       │   │   │   ├── _subfs.py
│   │   │       │   │   │   ├── _tempfs.py
│   │   │       │   │   │   ├── _tools.py
│   │   │       │   │   │   ├── _walk.py
│   │   │       │   │   │   └── _zipfs.py
│   │   │       │   │   ├── plistlib/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── py.typed
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── arrayTools.py
│   │   │       │   │   ├── bezierTools.c
│   │   │       │   │   ├── bezierTools.cp312-win_amd64.pyd
│   │   │       │   │   ├── bezierTools.py
│   │   │       │   │   ├── classifyTools.py
│   │   │       │   │   ├── cliTools.py
│   │   │       │   │   ├── configTools.py
│   │   │       │   │   ├── cython.py
│   │   │       │   │   ├── dictTools.py
│   │   │       │   │   ├── eexec.py
│   │   │       │   │   ├── encodingTools.py
│   │   │       │   │   ├── enumTools.py
│   │   │       │   │   ├── etree.py
│   │   │       │   │   ├── filenames.py
│   │   │       │   │   ├── fixedTools.py
│   │   │       │   │   ├── intTools.py
│   │   │       │   │   ├── iterTools.py
│   │   │       │   │   ├── lazyTools.py
│   │   │       │   │   ├── loggingTools.py
│   │   │       │   │   ├── macCreatorType.py
│   │   │       │   │   ├── macRes.py
│   │   │       │   │   ├── psCharStrings.py
│   │   │       │   │   ├── psLib.py
│   │   │       │   │   ├── psOperators.py
│   │   │       │   │   ├── py23.py
│   │   │       │   │   ├── roundTools.py
│   │   │       │   │   ├── sstruct.py
│   │   │       │   │   ├── symfont.py
│   │   │       │   │   ├── testTools.py
│   │   │       │   │   ├── textTools.py
│   │   │       │   │   ├── timeTools.py
│   │   │       │   │   ├── transform.py
│   │   │       │   │   ├── treeTools.py
│   │   │       │   │   ├── vector.py
│   │   │       │   │   ├── visitor.py
│   │   │       │   │   ├── xmlReader.py
│   │   │       │   │   └── xmlWriter.py
│   │   │       │   ├── mtiLib/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   └── __main__.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   └── __main__.py
│   │   │       │   ├── otlLib/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── builder.cpython-312.pyc
│   │   │       │   │   │   ├── error.cpython-312.pyc
│   │   │       │   │   │   └── maxContextCalc.cpython-312.pyc
│   │   │       │   │   ├── optimize/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   │   └── gpos.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── __main__.py
│   │   │       │   │   │   └── gpos.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── builder.py
│   │   │       │   │   ├── error.py
│   │   │       │   │   └── maxContextCalc.py
│   │   │       │   ├── pens/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── areaPen.cpython-312.pyc
│   │   │       │   │   │   ├── basePen.cpython-312.pyc
│   │   │       │   │   │   ├── boundsPen.cpython-312.pyc
│   │   │       │   │   │   ├── cairoPen.cpython-312.pyc
│   │   │       │   │   │   ├── cocoaPen.cpython-312.pyc
│   │   │       │   │   │   ├── cu2quPen.cpython-312.pyc
│   │   │       │   │   │   ├── explicitClosingLinePen.cpython-312.pyc
│   │   │       │   │   │   ├── filterPen.cpython-312.pyc
│   │   │       │   │   │   ├── freetypePen.cpython-312.pyc
│   │   │       │   │   │   ├── hashPointPen.cpython-312.pyc
│   │   │       │   │   │   ├── momentsPen.cpython-312.pyc
│   │   │       │   │   │   ├── perimeterPen.cpython-312.pyc
│   │   │       │   │   │   ├── pointInsidePen.cpython-312.pyc
│   │   │       │   │   │   ├── pointPen.cpython-312.pyc
│   │   │       │   │   │   ├── qtPen.cpython-312.pyc
│   │   │       │   │   │   ├── qu2cuPen.cpython-312.pyc
│   │   │       │   │   │   ├── quartzPen.cpython-312.pyc
│   │   │       │   │   │   ├── recordingPen.cpython-312.pyc
│   │   │       │   │   │   ├── reportLabPen.cpython-312.pyc
│   │   │       │   │   │   ├── reverseContourPen.cpython-312.pyc
│   │   │       │   │   │   ├── roundingPen.cpython-312.pyc
│   │   │       │   │   │   ├── statisticsPen.cpython-312.pyc
│   │   │       │   │   │   ├── svgPathPen.cpython-312.pyc
│   │   │       │   │   │   ├── t2CharStringPen.cpython-312.pyc
│   │   │       │   │   │   ├── teePen.cpython-312.pyc
│   │   │       │   │   │   ├── transformPen.cpython-312.pyc
│   │   │       │   │   │   ├── ttGlyphPen.cpython-312.pyc
│   │   │       │   │   │   └── wxPen.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── areaPen.py
│   │   │       │   │   ├── basePen.py
│   │   │       │   │   ├── boundsPen.py
│   │   │       │   │   ├── cairoPen.py
│   │   │       │   │   ├── cocoaPen.py
│   │   │       │   │   ├── cu2quPen.py
│   │   │       │   │   ├── explicitClosingLinePen.py
│   │   │       │   │   ├── filterPen.py
│   │   │       │   │   ├── freetypePen.py
│   │   │       │   │   ├── hashPointPen.py
│   │   │       │   │   ├── momentsPen.c
│   │   │       │   │   ├── momentsPen.cp312-win_amd64.pyd
│   │   │       │   │   ├── momentsPen.py
│   │   │       │   │   ├── perimeterPen.py
│   │   │       │   │   ├── pointInsidePen.py
│   │   │       │   │   ├── pointPen.py
│   │   │       │   │   ├── qtPen.py
│   │   │       │   │   ├── qu2cuPen.py
│   │   │       │   │   ├── quartzPen.py
│   │   │       │   │   ├── recordingPen.py
│   │   │       │   │   ├── reportLabPen.py
│   │   │       │   │   ├── reverseContourPen.py
│   │   │       │   │   ├── roundingPen.py
│   │   │       │   │   ├── statisticsPen.py
│   │   │       │   │   ├── svgPathPen.py
│   │   │       │   │   ├── t2CharStringPen.py
│   │   │       │   │   ├── teePen.py
│   │   │       │   │   ├── transformPen.py
│   │   │       │   │   ├── ttGlyphPen.py
│   │   │       │   │   └── wxPen.py
│   │   │       │   ├── qu2cu/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   ├── benchmark.cpython-312.pyc
│   │   │       │   │   │   ├── cli.cpython-312.pyc
│   │   │       │   │   │   └── qu2cu.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __main__.py
│   │   │       │   │   ├── benchmark.py
│   │   │       │   │   ├── cli.py
│   │   │       │   │   ├── qu2cu.c
│   │   │       │   │   ├── qu2cu.cp312-win_amd64.pyd
│   │   │       │   │   └── qu2cu.py
│   │   │       │   ├── subset/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   ├── cff.cpython-312.pyc
│   │   │       │   │   │   ├── svg.cpython-312.pyc
│   │   │       │   │   │   └── util.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __main__.py
│   │   │       │   │   ├── cff.py
│   │   │       │   │   ├── svg.py
│   │   │       │   │   └── util.py
│   │   │       │   ├── svgLib/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   ├── path/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── arc.cpython-312.pyc
│   │   │       │   │   │   │   ├── parser.cpython-312.pyc
│   │   │       │   │   │   │   └── shapes.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── arc.py
│   │   │       │   │   │   ├── parser.py
│   │   │       │   │   │   └── shapes.py
│   │   │       │   │   └── __init__.py
│   │   │       │   ├── t1Lib/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   └── __init__.py
│   │   │       │   ├── ttLib/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   ├── macUtils.cpython-312.pyc
│   │   │       │   │   │   ├── removeOverlaps.cpython-312.pyc
│   │   │       │   │   │   ├── reorderGlyphs.cpython-312.pyc
│   │   │       │   │   │   ├── scaleUpem.cpython-312.pyc
│   │   │       │   │   │   ├── sfnt.cpython-312.pyc
│   │   │       │   │   │   ├── standardGlyphOrder.cpython-312.pyc
│   │   │       │   │   │   ├── ttCollection.cpython-312.pyc
│   │   │       │   │   │   ├── ttFont.cpython-312.pyc
│   │   │       │   │   │   ├── ttGlyphSet.cpython-312.pyc
│   │   │       │   │   │   ├── ttVisitor.cpython-312.pyc
│   │   │       │   │   │   └── woff2.cpython-312.pyc
│   │   │       │   │   ├── tables/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── B_A_S_E_.cpython-312.pyc
│   │   │       │   │   │   │   ├── BitmapGlyphMetrics.cpython-312.pyc
│   │   │       │   │   │   │   ├── C_B_D_T_.cpython-312.pyc
│   │   │       │   │   │   │   ├── C_B_L_C_.cpython-312.pyc
│   │   │       │   │   │   │   ├── C_F_F_.cpython-312.pyc
│   │   │       │   │   │   │   ├── C_F_F__2.cpython-312.pyc
│   │   │       │   │   │   │   ├── C_O_L_R_.cpython-312.pyc
│   │   │       │   │   │   │   ├── C_P_A_L_.cpython-312.pyc
│   │   │       │   │   │   │   ├── D_S_I_G_.cpython-312.pyc
│   │   │       │   │   │   │   ├── D__e_b_g.cpython-312.pyc
│   │   │       │   │   │   │   ├── DefaultTable.cpython-312.pyc
│   │   │       │   │   │   │   ├── E_B_D_T_.cpython-312.pyc
│   │   │       │   │   │   │   ├── E_B_L_C_.cpython-312.pyc
│   │   │       │   │   │   │   ├── F_F_T_M_.cpython-312.pyc
│   │   │       │   │   │   │   ├── F__e_a_t.cpython-312.pyc
│   │   │       │   │   │   │   ├── G_D_E_F_.cpython-312.pyc
│   │   │       │   │   │   │   ├── G_M_A_P_.cpython-312.pyc
│   │   │       │   │   │   │   ├── G_P_K_G_.cpython-312.pyc
│   │   │       │   │   │   │   ├── G_P_O_S_.cpython-312.pyc
│   │   │       │   │   │   │   ├── G_S_U_B_.cpython-312.pyc
│   │   │       │   │   │   │   ├── G_V_A_R_.cpython-312.pyc
│   │   │       │   │   │   │   ├── G__l_a_t.cpython-312.pyc
│   │   │       │   │   │   │   ├── G__l_o_c.cpython-312.pyc
│   │   │       │   │   │   │   ├── H_V_A_R_.cpython-312.pyc
│   │   │       │   │   │   │   ├── J_S_T_F_.cpython-312.pyc
│   │   │       │   │   │   │   ├── L_T_S_H_.cpython-312.pyc
│   │   │       │   │   │   │   ├── M_A_T_H_.cpython-312.pyc
│   │   │       │   │   │   │   ├── M_E_T_A_.cpython-312.pyc
│   │   │       │   │   │   │   ├── M_V_A_R_.cpython-312.pyc
│   │   │       │   │   │   │   ├── O_S_2f_2.cpython-312.pyc
│   │   │       │   │   │   │   ├── S_I_N_G_.cpython-312.pyc
│   │   │       │   │   │   │   ├── S_T_A_T_.cpython-312.pyc
│   │   │       │   │   │   │   ├── S_V_G_.cpython-312.pyc
│   │   │       │   │   │   │   ├── S__i_l_f.cpython-312.pyc
│   │   │       │   │   │   │   ├── S__i_l_l.cpython-312.pyc
│   │   │       │   │   │   │   ├── T_S_I_B_.cpython-312.pyc
│   │   │       │   │   │   │   ├── T_S_I_C_.cpython-312.pyc
│   │   │       │   │   │   │   ├── T_S_I_D_.cpython-312.pyc
│   │   │       │   │   │   │   ├── T_S_I_J_.cpython-312.pyc
│   │   │       │   │   │   │   ├── T_S_I_P_.cpython-312.pyc
│   │   │       │   │   │   │   ├── T_S_I_S_.cpython-312.pyc
│   │   │       │   │   │   │   ├── T_S_I_V_.cpython-312.pyc
│   │   │       │   │   │   │   ├── T_S_I__0.cpython-312.pyc
│   │   │       │   │   │   │   ├── T_S_I__1.cpython-312.pyc
│   │   │       │   │   │   │   ├── T_S_I__2.cpython-312.pyc
│   │   │       │   │   │   │   ├── T_S_I__3.cpython-312.pyc
│   │   │       │   │   │   │   ├── T_S_I__5.cpython-312.pyc
│   │   │       │   │   │   │   ├── T_T_F_A_.cpython-312.pyc
│   │   │       │   │   │   │   ├── TupleVariation.cpython-312.pyc
│   │   │       │   │   │   │   ├── V_A_R_C_.cpython-312.pyc
│   │   │       │   │   │   │   ├── V_D_M_X_.cpython-312.pyc
│   │   │       │   │   │   │   ├── V_O_R_G_.cpython-312.pyc
│   │   │       │   │   │   │   ├── V_V_A_R_.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _a_n_k_r.cpython-312.pyc
│   │   │       │   │   │   │   ├── _a_v_a_r.cpython-312.pyc
│   │   │       │   │   │   │   ├── _b_s_l_n.cpython-312.pyc
│   │   │       │   │   │   │   ├── _c_i_d_g.cpython-312.pyc
│   │   │       │   │   │   │   ├── _c_m_a_p.cpython-312.pyc
│   │   │       │   │   │   │   ├── _c_v_a_r.cpython-312.pyc
│   │   │       │   │   │   │   ├── _c_v_t.cpython-312.pyc
│   │   │       │   │   │   │   ├── _f_e_a_t.cpython-312.pyc
│   │   │       │   │   │   │   ├── _f_p_g_m.cpython-312.pyc
│   │   │       │   │   │   │   ├── _f_v_a_r.cpython-312.pyc
│   │   │       │   │   │   │   ├── _g_a_s_p.cpython-312.pyc
│   │   │       │   │   │   │   ├── _g_c_i_d.cpython-312.pyc
│   │   │       │   │   │   │   ├── _g_l_y_f.cpython-312.pyc
│   │   │       │   │   │   │   ├── _g_v_a_r.cpython-312.pyc
│   │   │       │   │   │   │   ├── _h_d_m_x.cpython-312.pyc
│   │   │       │   │   │   │   ├── _h_e_a_d.cpython-312.pyc
│   │   │       │   │   │   │   ├── _h_h_e_a.cpython-312.pyc
│   │   │       │   │   │   │   ├── _h_m_t_x.cpython-312.pyc
│   │   │       │   │   │   │   ├── _k_e_r_n.cpython-312.pyc
│   │   │       │   │   │   │   ├── _l_c_a_r.cpython-312.pyc
│   │   │       │   │   │   │   ├── _l_o_c_a.cpython-312.pyc
│   │   │       │   │   │   │   ├── _l_t_a_g.cpython-312.pyc
│   │   │       │   │   │   │   ├── _m_a_x_p.cpython-312.pyc
│   │   │       │   │   │   │   ├── _m_e_t_a.cpython-312.pyc
│   │   │       │   │   │   │   ├── _m_o_r_t.cpython-312.pyc
│   │   │       │   │   │   │   ├── _m_o_r_x.cpython-312.pyc
│   │   │       │   │   │   │   ├── _n_a_m_e.cpython-312.pyc
│   │   │       │   │   │   │   ├── _o_p_b_d.cpython-312.pyc
│   │   │       │   │   │   │   ├── _p_o_s_t.cpython-312.pyc
│   │   │       │   │   │   │   ├── _p_r_e_p.cpython-312.pyc
│   │   │       │   │   │   │   ├── _p_r_o_p.cpython-312.pyc
│   │   │       │   │   │   │   ├── _s_b_i_x.cpython-312.pyc
│   │   │       │   │   │   │   ├── _t_r_a_k.cpython-312.pyc
│   │   │       │   │   │   │   ├── _v_h_e_a.cpython-312.pyc
│   │   │       │   │   │   │   ├── _v_m_t_x.cpython-312.pyc
│   │   │       │   │   │   │   ├── asciiTable.cpython-312.pyc
│   │   │       │   │   │   │   ├── grUtils.cpython-312.pyc
│   │   │       │   │   │   │   ├── otBase.cpython-312.pyc
│   │   │       │   │   │   │   ├── otConverters.cpython-312.pyc
│   │   │       │   │   │   │   ├── otData.cpython-312.pyc
│   │   │       │   │   │   │   ├── otTables.cpython-312.pyc
│   │   │       │   │   │   │   ├── otTraverse.cpython-312.pyc
│   │   │       │   │   │   │   ├── sbixGlyph.cpython-312.pyc
│   │   │       │   │   │   │   ├── sbixStrike.cpython-312.pyc
│   │   │       │   │   │   │   └── ttProgram.cpython-312.pyc
│   │   │       │   │   │   ├── B_A_S_E_.py
│   │   │       │   │   │   ├── BitmapGlyphMetrics.py
│   │   │       │   │   │   ├── C_B_D_T_.py
│   │   │       │   │   │   ├── C_B_L_C_.py
│   │   │       │   │   │   ├── C_F_F_.py
│   │   │       │   │   │   ├── C_F_F__2.py
│   │   │       │   │   │   ├── C_O_L_R_.py
│   │   │       │   │   │   ├── C_P_A_L_.py
│   │   │       │   │   │   ├── D_S_I_G_.py
│   │   │       │   │   │   ├── D__e_b_g.py
│   │   │       │   │   │   ├── DefaultTable.py
│   │   │       │   │   │   ├── E_B_D_T_.py
│   │   │       │   │   │   ├── E_B_L_C_.py
│   │   │       │   │   │   ├── F_F_T_M_.py
│   │   │       │   │   │   ├── F__e_a_t.py
│   │   │       │   │   │   ├── G_D_E_F_.py
│   │   │       │   │   │   ├── G_M_A_P_.py
│   │   │       │   │   │   ├── G_P_K_G_.py
│   │   │       │   │   │   ├── G_P_O_S_.py
│   │   │       │   │   │   ├── G_S_U_B_.py
│   │   │       │   │   │   ├── G_V_A_R_.py
│   │   │       │   │   │   ├── G__l_a_t.py
│   │   │       │   │   │   ├── G__l_o_c.py
│   │   │       │   │   │   ├── H_V_A_R_.py
│   │   │       │   │   │   ├── J_S_T_F_.py
│   │   │       │   │   │   ├── L_T_S_H_.py
│   │   │       │   │   │   ├── M_A_T_H_.py
│   │   │       │   │   │   ├── M_E_T_A_.py
│   │   │       │   │   │   ├── M_V_A_R_.py
│   │   │       │   │   │   ├── O_S_2f_2.py
│   │   │       │   │   │   ├── S_I_N_G_.py
│   │   │       │   │   │   ├── S_T_A_T_.py
│   │   │       │   │   │   ├── S_V_G_.py
│   │   │       │   │   │   ├── S__i_l_f.py
│   │   │       │   │   │   ├── S__i_l_l.py
│   │   │       │   │   │   ├── T_S_I_B_.py
│   │   │       │   │   │   ├── T_S_I_C_.py
│   │   │       │   │   │   ├── T_S_I_D_.py
│   │   │       │   │   │   ├── T_S_I_J_.py
│   │   │       │   │   │   ├── T_S_I_P_.py
│   │   │       │   │   │   ├── T_S_I_S_.py
│   │   │       │   │   │   ├── T_S_I_V_.py
│   │   │       │   │   │   ├── T_S_I__0.py
│   │   │       │   │   │   ├── T_S_I__1.py
│   │   │       │   │   │   ├── T_S_I__2.py
│   │   │       │   │   │   ├── T_S_I__3.py
│   │   │       │   │   │   ├── T_S_I__5.py
│   │   │       │   │   │   ├── T_T_F_A_.py
│   │   │       │   │   │   ├── TupleVariation.py
│   │   │       │   │   │   ├── V_A_R_C_.py
│   │   │       │   │   │   ├── V_D_M_X_.py
│   │   │       │   │   │   ├── V_O_R_G_.py
│   │   │       │   │   │   ├── V_V_A_R_.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _a_n_k_r.py
│   │   │       │   │   │   ├── _a_v_a_r.py
│   │   │       │   │   │   ├── _b_s_l_n.py
│   │   │       │   │   │   ├── _c_i_d_g.py
│   │   │       │   │   │   ├── _c_m_a_p.py
│   │   │       │   │   │   ├── _c_v_a_r.py
│   │   │       │   │   │   ├── _c_v_t.py
│   │   │       │   │   │   ├── _f_e_a_t.py
│   │   │       │   │   │   ├── _f_p_g_m.py
│   │   │       │   │   │   ├── _f_v_a_r.py
│   │   │       │   │   │   ├── _g_a_s_p.py
│   │   │       │   │   │   ├── _g_c_i_d.py
│   │   │       │   │   │   ├── _g_l_y_f.py
│   │   │       │   │   │   ├── _g_v_a_r.py
│   │   │       │   │   │   ├── _h_d_m_x.py
│   │   │       │   │   │   ├── _h_e_a_d.py
│   │   │       │   │   │   ├── _h_h_e_a.py
│   │   │       │   │   │   ├── _h_m_t_x.py
│   │   │       │   │   │   ├── _k_e_r_n.py
│   │   │       │   │   │   ├── _l_c_a_r.py
│   │   │       │   │   │   ├── _l_o_c_a.py
│   │   │       │   │   │   ├── _l_t_a_g.py
│   │   │       │   │   │   ├── _m_a_x_p.py
│   │   │       │   │   │   ├── _m_e_t_a.py
│   │   │       │   │   │   ├── _m_o_r_t.py
│   │   │       │   │   │   ├── _m_o_r_x.py
│   │   │       │   │   │   ├── _n_a_m_e.py
│   │   │       │   │   │   ├── _o_p_b_d.py
│   │   │       │   │   │   ├── _p_o_s_t.py
│   │   │       │   │   │   ├── _p_r_e_p.py
│   │   │       │   │   │   ├── _p_r_o_p.py
│   │   │       │   │   │   ├── _s_b_i_x.py
│   │   │       │   │   │   ├── _t_r_a_k.py
│   │   │       │   │   │   ├── _v_h_e_a.py
│   │   │       │   │   │   ├── _v_m_t_x.py
│   │   │       │   │   │   ├── asciiTable.py
│   │   │       │   │   │   ├── grUtils.py
│   │   │       │   │   │   ├── otBase.py
│   │   │       │   │   │   ├── otConverters.py
│   │   │       │   │   │   ├── otData.py
│   │   │       │   │   │   ├── otTables.py
│   │   │       │   │   │   ├── otTraverse.py
│   │   │       │   │   │   ├── sbixGlyph.py
│   │   │       │   │   │   ├── sbixStrike.py
│   │   │       │   │   │   ├── table_API_readme.txt
│   │   │       │   │   │   └── ttProgram.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __main__.py
│   │   │       │   │   ├── macUtils.py
│   │   │       │   │   ├── removeOverlaps.py
│   │   │       │   │   ├── reorderGlyphs.py
│   │   │       │   │   ├── scaleUpem.py
│   │   │       │   │   ├── sfnt.py
│   │   │       │   │   ├── standardGlyphOrder.py
│   │   │       │   │   ├── ttCollection.py
│   │   │       │   │   ├── ttFont.py
│   │   │       │   │   ├── ttGlyphSet.py
│   │   │       │   │   ├── ttVisitor.py
│   │   │       │   │   └── woff2.py
│   │   │       │   ├── ufoLib/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── converters.cpython-312.pyc
│   │   │       │   │   │   ├── errors.cpython-312.pyc
│   │   │       │   │   │   ├── etree.cpython-312.pyc
│   │   │       │   │   │   ├── filenames.cpython-312.pyc
│   │   │       │   │   │   ├── glifLib.cpython-312.pyc
│   │   │       │   │   │   ├── kerning.cpython-312.pyc
│   │   │       │   │   │   ├── plistlib.cpython-312.pyc
│   │   │       │   │   │   ├── pointPen.cpython-312.pyc
│   │   │       │   │   │   ├── utils.cpython-312.pyc
│   │   │       │   │   │   └── validators.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── converters.py
│   │   │       │   │   ├── errors.py
│   │   │       │   │   ├── etree.py
│   │   │       │   │   ├── filenames.py
│   │   │       │   │   ├── glifLib.py
│   │   │       │   │   ├── kerning.py
│   │   │       │   │   ├── plistlib.py
│   │   │       │   │   ├── pointPen.py
│   │   │       │   │   ├── utils.py
│   │   │       │   │   └── validators.py
│   │   │       │   ├── unicodedata/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── Blocks.cpython-312.pyc
│   │   │       │   │   │   ├── Mirrored.cpython-312.pyc
│   │   │       │   │   │   ├── OTTags.cpython-312.pyc
│   │   │       │   │   │   ├── ScriptExtensions.cpython-312.pyc
│   │   │       │   │   │   ├── Scripts.cpython-312.pyc
│   │   │       │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   ├── Blocks.py
│   │   │       │   │   ├── Mirrored.py
│   │   │       │   │   ├── OTTags.py
│   │   │       │   │   ├── ScriptExtensions.py
│   │   │       │   │   ├── Scripts.py
│   │   │       │   │   └── __init__.py
│   │   │       │   ├── varLib/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   ├── avarPlanner.cpython-312.pyc
│   │   │       │   │   │   ├── builder.cpython-312.pyc
│   │   │       │   │   │   ├── cff.cpython-312.pyc
│   │   │       │   │   │   ├── errors.cpython-312.pyc
│   │   │       │   │   │   ├── featureVars.cpython-312.pyc
│   │   │       │   │   │   ├── hvar.cpython-312.pyc
│   │   │       │   │   │   ├── interpolatable.cpython-312.pyc
│   │   │       │   │   │   ├── interpolatableHelpers.cpython-312.pyc
│   │   │       │   │   │   ├── interpolatablePlot.cpython-312.pyc
│   │   │       │   │   │   ├── interpolatableTestContourOrder.cpython-312.pyc
│   │   │       │   │   │   ├── interpolatableTestStartingPoint.cpython-312.pyc
│   │   │       │   │   │   ├── interpolate_layout.cpython-312.pyc
│   │   │       │   │   │   ├── iup.cpython-312.pyc
│   │   │       │   │   │   ├── merger.cpython-312.pyc
│   │   │       │   │   │   ├── models.cpython-312.pyc
│   │   │       │   │   │   ├── multiVarStore.cpython-312.pyc
│   │   │       │   │   │   ├── mutator.cpython-312.pyc
│   │   │       │   │   │   ├── mvar.cpython-312.pyc
│   │   │       │   │   │   ├── plot.cpython-312.pyc
│   │   │       │   │   │   ├── stat.cpython-312.pyc
│   │   │       │   │   │   └── varStore.cpython-312.pyc
│   │   │       │   │   ├── avar/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   │   ├── build.cpython-312.pyc
│   │   │       │   │   │   │   ├── map.cpython-312.pyc
│   │   │       │   │   │   │   ├── plan.cpython-312.pyc
│   │   │       │   │   │   │   └── unbuild.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── __main__.py
│   │   │       │   │   │   ├── build.py
│   │   │       │   │   │   ├── map.py
│   │   │       │   │   │   ├── plan.py
│   │   │       │   │   │   └── unbuild.py
│   │   │       │   │   ├── instancer/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   │   ├── featureVars.cpython-312.pyc
│   │   │       │   │   │   │   ├── names.cpython-312.pyc
│   │   │       │   │   │   │   └── solver.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── __main__.py
│   │   │       │   │   │   ├── featureVars.py
│   │   │       │   │   │   ├── names.py
│   │   │       │   │   │   └── solver.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __main__.py
│   │   │       │   │   ├── avarPlanner.py
│   │   │       │   │   ├── builder.py
│   │   │       │   │   ├── cff.py
│   │   │       │   │   ├── errors.py
│   │   │       │   │   ├── featureVars.py
│   │   │       │   │   ├── hvar.py
│   │   │       │   │   ├── interpolatable.py
│   │   │       │   │   ├── interpolatableHelpers.py
│   │   │       │   │   ├── interpolatablePlot.py
│   │   │       │   │   ├── interpolatableTestContourOrder.py
│   │   │       │   │   ├── interpolatableTestStartingPoint.py
│   │   │       │   │   ├── interpolate_layout.py
│   │   │       │   │   ├── iup.c
│   │   │       │   │   ├── iup.cp312-win_amd64.pyd
│   │   │       │   │   ├── iup.py
│   │   │       │   │   ├── merger.py
│   │   │       │   │   ├── models.py
│   │   │       │   │   ├── multiVarStore.py
│   │   │       │   │   ├── mutator.py
│   │   │       │   │   ├── mvar.py
│   │   │       │   │   ├── plot.py
│   │   │       │   │   ├── stat.py
│   │   │       │   │   └── varStore.py
│   │   │       │   ├── voltLib/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   ├── ast.cpython-312.pyc
│   │   │       │   │   │   ├── error.cpython-312.pyc
│   │   │       │   │   │   ├── lexer.cpython-312.pyc
│   │   │       │   │   │   ├── parser.cpython-312.pyc
│   │   │       │   │   │   └── voltToFea.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __main__.py
│   │   │       │   │   ├── ast.py
│   │   │       │   │   ├── error.py
│   │   │       │   │   ├── lexer.py
│   │   │       │   │   ├── parser.py
│   │   │       │   │   └── voltToFea.py
│   │   │       │   ├── __init__.py
│   │   │       │   ├── __main__.py
│   │   │       │   ├── afmLib.py
│   │   │       │   ├── agl.py
│   │   │       │   ├── annotations.py
│   │   │       │   ├── fontBuilder.py
│   │   │       │   ├── help.py
│   │   │       │   ├── tfmLib.py
│   │   │       │   ├── ttx.py
│   │   │       │   └── unicode.py
│   │   │       ├── fonttools-4.61.1.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   ├── LICENSE
│   │   │       │   │   └── LICENSE.external
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── WHEEL
│   │   │       │   ├── entry_points.txt
│   │   │       │   └── top_level.txt
│   │   │       ├── h11/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── _abnf.cpython-312.pyc
│   │   │       │   │   ├── _connection.cpython-312.pyc
│   │   │       │   │   ├── _events.cpython-312.pyc
│   │   │       │   │   ├── _headers.cpython-312.pyc
│   │   │       │   │   ├── _readers.cpython-312.pyc
│   │   │       │   │   ├── _receivebuffer.cpython-312.pyc
│   │   │       │   │   ├── _state.cpython-312.pyc
│   │   │       │   │   ├── _util.cpython-312.pyc
│   │   │       │   │   ├── _version.cpython-312.pyc
│   │   │       │   │   └── _writers.cpython-312.pyc
│   │   │       │   ├── __init__.py
│   │   │       │   ├── _abnf.py
│   │   │       │   ├── _connection.py
│   │   │       │   ├── _events.py
│   │   │       │   ├── _headers.py
│   │   │       │   ├── _readers.py
│   │   │       │   ├── _receivebuffer.py
│   │   │       │   ├── _state.py
│   │   │       │   ├── _util.py
│   │   │       │   ├── _version.py
│   │   │       │   ├── _writers.py
│   │   │       │   └── py.typed
│   │   │       ├── h11-0.16.0.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE.txt
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── WHEEL
│   │   │       │   └── top_level.txt
│   │   │       ├── idna/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── codec.cpython-312.pyc
│   │   │       │   │   ├── compat.cpython-312.pyc
│   │   │       │   │   ├── core.cpython-312.pyc
│   │   │       │   │   ├── idnadata.cpython-312.pyc
│   │   │       │   │   ├── intranges.cpython-312.pyc
│   │   │       │   │   ├── package_data.cpython-312.pyc
│   │   │       │   │   └── uts46data.cpython-312.pyc
│   │   │       │   ├── __init__.py
│   │   │       │   ├── codec.py
│   │   │       │   ├── compat.py
│   │   │       │   ├── core.py
│   │   │       │   ├── idnadata.py
│   │   │       │   ├── intranges.py
│   │   │       │   ├── package_data.py
│   │   │       │   ├── py.typed
│   │   │       │   └── uts46data.py
│   │   │       ├── idna-3.11.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE.md
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   └── WHEEL
│   │   │       ├── joblib/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── _cloudpickle_wrapper.cpython-312.pyc
│   │   │       │   │   ├── _dask.cpython-312.pyc
│   │   │       │   │   ├── _memmapping_reducer.cpython-312.pyc
│   │   │       │   │   ├── _multiprocessing_helpers.cpython-312.pyc
│   │   │       │   │   ├── _parallel_backends.cpython-312.pyc
│   │   │       │   │   ├── _store_backends.cpython-312.pyc
│   │   │       │   │   ├── _utils.cpython-312.pyc
│   │   │       │   │   ├── backports.cpython-312.pyc
│   │   │       │   │   ├── compressor.cpython-312.pyc
│   │   │       │   │   ├── disk.cpython-312.pyc
│   │   │       │   │   ├── executor.cpython-312.pyc
│   │   │       │   │   ├── func_inspect.cpython-312.pyc
│   │   │       │   │   ├── hashing.cpython-312.pyc
│   │   │       │   │   ├── logger.cpython-312.pyc
│   │   │       │   │   ├── memory.cpython-312.pyc
│   │   │       │   │   ├── numpy_pickle.cpython-312.pyc
│   │   │       │   │   ├── numpy_pickle_compat.cpython-312.pyc
│   │   │       │   │   ├── numpy_pickle_utils.cpython-312.pyc
│   │   │       │   │   ├── parallel.cpython-312.pyc
│   │   │       │   │   ├── pool.cpython-312.pyc
│   │   │       │   │   └── testing.cpython-312.pyc
│   │   │       │   ├── externals/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   ├── cloudpickle/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── cloudpickle.cpython-312.pyc
│   │   │       │   │   │   │   └── cloudpickle_fast.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── cloudpickle.py
│   │   │       │   │   │   └── cloudpickle_fast.py
│   │   │       │   │   ├── loky/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _base.cpython-312.pyc
│   │   │       │   │   │   │   ├── cloudpickle_wrapper.cpython-312.pyc
│   │   │       │   │   │   │   ├── initializers.cpython-312.pyc
│   │   │       │   │   │   │   ├── process_executor.cpython-312.pyc
│   │   │       │   │   │   │   └── reusable_executor.cpython-312.pyc
│   │   │       │   │   │   ├── backend/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _posix_reduction.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _win_reduction.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── context.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── fork_exec.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── popen_loky_posix.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── popen_loky_win32.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── process.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── queues.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── reduction.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── resource_tracker.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── spawn.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── synchronize.cpython-312.pyc
│   │   │       │   │   │   │   │   └── utils.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── _posix_reduction.py
│   │   │       │   │   │   │   ├── _win_reduction.py
│   │   │       │   │   │   │   ├── context.py
│   │   │       │   │   │   │   ├── fork_exec.py
│   │   │       │   │   │   │   ├── popen_loky_posix.py
│   │   │       │   │   │   │   ├── popen_loky_win32.py
│   │   │       │   │   │   │   ├── process.py
│   │   │       │   │   │   │   ├── queues.py
│   │   │       │   │   │   │   ├── reduction.py
│   │   │       │   │   │   │   ├── resource_tracker.py
│   │   │       │   │   │   │   ├── spawn.py
│   │   │       │   │   │   │   ├── synchronize.py
│   │   │       │   │   │   │   └── utils.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _base.py
│   │   │       │   │   │   ├── cloudpickle_wrapper.py
│   │   │       │   │   │   ├── initializers.py
│   │   │       │   │   │   ├── process_executor.py
│   │   │       │   │   │   └── reusable_executor.py
│   │   │       │   │   └── __init__.py
│   │   │       │   ├── test/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── common.cpython-312.pyc
│   │   │       │   │   │   ├── test_backports.cpython-312.pyc
│   │   │       │   │   │   ├── test_cloudpickle_wrapper.cpython-312.pyc
│   │   │       │   │   │   ├── test_config.cpython-312.pyc
│   │   │       │   │   │   ├── test_dask.cpython-312.pyc
│   │   │       │   │   │   ├── test_disk.cpython-312.pyc
│   │   │       │   │   │   ├── test_func_inspect.cpython-312.pyc
│   │   │       │   │   │   ├── test_func_inspect_special_encoding.cpython-312.pyc
│   │   │       │   │   │   ├── test_hashing.cpython-312.pyc
│   │   │       │   │   │   ├── test_init.cpython-312.pyc
│   │   │       │   │   │   ├── test_logger.cpython-312.pyc
│   │   │       │   │   │   ├── test_memmapping.cpython-312.pyc
│   │   │       │   │   │   ├── test_memory.cpython-312.pyc
│   │   │       │   │   │   ├── test_memory_async.cpython-312.pyc
│   │   │       │   │   │   ├── test_missing_multiprocessing.cpython-312.pyc
│   │   │       │   │   │   ├── test_module.cpython-312.pyc
│   │   │       │   │   │   ├── test_numpy_pickle.cpython-312.pyc
│   │   │       │   │   │   ├── test_numpy_pickle_compat.cpython-312.pyc
│   │   │       │   │   │   ├── test_numpy_pickle_utils.cpython-312.pyc
│   │   │       │   │   │   ├── test_parallel.cpython-312.pyc
│   │   │       │   │   │   ├── test_store_backends.cpython-312.pyc
│   │   │       │   │   │   ├── test_testing.cpython-312.pyc
│   │   │       │   │   │   ├── test_utils.cpython-312.pyc
│   │   │       │   │   │   └── testutils.cpython-312.pyc
│   │   │       │   │   ├── data/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── create_numpy_pickle.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── create_numpy_pickle.py
│   │   │       │   │   │   ├── joblib_0.10.0_compressed_pickle_py27_np16.gz
│   │   │       │   │   │   ├── joblib_0.10.0_compressed_pickle_py27_np17.gz
│   │   │       │   │   │   ├── joblib_0.10.0_compressed_pickle_py33_np18.gz
│   │   │       │   │   │   ├── joblib_0.10.0_compressed_pickle_py34_np19.gz
│   │   │       │   │   │   ├── joblib_0.10.0_compressed_pickle_py35_np19.gz
│   │   │       │   │   │   ├── joblib_0.10.0_pickle_py27_np17.pkl
│   │   │       │   │   │   ├── joblib_0.10.0_pickle_py27_np17.pkl.bz2
│   │   │       │   │   │   ├── joblib_0.10.0_pickle_py27_np17.pkl.gzip
│   │   │       │   │   │   ├── joblib_0.10.0_pickle_py27_np17.pkl.lzma
│   │   │       │   │   │   ├── joblib_0.10.0_pickle_py27_np17.pkl.xz
│   │   │       │   │   │   ├── joblib_0.10.0_pickle_py33_np18.pkl
│   │   │       │   │   │   ├── joblib_0.10.0_pickle_py33_np18.pkl.bz2
│   │   │       │   │   │   ├── joblib_0.10.0_pickle_py33_np18.pkl.gzip
│   │   │       │   │   │   ├── joblib_0.10.0_pickle_py33_np18.pkl.lzma
│   │   │       │   │   │   ├── joblib_0.10.0_pickle_py33_np18.pkl.xz
│   │   │       │   │   │   ├── joblib_0.10.0_pickle_py34_np19.pkl
│   │   │       │   │   │   ├── joblib_0.10.0_pickle_py34_np19.pkl.bz2
│   │   │       │   │   │   ├── joblib_0.10.0_pickle_py34_np19.pkl.gzip
│   │   │       │   │   │   ├── joblib_0.10.0_pickle_py34_np19.pkl.lzma
│   │   │       │   │   │   ├── joblib_0.10.0_pickle_py34_np19.pkl.xz
│   │   │       │   │   │   ├── joblib_0.10.0_pickle_py35_np19.pkl
│   │   │       │   │   │   ├── joblib_0.10.0_pickle_py35_np19.pkl.bz2
│   │   │       │   │   │   ├── joblib_0.10.0_pickle_py35_np19.pkl.gzip
│   │   │       │   │   │   ├── joblib_0.10.0_pickle_py35_np19.pkl.lzma
│   │   │       │   │   │   ├── joblib_0.10.0_pickle_py35_np19.pkl.xz
│   │   │       │   │   │   ├── joblib_0.11.0_compressed_pickle_py36_np111.gz
│   │   │       │   │   │   ├── joblib_0.11.0_pickle_py36_np111.pkl
│   │   │       │   │   │   ├── joblib_0.11.0_pickle_py36_np111.pkl.bz2
│   │   │       │   │   │   ├── joblib_0.11.0_pickle_py36_np111.pkl.gzip
│   │   │       │   │   │   ├── joblib_0.11.0_pickle_py36_np111.pkl.lzma
│   │   │       │   │   │   ├── joblib_0.11.0_pickle_py36_np111.pkl.xz
│   │   │       │   │   │   ├── joblib_0.8.4_compressed_pickle_py27_np17.gz
│   │   │       │   │   │   ├── joblib_0.9.2_compressed_pickle_py27_np16.gz
│   │   │       │   │   │   ├── joblib_0.9.2_compressed_pickle_py27_np17.gz
│   │   │       │   │   │   ├── joblib_0.9.2_compressed_pickle_py34_np19.gz
│   │   │       │   │   │   ├── joblib_0.9.2_compressed_pickle_py35_np19.gz
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py27_np16.pkl
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py27_np16.pkl_01.npy
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py27_np16.pkl_02.npy
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py27_np16.pkl_03.npy
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py27_np16.pkl_04.npy
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py27_np17.pkl
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py27_np17.pkl_01.npy
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py27_np17.pkl_02.npy
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py27_np17.pkl_03.npy
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py27_np17.pkl_04.npy
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py33_np18.pkl
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py33_np18.pkl_01.npy
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py33_np18.pkl_02.npy
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py33_np18.pkl_03.npy
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py33_np18.pkl_04.npy
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py34_np19.pkl
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py34_np19.pkl_01.npy
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py34_np19.pkl_02.npy
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py34_np19.pkl_03.npy
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py34_np19.pkl_04.npy
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py35_np19.pkl
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py35_np19.pkl_01.npy
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py35_np19.pkl_02.npy
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py35_np19.pkl_03.npy
│   │   │       │   │   │   ├── joblib_0.9.2_pickle_py35_np19.pkl_04.npy
│   │   │       │   │   │   ├── joblib_0.9.4.dev0_compressed_cache_size_pickle_py35_np19.gz
│   │   │       │   │   │   ├── joblib_0.9.4.dev0_compressed_cache_size_pickle_py35_np19.gz_01.npy.z
│   │   │       │   │   │   ├── joblib_0.9.4.dev0_compressed_cache_size_pickle_py35_np19.gz_02.npy.z
│   │   │       │   │   │   └── joblib_0.9.4.dev0_compressed_cache_size_pickle_py35_np19.gz_03.npy.z
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── common.py
│   │   │       │   │   ├── test_backports.py
│   │   │       │   │   ├── test_cloudpickle_wrapper.py
│   │   │       │   │   ├── test_config.py
│   │   │       │   │   ├── test_dask.py
│   │   │       │   │   ├── test_disk.py
│   │   │       │   │   ├── test_func_inspect.py
│   │   │       │   │   ├── test_func_inspect_special_encoding.py
│   │   │       │   │   ├── test_hashing.py
│   │   │       │   │   ├── test_init.py
│   │   │       │   │   ├── test_logger.py
│   │   │       │   │   ├── test_memmapping.py
│   │   │       │   │   ├── test_memory.py
│   │   │       │   │   ├── test_memory_async.py
│   │   │       │   │   ├── test_missing_multiprocessing.py
│   │   │       │   │   ├── test_module.py
│   │   │       │   │   ├── test_numpy_pickle.py
│   │   │       │   │   ├── test_numpy_pickle_compat.py
│   │   │       │   │   ├── test_numpy_pickle_utils.py
│   │   │       │   │   ├── test_parallel.py
│   │   │       │   │   ├── test_store_backends.py
│   │   │       │   │   ├── test_testing.py
│   │   │       │   │   ├── test_utils.py
│   │   │       │   │   └── testutils.py
│   │   │       │   ├── __init__.py
│   │   │       │   ├── _cloudpickle_wrapper.py
│   │   │       │   ├── _dask.py
│   │   │       │   ├── _memmapping_reducer.py
│   │   │       │   ├── _multiprocessing_helpers.py
│   │   │       │   ├── _parallel_backends.py
│   │   │       │   ├── _store_backends.py
│   │   │       │   ├── _utils.py
│   │   │       │   ├── backports.py
│   │   │       │   ├── compressor.py
│   │   │       │   ├── disk.py
│   │   │       │   ├── executor.py
│   │   │       │   ├── func_inspect.py
│   │   │       │   ├── hashing.py
│   │   │       │   ├── logger.py
│   │   │       │   ├── memory.py
│   │   │       │   ├── numpy_pickle.py
│   │   │       │   ├── numpy_pickle_compat.py
│   │   │       │   ├── numpy_pickle_utils.py
│   │   │       │   ├── parallel.py
│   │   │       │   ├── pool.py
│   │   │       │   └── testing.py
│   │   │       ├── joblib-1.5.3.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE.txt
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── REQUESTED
│   │   │       │   ├── WHEEL
│   │   │       │   └── top_level.txt
│   │   │       ├── kiwisolver/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   └── exceptions.cpython-312.pyc
│   │   │       │   ├── __init__.py
│   │   │       │   ├── _cext.cp312-win_amd64.pyd
│   │   │       │   ├── _cext.pyi
│   │   │       │   ├── exceptions.py
│   │   │       │   └── py.typed
│   │   │       ├── kiwisolver-1.4.9.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── WHEEL
│   │   │       │   └── top_level.txt
│   │   │       ├── matplotlib/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── _afm.cpython-312.pyc
│   │   │       │   │   ├── _animation_data.cpython-312.pyc
│   │   │       │   │   ├── _blocking_input.cpython-312.pyc
│   │   │       │   │   ├── _cm.cpython-312.pyc
│   │   │       │   │   ├── _cm_bivar.cpython-312.pyc
│   │   │       │   │   ├── _cm_listed.cpython-312.pyc
│   │   │       │   │   ├── _cm_multivar.cpython-312.pyc
│   │   │       │   │   ├── _color_data.cpython-312.pyc
│   │   │       │   │   ├── _constrained_layout.cpython-312.pyc
│   │   │       │   │   ├── _docstring.cpython-312.pyc
│   │   │       │   │   ├── _enums.cpython-312.pyc
│   │   │       │   │   ├── _fontconfig_pattern.cpython-312.pyc
│   │   │       │   │   ├── _internal_utils.cpython-312.pyc
│   │   │       │   │   ├── _layoutgrid.cpython-312.pyc
│   │   │       │   │   ├── _mathtext.cpython-312.pyc
│   │   │       │   │   ├── _mathtext_data.cpython-312.pyc
│   │   │       │   │   ├── _pylab_helpers.cpython-312.pyc
│   │   │       │   │   ├── _text_helpers.cpython-312.pyc
│   │   │       │   │   ├── _tight_bbox.cpython-312.pyc
│   │   │       │   │   ├── _tight_layout.cpython-312.pyc
│   │   │       │   │   ├── _type1font.cpython-312.pyc
│   │   │       │   │   ├── _version.cpython-312.pyc
│   │   │       │   │   ├── animation.cpython-312.pyc
│   │   │       │   │   ├── artist.cpython-312.pyc
│   │   │       │   │   ├── axis.cpython-312.pyc
│   │   │       │   │   ├── backend_bases.cpython-312.pyc
│   │   │       │   │   ├── backend_managers.cpython-312.pyc
│   │   │       │   │   ├── backend_tools.cpython-312.pyc
│   │   │       │   │   ├── bezier.cpython-312.pyc
│   │   │       │   │   ├── category.cpython-312.pyc
│   │   │       │   │   ├── cbook.cpython-312.pyc
│   │   │       │   │   ├── cm.cpython-312.pyc
│   │   │       │   │   ├── collections.cpython-312.pyc
│   │   │       │   │   ├── colorbar.cpython-312.pyc
│   │   │       │   │   ├── colorizer.cpython-312.pyc
│   │   │       │   │   ├── colors.cpython-312.pyc
│   │   │       │   │   ├── container.cpython-312.pyc
│   │   │       │   │   ├── contour.cpython-312.pyc
│   │   │       │   │   ├── dates.cpython-312.pyc
│   │   │       │   │   ├── dviread.cpython-312.pyc
│   │   │       │   │   ├── figure.cpython-312.pyc
│   │   │       │   │   ├── font_manager.cpython-312.pyc
│   │   │       │   │   ├── gridspec.cpython-312.pyc
│   │   │       │   │   ├── hatch.cpython-312.pyc
│   │   │       │   │   ├── image.cpython-312.pyc
│   │   │       │   │   ├── inset.cpython-312.pyc
│   │   │       │   │   ├── layout_engine.cpython-312.pyc
│   │   │       │   │   ├── legend.cpython-312.pyc
│   │   │       │   │   ├── legend_handler.cpython-312.pyc
│   │   │       │   │   ├── lines.cpython-312.pyc
│   │   │       │   │   ├── markers.cpython-312.pyc
│   │   │       │   │   ├── mathtext.cpython-312.pyc
│   │   │       │   │   ├── mlab.cpython-312.pyc
│   │   │       │   │   ├── offsetbox.cpython-312.pyc
│   │   │       │   │   ├── patches.cpython-312.pyc
│   │   │       │   │   ├── path.cpython-312.pyc
│   │   │       │   │   ├── patheffects.cpython-312.pyc
│   │   │       │   │   ├── pylab.cpython-312.pyc
│   │   │       │   │   ├── pyplot.cpython-312.pyc
│   │   │       │   │   ├── quiver.cpython-312.pyc
│   │   │       │   │   ├── rcsetup.cpython-312.pyc
│   │   │       │   │   ├── sankey.cpython-312.pyc
│   │   │       │   │   ├── scale.cpython-312.pyc
│   │   │       │   │   ├── spines.cpython-312.pyc
│   │   │       │   │   ├── stackplot.cpython-312.pyc
│   │   │       │   │   ├── streamplot.cpython-312.pyc
│   │   │       │   │   ├── table.cpython-312.pyc
│   │   │       │   │   ├── texmanager.cpython-312.pyc
│   │   │       │   │   ├── text.cpython-312.pyc
│   │   │       │   │   ├── textpath.cpython-312.pyc
│   │   │       │   │   ├── ticker.cpython-312.pyc
│   │   │       │   │   ├── transforms.cpython-312.pyc
│   │   │       │   │   ├── typing.cpython-312.pyc
│   │   │       │   │   ├── units.cpython-312.pyc
│   │   │       │   │   └── widgets.cpython-312.pyc
│   │   │       │   ├── _api/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   └── deprecation.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __init__.pyi
│   │   │       │   │   ├── deprecation.py
│   │   │       │   │   └── deprecation.pyi
│   │   │       │   ├── axes/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _axes.cpython-312.pyc
│   │   │       │   │   │   ├── _base.cpython-312.pyc
│   │   │       │   │   │   └── _secondary_axes.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __init__.pyi
│   │   │       │   │   ├── _axes.py
│   │   │       │   │   ├── _axes.pyi
│   │   │       │   │   ├── _base.py
│   │   │       │   │   ├── _base.pyi
│   │   │       │   │   ├── _secondary_axes.py
│   │   │       │   │   └── _secondary_axes.pyi
│   │   │       │   ├── backends/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _backend_gtk.cpython-312.pyc
│   │   │       │   │   │   ├── _backend_pdf_ps.cpython-312.pyc
│   │   │       │   │   │   ├── _backend_tk.cpython-312.pyc
│   │   │       │   │   │   ├── backend_agg.cpython-312.pyc
│   │   │       │   │   │   ├── backend_cairo.cpython-312.pyc
│   │   │       │   │   │   ├── backend_gtk3.cpython-312.pyc
│   │   │       │   │   │   ├── backend_gtk3agg.cpython-312.pyc
│   │   │       │   │   │   ├── backend_gtk3cairo.cpython-312.pyc
│   │   │       │   │   │   ├── backend_gtk4.cpython-312.pyc
│   │   │       │   │   │   ├── backend_gtk4agg.cpython-312.pyc
│   │   │       │   │   │   ├── backend_gtk4cairo.cpython-312.pyc
│   │   │       │   │   │   ├── backend_macosx.cpython-312.pyc
│   │   │       │   │   │   ├── backend_mixed.cpython-312.pyc
│   │   │       │   │   │   ├── backend_nbagg.cpython-312.pyc
│   │   │       │   │   │   ├── backend_pdf.cpython-312.pyc
│   │   │       │   │   │   ├── backend_pgf.cpython-312.pyc
│   │   │       │   │   │   ├── backend_ps.cpython-312.pyc
│   │   │       │   │   │   ├── backend_qt.cpython-312.pyc
│   │   │       │   │   │   ├── backend_qt5.cpython-312.pyc
│   │   │       │   │   │   ├── backend_qt5agg.cpython-312.pyc
│   │   │       │   │   │   ├── backend_qt5cairo.cpython-312.pyc
│   │   │       │   │   │   ├── backend_qtagg.cpython-312.pyc
│   │   │       │   │   │   ├── backend_qtcairo.cpython-312.pyc
│   │   │       │   │   │   ├── backend_svg.cpython-312.pyc
│   │   │       │   │   │   ├── backend_template.cpython-312.pyc
│   │   │       │   │   │   ├── backend_tkagg.cpython-312.pyc
│   │   │       │   │   │   ├── backend_tkcairo.cpython-312.pyc
│   │   │       │   │   │   ├── backend_webagg.cpython-312.pyc
│   │   │       │   │   │   ├── backend_webagg_core.cpython-312.pyc
│   │   │       │   │   │   ├── backend_wx.cpython-312.pyc
│   │   │       │   │   │   ├── backend_wxagg.cpython-312.pyc
│   │   │       │   │   │   ├── backend_wxcairo.cpython-312.pyc
│   │   │       │   │   │   ├── qt_compat.cpython-312.pyc
│   │   │       │   │   │   └── registry.cpython-312.pyc
│   │   │       │   │   ├── qt_editor/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _formlayout.cpython-312.pyc
│   │   │       │   │   │   │   └── figureoptions.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _formlayout.py
│   │   │       │   │   │   └── figureoptions.py
│   │   │       │   │   ├── web_backend/
│   │   │       │   │   │   ├── css/
│   │   │       │   │   │   │   ├── boilerplate.css
│   │   │       │   │   │   │   ├── fbm.css
│   │   │       │   │   │   │   ├── mpl.css
│   │   │       │   │   │   │   └── page.css
│   │   │       │   │   │   ├── js/
│   │   │       │   │   │   │   ├── mpl.js
│   │   │       │   │   │   │   ├── mpl_tornado.js
│   │   │       │   │   │   │   └── nbagg_mpl.js
│   │   │       │   │   │   ├── all_figures.html
│   │   │       │   │   │   ├── ipython_inline_figure.html
│   │   │       │   │   │   └── single_figure.html
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _backend_agg.cp312-win_amd64.pyd
│   │   │       │   │   ├── _backend_agg.pyi
│   │   │       │   │   ├── _backend_gtk.py
│   │   │       │   │   ├── _backend_pdf_ps.py
│   │   │       │   │   ├── _backend_tk.py
│   │   │       │   │   ├── _macosx.pyi
│   │   │       │   │   ├── _tkagg.cp312-win_amd64.pyd
│   │   │       │   │   ├── _tkagg.pyi
│   │   │       │   │   ├── backend_agg.py
│   │   │       │   │   ├── backend_cairo.py
│   │   │       │   │   ├── backend_gtk3.py
│   │   │       │   │   ├── backend_gtk3agg.py
│   │   │       │   │   ├── backend_gtk3cairo.py
│   │   │       │   │   ├── backend_gtk4.py
│   │   │       │   │   ├── backend_gtk4agg.py
│   │   │       │   │   ├── backend_gtk4cairo.py
│   │   │       │   │   ├── backend_macosx.py
│   │   │       │   │   ├── backend_mixed.py
│   │   │       │   │   ├── backend_nbagg.py
│   │   │       │   │   ├── backend_pdf.py
│   │   │       │   │   ├── backend_pgf.py
│   │   │       │   │   ├── backend_ps.py
│   │   │       │   │   ├── backend_qt.py
│   │   │       │   │   ├── backend_qt5.py
│   │   │       │   │   ├── backend_qt5agg.py
│   │   │       │   │   ├── backend_qt5cairo.py
│   │   │       │   │   ├── backend_qtagg.py
│   │   │       │   │   ├── backend_qtcairo.py
│   │   │       │   │   ├── backend_svg.py
│   │   │       │   │   ├── backend_template.py
│   │   │       │   │   ├── backend_tkagg.py
│   │   │       │   │   ├── backend_tkcairo.py
│   │   │       │   │   ├── backend_webagg.py
│   │   │       │   │   ├── backend_webagg_core.py
│   │   │       │   │   ├── backend_wx.py
│   │   │       │   │   ├── backend_wxagg.py
│   │   │       │   │   ├── backend_wxcairo.py
│   │   │       │   │   ├── qt_compat.py
│   │   │       │   │   └── registry.py
│   │   │       │   ├── mpl-data/
│   │   │       │   │   ├── fonts/
│   │   │       │   │   │   ├── afm/
│   │   │       │   │   │   │   ├── cmex10.afm
│   │   │       │   │   │   │   ├── cmmi10.afm
│   │   │       │   │   │   │   ├── cmr10.afm
│   │   │       │   │   │   │   ├── cmsy10.afm
│   │   │       │   │   │   │   ├── cmtt10.afm
│   │   │       │   │   │   │   ├── pagd8a.afm
│   │   │       │   │   │   │   ├── pagdo8a.afm
│   │   │       │   │   │   │   ├── pagk8a.afm
│   │   │       │   │   │   │   ├── pagko8a.afm
│   │   │       │   │   │   │   ├── pbkd8a.afm
│   │   │       │   │   │   │   ├── pbkdi8a.afm
│   │   │       │   │   │   │   ├── pbkl8a.afm
│   │   │       │   │   │   │   ├── pbkli8a.afm
│   │   │       │   │   │   │   ├── pcrb8a.afm
│   │   │       │   │   │   │   ├── pcrbo8a.afm
│   │   │       │   │   │   │   ├── pcrr8a.afm
│   │   │       │   │   │   │   ├── pcrro8a.afm
│   │   │       │   │   │   │   ├── phvb8a.afm
│   │   │       │   │   │   │   ├── phvb8an.afm
│   │   │       │   │   │   │   ├── phvbo8a.afm
│   │   │       │   │   │   │   ├── phvbo8an.afm
│   │   │       │   │   │   │   ├── phvl8a.afm
│   │   │       │   │   │   │   ├── phvlo8a.afm
│   │   │       │   │   │   │   ├── phvr8a.afm
│   │   │       │   │   │   │   ├── phvr8an.afm
│   │   │       │   │   │   │   ├── phvro8a.afm
│   │   │       │   │   │   │   ├── phvro8an.afm
│   │   │       │   │   │   │   ├── pncb8a.afm
│   │   │       │   │   │   │   ├── pncbi8a.afm
│   │   │       │   │   │   │   ├── pncr8a.afm
│   │   │       │   │   │   │   ├── pncri8a.afm
│   │   │       │   │   │   │   ├── pplb8a.afm
│   │   │       │   │   │   │   ├── pplbi8a.afm
│   │   │       │   │   │   │   ├── pplr8a.afm
│   │   │       │   │   │   │   ├── pplri8a.afm
│   │   │       │   │   │   │   ├── psyr.afm
│   │   │       │   │   │   │   ├── ptmb8a.afm
│   │   │       │   │   │   │   ├── ptmbi8a.afm
│   │   │       │   │   │   │   ├── ptmr8a.afm
│   │   │       │   │   │   │   ├── ptmri8a.afm
│   │   │       │   │   │   │   ├── putb8a.afm
│   │   │       │   │   │   │   ├── putbi8a.afm
│   │   │       │   │   │   │   ├── putr8a.afm
│   │   │       │   │   │   │   ├── putri8a.afm
│   │   │       │   │   │   │   ├── pzcmi8a.afm
│   │   │       │   │   │   │   └── pzdr.afm
│   │   │       │   │   │   ├── pdfcorefonts/
│   │   │       │   │   │   │   ├── Courier-Bold.afm
│   │   │       │   │   │   │   ├── Courier-BoldOblique.afm
│   │   │       │   │   │   │   ├── Courier-Oblique.afm
│   │   │       │   │   │   │   ├── Courier.afm
│   │   │       │   │   │   │   ├── Helvetica-Bold.afm
│   │   │       │   │   │   │   ├── Helvetica-BoldOblique.afm
│   │   │       │   │   │   │   ├── Helvetica-Oblique.afm
│   │   │       │   │   │   │   ├── Helvetica.afm
│   │   │       │   │   │   │   ├── Symbol.afm
│   │   │       │   │   │   │   ├── Times-Bold.afm
│   │   │       │   │   │   │   ├── Times-BoldItalic.afm
│   │   │       │   │   │   │   ├── Times-Italic.afm
│   │   │       │   │   │   │   ├── Times-Roman.afm
│   │   │       │   │   │   │   ├── ZapfDingbats.afm
│   │   │       │   │   │   │   └── readme.txt
│   │   │       │   │   │   ├── ttf/
│   │   │       │   │   │       ├── DejaVuSans-Bold.ttf
│   │   │       │   │   │       ├── DejaVuSans-BoldOblique.ttf
│   │   │       │   │   │       ├── DejaVuSans-Oblique.ttf
│   │   │       │   │   │       ├── DejaVuSans.ttf
│   │   │       │   │   │       ├── DejaVuSansDisplay.ttf
│   │   │       │   │   │       ├── DejaVuSansMono-Bold.ttf
│   │   │       │   │   │       ├── DejaVuSansMono-BoldOblique.ttf
│   │   │       │   │   │       ├── DejaVuSansMono-Oblique.ttf
│   │   │       │   │   │       ├── DejaVuSansMono.ttf
│   │   │       │   │   │       ├── DejaVuSerif-Bold.ttf
│   │   │       │   │   │       ├── DejaVuSerif-BoldItalic.ttf
│   │   │       │   │   │       ├── DejaVuSerif-Italic.ttf
│   │   │       │   │   │       ├── DejaVuSerif.ttf
│   │   │       │   │   │       ├── DejaVuSerifDisplay.ttf
│   │   │       │   │   │       ├── LICENSE_DEJAVU
│   │   │       │   │   │       ├── LICENSE_STIX
│   │   │       │   │   │       ├── STIXGeneral.ttf
│   │   │       │   │   │       ├── STIXGeneralBol.ttf
│   │   │       │   │   │       ├── STIXGeneralBolIta.ttf
│   │   │       │   │   │       ├── STIXGeneralItalic.ttf
│   │   │       │   │   │       ├── STIXNonUni.ttf
│   │   │       │   │   │       ├── STIXNonUniBol.ttf
│   │   │       │   │   │       ├── STIXNonUniBolIta.ttf
│   │   │       │   │   │       ├── STIXNonUniIta.ttf
│   │   │       │   │   │       ├── STIXSizFiveSymReg.ttf
│   │   │       │   │   │       ├── STIXSizFourSymBol.ttf
│   │   │       │   │   │       ├── STIXSizFourSymReg.ttf
│   │   │       │   │   │       ├── STIXSizOneSymBol.ttf
│   │   │       │   │   │       ├── STIXSizOneSymReg.ttf
│   │   │       │   │   │       ├── STIXSizThreeSymBol.ttf
│   │   │       │   │   │       ├── STIXSizThreeSymReg.ttf
│   │   │       │   │   │       ├── STIXSizTwoSymBol.ttf
│   │   │       │   │   │       ├── STIXSizTwoSymReg.ttf
│   │   │       │   │   │       ├── cmb10.ttf
│   │   │       │   │   │       ├── cmex10.ttf
│   │   │       │   │   │       ├── cmmi10.ttf
│   │   │       │   │   │       ├── cmr10.ttf
│   │   │       │   │   │       ├── cmss10.ttf
│   │   │       │   │   │       ├── cmsy10.ttf
│   │   │       │   │   │       └── cmtt10.ttf
│   │   │       │   │   ├── images/
│   │   │       │   │   │   ├── back-symbolic.svg
│   │   │       │   │   │   ├── back.pdf
│   │   │       │   │   │   ├── back.png
│   │   │       │   │   │   ├── back.svg
│   │   │       │   │   │   ├── back_large.png
│   │   │       │   │   │   ├── filesave-symbolic.svg
│   │   │       │   │   │   ├── filesave.pdf
│   │   │       │   │   │   ├── filesave.png
│   │   │       │   │   │   ├── filesave.svg
│   │   │       │   │   │   ├── filesave_large.png
│   │   │       │   │   │   ├── forward-symbolic.svg
│   │   │       │   │   │   ├── forward.pdf
│   │   │       │   │   │   ├── forward.png
│   │   │       │   │   │   ├── forward.svg
│   │   │       │   │   │   ├── forward_large.png
│   │   │       │   │   │   ├── hand.pdf
│   │   │       │   │   │   ├── hand.png
│   │   │       │   │   │   ├── hand.svg
│   │   │       │   │   │   ├── help-symbolic.svg
│   │   │       │   │   │   ├── help.pdf
│   │   │       │   │   │   ├── help.png
│   │   │       │   │   │   ├── help.svg
│   │   │       │   │   │   ├── help_large.png
│   │   │       │   │   │   ├── home-symbolic.svg
│   │   │       │   │   │   ├── home.pdf
│   │   │       │   │   │   ├── home.png
│   │   │       │   │   │   ├── home.svg
│   │   │       │   │   │   ├── home_large.png
│   │   │       │   │   │   ├── matplotlib.pdf
│   │   │       │   │   │   ├── matplotlib.png
│   │   │       │   │   │   ├── matplotlib.svg
│   │   │       │   │   │   ├── matplotlib_large.png
│   │   │       │   │   │   ├── move-symbolic.svg
│   │   │       │   │   │   ├── move.pdf
│   │   │       │   │   │   ├── move.png
│   │   │       │   │   │   ├── move.svg
│   │   │       │   │   │   ├── move_large.png
│   │   │       │   │   │   ├── qt4_editor_options.pdf
│   │   │       │   │   │   ├── qt4_editor_options.png
│   │   │       │   │   │   ├── qt4_editor_options.svg
│   │   │       │   │   │   ├── qt4_editor_options_large.png
│   │   │       │   │   │   ├── subplots-symbolic.svg
│   │   │       │   │   │   ├── subplots.pdf
│   │   │       │   │   │   ├── subplots.png
│   │   │       │   │   │   ├── subplots.svg
│   │   │       │   │   │   ├── subplots_large.png
│   │   │       │   │   │   ├── zoom_to_rect-symbolic.svg
│   │   │       │   │   │   ├── zoom_to_rect.pdf
│   │   │       │   │   │   ├── zoom_to_rect.png
│   │   │       │   │   │   ├── zoom_to_rect.svg
│   │   │       │   │   │   └── zoom_to_rect_large.png
│   │   │       │   │   ├── plot_directive/
│   │   │       │   │   │   └── plot_directive.css
│   │   │       │   │   ├── sample_data/
│   │   │       │   │   │   ├── axes_grid/
│   │   │       │   │   │   │   └── bivariate_normal.npy
│   │   │       │   │   │   ├── Minduka_Present_Blue_Pack.png
│   │   │       │   │   │   ├── README.txt
│   │   │       │   │   │   ├── Stocks.csv
│   │   │       │   │   │   ├── data_x_x2_x3.csv
│   │   │       │   │   │   ├── eeg.dat
│   │   │       │   │   │   ├── embedding_in_wx3.xrc
│   │   │       │   │   │   ├── goog.npz
│   │   │       │   │   │   ├── grace_hopper.jpg
│   │   │       │   │   │   ├── jacksboro_fault_dem.npz
│   │   │       │   │   │   ├── logo2.png
│   │   │       │   │   │   ├── membrane.dat
│   │   │       │   │   │   ├── msft.csv
│   │   │       │   │   │   ├── s1045.ima.gz
│   │   │       │   │   │   └── topobathy.npz
│   │   │       │   │   ├── stylelib/
│   │   │       │   │   │   ├── Solarize_Light2.mplstyle
│   │   │       │   │   │   ├── _classic_test_patch.mplstyle
│   │   │       │   │   │   ├── _mpl-gallery-nogrid.mplstyle
│   │   │       │   │   │   ├── _mpl-gallery.mplstyle
│   │   │       │   │   │   ├── bmh.mplstyle
│   │   │       │   │   │   ├── classic.mplstyle
│   │   │       │   │   │   ├── dark_background.mplstyle
│   │   │       │   │   │   ├── fast.mplstyle
│   │   │       │   │   │   ├── fivethirtyeight.mplstyle
│   │   │       │   │   │   ├── ggplot.mplstyle
│   │   │       │   │   │   ├── grayscale.mplstyle
│   │   │       │   │   │   ├── petroff10.mplstyle
│   │   │       │   │   │   ├── seaborn-v0_8-bright.mplstyle
│   │   │       │   │   │   ├── seaborn-v0_8-colorblind.mplstyle
│   │   │       │   │   │   ├── seaborn-v0_8-dark-palette.mplstyle
│   │   │       │   │   │   ├── seaborn-v0_8-dark.mplstyle
│   │   │       │   │   │   ├── seaborn-v0_8-darkgrid.mplstyle
│   │   │       │   │   │   ├── seaborn-v0_8-deep.mplstyle
│   │   │       │   │   │   ├── seaborn-v0_8-muted.mplstyle
│   │   │       │   │   │   ├── seaborn-v0_8-notebook.mplstyle
│   │   │       │   │   │   ├── seaborn-v0_8-paper.mplstyle
│   │   │       │   │   │   ├── seaborn-v0_8-pastel.mplstyle
│   │   │       │   │   │   ├── seaborn-v0_8-poster.mplstyle
│   │   │       │   │   │   ├── seaborn-v0_8-talk.mplstyle
│   │   │       │   │   │   ├── seaborn-v0_8-ticks.mplstyle
│   │   │       │   │   │   ├── seaborn-v0_8-white.mplstyle
│   │   │       │   │   │   ├── seaborn-v0_8-whitegrid.mplstyle
│   │   │       │   │   │   ├── seaborn-v0_8.mplstyle
│   │   │       │   │   │   └── tableau-colorblind10.mplstyle
│   │   │       │   │   ├── kpsewhich.lua
│   │   │       │   │   └── matplotlibrc
│   │   │       │   ├── projections/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── geo.cpython-312.pyc
│   │   │       │   │   │   └── polar.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __init__.pyi
│   │   │       │   │   ├── geo.py
│   │   │       │   │   ├── geo.pyi
│   │   │       │   │   ├── polar.py
│   │   │       │   │   └── polar.pyi
│   │   │       │   ├── sphinxext/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── figmpl_directive.cpython-312.pyc
│   │   │       │   │   │   ├── mathmpl.cpython-312.pyc
│   │   │       │   │   │   ├── plot_directive.cpython-312.pyc
│   │   │       │   │   │   └── roles.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── figmpl_directive.py
│   │   │       │   │   ├── mathmpl.py
│   │   │       │   │   ├── plot_directive.py
│   │   │       │   │   └── roles.py
│   │   │       │   ├── style/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   └── core.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── core.py
│   │   │       │   │   └── core.pyi
│   │   │       │   ├── testing/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _markers.cpython-312.pyc
│   │   │       │   │   │   ├── compare.cpython-312.pyc
│   │   │       │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   ├── decorators.cpython-312.pyc
│   │   │       │   │   │   ├── exceptions.cpython-312.pyc
│   │   │       │   │   │   └── widgets.cpython-312.pyc
│   │   │       │   │   ├── jpl_units/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── Duration.cpython-312.pyc
│   │   │       │   │   │   │   ├── Epoch.cpython-312.pyc
│   │   │       │   │   │   │   ├── EpochConverter.cpython-312.pyc
│   │   │       │   │   │   │   ├── StrConverter.cpython-312.pyc
│   │   │       │   │   │   │   ├── UnitDbl.cpython-312.pyc
│   │   │       │   │   │   │   ├── UnitDblConverter.cpython-312.pyc
│   │   │       │   │   │   │   ├── UnitDblFormatter.cpython-312.pyc
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── Duration.py
│   │   │       │   │   │   ├── Epoch.py
│   │   │       │   │   │   ├── EpochConverter.py
│   │   │       │   │   │   ├── StrConverter.py
│   │   │       │   │   │   ├── UnitDbl.py
│   │   │       │   │   │   ├── UnitDblConverter.py
│   │   │       │   │   │   ├── UnitDblFormatter.py
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __init__.pyi
│   │   │       │   │   ├── _markers.py
│   │   │       │   │   ├── compare.py
│   │   │       │   │   ├── compare.pyi
│   │   │       │   │   ├── conftest.py
│   │   │       │   │   ├── conftest.pyi
│   │   │       │   │   ├── decorators.py
│   │   │       │   │   ├── decorators.pyi
│   │   │       │   │   ├── exceptions.py
│   │   │       │   │   ├── widgets.py
│   │   │       │   │   └── widgets.pyi
│   │   │       │   ├── tests/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   ├── test_afm.cpython-312.pyc
│   │   │       │   │   │   ├── test_agg.cpython-312.pyc
│   │   │       │   │   │   ├── test_agg_filter.cpython-312.pyc
│   │   │       │   │   │   ├── test_animation.cpython-312.pyc
│   │   │       │   │   │   ├── test_api.cpython-312.pyc
│   │   │       │   │   │   ├── test_arrow_patches.cpython-312.pyc
│   │   │       │   │   │   ├── test_artist.cpython-312.pyc
│   │   │       │   │   │   ├── test_axes.cpython-312.pyc
│   │   │       │   │   │   ├── test_axis.cpython-312.pyc
│   │   │       │   │   │   ├── test_backend_bases.cpython-312.pyc
│   │   │       │   │   │   ├── test_backend_cairo.cpython-312.pyc
│   │   │       │   │   │   ├── test_backend_gtk3.cpython-312.pyc
│   │   │       │   │   │   ├── test_backend_inline.cpython-312.pyc
│   │   │       │   │   │   ├── test_backend_macosx.cpython-312.pyc
│   │   │       │   │   │   ├── test_backend_nbagg.cpython-312.pyc
│   │   │       │   │   │   ├── test_backend_pdf.cpython-312.pyc
│   │   │       │   │   │   ├── test_backend_pgf.cpython-312.pyc
│   │   │       │   │   │   ├── test_backend_ps.cpython-312.pyc
│   │   │       │   │   │   ├── test_backend_qt.cpython-312.pyc
│   │   │       │   │   │   ├── test_backend_registry.cpython-312.pyc
│   │   │       │   │   │   ├── test_backend_svg.cpython-312.pyc
│   │   │       │   │   │   ├── test_backend_template.cpython-312.pyc
│   │   │       │   │   │   ├── test_backend_tk.cpython-312.pyc
│   │   │       │   │   │   ├── test_backend_tools.cpython-312.pyc
│   │   │       │   │   │   ├── test_backend_webagg.cpython-312.pyc
│   │   │       │   │   │   ├── test_backends_interactive.cpython-312.pyc
│   │   │       │   │   │   ├── test_basic.cpython-312.pyc
│   │   │       │   │   │   ├── test_bbox_tight.cpython-312.pyc
│   │   │       │   │   │   ├── test_bezier.cpython-312.pyc
│   │   │       │   │   │   ├── test_category.cpython-312.pyc
│   │   │       │   │   │   ├── test_cbook.cpython-312.pyc
│   │   │       │   │   │   ├── test_collections.cpython-312.pyc
│   │   │       │   │   │   ├── test_colorbar.cpython-312.pyc
│   │   │       │   │   │   ├── test_colors.cpython-312.pyc
│   │   │       │   │   │   ├── test_compare_images.cpython-312.pyc
│   │   │       │   │   │   ├── test_constrainedlayout.cpython-312.pyc
│   │   │       │   │   │   ├── test_container.cpython-312.pyc
│   │   │       │   │   │   ├── test_contour.cpython-312.pyc
│   │   │       │   │   │   ├── test_cycles.cpython-312.pyc
│   │   │       │   │   │   ├── test_dates.cpython-312.pyc
│   │   │       │   │   │   ├── test_datetime.cpython-312.pyc
│   │   │       │   │   │   ├── test_determinism.cpython-312.pyc
│   │   │       │   │   │   ├── test_doc.cpython-312.pyc
│   │   │       │   │   │   ├── test_dviread.cpython-312.pyc
│   │   │       │   │   │   ├── test_figure.cpython-312.pyc
│   │   │       │   │   │   ├── test_font_manager.cpython-312.pyc
│   │   │       │   │   │   ├── test_fontconfig_pattern.cpython-312.pyc
│   │   │       │   │   │   ├── test_ft2font.cpython-312.pyc
│   │   │       │   │   │   ├── test_getattr.cpython-312.pyc
│   │   │       │   │   │   ├── test_gridspec.cpython-312.pyc
│   │   │       │   │   │   ├── test_image.cpython-312.pyc
│   │   │       │   │   │   ├── test_legend.cpython-312.pyc
│   │   │       │   │   │   ├── test_lines.cpython-312.pyc
│   │   │       │   │   │   ├── test_marker.cpython-312.pyc
│   │   │       │   │   │   ├── test_mathtext.cpython-312.pyc
│   │   │       │   │   │   ├── test_matplotlib.cpython-312.pyc
│   │   │       │   │   │   ├── test_mlab.cpython-312.pyc
│   │   │       │   │   │   ├── test_multivariate_colormaps.cpython-312.pyc
│   │   │       │   │   │   ├── test_offsetbox.cpython-312.pyc
│   │   │       │   │   │   ├── test_patches.cpython-312.pyc
│   │   │       │   │   │   ├── test_path.cpython-312.pyc
│   │   │       │   │   │   ├── test_patheffects.cpython-312.pyc
│   │   │       │   │   │   ├── test_pickle.cpython-312.pyc
│   │   │       │   │   │   ├── test_png.cpython-312.pyc
│   │   │       │   │   │   ├── test_polar.cpython-312.pyc
│   │   │       │   │   │   ├── test_preprocess_data.cpython-312.pyc
│   │   │       │   │   │   ├── test_pyplot.cpython-312.pyc
│   │   │       │   │   │   ├── test_quiver.cpython-312.pyc
│   │   │       │   │   │   ├── test_rcparams.cpython-312.pyc
│   │   │       │   │   │   ├── test_sankey.cpython-312.pyc
│   │   │       │   │   │   ├── test_scale.cpython-312.pyc
│   │   │       │   │   │   ├── test_simplification.cpython-312.pyc
│   │   │       │   │   │   ├── test_skew.cpython-312.pyc
│   │   │       │   │   │   ├── test_sphinxext.cpython-312.pyc
│   │   │       │   │   │   ├── test_spines.cpython-312.pyc
│   │   │       │   │   │   ├── test_streamplot.cpython-312.pyc
│   │   │       │   │   │   ├── test_style.cpython-312.pyc
│   │   │       │   │   │   ├── test_subplots.cpython-312.pyc
│   │   │       │   │   │   ├── test_table.cpython-312.pyc
│   │   │       │   │   │   ├── test_testing.cpython-312.pyc
│   │   │       │   │   │   ├── test_texmanager.cpython-312.pyc
│   │   │       │   │   │   ├── test_text.cpython-312.pyc
│   │   │       │   │   │   ├── test_textpath.cpython-312.pyc
│   │   │       │   │   │   ├── test_ticker.cpython-312.pyc
│   │   │       │   │   │   ├── test_tightlayout.cpython-312.pyc
│   │   │       │   │   │   ├── test_transforms.cpython-312.pyc
│   │   │       │   │   │   ├── test_triangulation.cpython-312.pyc
│   │   │       │   │   │   ├── test_type1font.cpython-312.pyc
│   │   │       │   │   │   ├── test_units.cpython-312.pyc
│   │   │       │   │   │   ├── test_usetex.cpython-312.pyc
│   │   │       │   │   │   └── test_widgets.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── conftest.py
│   │   │       │   │   ├── test_afm.py
│   │   │       │   │   ├── test_agg.py
│   │   │       │   │   ├── test_agg_filter.py
│   │   │       │   │   ├── test_animation.py
│   │   │       │   │   ├── test_api.py
│   │   │       │   │   ├── test_arrow_patches.py
│   │   │       │   │   ├── test_artist.py
│   │   │       │   │   ├── test_axes.py
│   │   │       │   │   ├── test_axis.py
│   │   │       │   │   ├── test_backend_bases.py
│   │   │       │   │   ├── test_backend_cairo.py
│   │   │       │   │   ├── test_backend_gtk3.py
│   │   │       │   │   ├── test_backend_inline.py
│   │   │       │   │   ├── test_backend_macosx.py
│   │   │       │   │   ├── test_backend_nbagg.py
│   │   │       │   │   ├── test_backend_pdf.py
│   │   │       │   │   ├── test_backend_pgf.py
│   │   │       │   │   ├── test_backend_ps.py
│   │   │       │   │   ├── test_backend_qt.py
│   │   │       │   │   ├── test_backend_registry.py
│   │   │       │   │   ├── test_backend_svg.py
│   │   │       │   │   ├── test_backend_template.py
│   │   │       │   │   ├── test_backend_tk.py
│   │   │       │   │   ├── test_backend_tools.py
│   │   │       │   │   ├── test_backend_webagg.py
│   │   │       │   │   ├── test_backends_interactive.py
│   │   │       │   │   ├── test_basic.py
│   │   │       │   │   ├── test_bbox_tight.py
│   │   │       │   │   ├── test_bezier.py
│   │   │       │   │   ├── test_category.py
│   │   │       │   │   ├── test_cbook.py
│   │   │       │   │   ├── test_collections.py
│   │   │       │   │   ├── test_colorbar.py
│   │   │       │   │   ├── test_colors.py
│   │   │       │   │   ├── test_compare_images.py
│   │   │       │   │   ├── test_constrainedlayout.py
│   │   │       │   │   ├── test_container.py
│   │   │       │   │   ├── test_contour.py
│   │   │       │   │   ├── test_cycles.py
│   │   │       │   │   ├── test_dates.py
│   │   │       │   │   ├── test_datetime.py
│   │   │       │   │   ├── test_determinism.py
│   │   │       │   │   ├── test_doc.py
│   │   │       │   │   ├── test_dviread.py
│   │   │       │   │   ├── test_figure.py
│   │   │       │   │   ├── test_font_manager.py
│   │   │       │   │   ├── test_fontconfig_pattern.py
│   │   │       │   │   ├── test_ft2font.py
│   │   │       │   │   ├── test_getattr.py
│   │   │       │   │   ├── test_gridspec.py
│   │   │       │   │   ├── test_image.py
│   │   │       │   │   ├── test_legend.py
│   │   │       │   │   ├── test_lines.py
│   │   │       │   │   ├── test_marker.py
│   │   │       │   │   ├── test_mathtext.py
│   │   │       │   │   ├── test_matplotlib.py
│   │   │       │   │   ├── test_mlab.py
│   │   │       │   │   ├── test_multivariate_colormaps.py
│   │   │       │   │   ├── test_offsetbox.py
│   │   │       │   │   ├── test_patches.py
│   │   │       │   │   ├── test_path.py
│   │   │       │   │   ├── test_patheffects.py
│   │   │       │   │   ├── test_pickle.py
│   │   │       │   │   ├── test_png.py
│   │   │       │   │   ├── test_polar.py
│   │   │       │   │   ├── test_preprocess_data.py
│   │   │       │   │   ├── test_pyplot.py
│   │   │       │   │   ├── test_quiver.py
│   │   │       │   │   ├── test_rcparams.py
│   │   │       │   │   ├── test_sankey.py
│   │   │       │   │   ├── test_scale.py
│   │   │       │   │   ├── test_simplification.py
│   │   │       │   │   ├── test_skew.py
│   │   │       │   │   ├── test_sphinxext.py
│   │   │       │   │   ├── test_spines.py
│   │   │       │   │   ├── test_streamplot.py
│   │   │       │   │   ├── test_style.py
│   │   │       │   │   ├── test_subplots.py
│   │   │       │   │   ├── test_table.py
│   │   │       │   │   ├── test_testing.py
│   │   │       │   │   ├── test_texmanager.py
│   │   │       │   │   ├── test_text.py
│   │   │       │   │   ├── test_textpath.py
│   │   │       │   │   ├── test_ticker.py
│   │   │       │   │   ├── test_tightlayout.py
│   │   │       │   │   ├── test_transforms.py
│   │   │       │   │   ├── test_triangulation.py
│   │   │       │   │   ├── test_type1font.py
│   │   │       │   │   ├── test_units.py
│   │   │       │   │   ├── test_usetex.py
│   │   │       │   │   └── test_widgets.py
│   │   │       │   ├── tri/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _triangulation.cpython-312.pyc
│   │   │       │   │   │   ├── _tricontour.cpython-312.pyc
│   │   │       │   │   │   ├── _trifinder.cpython-312.pyc
│   │   │       │   │   │   ├── _triinterpolate.cpython-312.pyc
│   │   │       │   │   │   ├── _tripcolor.cpython-312.pyc
│   │   │       │   │   │   ├── _triplot.cpython-312.pyc
│   │   │       │   │   │   ├── _trirefine.cpython-312.pyc
│   │   │       │   │   │   └── _tritools.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _triangulation.py
│   │   │       │   │   ├── _triangulation.pyi
│   │   │       │   │   ├── _tricontour.py
│   │   │       │   │   ├── _tricontour.pyi
│   │   │       │   │   ├── _trifinder.py
│   │   │       │   │   ├── _trifinder.pyi
│   │   │       │   │   ├── _triinterpolate.py
│   │   │       │   │   ├── _triinterpolate.pyi
│   │   │       │   │   ├── _tripcolor.py
│   │   │       │   │   ├── _tripcolor.pyi
│   │   │       │   │   ├── _triplot.py
│   │   │       │   │   ├── _triplot.pyi
│   │   │       │   │   ├── _trirefine.py
│   │   │       │   │   ├── _trirefine.pyi
│   │   │       │   │   ├── _tritools.py
│   │   │       │   │   └── _tritools.pyi
│   │   │       │   ├── __init__.py
│   │   │       │   ├── __init__.pyi
│   │   │       │   ├── _afm.py
│   │   │       │   ├── _animation_data.py
│   │   │       │   ├── _blocking_input.py
│   │   │       │   ├── _c_internal_utils.cp312-win_amd64.pyd
│   │   │       │   ├── _c_internal_utils.pyi
│   │   │       │   ├── _cm.py
│   │   │       │   ├── _cm_bivar.py
│   │   │       │   ├── _cm_listed.py
│   │   │       │   ├── _cm_multivar.py
│   │   │       │   ├── _color_data.py
│   │   │       │   ├── _color_data.pyi
│   │   │       │   ├── _constrained_layout.py
│   │   │       │   ├── _docstring.py
│   │   │       │   ├── _docstring.pyi
│   │   │       │   ├── _enums.py
│   │   │       │   ├── _enums.pyi
│   │   │       │   ├── _fontconfig_pattern.py
│   │   │       │   ├── _image.cp312-win_amd64.pyd
│   │   │       │   ├── _image.pyi
│   │   │       │   ├── _internal_utils.py
│   │   │       │   ├── _layoutgrid.py
│   │   │       │   ├── _mathtext.py
│   │   │       │   ├── _mathtext_data.py
│   │   │       │   ├── _path.cp312-win_amd64.pyd
│   │   │       │   ├── _path.pyi
│   │   │       │   ├── _pylab_helpers.py
│   │   │       │   ├── _pylab_helpers.pyi
│   │   │       │   ├── _qhull.cp312-win_amd64.pyd
│   │   │       │   ├── _qhull.pyi
│   │   │       │   ├── _text_helpers.py
│   │   │       │   ├── _tight_bbox.py
│   │   │       │   ├── _tight_layout.py
│   │   │       │   ├── _tri.cp312-win_amd64.pyd
│   │   │       │   ├── _tri.pyi
│   │   │       │   ├── _type1font.py
│   │   │       │   ├── _version.py
│   │   │       │   ├── animation.py
│   │   │       │   ├── animation.pyi
│   │   │       │   ├── artist.py
│   │   │       │   ├── artist.pyi
│   │   │       │   ├── axis.py
│   │   │       │   ├── axis.pyi
│   │   │       │   ├── backend_bases.py
│   │   │       │   ├── backend_bases.pyi
│   │   │       │   ├── backend_managers.py
│   │   │       │   ├── backend_managers.pyi
│   │   │       │   ├── backend_tools.py
│   │   │       │   ├── backend_tools.pyi
│   │   │       │   ├── bezier.py
│   │   │       │   ├── bezier.pyi
│   │   │       │   ├── category.py
│   │   │       │   ├── cbook.py
│   │   │       │   ├── cbook.pyi
│   │   │       │   ├── cm.py
│   │   │       │   ├── cm.pyi
│   │   │       │   ├── collections.py
│   │   │       │   ├── collections.pyi
│   │   │       │   ├── colorbar.py
│   │   │       │   ├── colorbar.pyi
│   │   │       │   ├── colorizer.py
│   │   │       │   ├── colorizer.pyi
│   │   │       │   ├── colors.py
│   │   │       │   ├── colors.pyi
│   │   │       │   ├── container.py
│   │   │       │   ├── container.pyi
│   │   │       │   ├── contour.py
│   │   │       │   ├── contour.pyi
│   │   │       │   ├── dates.py
│   │   │       │   ├── dviread.py
│   │   │       │   ├── dviread.pyi
│   │   │       │   ├── figure.py
│   │   │       │   ├── figure.pyi
│   │   │       │   ├── font_manager.py
│   │   │       │   ├── font_manager.pyi
│   │   │       │   ├── ft2font.cp312-win_amd64.pyd
│   │   │       │   ├── ft2font.pyi
│   │   │       │   ├── gridspec.py
│   │   │       │   ├── gridspec.pyi
│   │   │       │   ├── hatch.py
│   │   │       │   ├── hatch.pyi
│   │   │       │   ├── image.py
│   │   │       │   ├── image.pyi
│   │   │       │   ├── inset.py
│   │   │       │   ├── inset.pyi
│   │   │       │   ├── layout_engine.py
│   │   │       │   ├── layout_engine.pyi
│   │   │       │   ├── legend.py
│   │   │       │   ├── legend.pyi
│   │   │       │   ├── legend_handler.py
│   │   │       │   ├── legend_handler.pyi
│   │   │       │   ├── lines.py
│   │   │       │   ├── lines.pyi
│   │   │       │   ├── markers.py
│   │   │       │   ├── markers.pyi
│   │   │       │   ├── mathtext.py
│   │   │       │   ├── mathtext.pyi
│   │   │       │   ├── mlab.py
│   │   │       │   ├── mlab.pyi
│   │   │       │   ├── offsetbox.py
│   │   │       │   ├── offsetbox.pyi
│   │   │       │   ├── patches.py
│   │   │       │   ├── patches.pyi
│   │   │       │   ├── path.py
│   │   │       │   ├── path.pyi
│   │   │       │   ├── patheffects.py
│   │   │       │   ├── patheffects.pyi
│   │   │       │   ├── py.typed
│   │   │       │   ├── pylab.py
│   │   │       │   ├── pyplot.py
│   │   │       │   ├── quiver.py
│   │   │       │   ├── quiver.pyi
│   │   │       │   ├── rcsetup.py
│   │   │       │   ├── rcsetup.pyi
│   │   │       │   ├── sankey.py
│   │   │       │   ├── sankey.pyi
│   │   │       │   ├── scale.py
│   │   │       │   ├── scale.pyi
│   │   │       │   ├── spines.py
│   │   │       │   ├── spines.pyi
│   │   │       │   ├── stackplot.py
│   │   │       │   ├── stackplot.pyi
│   │   │       │   ├── streamplot.py
│   │   │       │   ├── streamplot.pyi
│   │   │       │   ├── table.py
│   │   │       │   ├── table.pyi
│   │   │       │   ├── texmanager.py
│   │   │       │   ├── texmanager.pyi
│   │   │       │   ├── text.py
│   │   │       │   ├── text.pyi
│   │   │       │   ├── textpath.py
│   │   │       │   ├── textpath.pyi
│   │   │       │   ├── ticker.py
│   │   │       │   ├── ticker.pyi
│   │   │       │   ├── transforms.py
│   │   │       │   ├── transforms.pyi
│   │   │       │   ├── typing.py
│   │   │       │   ├── units.py
│   │   │       │   ├── widgets.py
│   │   │       │   └── widgets.pyi
│   │   │       ├── matplotlib-3.10.0.dist-info/
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── LICENSE
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── REQUESTED
│   │   │       │   └── WHEEL
│   │   │       ├── mpl_toolkits/
│   │   │       │   ├── axes_grid1/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── anchored_artists.cpython-312.pyc
│   │   │       │   │   │   ├── axes_divider.cpython-312.pyc
│   │   │       │   │   │   ├── axes_grid.cpython-312.pyc
│   │   │       │   │   │   ├── axes_rgb.cpython-312.pyc
│   │   │       │   │   │   ├── axes_size.cpython-312.pyc
│   │   │       │   │   │   ├── inset_locator.cpython-312.pyc
│   │   │       │   │   │   ├── mpl_axes.cpython-312.pyc
│   │   │       │   │   │   └── parasite_axes.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   └── test_axes_grid1.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── conftest.py
│   │   │       │   │   │   └── test_axes_grid1.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── anchored_artists.py
│   │   │       │   │   ├── axes_divider.py
│   │   │       │   │   ├── axes_grid.py
│   │   │       │   │   ├── axes_rgb.py
│   │   │       │   │   ├── axes_size.py
│   │   │       │   │   ├── inset_locator.py
│   │   │       │   │   ├── mpl_axes.py
│   │   │       │   │   └── parasite_axes.py
│   │   │       │   ├── axisartist/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── angle_helper.cpython-312.pyc
│   │   │       │   │   │   ├── axes_divider.cpython-312.pyc
│   │   │       │   │   │   ├── axis_artist.cpython-312.pyc
│   │   │       │   │   │   ├── axisline_style.cpython-312.pyc
│   │   │       │   │   │   ├── axislines.cpython-312.pyc
│   │   │       │   │   │   ├── floating_axes.cpython-312.pyc
│   │   │       │   │   │   ├── grid_finder.cpython-312.pyc
│   │   │       │   │   │   ├── grid_helper_curvelinear.cpython-312.pyc
│   │   │       │   │   │   └── parasite_axes.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_angle_helper.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_axis_artist.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_axislines.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_floating_axes.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_grid_finder.cpython-312.pyc
│   │   │       │   │   │   │   └── test_grid_helper_curvelinear.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── conftest.py
│   │   │       │   │   │   ├── test_angle_helper.py
│   │   │       │   │   │   ├── test_axis_artist.py
│   │   │       │   │   │   ├── test_axislines.py
│   │   │       │   │   │   ├── test_floating_axes.py
│   │   │       │   │   │   ├── test_grid_finder.py
│   │   │       │   │   │   └── test_grid_helper_curvelinear.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── angle_helper.py
│   │   │       │   │   ├── axes_divider.py
│   │   │       │   │   ├── axis_artist.py
│   │   │       │   │   ├── axisline_style.py
│   │   │       │   │   ├── axislines.py
│   │   │       │   │   ├── floating_axes.py
│   │   │       │   │   ├── grid_finder.py
│   │   │       │   │   ├── grid_helper_curvelinear.py
│   │   │       │   │   └── parasite_axes.py
│   │   │       │   ├── mplot3d/
│   │   │       │       ├── __pycache__/
│   │   │       │       │   ├── __init__.cpython-312.pyc
│   │   │       │       │   ├── art3d.cpython-312.pyc
│   │   │       │       │   ├── axes3d.cpython-312.pyc
│   │   │       │       │   ├── axis3d.cpython-312.pyc
│   │   │       │       │   └── proj3d.cpython-312.pyc
│   │   │       │       ├── tests/
│   │   │       │       │   ├── __pycache__/
│   │   │       │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │       │   │   ├── conftest.cpython-312.pyc
│   │   │       │       │   │   ├── test_art3d.cpython-312.pyc
│   │   │       │       │   │   ├── test_axes3d.cpython-312.pyc
│   │   │       │       │   │   └── test_legend3d.cpython-312.pyc
│   │   │       │       │   ├── __init__.py
│   │   │       │       │   ├── conftest.py
│   │   │       │       │   ├── test_art3d.py
│   │   │       │       │   ├── test_axes3d.py
│   │   │       │       │   └── test_legend3d.py
│   │   │       │       ├── __init__.py
│   │   │       │       ├── art3d.py
│   │   │       │       ├── axes3d.py
│   │   │       │       ├── axis3d.py
│   │   │       │       └── proj3d.py
│   │   │       ├── numpy/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __config__.cpython-312.pyc
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── _configtool.cpython-312.pyc
│   │   │       │   │   ├── _distributor_init.cpython-312.pyc
│   │   │       │   │   ├── _expired_attrs_2_0.cpython-312.pyc
│   │   │       │   │   ├── _globals.cpython-312.pyc
│   │   │       │   │   ├── _pytesttester.cpython-312.pyc
│   │   │       │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   ├── ctypeslib.cpython-312.pyc
│   │   │       │   │   ├── dtypes.cpython-312.pyc
│   │   │       │   │   ├── exceptions.cpython-312.pyc
│   │   │       │   │   ├── matlib.cpython-312.pyc
│   │   │       │   │   └── version.cpython-312.pyc
│   │   │       │   ├── _core/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _add_newdocs.cpython-312.pyc
│   │   │       │   │   │   ├── _add_newdocs_scalars.cpython-312.pyc
│   │   │       │   │   │   ├── _asarray.cpython-312.pyc
│   │   │       │   │   │   ├── _dtype.cpython-312.pyc
│   │   │       │   │   │   ├── _dtype_ctypes.cpython-312.pyc
│   │   │       │   │   │   ├── _exceptions.cpython-312.pyc
│   │   │       │   │   │   ├── _internal.cpython-312.pyc
│   │   │       │   │   │   ├── _machar.cpython-312.pyc
│   │   │       │   │   │   ├── _methods.cpython-312.pyc
│   │   │       │   │   │   ├── _string_helpers.cpython-312.pyc
│   │   │       │   │   │   ├── _type_aliases.cpython-312.pyc
│   │   │       │   │   │   ├── _ufunc_config.cpython-312.pyc
│   │   │       │   │   │   ├── arrayprint.cpython-312.pyc
│   │   │       │   │   │   ├── cversions.cpython-312.pyc
│   │   │       │   │   │   ├── defchararray.cpython-312.pyc
│   │   │       │   │   │   ├── einsumfunc.cpython-312.pyc
│   │   │       │   │   │   ├── fromnumeric.cpython-312.pyc
│   │   │       │   │   │   ├── function_base.cpython-312.pyc
│   │   │       │   │   │   ├── getlimits.cpython-312.pyc
│   │   │       │   │   │   ├── memmap.cpython-312.pyc
│   │   │       │   │   │   ├── multiarray.cpython-312.pyc
│   │   │       │   │   │   ├── numeric.cpython-312.pyc
│   │   │       │   │   │   ├── numerictypes.cpython-312.pyc
│   │   │       │   │   │   ├── overrides.cpython-312.pyc
│   │   │       │   │   │   ├── records.cpython-312.pyc
│   │   │       │   │   │   ├── shape_base.cpython-312.pyc
│   │   │       │   │   │   ├── strings.cpython-312.pyc
│   │   │       │   │   │   └── umath.cpython-312.pyc
│   │   │       │   │   ├── include/
│   │   │       │   │   │   ├── numpy/
│   │   │       │   │   │       ├── random/
│   │   │       │   │   │       │   ├── LICENSE.txt
│   │   │       │   │   │       │   ├── bitgen.h
│   │   │       │   │   │       │   ├── distributions.h
│   │   │       │   │   │       │   └── libdivide.h
│   │   │       │   │   │       ├── __multiarray_api.c
│   │   │       │   │   │       ├── __multiarray_api.h
│   │   │       │   │   │       ├── __ufunc_api.c
│   │   │       │   │   │       ├── __ufunc_api.h
│   │   │       │   │   │       ├── _neighborhood_iterator_imp.h
│   │   │       │   │   │       ├── _numpyconfig.h
│   │   │       │   │   │       ├── _public_dtype_api_table.h
│   │   │       │   │   │       ├── arrayobject.h
│   │   │       │   │   │       ├── arrayscalars.h
│   │   │       │   │   │       ├── dtype_api.h
│   │   │       │   │   │       ├── halffloat.h
│   │   │       │   │   │       ├── ndarrayobject.h
│   │   │       │   │   │       ├── ndarraytypes.h
│   │   │       │   │   │       ├── npy_1_7_deprecated_api.h
│   │   │       │   │   │       ├── npy_2_compat.h
│   │   │       │   │   │       ├── npy_2_complexcompat.h
│   │   │       │   │   │       ├── npy_3kcompat.h
│   │   │       │   │   │       ├── npy_common.h
│   │   │       │   │   │       ├── npy_cpu.h
│   │   │       │   │   │       ├── npy_endian.h
│   │   │       │   │   │       ├── npy_math.h
│   │   │       │   │   │       ├── npy_no_deprecated_api.h
│   │   │       │   │   │       ├── npy_os.h
│   │   │       │   │   │       ├── numpyconfig.h
│   │   │       │   │   │       ├── ufuncobject.h
│   │   │       │   │   │       └── utils.h
│   │   │       │   │   ├── lib/
│   │   │       │   │   │   ├── npy-pkg-config/
│   │   │       │   │   │   │   ├── mlib.ini
│   │   │       │   │   │   │   └── npymath.ini
│   │   │       │   │   │   ├── pkgconfig/
│   │   │       │   │   │   │   └── numpy.pc
│   │   │       │   │   │   └── npymath.lib
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _locales.cpython-312.pyc
│   │   │       │   │   │   │   ├── _natype.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__exceptions.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_abc.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_api.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_argparse.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_array_coercion.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_array_interface.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_arraymethod.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_arrayobject.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_arrayprint.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_casting_floatingpoint_errors.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_casting_unittests.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_conversion_utils.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cpu_dispatcher.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cpu_features.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_custom_dtypes.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cython.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_datetime.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_defchararray.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_deprecations.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_dlpack.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_dtype.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_einsum.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_errstate.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_extint128.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_function_base.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_getlimits.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_half.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_hashtable.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_indexerrors.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_item_selection.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_limited_api.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_longdouble.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_machar.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mem_overlap.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mem_policy.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_memmap.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_multiarray.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_nditer.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_nep50_promotions.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_numeric.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_numerictypes.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_overrides.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_print.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_protocols.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_records.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_regression.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_scalar_ctors.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_scalar_methods.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_scalarbuffer.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_scalarinherit.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_scalarmath.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_scalarprint.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_shape_base.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_simd.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_simd_module.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_stringdtype.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_strings.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ufunc.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_umath.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_umath_accuracy.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_umath_complex.cpython-312.pyc
│   │   │       │   │   │   │   └── test_unicode.cpython-312.pyc
│   │   │       │   │   │   ├── data/
│   │   │       │   │   │   │   ├── astype_copy.pkl
│   │   │       │   │   │   │   ├── generate_umath_validation_data.cpp
│   │   │       │   │   │   │   ├── recarray_from_file.fits
│   │   │       │   │   │   │   ├── umath-validation-set-README.txt
│   │   │       │   │   │   │   ├── umath-validation-set-arccos.csv
│   │   │       │   │   │   │   ├── umath-validation-set-arccosh.csv
│   │   │       │   │   │   │   ├── umath-validation-set-arcsin.csv
│   │   │       │   │   │   │   ├── umath-validation-set-arcsinh.csv
│   │   │       │   │   │   │   ├── umath-validation-set-arctan.csv
│   │   │       │   │   │   │   ├── umath-validation-set-arctanh.csv
│   │   │       │   │   │   │   ├── umath-validation-set-cbrt.csv
│   │   │       │   │   │   │   ├── umath-validation-set-cos.csv
│   │   │       │   │   │   │   ├── umath-validation-set-cosh.csv
│   │   │       │   │   │   │   ├── umath-validation-set-exp.csv
│   │   │       │   │   │   │   ├── umath-validation-set-exp2.csv
│   │   │       │   │   │   │   ├── umath-validation-set-expm1.csv
│   │   │       │   │   │   │   ├── umath-validation-set-log.csv
│   │   │       │   │   │   │   ├── umath-validation-set-log10.csv
│   │   │       │   │   │   │   ├── umath-validation-set-log1p.csv
│   │   │       │   │   │   │   ├── umath-validation-set-log2.csv
│   │   │       │   │   │   │   ├── umath-validation-set-sin.csv
│   │   │       │   │   │   │   ├── umath-validation-set-sinh.csv
│   │   │       │   │   │   │   ├── umath-validation-set-tan.csv
│   │   │       │   │   │   │   └── umath-validation-set-tanh.csv
│   │   │       │   │   │   ├── examples/
│   │   │       │   │   │   │   ├── cython/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   └── setup.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── checks.pyx
│   │   │       │   │   │   │   │   ├── meson.build
│   │   │       │   │   │   │   │   └── setup.py
│   │   │       │   │   │   │   ├── limited_api/
│   │   │       │   │   │   │       ├── __pycache__/
│   │   │       │   │   │   │       │   └── setup.cpython-312.pyc
│   │   │       │   │   │   │       ├── limited_api1.c
│   │   │       │   │   │   │       ├── limited_api2.pyx
│   │   │       │   │   │   │       ├── limited_api_latest.c
│   │   │       │   │   │   │       ├── meson.build
│   │   │       │   │   │   │       └── setup.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _locales.py
│   │   │       │   │   │   ├── _natype.py
│   │   │       │   │   │   ├── test__exceptions.py
│   │   │       │   │   │   ├── test_abc.py
│   │   │       │   │   │   ├── test_api.py
│   │   │       │   │   │   ├── test_argparse.py
│   │   │       │   │   │   ├── test_array_coercion.py
│   │   │       │   │   │   ├── test_array_interface.py
│   │   │       │   │   │   ├── test_arraymethod.py
│   │   │       │   │   │   ├── test_arrayobject.py
│   │   │       │   │   │   ├── test_arrayprint.py
│   │   │       │   │   │   ├── test_casting_floatingpoint_errors.py
│   │   │       │   │   │   ├── test_casting_unittests.py
│   │   │       │   │   │   ├── test_conversion_utils.py
│   │   │       │   │   │   ├── test_cpu_dispatcher.py
│   │   │       │   │   │   ├── test_cpu_features.py
│   │   │       │   │   │   ├── test_custom_dtypes.py
│   │   │       │   │   │   ├── test_cython.py
│   │   │       │   │   │   ├── test_datetime.py
│   │   │       │   │   │   ├── test_defchararray.py
│   │   │       │   │   │   ├── test_deprecations.py
│   │   │       │   │   │   ├── test_dlpack.py
│   │   │       │   │   │   ├── test_dtype.py
│   │   │       │   │   │   ├── test_einsum.py
│   │   │       │   │   │   ├── test_errstate.py
│   │   │       │   │   │   ├── test_extint128.py
│   │   │       │   │   │   ├── test_function_base.py
│   │   │       │   │   │   ├── test_getlimits.py
│   │   │       │   │   │   ├── test_half.py
│   │   │       │   │   │   ├── test_hashtable.py
│   │   │       │   │   │   ├── test_indexerrors.py
│   │   │       │   │   │   ├── test_indexing.py
│   │   │       │   │   │   ├── test_item_selection.py
│   │   │       │   │   │   ├── test_limited_api.py
│   │   │       │   │   │   ├── test_longdouble.py
│   │   │       │   │   │   ├── test_machar.py
│   │   │       │   │   │   ├── test_mem_overlap.py
│   │   │       │   │   │   ├── test_mem_policy.py
│   │   │       │   │   │   ├── test_memmap.py
│   │   │       │   │   │   ├── test_multiarray.py
│   │   │       │   │   │   ├── test_nditer.py
│   │   │       │   │   │   ├── test_nep50_promotions.py
│   │   │       │   │   │   ├── test_numeric.py
│   │   │       │   │   │   ├── test_numerictypes.py
│   │   │       │   │   │   ├── test_overrides.py
│   │   │       │   │   │   ├── test_print.py
│   │   │       │   │   │   ├── test_protocols.py
│   │   │       │   │   │   ├── test_records.py
│   │   │       │   │   │   ├── test_regression.py
│   │   │       │   │   │   ├── test_scalar_ctors.py
│   │   │       │   │   │   ├── test_scalar_methods.py
│   │   │       │   │   │   ├── test_scalarbuffer.py
│   │   │       │   │   │   ├── test_scalarinherit.py
│   │   │       │   │   │   ├── test_scalarmath.py
│   │   │       │   │   │   ├── test_scalarprint.py
│   │   │       │   │   │   ├── test_shape_base.py
│   │   │       │   │   │   ├── test_simd.py
│   │   │       │   │   │   ├── test_simd_module.py
│   │   │       │   │   │   ├── test_stringdtype.py
│   │   │       │   │   │   ├── test_strings.py
│   │   │       │   │   │   ├── test_ufunc.py
│   │   │       │   │   │   ├── test_umath.py
│   │   │       │   │   │   ├── test_umath_accuracy.py
│   │   │       │   │   │   ├── test_umath_complex.py
│   │   │       │   │   │   └── test_unicode.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __init__.pyi
│   │   │       │   │   ├── _add_newdocs.py
│   │   │       │   │   ├── _add_newdocs_scalars.py
│   │   │       │   │   ├── _asarray.py
│   │   │       │   │   ├── _asarray.pyi
│   │   │       │   │   ├── _dtype.py
│   │   │       │   │   ├── _dtype_ctypes.py
│   │   │       │   │   ├── _exceptions.py
│   │   │       │   │   ├── _internal.py
│   │   │       │   │   ├── _internal.pyi
│   │   │       │   │   ├── _machar.py
│   │   │       │   │   ├── _methods.py
│   │   │       │   │   ├── _multiarray_tests.cp312-win_amd64.lib
│   │   │       │   │   ├── _multiarray_tests.cp312-win_amd64.pyd
│   │   │       │   │   ├── _multiarray_umath.cp312-win_amd64.lib
│   │   │       │   │   ├── _multiarray_umath.cp312-win_amd64.pyd
│   │   │       │   │   ├── _operand_flag_tests.cp312-win_amd64.lib
│   │   │       │   │   ├── _operand_flag_tests.cp312-win_amd64.pyd
│   │   │       │   │   ├── _rational_tests.cp312-win_amd64.lib
│   │   │       │   │   ├── _rational_tests.cp312-win_amd64.pyd
│   │   │       │   │   ├── _simd.cp312-win_amd64.lib
│   │   │       │   │   ├── _simd.cp312-win_amd64.pyd
│   │   │       │   │   ├── _string_helpers.py
│   │   │       │   │   ├── _struct_ufunc_tests.cp312-win_amd64.lib
│   │   │       │   │   ├── _struct_ufunc_tests.cp312-win_amd64.pyd
│   │   │       │   │   ├── _type_aliases.py
│   │   │       │   │   ├── _type_aliases.pyi
│   │   │       │   │   ├── _ufunc_config.py
│   │   │       │   │   ├── _ufunc_config.pyi
│   │   │       │   │   ├── _umath_tests.cp312-win_amd64.lib
│   │   │       │   │   ├── _umath_tests.cp312-win_amd64.pyd
│   │   │       │   │   ├── arrayprint.py
│   │   │       │   │   ├── arrayprint.pyi
│   │   │       │   │   ├── cversions.py
│   │   │       │   │   ├── defchararray.py
│   │   │       │   │   ├── defchararray.pyi
│   │   │       │   │   ├── einsumfunc.py
│   │   │       │   │   ├── einsumfunc.pyi
│   │   │       │   │   ├── fromnumeric.py
│   │   │       │   │   ├── fromnumeric.pyi
│   │   │       │   │   ├── function_base.py
│   │   │       │   │   ├── function_base.pyi
│   │   │       │   │   ├── getlimits.py
│   │   │       │   │   ├── getlimits.pyi
│   │   │       │   │   ├── memmap.py
│   │   │       │   │   ├── memmap.pyi
│   │   │       │   │   ├── multiarray.py
│   │   │       │   │   ├── multiarray.pyi
│   │   │       │   │   ├── numeric.py
│   │   │       │   │   ├── numeric.pyi
│   │   │       │   │   ├── numerictypes.py
│   │   │       │   │   ├── numerictypes.pyi
│   │   │       │   │   ├── overrides.py
│   │   │       │   │   ├── records.py
│   │   │       │   │   ├── records.pyi
│   │   │       │   │   ├── shape_base.py
│   │   │       │   │   ├── shape_base.pyi
│   │   │       │   │   ├── strings.py
│   │   │       │   │   ├── strings.pyi
│   │   │       │   │   └── umath.py
│   │   │       │   ├── _pyinstaller/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── hook-numpy.cpython-312.pyc
│   │   │       │   │   │   ├── pyinstaller-smoke.cpython-312.pyc
│   │   │       │   │   │   └── test_pyinstaller.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── hook-numpy.py
│   │   │       │   │   ├── pyinstaller-smoke.py
│   │   │       │   │   └── test_pyinstaller.py
│   │   │       │   ├── _typing/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _add_docstring.cpython-312.pyc
│   │   │       │   │   │   ├── _array_like.cpython-312.pyc
│   │   │       │   │   │   ├── _char_codes.cpython-312.pyc
│   │   │       │   │   │   ├── _dtype_like.cpython-312.pyc
│   │   │       │   │   │   ├── _extended_precision.cpython-312.pyc
│   │   │       │   │   │   ├── _nbit.cpython-312.pyc
│   │   │       │   │   │   ├── _nested_sequence.cpython-312.pyc
│   │   │       │   │   │   ├── _scalars.cpython-312.pyc
│   │   │       │   │   │   └── _shape.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _add_docstring.py
│   │   │       │   │   ├── _array_like.py
│   │   │       │   │   ├── _callable.pyi
│   │   │       │   │   ├── _char_codes.py
│   │   │       │   │   ├── _dtype_like.py
│   │   │       │   │   ├── _extended_precision.py
│   │   │       │   │   ├── _nbit.py
│   │   │       │   │   ├── _nested_sequence.py
│   │   │       │   │   ├── _scalars.py
│   │   │       │   │   ├── _shape.py
│   │   │       │   │   └── _ufunc.pyi
│   │   │       │   ├── _utils/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _convertions.cpython-312.pyc
│   │   │       │   │   │   ├── _inspect.cpython-312.pyc
│   │   │       │   │   │   └── _pep440.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _convertions.py
│   │   │       │   │   ├── _inspect.py
│   │   │       │   │   └── _pep440.py
│   │   │       │   ├── char/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   └── __init__.pyi
│   │   │       │   ├── compat/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   └── py3k.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   └── py3k.py
│   │   │       │   ├── core/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _dtype.cpython-312.pyc
│   │   │       │   │   │   ├── _dtype_ctypes.cpython-312.pyc
│   │   │       │   │   │   ├── _internal.cpython-312.pyc
│   │   │       │   │   │   ├── _multiarray_umath.cpython-312.pyc
│   │   │       │   │   │   ├── _utils.cpython-312.pyc
│   │   │       │   │   │   ├── arrayprint.cpython-312.pyc
│   │   │       │   │   │   ├── defchararray.cpython-312.pyc
│   │   │       │   │   │   ├── einsumfunc.cpython-312.pyc
│   │   │       │   │   │   ├── fromnumeric.cpython-312.pyc
│   │   │       │   │   │   ├── function_base.cpython-312.pyc
│   │   │       │   │   │   ├── getlimits.cpython-312.pyc
│   │   │       │   │   │   ├── multiarray.cpython-312.pyc
│   │   │       │   │   │   ├── numeric.cpython-312.pyc
│   │   │       │   │   │   ├── numerictypes.cpython-312.pyc
│   │   │       │   │   │   ├── overrides.cpython-312.pyc
│   │   │       │   │   │   ├── records.cpython-312.pyc
│   │   │       │   │   │   ├── shape_base.cpython-312.pyc
│   │   │       │   │   │   └── umath.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __init__.pyi
│   │   │       │   │   ├── _dtype.py
│   │   │       │   │   ├── _dtype_ctypes.py
│   │   │       │   │   ├── _internal.py
│   │   │       │   │   ├── _multiarray_umath.py
│   │   │       │   │   ├── _utils.py
│   │   │       │   │   ├── arrayprint.py
│   │   │       │   │   ├── defchararray.py
│   │   │       │   │   ├── einsumfunc.py
│   │   │       │   │   ├── fromnumeric.py
│   │   │       │   │   ├── function_base.py
│   │   │       │   │   ├── getlimits.py
│   │   │       │   │   ├── multiarray.py
│   │   │       │   │   ├── numeric.py
│   │   │       │   │   ├── numerictypes.py
│   │   │       │   │   ├── overrides.py
│   │   │       │   │   ├── records.py
│   │   │       │   │   ├── shape_base.py
│   │   │       │   │   └── umath.py
│   │   │       │   ├── doc/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── ufuncs.cpython-312.pyc
│   │   │       │   │   └── ufuncs.py
│   │   │       │   ├── f2py/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   ├── __version__.cpython-312.pyc
│   │   │       │   │   │   ├── _isocbind.cpython-312.pyc
│   │   │       │   │   │   ├── _src_pyf.cpython-312.pyc
│   │   │       │   │   │   ├── auxfuncs.cpython-312.pyc
│   │   │       │   │   │   ├── capi_maps.cpython-312.pyc
│   │   │       │   │   │   ├── cb_rules.cpython-312.pyc
│   │   │       │   │   │   ├── cfuncs.cpython-312.pyc
│   │   │       │   │   │   ├── common_rules.cpython-312.pyc
│   │   │       │   │   │   ├── crackfortran.cpython-312.pyc
│   │   │       │   │   │   ├── diagnose.cpython-312.pyc
│   │   │       │   │   │   ├── f2py2e.cpython-312.pyc
│   │   │       │   │   │   ├── f90mod_rules.cpython-312.pyc
│   │   │       │   │   │   ├── func2subr.cpython-312.pyc
│   │   │       │   │   │   ├── rules.cpython-312.pyc
│   │   │       │   │   │   ├── symbolic.cpython-312.pyc
│   │   │       │   │   │   └── use_rules.cpython-312.pyc
│   │   │       │   │   ├── _backends/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _backend.cpython-312.pyc
│   │   │       │   │   │   │   ├── _distutils.cpython-312.pyc
│   │   │       │   │   │   │   └── _meson.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _backend.py
│   │   │       │   │   │   ├── _distutils.py
│   │   │       │   │   │   ├── _meson.py
│   │   │       │   │   │   └── meson.build.template
│   │   │       │   │   ├── src/
│   │   │       │   │   │   ├── fortranobject.c
│   │   │       │   │   │   └── fortranobject.h
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_abstract_interface.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_array_from_pyobj.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_assumed_shape.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_block_docstring.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_callback.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_character.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_common.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_crackfortran.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_data.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_docs.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_f2cmap.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_f2py2e.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_isoc.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_kind.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mixed.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_modules.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_parameter.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pyf_src.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_quoted_character.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_regression.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_return_character.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_return_complex.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_return_integer.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_return_logical.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_return_real.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_semicolon_split.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_size.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_string.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_symbolic.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_value_attrspec.cpython-312.pyc
│   │   │       │   │   │   │   └── util.cpython-312.pyc
│   │   │       │   │   │   ├── src/
│   │   │       │   │   │   │   ├── abstract_interface/
│   │   │       │   │   │   │   │   ├── foo.f90
│   │   │       │   │   │   │   │   └── gh18403_mod.f90
│   │   │       │   │   │   │   ├── array_from_pyobj/
│   │   │       │   │   │   │   │   └── wrapmodule.c
│   │   │       │   │   │   │   ├── assumed_shape/
│   │   │       │   │   │   │   │   ├── foo_free.f90
│   │   │       │   │   │   │   │   ├── foo_mod.f90
│   │   │       │   │   │   │   │   ├── foo_use.f90
│   │   │       │   │   │   │   │   └── precision.f90
│   │   │       │   │   │   │   ├── block_docstring/
│   │   │       │   │   │   │   │   └── foo.f
│   │   │       │   │   │   │   ├── callback/
│   │   │       │   │   │   │   │   ├── foo.f
│   │   │       │   │   │   │   │   ├── gh17797.f90
│   │   │       │   │   │   │   │   ├── gh18335.f90
│   │   │       │   │   │   │   │   ├── gh25211.f
│   │   │       │   │   │   │   │   └── gh25211.pyf
│   │   │       │   │   │   │   ├── cli/
│   │   │       │   │   │   │   │   ├── gh_22819.pyf
│   │   │       │   │   │   │   │   ├── hi77.f
│   │   │       │   │   │   │   │   └── hiworld.f90
│   │   │       │   │   │   │   ├── common/
│   │   │       │   │   │   │   │   ├── block.f
│   │   │       │   │   │   │   │   └── gh19161.f90
│   │   │       │   │   │   │   ├── crackfortran/
│   │   │       │   │   │   │   │   ├── accesstype.f90
│   │   │       │   │   │   │   │   ├── data_common.f
│   │   │       │   │   │   │   │   ├── data_multiplier.f
│   │   │       │   │   │   │   │   ├── data_stmts.f90
│   │   │       │   │   │   │   │   ├── data_with_comments.f
│   │   │       │   │   │   │   │   ├── foo_deps.f90
│   │   │       │   │   │   │   │   ├── gh15035.f
│   │   │       │   │   │   │   │   ├── gh17859.f
│   │   │       │   │   │   │   │   ├── gh22648.pyf
│   │   │       │   │   │   │   │   ├── gh23533.f
│   │   │       │   │   │   │   │   ├── gh23598.f90
│   │   │       │   │   │   │   │   ├── gh23598Warn.f90
│   │   │       │   │   │   │   │   ├── gh23879.f90
│   │   │       │   │   │   │   │   ├── gh2848.f90
│   │   │       │   │   │   │   │   ├── operators.f90
│   │   │       │   │   │   │   │   ├── privatemod.f90
│   │   │       │   │   │   │   │   ├── publicmod.f90
│   │   │       │   │   │   │   │   ├── pubprivmod.f90
│   │   │       │   │   │   │   │   └── unicode_comment.f90
│   │   │       │   │   │   │   ├── f2cmap/
│   │   │       │   │   │   │   │   └── isoFortranEnvMap.f90
│   │   │       │   │   │   │   ├── isocintrin/
│   │   │       │   │   │   │   │   └── isoCtests.f90
│   │   │       │   │   │   │   ├── kind/
│   │   │       │   │   │   │   │   └── foo.f90
│   │   │       │   │   │   │   ├── mixed/
│   │   │       │   │   │   │   │   ├── foo.f
│   │   │       │   │   │   │   │   ├── foo_fixed.f90
│   │   │       │   │   │   │   │   └── foo_free.f90
│   │   │       │   │   │   │   ├── modules/
│   │   │       │   │   │   │   │   ├── gh25337/
│   │   │       │   │   │   │   │   │   ├── data.f90
│   │   │       │   │   │   │   │   │   └── use_data.f90
│   │   │       │   │   │   │   │   ├── module_data_docstring.f90
│   │   │       │   │   │   │   │   └── use_modules.f90
│   │   │       │   │   │   │   ├── negative_bounds/
│   │   │       │   │   │   │   │   └── issue_20853.f90
│   │   │       │   │   │   │   ├── parameter/
│   │   │       │   │   │   │   │   ├── constant_array.f90
│   │   │       │   │   │   │   │   ├── constant_both.f90
│   │   │       │   │   │   │   │   ├── constant_compound.f90
│   │   │       │   │   │   │   │   ├── constant_integer.f90
│   │   │       │   │   │   │   │   ├── constant_non_compound.f90
│   │   │       │   │   │   │   │   └── constant_real.f90
│   │   │       │   │   │   │   ├── quoted_character/
│   │   │       │   │   │   │   │   └── foo.f
│   │   │       │   │   │   │   ├── regression/
│   │   │       │   │   │   │   │   ├── AB.inc
│   │   │       │   │   │   │   │   ├── f77comments.f
│   │   │       │   │   │   │   │   ├── f77fixedform.f95
│   │   │       │   │   │   │   │   ├── f90continuation.f90
│   │   │       │   │   │   │   │   ├── incfile.f90
│   │   │       │   │   │   │   │   └── inout.f90
│   │   │       │   │   │   │   ├── return_character/
│   │   │       │   │   │   │   │   ├── foo77.f
│   │   │       │   │   │   │   │   └── foo90.f90
│   │   │       │   │   │   │   ├── return_complex/
│   │   │       │   │   │   │   │   ├── foo77.f
│   │   │       │   │   │   │   │   └── foo90.f90
│   │   │       │   │   │   │   ├── return_integer/
│   │   │       │   │   │   │   │   ├── foo77.f
│   │   │       │   │   │   │   │   └── foo90.f90
│   │   │       │   │   │   │   ├── return_logical/
│   │   │       │   │   │   │   │   ├── foo77.f
│   │   │       │   │   │   │   │   └── foo90.f90
│   │   │       │   │   │   │   ├── return_real/
│   │   │       │   │   │   │   │   ├── foo77.f
│   │   │       │   │   │   │   │   └── foo90.f90
│   │   │       │   │   │   │   ├── size/
│   │   │       │   │   │   │   │   └── foo.f90
│   │   │       │   │   │   │   ├── string/
│   │   │       │   │   │   │   │   ├── char.f90
│   │   │       │   │   │   │   │   ├── fixed_string.f90
│   │   │       │   │   │   │   │   ├── gh24008.f
│   │   │       │   │   │   │   │   ├── gh24662.f90
│   │   │       │   │   │   │   │   ├── gh25286.f90
│   │   │       │   │   │   │   │   ├── gh25286.pyf
│   │   │       │   │   │   │   │   ├── gh25286_bc.pyf
│   │   │       │   │   │   │   │   ├── scalar_string.f90
│   │   │       │   │   │   │   │   └── string.f
│   │   │       │   │   │   │   ├── value_attrspec/
│   │   │       │   │   │   │       └── gh21665.f90
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_abstract_interface.py
│   │   │       │   │   │   ├── test_array_from_pyobj.py
│   │   │       │   │   │   ├── test_assumed_shape.py
│   │   │       │   │   │   ├── test_block_docstring.py
│   │   │       │   │   │   ├── test_callback.py
│   │   │       │   │   │   ├── test_character.py
│   │   │       │   │   │   ├── test_common.py
│   │   │       │   │   │   ├── test_crackfortran.py
│   │   │       │   │   │   ├── test_data.py
│   │   │       │   │   │   ├── test_docs.py
│   │   │       │   │   │   ├── test_f2cmap.py
│   │   │       │   │   │   ├── test_f2py2e.py
│   │   │       │   │   │   ├── test_isoc.py
│   │   │       │   │   │   ├── test_kind.py
│   │   │       │   │   │   ├── test_mixed.py
│   │   │       │   │   │   ├── test_modules.py
│   │   │       │   │   │   ├── test_parameter.py
│   │   │       │   │   │   ├── test_pyf_src.py
│   │   │       │   │   │   ├── test_quoted_character.py
│   │   │       │   │   │   ├── test_regression.py
│   │   │       │   │   │   ├── test_return_character.py
│   │   │       │   │   │   ├── test_return_complex.py
│   │   │       │   │   │   ├── test_return_integer.py
│   │   │       │   │   │   ├── test_return_logical.py
│   │   │       │   │   │   ├── test_return_real.py
│   │   │       │   │   │   ├── test_semicolon_split.py
│   │   │       │   │   │   ├── test_size.py
│   │   │       │   │   │   ├── test_string.py
│   │   │       │   │   │   ├── test_symbolic.py
│   │   │       │   │   │   ├── test_value_attrspec.py
│   │   │       │   │   │   └── util.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __init__.pyi
│   │   │       │   │   ├── __main__.py
│   │   │       │   │   ├── __version__.py
│   │   │       │   │   ├── _isocbind.py
│   │   │       │   │   ├── _src_pyf.py
│   │   │       │   │   ├── auxfuncs.py
│   │   │       │   │   ├── capi_maps.py
│   │   │       │   │   ├── cb_rules.py
│   │   │       │   │   ├── cfuncs.py
│   │   │       │   │   ├── common_rules.py
│   │   │       │   │   ├── crackfortran.py
│   │   │       │   │   ├── diagnose.py
│   │   │       │   │   ├── f2py2e.py
│   │   │       │   │   ├── f90mod_rules.py
│   │   │       │   │   ├── func2subr.py
│   │   │       │   │   ├── rules.py
│   │   │       │   │   ├── setup.cfg
│   │   │       │   │   ├── symbolic.py
│   │   │       │   │   └── use_rules.py
│   │   │       │   ├── fft/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _helper.cpython-312.pyc
│   │   │       │   │   │   ├── _pocketfft.cpython-312.pyc
│   │   │       │   │   │   └── helper.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_helper.cpython-312.pyc
│   │   │       │   │   │   │   └── test_pocketfft.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_helper.py
│   │   │       │   │   │   └── test_pocketfft.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __init__.pyi
│   │   │       │   │   ├── _helper.py
│   │   │       │   │   ├── _helper.pyi
│   │   │       │   │   ├── _pocketfft.py
│   │   │       │   │   ├── _pocketfft.pyi
│   │   │       │   │   ├── _pocketfft_umath.cp312-win_amd64.lib
│   │   │       │   │   ├── _pocketfft_umath.cp312-win_amd64.pyd
│   │   │       │   │   └── helper.py
│   │   │       │   ├── lib/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _array_utils_impl.cpython-312.pyc
│   │   │       │   │   │   ├── _arraypad_impl.cpython-312.pyc
│   │   │       │   │   │   ├── _arraysetops_impl.cpython-312.pyc
│   │   │       │   │   │   ├── _arrayterator_impl.cpython-312.pyc
│   │   │       │   │   │   ├── _datasource.cpython-312.pyc
│   │   │       │   │   │   ├── _function_base_impl.cpython-312.pyc
│   │   │       │   │   │   ├── _histograms_impl.cpython-312.pyc
│   │   │       │   │   │   ├── _index_tricks_impl.cpython-312.pyc
│   │   │       │   │   │   ├── _iotools.cpython-312.pyc
│   │   │       │   │   │   ├── _nanfunctions_impl.cpython-312.pyc
│   │   │       │   │   │   ├── _npyio_impl.cpython-312.pyc
│   │   │       │   │   │   ├── _polynomial_impl.cpython-312.pyc
│   │   │       │   │   │   ├── _scimath_impl.cpython-312.pyc
│   │   │       │   │   │   ├── _shape_base_impl.cpython-312.pyc
│   │   │       │   │   │   ├── _stride_tricks_impl.cpython-312.pyc
│   │   │       │   │   │   ├── _twodim_base_impl.cpython-312.pyc
│   │   │       │   │   │   ├── _type_check_impl.cpython-312.pyc
│   │   │       │   │   │   ├── _ufunclike_impl.cpython-312.pyc
│   │   │       │   │   │   ├── _user_array_impl.cpython-312.pyc
│   │   │       │   │   │   ├── _utils_impl.cpython-312.pyc
│   │   │       │   │   │   ├── _version.cpython-312.pyc
│   │   │       │   │   │   ├── array_utils.cpython-312.pyc
│   │   │       │   │   │   ├── format.cpython-312.pyc
│   │   │       │   │   │   ├── introspect.cpython-312.pyc
│   │   │       │   │   │   ├── mixins.cpython-312.pyc
│   │   │       │   │   │   ├── npyio.cpython-312.pyc
│   │   │       │   │   │   ├── recfunctions.cpython-312.pyc
│   │   │       │   │   │   ├── scimath.cpython-312.pyc
│   │   │       │   │   │   ├── stride_tricks.cpython-312.pyc
│   │   │       │   │   │   └── user_array.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__datasource.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__iotools.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__version.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_array_utils.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_arraypad.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_arraysetops.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_arrayterator.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_format.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_function_base.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_histograms.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_index_tricks.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_io.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_loadtxt.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mixins.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_nanfunctions.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_packbits.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_polynomial.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_recfunctions.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_regression.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_shape_base.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_stride_tricks.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_twodim_base.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_type_check.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ufunclike.cpython-312.pyc
│   │   │       │   │   │   │   └── test_utils.cpython-312.pyc
│   │   │       │   │   │   ├── data/
│   │   │       │   │   │   │   ├── py2-np0-objarr.npy
│   │   │       │   │   │   │   ├── py2-objarr.npy
│   │   │       │   │   │   │   ├── py2-objarr.npz
│   │   │       │   │   │   │   ├── py3-objarr.npy
│   │   │       │   │   │   │   ├── py3-objarr.npz
│   │   │       │   │   │   │   ├── python3.npy
│   │   │       │   │   │   │   └── win64python2.npy
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test__datasource.py
│   │   │       │   │   │   ├── test__iotools.py
│   │   │       │   │   │   ├── test__version.py
│   │   │       │   │   │   ├── test_array_utils.py
│   │   │       │   │   │   ├── test_arraypad.py
│   │   │       │   │   │   ├── test_arraysetops.py
│   │   │       │   │   │   ├── test_arrayterator.py
│   │   │       │   │   │   ├── test_format.py
│   │   │       │   │   │   ├── test_function_base.py
│   │   │       │   │   │   ├── test_histograms.py
│   │   │       │   │   │   ├── test_index_tricks.py
│   │   │       │   │   │   ├── test_io.py
│   │   │       │   │   │   ├── test_loadtxt.py
│   │   │       │   │   │   ├── test_mixins.py
│   │   │       │   │   │   ├── test_nanfunctions.py
│   │   │       │   │   │   ├── test_packbits.py
│   │   │       │   │   │   ├── test_polynomial.py
│   │   │       │   │   │   ├── test_recfunctions.py
│   │   │       │   │   │   ├── test_regression.py
│   │   │       │   │   │   ├── test_shape_base.py
│   │   │       │   │   │   ├── test_stride_tricks.py
│   │   │       │   │   │   ├── test_twodim_base.py
│   │   │       │   │   │   ├── test_type_check.py
│   │   │       │   │   │   ├── test_ufunclike.py
│   │   │       │   │   │   └── test_utils.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __init__.pyi
│   │   │       │   │   ├── _array_utils_impl.py
│   │   │       │   │   ├── _array_utils_impl.pyi
│   │   │       │   │   ├── _arraypad_impl.py
│   │   │       │   │   ├── _arraypad_impl.pyi
│   │   │       │   │   ├── _arraysetops_impl.py
│   │   │       │   │   ├── _arraysetops_impl.pyi
│   │   │       │   │   ├── _arrayterator_impl.py
│   │   │       │   │   ├── _arrayterator_impl.pyi
│   │   │       │   │   ├── _datasource.py
│   │   │       │   │   ├── _function_base_impl.py
│   │   │       │   │   ├── _function_base_impl.pyi
│   │   │       │   │   ├── _histograms_impl.py
│   │   │       │   │   ├── _histograms_impl.pyi
│   │   │       │   │   ├── _index_tricks_impl.py
│   │   │       │   │   ├── _index_tricks_impl.pyi
│   │   │       │   │   ├── _iotools.py
│   │   │       │   │   ├── _nanfunctions_impl.py
│   │   │       │   │   ├── _nanfunctions_impl.pyi
│   │   │       │   │   ├── _npyio_impl.py
│   │   │       │   │   ├── _npyio_impl.pyi
│   │   │       │   │   ├── _polynomial_impl.py
│   │   │       │   │   ├── _polynomial_impl.pyi
│   │   │       │   │   ├── _scimath_impl.py
│   │   │       │   │   ├── _scimath_impl.pyi
│   │   │       │   │   ├── _shape_base_impl.py
│   │   │       │   │   ├── _shape_base_impl.pyi
│   │   │       │   │   ├── _stride_tricks_impl.py
│   │   │       │   │   ├── _stride_tricks_impl.pyi
│   │   │       │   │   ├── _twodim_base_impl.py
│   │   │       │   │   ├── _twodim_base_impl.pyi
│   │   │       │   │   ├── _type_check_impl.py
│   │   │       │   │   ├── _type_check_impl.pyi
│   │   │       │   │   ├── _ufunclike_impl.py
│   │   │       │   │   ├── _ufunclike_impl.pyi
│   │   │       │   │   ├── _user_array_impl.py
│   │   │       │   │   ├── _utils_impl.py
│   │   │       │   │   ├── _utils_impl.pyi
│   │   │       │   │   ├── _version.py
│   │   │       │   │   ├── _version.pyi
│   │   │       │   │   ├── array_utils.py
│   │   │       │   │   ├── array_utils.pyi
│   │   │       │   │   ├── format.py
│   │   │       │   │   ├── format.pyi
│   │   │       │   │   ├── introspect.py
│   │   │       │   │   ├── mixins.py
│   │   │       │   │   ├── mixins.pyi
│   │   │       │   │   ├── npyio.py
│   │   │       │   │   ├── npyio.pyi
│   │   │       │   │   ├── recfunctions.py
│   │   │       │   │   ├── scimath.py
│   │   │       │   │   ├── scimath.pyi
│   │   │       │   │   ├── stride_tricks.py
│   │   │       │   │   ├── stride_tricks.pyi
│   │   │       │   │   └── user_array.py
│   │   │       │   ├── linalg/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _linalg.cpython-312.pyc
│   │   │       │   │   │   └── linalg.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_deprecations.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_linalg.cpython-312.pyc
│   │   │       │   │   │   │   └── test_regression.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_deprecations.py
│   │   │       │   │   │   ├── test_linalg.py
│   │   │       │   │   │   └── test_regression.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __init__.pyi
│   │   │       │   │   ├── _linalg.py
│   │   │       │   │   ├── _linalg.pyi
│   │   │       │   │   ├── _umath_linalg.cp312-win_amd64.lib
│   │   │       │   │   ├── _umath_linalg.cp312-win_amd64.pyd
│   │   │       │   │   ├── lapack_lite.cp312-win_amd64.lib
│   │   │       │   │   ├── lapack_lite.cp312-win_amd64.pyd
│   │   │       │   │   └── linalg.py
│   │   │       │   ├── ma/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── core.cpython-312.pyc
│   │   │       │   │   │   ├── extras.cpython-312.pyc
│   │   │       │   │   │   ├── mrecords.cpython-312.pyc
│   │   │       │   │   │   ├── testutils.cpython-312.pyc
│   │   │       │   │   │   └── timer_comparison.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_arrayobject.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_core.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_deprecations.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_extras.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mrecords.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_old_ma.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_regression.cpython-312.pyc
│   │   │       │   │   │   │   └── test_subclassing.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_arrayobject.py
│   │   │       │   │   │   ├── test_core.py
│   │   │       │   │   │   ├── test_deprecations.py
│   │   │       │   │   │   ├── test_extras.py
│   │   │       │   │   │   ├── test_mrecords.py
│   │   │       │   │   │   ├── test_old_ma.py
│   │   │       │   │   │   ├── test_regression.py
│   │   │       │   │   │   └── test_subclassing.py
│   │   │       │   │   ├── API_CHANGES.txt
│   │   │       │   │   ├── LICENSE
│   │   │       │   │   ├── README.rst
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __init__.pyi
│   │   │       │   │   ├── core.py
│   │   │       │   │   ├── core.pyi
│   │   │       │   │   ├── extras.py
│   │   │       │   │   ├── extras.pyi
│   │   │       │   │   ├── mrecords.py
│   │   │       │   │   ├── mrecords.pyi
│   │   │       │   │   ├── testutils.py
│   │   │       │   │   └── timer_comparison.py
│   │   │       │   ├── matrixlib/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   └── defmatrix.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_defmatrix.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_interaction.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_masked_matrix.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_matrix_linalg.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_multiarray.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_numeric.cpython-312.pyc
│   │   │       │   │   │   │   └── test_regression.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_defmatrix.py
│   │   │       │   │   │   ├── test_interaction.py
│   │   │       │   │   │   ├── test_masked_matrix.py
│   │   │       │   │   │   ├── test_matrix_linalg.py
│   │   │       │   │   │   ├── test_multiarray.py
│   │   │       │   │   │   ├── test_numeric.py
│   │   │       │   │   │   └── test_regression.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __init__.pyi
│   │   │       │   │   ├── defmatrix.py
│   │   │       │   │   └── defmatrix.pyi
│   │   │       │   ├── polynomial/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _polybase.cpython-312.pyc
│   │   │       │   │   │   ├── chebyshev.cpython-312.pyc
│   │   │       │   │   │   ├── hermite.cpython-312.pyc
│   │   │       │   │   │   ├── hermite_e.cpython-312.pyc
│   │   │       │   │   │   ├── laguerre.cpython-312.pyc
│   │   │       │   │   │   ├── legendre.cpython-312.pyc
│   │   │       │   │   │   ├── polynomial.cpython-312.pyc
│   │   │       │   │   │   └── polyutils.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_chebyshev.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_classes.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_hermite.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_hermite_e.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_laguerre.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_legendre.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_polynomial.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_polyutils.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_printing.cpython-312.pyc
│   │   │       │   │   │   │   └── test_symbol.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_chebyshev.py
│   │   │       │   │   │   ├── test_classes.py
│   │   │       │   │   │   ├── test_hermite.py
│   │   │       │   │   │   ├── test_hermite_e.py
│   │   │       │   │   │   ├── test_laguerre.py
│   │   │       │   │   │   ├── test_legendre.py
│   │   │       │   │   │   ├── test_polynomial.py
│   │   │       │   │   │   ├── test_polyutils.py
│   │   │       │   │   │   ├── test_printing.py
│   │   │       │   │   │   └── test_symbol.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __init__.pyi
│   │   │       │   │   ├── _polybase.py
│   │   │       │   │   ├── _polybase.pyi
│   │   │       │   │   ├── chebyshev.py
│   │   │       │   │   ├── chebyshev.pyi
│   │   │       │   │   ├── hermite.py
│   │   │       │   │   ├── hermite.pyi
│   │   │       │   │   ├── hermite_e.py
│   │   │       │   │   ├── hermite_e.pyi
│   │   │       │   │   ├── laguerre.py
│   │   │       │   │   ├── laguerre.pyi
│   │   │       │   │   ├── legendre.py
│   │   │       │   │   ├── legendre.pyi
│   │   │       │   │   ├── polynomial.py
│   │   │       │   │   ├── polynomial.pyi
│   │   │       │   │   ├── polyutils.py
│   │   │       │   │   └── polyutils.pyi
│   │   │       │   ├── random/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   └── _pickle.cpython-312.pyc
│   │   │       │   │   ├── _examples/
│   │   │       │   │   │   ├── cffi/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── extending.cpython-312.pyc
│   │   │       │   │   │   │   │   └── parse.cpython-312.pyc
│   │   │       │   │   │   │   ├── extending.py
│   │   │       │   │   │   │   └── parse.py
│   │   │       │   │   │   ├── cython/
│   │   │       │   │   │   │   ├── extending.pyx
│   │   │       │   │   │   │   ├── extending_distributions.pyx
│   │   │       │   │   │   │   └── meson.build
│   │   │       │   │   │   ├── numba/
│   │   │       │   │   │       ├── __pycache__/
│   │   │       │   │   │       │   ├── extending.cpython-312.pyc
│   │   │       │   │   │       │   └── extending_distributions.cpython-312.pyc
│   │   │       │   │   │       ├── extending.py
│   │   │       │   │   │       └── extending_distributions.py
│   │   │       │   │   ├── lib/
│   │   │       │   │   │   └── npyrandom.lib
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_direct.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_extending.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_generator_mt19937.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_generator_mt19937_regressions.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_random.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_randomstate.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_randomstate_regression.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_regression.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_seed_sequence.cpython-312.pyc
│   │   │       │   │   │   │   └── test_smoke.cpython-312.pyc
│   │   │       │   │   │   ├── data/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── generator_pcg64_np121.pkl.gz
│   │   │       │   │   │   │   ├── generator_pcg64_np126.pkl.gz
│   │   │       │   │   │   │   ├── mt19937-testset-1.csv
│   │   │       │   │   │   │   ├── mt19937-testset-2.csv
│   │   │       │   │   │   │   ├── pcg64-testset-1.csv
│   │   │       │   │   │   │   ├── pcg64-testset-2.csv
│   │   │       │   │   │   │   ├── pcg64dxsm-testset-1.csv
│   │   │       │   │   │   │   ├── pcg64dxsm-testset-2.csv
│   │   │       │   │   │   │   ├── philox-testset-1.csv
│   │   │       │   │   │   │   ├── philox-testset-2.csv
│   │   │       │   │   │   │   ├── sfc64-testset-1.csv
│   │   │       │   │   │   │   ├── sfc64-testset-2.csv
│   │   │       │   │   │   │   └── sfc64_np126.pkl.gz
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_direct.py
│   │   │       │   │   │   ├── test_extending.py
│   │   │       │   │   │   ├── test_generator_mt19937.py
│   │   │       │   │   │   ├── test_generator_mt19937_regressions.py
│   │   │       │   │   │   ├── test_random.py
│   │   │       │   │   │   ├── test_randomstate.py
│   │   │       │   │   │   ├── test_randomstate_regression.py
│   │   │       │   │   │   ├── test_regression.py
│   │   │       │   │   │   ├── test_seed_sequence.py
│   │   │       │   │   │   └── test_smoke.py
│   │   │       │   │   ├── LICENSE.md
│   │   │       │   │   ├── __init__.pxd
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __init__.pyi
│   │   │       │   │   ├── _bounded_integers.cp312-win_amd64.lib
│   │   │       │   │   ├── _bounded_integers.cp312-win_amd64.pyd
│   │   │       │   │   ├── _bounded_integers.pxd
│   │   │       │   │   ├── _common.cp312-win_amd64.lib
│   │   │       │   │   ├── _common.cp312-win_amd64.pyd
│   │   │       │   │   ├── _common.pxd
│   │   │       │   │   ├── _generator.cp312-win_amd64.lib
│   │   │       │   │   ├── _generator.cp312-win_amd64.pyd
│   │   │       │   │   ├── _generator.pyi
│   │   │       │   │   ├── _mt19937.cp312-win_amd64.lib
│   │   │       │   │   ├── _mt19937.cp312-win_amd64.pyd
│   │   │       │   │   ├── _mt19937.pyi
│   │   │       │   │   ├── _pcg64.cp312-win_amd64.lib
│   │   │       │   │   ├── _pcg64.cp312-win_amd64.pyd
│   │   │       │   │   ├── _pcg64.pyi
│   │   │       │   │   ├── _philox.cp312-win_amd64.lib
│   │   │       │   │   ├── _philox.cp312-win_amd64.pyd
│   │   │       │   │   ├── _philox.pyi
│   │   │       │   │   ├── _pickle.py
│   │   │       │   │   ├── _sfc64.cp312-win_amd64.lib
│   │   │       │   │   ├── _sfc64.cp312-win_amd64.pyd
│   │   │       │   │   ├── _sfc64.pyi
│   │   │       │   │   ├── bit_generator.cp312-win_amd64.lib
│   │   │       │   │   ├── bit_generator.cp312-win_amd64.pyd
│   │   │       │   │   ├── bit_generator.pxd
│   │   │       │   │   ├── bit_generator.pyi
│   │   │       │   │   ├── c_distributions.pxd
│   │   │       │   │   ├── mtrand.cp312-win_amd64.lib
│   │   │       │   │   ├── mtrand.cp312-win_amd64.pyd
│   │   │       │   │   └── mtrand.pyi
│   │   │       │   ├── rec/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   └── __init__.pyi
│   │   │       │   ├── strings/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   └── __init__.pyi
│   │   │       │   ├── testing/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── overrides.cpython-312.pyc
│   │   │       │   │   │   └── print_coercion_tables.cpython-312.pyc
│   │   │       │   │   ├── _private/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── extbuild.cpython-312.pyc
│   │   │       │   │   │   │   └── utils.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── extbuild.py
│   │   │       │   │   │   ├── utils.py
│   │   │       │   │   │   └── utils.pyi
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── test_utils.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── test_utils.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __init__.pyi
│   │   │       │   │   ├── overrides.py
│   │   │       │   │   └── print_coercion_tables.py
│   │   │       │   ├── tests/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── test__all__.cpython-312.pyc
│   │   │       │   │   │   ├── test_configtool.cpython-312.pyc
│   │   │       │   │   │   ├── test_ctypeslib.cpython-312.pyc
│   │   │       │   │   │   ├── test_lazyloading.cpython-312.pyc
│   │   │       │   │   │   ├── test_matlib.cpython-312.pyc
│   │   │       │   │   │   ├── test_numpy_config.cpython-312.pyc
│   │   │       │   │   │   ├── test_numpy_version.cpython-312.pyc
│   │   │       │   │   │   ├── test_public_api.cpython-312.pyc
│   │   │       │   │   │   ├── test_reloading.cpython-312.pyc
│   │   │       │   │   │   ├── test_scripts.cpython-312.pyc
│   │   │       │   │   │   └── test_warnings.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── test__all__.py
│   │   │       │   │   ├── test_configtool.py
│   │   │       │   │   ├── test_ctypeslib.py
│   │   │       │   │   ├── test_lazyloading.py
│   │   │       │   │   ├── test_matlib.py
│   │   │       │   │   ├── test_numpy_config.py
│   │   │       │   │   ├── test_numpy_version.py
│   │   │       │   │   ├── test_public_api.py
│   │   │       │   │   ├── test_reloading.py
│   │   │       │   │   ├── test_scripts.py
│   │   │       │   │   └── test_warnings.py
│   │   │       │   ├── typing/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   └── mypy_plugin.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_isfile.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_runtime.cpython-312.pyc
│   │   │       │   │   │   │   └── test_typing.cpython-312.pyc
│   │   │       │   │   │   ├── data/
│   │   │       │   │   │   │   ├── fail/
│   │   │       │   │   │   │   │   ├── arithmetic.pyi
│   │   │       │   │   │   │   │   ├── array_constructors.pyi
│   │   │       │   │   │   │   │   ├── array_like.pyi
│   │   │       │   │   │   │   │   ├── array_pad.pyi
│   │   │       │   │   │   │   │   ├── arrayprint.pyi
│   │   │       │   │   │   │   │   ├── arrayterator.pyi
│   │   │       │   │   │   │   │   ├── bitwise_ops.pyi
│   │   │       │   │   │   │   │   ├── char.pyi
│   │   │       │   │   │   │   │   ├── chararray.pyi
│   │   │       │   │   │   │   │   ├── comparisons.pyi
│   │   │       │   │   │   │   │   ├── constants.pyi
│   │   │       │   │   │   │   │   ├── datasource.pyi
│   │   │       │   │   │   │   │   ├── dtype.pyi
│   │   │       │   │   │   │   │   ├── einsumfunc.pyi
│   │   │       │   │   │   │   │   ├── false_positives.pyi
│   │   │       │   │   │   │   │   ├── flatiter.pyi
│   │   │       │   │   │   │   │   ├── fromnumeric.pyi
│   │   │       │   │   │   │   │   ├── histograms.pyi
│   │   │       │   │   │   │   │   ├── index_tricks.pyi
│   │   │       │   │   │   │   │   ├── lib_function_base.pyi
│   │   │       │   │   │   │   │   ├── lib_polynomial.pyi
│   │   │       │   │   │   │   │   ├── lib_utils.pyi
│   │   │       │   │   │   │   │   ├── lib_version.pyi
│   │   │       │   │   │   │   │   ├── linalg.pyi
│   │   │       │   │   │   │   │   ├── memmap.pyi
│   │   │       │   │   │   │   │   ├── modules.pyi
│   │   │       │   │   │   │   │   ├── multiarray.pyi
│   │   │       │   │   │   │   │   ├── ndarray.pyi
│   │   │       │   │   │   │   │   ├── ndarray_misc.pyi
│   │   │       │   │   │   │   │   ├── nditer.pyi
│   │   │       │   │   │   │   │   ├── nested_sequence.pyi
│   │   │       │   │   │   │   │   ├── npyio.pyi
│   │   │       │   │   │   │   │   ├── numerictypes.pyi
│   │   │       │   │   │   │   │   ├── random.pyi
│   │   │       │   │   │   │   │   ├── rec.pyi
│   │   │       │   │   │   │   │   ├── scalars.pyi
│   │   │       │   │   │   │   │   ├── shape_base.pyi
│   │   │       │   │   │   │   │   ├── stride_tricks.pyi
│   │   │       │   │   │   │   │   ├── strings.pyi
│   │   │       │   │   │   │   │   ├── testing.pyi
│   │   │       │   │   │   │   │   ├── twodim_base.pyi
│   │   │       │   │   │   │   │   ├── type_check.pyi
│   │   │       │   │   │   │   │   ├── ufunc_config.pyi
│   │   │       │   │   │   │   │   ├── ufunclike.pyi
│   │   │       │   │   │   │   │   ├── ufuncs.pyi
│   │   │       │   │   │   │   │   └── warnings_and_errors.pyi
│   │   │       │   │   │   │   ├── misc/
│   │   │       │   │   │   │   │   └── extended_precision.pyi
│   │   │       │   │   │   │   ├── pass/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── arithmetic.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── array_constructors.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── array_like.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── arrayprint.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── arrayterator.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── bitwise_ops.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── comparisons.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── dtype.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── einsumfunc.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── flatiter.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── fromnumeric.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── index_tricks.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── lib_utils.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── lib_version.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── literal.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── ma.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── mod.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── modules.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── multiarray.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── ndarray_conversion.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── ndarray_misc.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── ndarray_shape_manipulation.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── numeric.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── numerictypes.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── random.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── scalars.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── simple.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── simple_py3.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── ufunc_config.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── ufunclike.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── ufuncs.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── warnings_and_errors.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── arithmetic.py
│   │   │       │   │   │   │   │   ├── array_constructors.py
│   │   │       │   │   │   │   │   ├── array_like.py
│   │   │       │   │   │   │   │   ├── arrayprint.py
│   │   │       │   │   │   │   │   ├── arrayterator.py
│   │   │       │   │   │   │   │   ├── bitwise_ops.py
│   │   │       │   │   │   │   │   ├── comparisons.py
│   │   │       │   │   │   │   │   ├── dtype.py
│   │   │       │   │   │   │   │   ├── einsumfunc.py
│   │   │       │   │   │   │   │   ├── flatiter.py
│   │   │       │   │   │   │   │   ├── fromnumeric.py
│   │   │       │   │   │   │   │   ├── index_tricks.py
│   │   │       │   │   │   │   │   ├── lib_utils.py
│   │   │       │   │   │   │   │   ├── lib_version.py
│   │   │       │   │   │   │   │   ├── literal.py
│   │   │       │   │   │   │   │   ├── ma.py
│   │   │       │   │   │   │   │   ├── mod.py
│   │   │       │   │   │   │   │   ├── modules.py
│   │   │       │   │   │   │   │   ├── multiarray.py
│   │   │       │   │   │   │   │   ├── ndarray_conversion.py
│   │   │       │   │   │   │   │   ├── ndarray_misc.py
│   │   │       │   │   │   │   │   ├── ndarray_shape_manipulation.py
│   │   │       │   │   │   │   │   ├── numeric.py
│   │   │       │   │   │   │   │   ├── numerictypes.py
│   │   │       │   │   │   │   │   ├── random.py
│   │   │       │   │   │   │   │   ├── scalars.py
│   │   │       │   │   │   │   │   ├── simple.py
│   │   │       │   │   │   │   │   ├── simple_py3.py
│   │   │       │   │   │   │   │   ├── ufunc_config.py
│   │   │       │   │   │   │   │   ├── ufunclike.py
│   │   │       │   │   │   │   │   ├── ufuncs.py
│   │   │       │   │   │   │   │   └── warnings_and_errors.py
│   │   │       │   │   │   │   ├── reveal/
│   │   │       │   │   │   │   │   ├── arithmetic.pyi
│   │   │       │   │   │   │   │   ├── array_constructors.pyi
│   │   │       │   │   │   │   │   ├── arraypad.pyi
│   │   │       │   │   │   │   │   ├── arrayprint.pyi
│   │   │       │   │   │   │   │   ├── arraysetops.pyi
│   │   │       │   │   │   │   │   ├── arrayterator.pyi
│   │   │       │   │   │   │   │   ├── bitwise_ops.pyi
│   │   │       │   │   │   │   │   ├── char.pyi
│   │   │       │   │   │   │   │   ├── chararray.pyi
│   │   │       │   │   │   │   │   ├── comparisons.pyi
│   │   │       │   │   │   │   │   ├── constants.pyi
│   │   │       │   │   │   │   │   ├── ctypeslib.pyi
│   │   │       │   │   │   │   │   ├── datasource.pyi
│   │   │       │   │   │   │   │   ├── dtype.pyi
│   │   │       │   │   │   │   │   ├── einsumfunc.pyi
│   │   │       │   │   │   │   │   ├── emath.pyi
│   │   │       │   │   │   │   │   ├── false_positives.pyi
│   │   │       │   │   │   │   │   ├── fft.pyi
│   │   │       │   │   │   │   │   ├── flatiter.pyi
│   │   │       │   │   │   │   │   ├── fromnumeric.pyi
│   │   │       │   │   │   │   │   ├── getlimits.pyi
│   │   │       │   │   │   │   │   ├── histograms.pyi
│   │   │       │   │   │   │   │   ├── index_tricks.pyi
│   │   │       │   │   │   │   │   ├── lib_function_base.pyi
│   │   │       │   │   │   │   │   ├── lib_polynomial.pyi
│   │   │       │   │   │   │   │   ├── lib_utils.pyi
│   │   │       │   │   │   │   │   ├── lib_version.pyi
│   │   │       │   │   │   │   │   ├── linalg.pyi
│   │   │       │   │   │   │   │   ├── matrix.pyi
│   │   │       │   │   │   │   │   ├── memmap.pyi
│   │   │       │   │   │   │   │   ├── mod.pyi
│   │   │       │   │   │   │   │   ├── modules.pyi
│   │   │       │   │   │   │   │   ├── multiarray.pyi
│   │   │       │   │   │   │   │   ├── nbit_base_example.pyi
│   │   │       │   │   │   │   │   ├── ndarray_conversion.pyi
│   │   │       │   │   │   │   │   ├── ndarray_misc.pyi
│   │   │       │   │   │   │   │   ├── ndarray_shape_manipulation.pyi
│   │   │       │   │   │   │   │   ├── nditer.pyi
│   │   │       │   │   │   │   │   ├── nested_sequence.pyi
│   │   │       │   │   │   │   │   ├── npyio.pyi
│   │   │       │   │   │   │   │   ├── numeric.pyi
│   │   │       │   │   │   │   │   ├── numerictypes.pyi
│   │   │       │   │   │   │   │   ├── random.pyi
│   │   │       │   │   │   │   │   ├── rec.pyi
│   │   │       │   │   │   │   │   ├── scalars.pyi
│   │   │       │   │   │   │   │   ├── shape_base.pyi
│   │   │       │   │   │   │   │   ├── stride_tricks.pyi
│   │   │       │   │   │   │   │   ├── strings.pyi
│   │   │       │   │   │   │   │   ├── testing.pyi
│   │   │       │   │   │   │   │   ├── twodim_base.pyi
│   │   │       │   │   │   │   │   ├── type_check.pyi
│   │   │       │   │   │   │   │   ├── ufunc_config.pyi
│   │   │       │   │   │   │   │   ├── ufunclike.pyi
│   │   │       │   │   │   │   │   ├── ufuncs.pyi
│   │   │       │   │   │   │   │   └── warnings_and_errors.pyi
│   │   │       │   │   │   │   └── mypy.ini
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_isfile.py
│   │   │       │   │   │   ├── test_runtime.py
│   │   │       │   │   │   └── test_typing.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   └── mypy_plugin.py
│   │   │       │   ├── __config__.py
│   │   │       │   ├── __init__.cython-30.pxd
│   │   │       │   ├── __init__.pxd
│   │   │       │   ├── __init__.py
│   │   │       │   ├── __init__.pyi
│   │   │       │   ├── _configtool.py
│   │   │       │   ├── _distributor_init.py
│   │   │       │   ├── _expired_attrs_2_0.py
│   │   │       │   ├── _globals.py
│   │   │       │   ├── _pytesttester.py
│   │   │       │   ├── _pytesttester.pyi
│   │   │       │   ├── conftest.py
│   │   │       │   ├── ctypeslib.py
│   │   │       │   ├── ctypeslib.pyi
│   │   │       │   ├── dtypes.py
│   │   │       │   ├── dtypes.pyi
│   │   │       │   ├── exceptions.py
│   │   │       │   ├── exceptions.pyi
│   │   │       │   ├── matlib.py
│   │   │       │   ├── py.typed
│   │   │       │   ├── version.py
│   │   │       │   └── version.pyi
│   │   │       ├── numpy-2.0.2.dist-info/
│   │   │       │   ├── DELVEWHEEL
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── LICENSE.txt
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── REQUESTED
│   │   │       │   ├── WHEEL
│   │   │       │   └── entry_points.txt
│   │   │       ├── numpy.libs/
│   │   │       │   ├── libscipy_openblas64_-caad452230ae4ddb57899b8b3a33c55c.dll
│   │   │       │   └── msvcp140-23ebcc0b37c8e3d074511f362feac48b.dll
│   │   │       ├── packaging/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── _elffile.cpython-312.pyc
│   │   │       │   │   ├── _manylinux.cpython-312.pyc
│   │   │       │   │   ├── _musllinux.cpython-312.pyc
│   │   │       │   │   ├── _parser.cpython-312.pyc
│   │   │       │   │   ├── _structures.cpython-312.pyc
│   │   │       │   │   ├── _tokenizer.cpython-312.pyc
│   │   │       │   │   ├── markers.cpython-312.pyc
│   │   │       │   │   ├── metadata.cpython-312.pyc
│   │   │       │   │   ├── requirements.cpython-312.pyc
│   │   │       │   │   ├── specifiers.cpython-312.pyc
│   │   │       │   │   ├── tags.cpython-312.pyc
│   │   │       │   │   ├── utils.cpython-312.pyc
│   │   │       │   │   └── version.cpython-312.pyc
│   │   │       │   ├── licenses/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   └── _spdx.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   └── _spdx.py
│   │   │       │   ├── __init__.py
│   │   │       │   ├── _elffile.py
│   │   │       │   ├── _manylinux.py
│   │   │       │   ├── _musllinux.py
│   │   │       │   ├── _parser.py
│   │   │       │   ├── _structures.py
│   │   │       │   ├── _tokenizer.py
│   │   │       │   ├── markers.py
│   │   │       │   ├── metadata.py
│   │   │       │   ├── py.typed
│   │   │       │   ├── requirements.py
│   │   │       │   ├── specifiers.py
│   │   │       │   ├── tags.py
│   │   │       │   ├── utils.py
│   │   │       │   └── version.py
│   │   │       ├── packaging-25.0.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   ├── LICENSE
│   │   │       │   │   ├── LICENSE.APACHE
│   │   │       │   │   └── LICENSE.BSD
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   └── WHEEL
│   │   │       ├── pandas/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── _typing.cpython-312.pyc
│   │   │       │   │   ├── _version.cpython-312.pyc
│   │   │       │   │   ├── _version_meson.cpython-312.pyc
│   │   │       │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   └── testing.cpython-312.pyc
│   │   │       │   ├── _config/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── config.cpython-312.pyc
│   │   │       │   │   │   ├── dates.cpython-312.pyc
│   │   │       │   │   │   ├── display.cpython-312.pyc
│   │   │       │   │   │   └── localization.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── config.py
│   │   │       │   │   ├── dates.py
│   │   │       │   │   ├── display.py
│   │   │       │   │   └── localization.py
│   │   │       │   ├── _libs/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   ├── tslibs/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── base.cp312-win_amd64.lib
│   │   │       │   │   │   ├── base.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── ccalendar.cp312-win_amd64.lib
│   │   │       │   │   │   ├── ccalendar.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── ccalendar.pyi
│   │   │       │   │   │   ├── conversion.cp312-win_amd64.lib
│   │   │       │   │   │   ├── conversion.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── conversion.pyi
│   │   │       │   │   │   ├── dtypes.cp312-win_amd64.lib
│   │   │       │   │   │   ├── dtypes.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── dtypes.pyi
│   │   │       │   │   │   ├── fields.cp312-win_amd64.lib
│   │   │       │   │   │   ├── fields.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── fields.pyi
│   │   │       │   │   │   ├── nattype.cp312-win_amd64.lib
│   │   │       │   │   │   ├── nattype.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── nattype.pyi
│   │   │       │   │   │   ├── np_datetime.cp312-win_amd64.lib
│   │   │       │   │   │   ├── np_datetime.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── np_datetime.pyi
│   │   │       │   │   │   ├── offsets.cp312-win_amd64.lib
│   │   │       │   │   │   ├── offsets.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── offsets.pyi
│   │   │       │   │   │   ├── parsing.cp312-win_amd64.lib
│   │   │       │   │   │   ├── parsing.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── parsing.pyi
│   │   │       │   │   │   ├── period.cp312-win_amd64.lib
│   │   │       │   │   │   ├── period.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── period.pyi
│   │   │       │   │   │   ├── strptime.cp312-win_amd64.lib
│   │   │       │   │   │   ├── strptime.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── strptime.pyi
│   │   │       │   │   │   ├── timedeltas.cp312-win_amd64.lib
│   │   │       │   │   │   ├── timedeltas.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── timedeltas.pyi
│   │   │       │   │   │   ├── timestamps.cp312-win_amd64.lib
│   │   │       │   │   │   ├── timestamps.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── timestamps.pyi
│   │   │       │   │   │   ├── timezones.cp312-win_amd64.lib
│   │   │       │   │   │   ├── timezones.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── timezones.pyi
│   │   │       │   │   │   ├── tzconversion.cp312-win_amd64.lib
│   │   │       │   │   │   ├── tzconversion.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── tzconversion.pyi
│   │   │       │   │   │   ├── vectorized.cp312-win_amd64.lib
│   │   │       │   │   │   ├── vectorized.cp312-win_amd64.pyd
│   │   │       │   │   │   └── vectorized.pyi
│   │   │       │   │   ├── window/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── aggregations.cp312-win_amd64.lib
│   │   │       │   │   │   ├── aggregations.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── aggregations.pyi
│   │   │       │   │   │   ├── indexers.cp312-win_amd64.lib
│   │   │       │   │   │   ├── indexers.cp312-win_amd64.pyd
│   │   │       │   │   │   └── indexers.pyi
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── algos.cp312-win_amd64.lib
│   │   │       │   │   ├── algos.cp312-win_amd64.pyd
│   │   │       │   │   ├── algos.pyi
│   │   │       │   │   ├── arrays.cp312-win_amd64.lib
│   │   │       │   │   ├── arrays.cp312-win_amd64.pyd
│   │   │       │   │   ├── arrays.pyi
│   │   │       │   │   ├── byteswap.cp312-win_amd64.lib
│   │   │       │   │   ├── byteswap.cp312-win_amd64.pyd
│   │   │       │   │   ├── byteswap.pyi
│   │   │       │   │   ├── groupby.cp312-win_amd64.lib
│   │   │       │   │   ├── groupby.cp312-win_amd64.pyd
│   │   │       │   │   ├── groupby.pyi
│   │   │       │   │   ├── hashing.cp312-win_amd64.lib
│   │   │       │   │   ├── hashing.cp312-win_amd64.pyd
│   │   │       │   │   ├── hashing.pyi
│   │   │       │   │   ├── hashtable.cp312-win_amd64.lib
│   │   │       │   │   ├── hashtable.cp312-win_amd64.pyd
│   │   │       │   │   ├── hashtable.pyi
│   │   │       │   │   ├── index.cp312-win_amd64.lib
│   │   │       │   │   ├── index.cp312-win_amd64.pyd
│   │   │       │   │   ├── index.pyi
│   │   │       │   │   ├── indexing.cp312-win_amd64.lib
│   │   │       │   │   ├── indexing.cp312-win_amd64.pyd
│   │   │       │   │   ├── indexing.pyi
│   │   │       │   │   ├── internals.cp312-win_amd64.lib
│   │   │       │   │   ├── internals.cp312-win_amd64.pyd
│   │   │       │   │   ├── internals.pyi
│   │   │       │   │   ├── interval.cp312-win_amd64.lib
│   │   │       │   │   ├── interval.cp312-win_amd64.pyd
│   │   │       │   │   ├── interval.pyi
│   │   │       │   │   ├── join.cp312-win_amd64.lib
│   │   │       │   │   ├── join.cp312-win_amd64.pyd
│   │   │       │   │   ├── join.pyi
│   │   │       │   │   ├── json.cp312-win_amd64.lib
│   │   │       │   │   ├── json.cp312-win_amd64.pyd
│   │   │       │   │   ├── json.pyi
│   │   │       │   │   ├── lib.cp312-win_amd64.lib
│   │   │       │   │   ├── lib.cp312-win_amd64.pyd
│   │   │       │   │   ├── lib.pyi
│   │   │       │   │   ├── missing.cp312-win_amd64.lib
│   │   │       │   │   ├── missing.cp312-win_amd64.pyd
│   │   │       │   │   ├── missing.pyi
│   │   │       │   │   ├── ops.cp312-win_amd64.lib
│   │   │       │   │   ├── ops.cp312-win_amd64.pyd
│   │   │       │   │   ├── ops.pyi
│   │   │       │   │   ├── ops_dispatch.cp312-win_amd64.lib
│   │   │       │   │   ├── ops_dispatch.cp312-win_amd64.pyd
│   │   │       │   │   ├── ops_dispatch.pyi
│   │   │       │   │   ├── pandas_datetime.cp312-win_amd64.lib
│   │   │       │   │   ├── pandas_datetime.cp312-win_amd64.pyd
│   │   │       │   │   ├── pandas_parser.cp312-win_amd64.lib
│   │   │       │   │   ├── pandas_parser.cp312-win_amd64.pyd
│   │   │       │   │   ├── parsers.cp312-win_amd64.lib
│   │   │       │   │   ├── parsers.cp312-win_amd64.pyd
│   │   │       │   │   ├── parsers.pyi
│   │   │       │   │   ├── properties.cp312-win_amd64.lib
│   │   │       │   │   ├── properties.cp312-win_amd64.pyd
│   │   │       │   │   ├── properties.pyi
│   │   │       │   │   ├── reshape.cp312-win_amd64.lib
│   │   │       │   │   ├── reshape.cp312-win_amd64.pyd
│   │   │       │   │   ├── reshape.pyi
│   │   │       │   │   ├── sas.cp312-win_amd64.lib
│   │   │       │   │   ├── sas.cp312-win_amd64.pyd
│   │   │       │   │   ├── sas.pyi
│   │   │       │   │   ├── sparse.cp312-win_amd64.lib
│   │   │       │   │   ├── sparse.cp312-win_amd64.pyd
│   │   │       │   │   ├── sparse.pyi
│   │   │       │   │   ├── testing.cp312-win_amd64.lib
│   │   │       │   │   ├── testing.cp312-win_amd64.pyd
│   │   │       │   │   ├── testing.pyi
│   │   │       │   │   ├── tslib.cp312-win_amd64.lib
│   │   │       │   │   ├── tslib.cp312-win_amd64.pyd
│   │   │       │   │   ├── tslib.pyi
│   │   │       │   │   ├── writers.cp312-win_amd64.lib
│   │   │       │   │   ├── writers.cp312-win_amd64.pyd
│   │   │       │   │   └── writers.pyi
│   │   │       │   ├── _testing/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _hypothesis.cpython-312.pyc
│   │   │       │   │   │   ├── _io.cpython-312.pyc
│   │   │       │   │   │   ├── _warnings.cpython-312.pyc
│   │   │       │   │   │   ├── asserters.cpython-312.pyc
│   │   │       │   │   │   ├── compat.cpython-312.pyc
│   │   │       │   │   │   └── contexts.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _hypothesis.py
│   │   │       │   │   ├── _io.py
│   │   │       │   │   ├── _warnings.py
│   │   │       │   │   ├── asserters.py
│   │   │       │   │   ├── compat.py
│   │   │       │   │   └── contexts.py
│   │   │       │   ├── api/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   ├── extensions/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── indexers/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── interchange/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── types/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── typing/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   └── __init__.py
│   │   │       │   ├── arrays/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   └── __init__.py
│   │   │       │   ├── compat/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _constants.cpython-312.pyc
│   │   │       │   │   │   ├── _optional.cpython-312.pyc
│   │   │       │   │   │   ├── compressors.cpython-312.pyc
│   │   │       │   │   │   ├── pickle_compat.cpython-312.pyc
│   │   │       │   │   │   └── pyarrow.cpython-312.pyc
│   │   │       │   │   ├── numpy/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── function.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── function.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _constants.py
│   │   │       │   │   ├── _optional.py
│   │   │       │   │   ├── compressors.py
│   │   │       │   │   ├── pickle_compat.py
│   │   │       │   │   └── pyarrow.py
│   │   │       │   ├── core/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── accessor.cpython-312.pyc
│   │   │       │   │   │   ├── algorithms.cpython-312.pyc
│   │   │       │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   ├── apply.cpython-312.pyc
│   │   │       │   │   │   ├── arraylike.cpython-312.pyc
│   │   │       │   │   │   ├── base.cpython-312.pyc
│   │   │       │   │   │   ├── common.cpython-312.pyc
│   │   │       │   │   │   ├── config_init.cpython-312.pyc
│   │   │       │   │   │   ├── construction.cpython-312.pyc
│   │   │       │   │   │   ├── flags.cpython-312.pyc
│   │   │       │   │   │   ├── frame.cpython-312.pyc
│   │   │       │   │   │   ├── generic.cpython-312.pyc
│   │   │       │   │   │   ├── indexing.cpython-312.pyc
│   │   │       │   │   │   ├── missing.cpython-312.pyc
│   │   │       │   │   │   ├── nanops.cpython-312.pyc
│   │   │       │   │   │   ├── resample.cpython-312.pyc
│   │   │       │   │   │   ├── roperator.cpython-312.pyc
│   │   │       │   │   │   ├── sample.cpython-312.pyc
│   │   │       │   │   │   ├── series.cpython-312.pyc
│   │   │       │   │   │   ├── shared_docs.cpython-312.pyc
│   │   │       │   │   │   └── sorting.cpython-312.pyc
│   │   │       │   │   ├── _numba/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── executor.cpython-312.pyc
│   │   │       │   │   │   │   └── extensions.cpython-312.pyc
│   │   │       │   │   │   ├── kernels/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── mean_.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── min_max_.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── shared.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── sum_.cpython-312.pyc
│   │   │       │   │   │   │   │   └── var_.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── mean_.py
│   │   │       │   │   │   │   ├── min_max_.py
│   │   │       │   │   │   │   ├── shared.py
│   │   │       │   │   │   │   ├── sum_.py
│   │   │       │   │   │   │   └── var_.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── executor.py
│   │   │       │   │   │   └── extensions.py
│   │   │       │   │   ├── array_algos/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── datetimelike_accumulations.cpython-312.pyc
│   │   │       │   │   │   │   ├── masked_accumulations.cpython-312.pyc
│   │   │       │   │   │   │   ├── masked_reductions.cpython-312.pyc
│   │   │       │   │   │   │   ├── putmask.cpython-312.pyc
│   │   │       │   │   │   │   ├── quantile.cpython-312.pyc
│   │   │       │   │   │   │   ├── replace.cpython-312.pyc
│   │   │       │   │   │   │   ├── take.cpython-312.pyc
│   │   │       │   │   │   │   └── transforms.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── datetimelike_accumulations.py
│   │   │       │   │   │   ├── masked_accumulations.py
│   │   │       │   │   │   ├── masked_reductions.py
│   │   │       │   │   │   ├── putmask.py
│   │   │       │   │   │   ├── quantile.py
│   │   │       │   │   │   ├── replace.py
│   │   │       │   │   │   ├── take.py
│   │   │       │   │   │   └── transforms.py
│   │   │       │   │   ├── arrays/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _arrow_string_mixins.cpython-312.pyc
│   │   │       │   │   │   │   ├── _mixins.cpython-312.pyc
│   │   │       │   │   │   │   ├── _ranges.cpython-312.pyc
│   │   │       │   │   │   │   ├── _utils.cpython-312.pyc
│   │   │       │   │   │   │   ├── base.cpython-312.pyc
│   │   │       │   │   │   │   ├── boolean.cpython-312.pyc
│   │   │       │   │   │   │   ├── categorical.cpython-312.pyc
│   │   │       │   │   │   │   ├── datetimelike.cpython-312.pyc
│   │   │       │   │   │   │   ├── datetimes.cpython-312.pyc
│   │   │       │   │   │   │   ├── floating.cpython-312.pyc
│   │   │       │   │   │   │   ├── integer.cpython-312.pyc
│   │   │       │   │   │   │   ├── interval.cpython-312.pyc
│   │   │       │   │   │   │   ├── masked.cpython-312.pyc
│   │   │       │   │   │   │   ├── numeric.cpython-312.pyc
│   │   │       │   │   │   │   ├── numpy_.cpython-312.pyc
│   │   │       │   │   │   │   ├── period.cpython-312.pyc
│   │   │       │   │   │   │   ├── string_.cpython-312.pyc
│   │   │       │   │   │   │   ├── string_arrow.cpython-312.pyc
│   │   │       │   │   │   │   └── timedeltas.cpython-312.pyc
│   │   │       │   │   │   ├── arrow/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _arrow_utils.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── accessors.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── array.cpython-312.pyc
│   │   │       │   │   │   │   │   └── extension_types.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── _arrow_utils.py
│   │   │       │   │   │   │   ├── accessors.py
│   │   │       │   │   │   │   ├── array.py
│   │   │       │   │   │   │   └── extension_types.py
│   │   │       │   │   │   ├── sparse/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── accessor.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── array.cpython-312.pyc
│   │   │       │   │   │   │   │   └── scipy_sparse.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── accessor.py
│   │   │       │   │   │   │   ├── array.py
│   │   │       │   │   │   │   └── scipy_sparse.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _arrow_string_mixins.py
│   │   │       │   │   │   ├── _mixins.py
│   │   │       │   │   │   ├── _ranges.py
│   │   │       │   │   │   ├── _utils.py
│   │   │       │   │   │   ├── base.py
│   │   │       │   │   │   ├── boolean.py
│   │   │       │   │   │   ├── categorical.py
│   │   │       │   │   │   ├── datetimelike.py
│   │   │       │   │   │   ├── datetimes.py
│   │   │       │   │   │   ├── floating.py
│   │   │       │   │   │   ├── integer.py
│   │   │       │   │   │   ├── interval.py
│   │   │       │   │   │   ├── masked.py
│   │   │       │   │   │   ├── numeric.py
│   │   │       │   │   │   ├── numpy_.py
│   │   │       │   │   │   ├── period.py
│   │   │       │   │   │   ├── string_.py
│   │   │       │   │   │   ├── string_arrow.py
│   │   │       │   │   │   └── timedeltas.py
│   │   │       │   │   ├── computation/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── align.cpython-312.pyc
│   │   │       │   │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   │   ├── check.cpython-312.pyc
│   │   │       │   │   │   │   ├── common.cpython-312.pyc
│   │   │       │   │   │   │   ├── engines.cpython-312.pyc
│   │   │       │   │   │   │   ├── eval.cpython-312.pyc
│   │   │       │   │   │   │   ├── expr.cpython-312.pyc
│   │   │       │   │   │   │   ├── expressions.cpython-312.pyc
│   │   │       │   │   │   │   ├── ops.cpython-312.pyc
│   │   │       │   │   │   │   ├── parsing.cpython-312.pyc
│   │   │       │   │   │   │   ├── pytables.cpython-312.pyc
│   │   │       │   │   │   │   └── scope.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── align.py
│   │   │       │   │   │   ├── api.py
│   │   │       │   │   │   ├── check.py
│   │   │       │   │   │   ├── common.py
│   │   │       │   │   │   ├── engines.py
│   │   │       │   │   │   ├── eval.py
│   │   │       │   │   │   ├── expr.py
│   │   │       │   │   │   ├── expressions.py
│   │   │       │   │   │   ├── ops.py
│   │   │       │   │   │   ├── parsing.py
│   │   │       │   │   │   ├── pytables.py
│   │   │       │   │   │   └── scope.py
│   │   │       │   │   ├── dtypes/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   │   ├── astype.cpython-312.pyc
│   │   │       │   │   │   │   ├── base.cpython-312.pyc
│   │   │       │   │   │   │   ├── cast.cpython-312.pyc
│   │   │       │   │   │   │   ├── common.cpython-312.pyc
│   │   │       │   │   │   │   ├── concat.cpython-312.pyc
│   │   │       │   │   │   │   ├── dtypes.cpython-312.pyc
│   │   │       │   │   │   │   ├── generic.cpython-312.pyc
│   │   │       │   │   │   │   ├── inference.cpython-312.pyc
│   │   │       │   │   │   │   └── missing.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── api.py
│   │   │       │   │   │   ├── astype.py
│   │   │       │   │   │   ├── base.py
│   │   │       │   │   │   ├── cast.py
│   │   │       │   │   │   ├── common.py
│   │   │       │   │   │   ├── concat.py
│   │   │       │   │   │   ├── dtypes.py
│   │   │       │   │   │   ├── generic.py
│   │   │       │   │   │   ├── inference.py
│   │   │       │   │   │   └── missing.py
│   │   │       │   │   ├── groupby/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── base.cpython-312.pyc
│   │   │       │   │   │   │   ├── categorical.cpython-312.pyc
│   │   │       │   │   │   │   ├── generic.cpython-312.pyc
│   │   │       │   │   │   │   ├── groupby.cpython-312.pyc
│   │   │       │   │   │   │   ├── grouper.cpython-312.pyc
│   │   │       │   │   │   │   ├── indexing.cpython-312.pyc
│   │   │       │   │   │   │   ├── numba_.cpython-312.pyc
│   │   │       │   │   │   │   └── ops.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── base.py
│   │   │       │   │   │   ├── categorical.py
│   │   │       │   │   │   ├── generic.py
│   │   │       │   │   │   ├── groupby.py
│   │   │       │   │   │   ├── grouper.py
│   │   │       │   │   │   ├── indexing.py
│   │   │       │   │   │   ├── numba_.py
│   │   │       │   │   │   └── ops.py
│   │   │       │   │   ├── indexers/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── objects.cpython-312.pyc
│   │   │       │   │   │   │   └── utils.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── objects.py
│   │   │       │   │   │   └── utils.py
│   │   │       │   │   ├── indexes/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── accessors.cpython-312.pyc
│   │   │       │   │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   │   ├── base.cpython-312.pyc
│   │   │       │   │   │   │   ├── category.cpython-312.pyc
│   │   │       │   │   │   │   ├── datetimelike.cpython-312.pyc
│   │   │       │   │   │   │   ├── datetimes.cpython-312.pyc
│   │   │       │   │   │   │   ├── extension.cpython-312.pyc
│   │   │       │   │   │   │   ├── frozen.cpython-312.pyc
│   │   │       │   │   │   │   ├── interval.cpython-312.pyc
│   │   │       │   │   │   │   ├── multi.cpython-312.pyc
│   │   │       │   │   │   │   ├── period.cpython-312.pyc
│   │   │       │   │   │   │   ├── range.cpython-312.pyc
│   │   │       │   │   │   │   └── timedeltas.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── accessors.py
│   │   │       │   │   │   ├── api.py
│   │   │       │   │   │   ├── base.py
│   │   │       │   │   │   ├── category.py
│   │   │       │   │   │   ├── datetimelike.py
│   │   │       │   │   │   ├── datetimes.py
│   │   │       │   │   │   ├── extension.py
│   │   │       │   │   │   ├── frozen.py
│   │   │       │   │   │   ├── interval.py
│   │   │       │   │   │   ├── multi.py
│   │   │       │   │   │   ├── period.py
│   │   │       │   │   │   ├── range.py
│   │   │       │   │   │   └── timedeltas.py
│   │   │       │   │   ├── interchange/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── buffer.cpython-312.pyc
│   │   │       │   │   │   │   ├── column.cpython-312.pyc
│   │   │       │   │   │   │   ├── dataframe.cpython-312.pyc
│   │   │       │   │   │   │   ├── dataframe_protocol.cpython-312.pyc
│   │   │       │   │   │   │   ├── from_dataframe.cpython-312.pyc
│   │   │       │   │   │   │   └── utils.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── buffer.py
│   │   │       │   │   │   ├── column.py
│   │   │       │   │   │   ├── dataframe.py
│   │   │       │   │   │   ├── dataframe_protocol.py
│   │   │       │   │   │   ├── from_dataframe.py
│   │   │       │   │   │   └── utils.py
│   │   │       │   │   ├── internals/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   │   ├── array_manager.cpython-312.pyc
│   │   │       │   │   │   │   ├── base.cpython-312.pyc
│   │   │       │   │   │   │   ├── blocks.cpython-312.pyc
│   │   │       │   │   │   │   ├── concat.cpython-312.pyc
│   │   │       │   │   │   │   ├── construction.cpython-312.pyc
│   │   │       │   │   │   │   ├── managers.cpython-312.pyc
│   │   │       │   │   │   │   └── ops.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── api.py
│   │   │       │   │   │   ├── array_manager.py
│   │   │       │   │   │   ├── base.py
│   │   │       │   │   │   ├── blocks.py
│   │   │       │   │   │   ├── concat.py
│   │   │       │   │   │   ├── construction.py
│   │   │       │   │   │   ├── managers.py
│   │   │       │   │   │   └── ops.py
│   │   │       │   │   ├── methods/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── describe.cpython-312.pyc
│   │   │       │   │   │   │   ├── selectn.cpython-312.pyc
│   │   │       │   │   │   │   └── to_dict.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── describe.py
│   │   │       │   │   │   ├── selectn.py
│   │   │       │   │   │   └── to_dict.py
│   │   │       │   │   ├── ops/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── array_ops.cpython-312.pyc
│   │   │       │   │   │   │   ├── common.cpython-312.pyc
│   │   │       │   │   │   │   ├── dispatch.cpython-312.pyc
│   │   │       │   │   │   │   ├── docstrings.cpython-312.pyc
│   │   │       │   │   │   │   ├── invalid.cpython-312.pyc
│   │   │       │   │   │   │   ├── mask_ops.cpython-312.pyc
│   │   │       │   │   │   │   └── missing.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── array_ops.py
│   │   │       │   │   │   ├── common.py
│   │   │       │   │   │   ├── dispatch.py
│   │   │       │   │   │   ├── docstrings.py
│   │   │       │   │   │   ├── invalid.py
│   │   │       │   │   │   ├── mask_ops.py
│   │   │       │   │   │   └── missing.py
│   │   │       │   │   ├── reshape/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   │   ├── concat.cpython-312.pyc
│   │   │       │   │   │   │   ├── encoding.cpython-312.pyc
│   │   │       │   │   │   │   ├── melt.cpython-312.pyc
│   │   │       │   │   │   │   ├── merge.cpython-312.pyc
│   │   │       │   │   │   │   ├── pivot.cpython-312.pyc
│   │   │       │   │   │   │   ├── reshape.cpython-312.pyc
│   │   │       │   │   │   │   ├── tile.cpython-312.pyc
│   │   │       │   │   │   │   └── util.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── api.py
│   │   │       │   │   │   ├── concat.py
│   │   │       │   │   │   ├── encoding.py
│   │   │       │   │   │   ├── melt.py
│   │   │       │   │   │   ├── merge.py
│   │   │       │   │   │   ├── pivot.py
│   │   │       │   │   │   ├── reshape.py
│   │   │       │   │   │   ├── tile.py
│   │   │       │   │   │   └── util.py
│   │   │       │   │   ├── sparse/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── api.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── api.py
│   │   │       │   │   ├── strings/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── accessor.cpython-312.pyc
│   │   │       │   │   │   │   ├── base.cpython-312.pyc
│   │   │       │   │   │   │   └── object_array.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── accessor.py
│   │   │       │   │   │   ├── base.py
│   │   │       │   │   │   └── object_array.py
│   │   │       │   │   ├── tools/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── datetimes.cpython-312.pyc
│   │   │       │   │   │   │   ├── numeric.cpython-312.pyc
│   │   │       │   │   │   │   ├── timedeltas.cpython-312.pyc
│   │   │       │   │   │   │   └── times.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── datetimes.py
│   │   │       │   │   │   ├── numeric.py
│   │   │       │   │   │   ├── timedeltas.py
│   │   │       │   │   │   └── times.py
│   │   │       │   │   ├── util/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── hashing.cpython-312.pyc
│   │   │       │   │   │   │   └── numba_.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── hashing.py
│   │   │       │   │   │   └── numba_.py
│   │   │       │   │   ├── window/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── common.cpython-312.pyc
│   │   │       │   │   │   │   ├── doc.cpython-312.pyc
│   │   │       │   │   │   │   ├── ewm.cpython-312.pyc
│   │   │       │   │   │   │   ├── expanding.cpython-312.pyc
│   │   │       │   │   │   │   ├── numba_.cpython-312.pyc
│   │   │       │   │   │   │   ├── online.cpython-312.pyc
│   │   │       │   │   │   │   └── rolling.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── common.py
│   │   │       │   │   │   ├── doc.py
│   │   │       │   │   │   ├── ewm.py
│   │   │       │   │   │   ├── expanding.py
│   │   │       │   │   │   ├── numba_.py
│   │   │       │   │   │   ├── online.py
│   │   │       │   │   │   └── rolling.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── accessor.py
│   │   │       │   │   ├── algorithms.py
│   │   │       │   │   ├── api.py
│   │   │       │   │   ├── apply.py
│   │   │       │   │   ├── arraylike.py
│   │   │       │   │   ├── base.py
│   │   │       │   │   ├── common.py
│   │   │       │   │   ├── config_init.py
│   │   │       │   │   ├── construction.py
│   │   │       │   │   ├── flags.py
│   │   │       │   │   ├── frame.py
│   │   │       │   │   ├── generic.py
│   │   │       │   │   ├── indexing.py
│   │   │       │   │   ├── missing.py
│   │   │       │   │   ├── nanops.py
│   │   │       │   │   ├── resample.py
│   │   │       │   │   ├── roperator.py
│   │   │       │   │   ├── sample.py
│   │   │       │   │   ├── series.py
│   │   │       │   │   ├── shared_docs.py
│   │   │       │   │   └── sorting.py
│   │   │       │   ├── errors/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   └── __init__.py
│   │   │       │   ├── io/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _util.cpython-312.pyc
│   │   │       │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   ├── clipboards.cpython-312.pyc
│   │   │       │   │   │   ├── common.cpython-312.pyc
│   │   │       │   │   │   ├── feather_format.cpython-312.pyc
│   │   │       │   │   │   ├── gbq.cpython-312.pyc
│   │   │       │   │   │   ├── html.cpython-312.pyc
│   │   │       │   │   │   ├── orc.cpython-312.pyc
│   │   │       │   │   │   ├── parquet.cpython-312.pyc
│   │   │       │   │   │   ├── pickle.cpython-312.pyc
│   │   │       │   │   │   ├── pytables.cpython-312.pyc
│   │   │       │   │   │   ├── spss.cpython-312.pyc
│   │   │       │   │   │   ├── sql.cpython-312.pyc
│   │   │       │   │   │   ├── stata.cpython-312.pyc
│   │   │       │   │   │   └── xml.cpython-312.pyc
│   │   │       │   │   ├── clipboard/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── excel/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _base.cpython-312.pyc
│   │   │       │   │   │   │   ├── _calamine.cpython-312.pyc
│   │   │       │   │   │   │   ├── _odfreader.cpython-312.pyc
│   │   │       │   │   │   │   ├── _odswriter.cpython-312.pyc
│   │   │       │   │   │   │   ├── _openpyxl.cpython-312.pyc
│   │   │       │   │   │   │   ├── _pyxlsb.cpython-312.pyc
│   │   │       │   │   │   │   ├── _util.cpython-312.pyc
│   │   │       │   │   │   │   ├── _xlrd.cpython-312.pyc
│   │   │       │   │   │   │   └── _xlsxwriter.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _base.py
│   │   │       │   │   │   ├── _calamine.py
│   │   │       │   │   │   ├── _odfreader.py
│   │   │       │   │   │   ├── _odswriter.py
│   │   │       │   │   │   ├── _openpyxl.py
│   │   │       │   │   │   ├── _pyxlsb.py
│   │   │       │   │   │   ├── _util.py
│   │   │       │   │   │   ├── _xlrd.py
│   │   │       │   │   │   └── _xlsxwriter.py
│   │   │       │   │   ├── formats/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _color_data.cpython-312.pyc
│   │   │       │   │   │   │   ├── console.cpython-312.pyc
│   │   │       │   │   │   │   ├── css.cpython-312.pyc
│   │   │       │   │   │   │   ├── csvs.cpython-312.pyc
│   │   │       │   │   │   │   ├── excel.cpython-312.pyc
│   │   │       │   │   │   │   ├── format.cpython-312.pyc
│   │   │       │   │   │   │   ├── html.cpython-312.pyc
│   │   │       │   │   │   │   ├── info.cpython-312.pyc
│   │   │       │   │   │   │   ├── printing.cpython-312.pyc
│   │   │       │   │   │   │   ├── string.cpython-312.pyc
│   │   │       │   │   │   │   ├── style.cpython-312.pyc
│   │   │       │   │   │   │   ├── style_render.cpython-312.pyc
│   │   │       │   │   │   │   └── xml.cpython-312.pyc
│   │   │       │   │   │   ├── templates/
│   │   │       │   │   │   │   ├── html.tpl
│   │   │       │   │   │   │   ├── html_style.tpl
│   │   │       │   │   │   │   ├── html_table.tpl
│   │   │       │   │   │   │   ├── latex.tpl
│   │   │       │   │   │   │   ├── latex_longtable.tpl
│   │   │       │   │   │   │   ├── latex_table.tpl
│   │   │       │   │   │   │   └── string.tpl
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _color_data.py
│   │   │       │   │   │   ├── console.py
│   │   │       │   │   │   ├── css.py
│   │   │       │   │   │   ├── csvs.py
│   │   │       │   │   │   ├── excel.py
│   │   │       │   │   │   ├── format.py
│   │   │       │   │   │   ├── html.py
│   │   │       │   │   │   ├── info.py
│   │   │       │   │   │   ├── printing.py
│   │   │       │   │   │   ├── string.py
│   │   │       │   │   │   ├── style.py
│   │   │       │   │   │   ├── style_render.py
│   │   │       │   │   │   └── xml.py
│   │   │       │   │   ├── json/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _json.cpython-312.pyc
│   │   │       │   │   │   │   ├── _normalize.cpython-312.pyc
│   │   │       │   │   │   │   └── _table_schema.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _json.py
│   │   │       │   │   │   ├── _normalize.py
│   │   │       │   │   │   └── _table_schema.py
│   │   │       │   │   ├── parsers/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── arrow_parser_wrapper.cpython-312.pyc
│   │   │       │   │   │   │   ├── base_parser.cpython-312.pyc
│   │   │       │   │   │   │   ├── c_parser_wrapper.cpython-312.pyc
│   │   │       │   │   │   │   ├── python_parser.cpython-312.pyc
│   │   │       │   │   │   │   └── readers.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── arrow_parser_wrapper.py
│   │   │       │   │   │   ├── base_parser.py
│   │   │       │   │   │   ├── c_parser_wrapper.py
│   │   │       │   │   │   ├── python_parser.py
│   │   │       │   │   │   └── readers.py
│   │   │       │   │   ├── sas/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── sas7bdat.cpython-312.pyc
│   │   │       │   │   │   │   ├── sas_constants.cpython-312.pyc
│   │   │       │   │   │   │   ├── sas_xport.cpython-312.pyc
│   │   │       │   │   │   │   └── sasreader.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── sas7bdat.py
│   │   │       │   │   │   ├── sas_constants.py
│   │   │       │   │   │   ├── sas_xport.py
│   │   │       │   │   │   └── sasreader.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _util.py
│   │   │       │   │   ├── api.py
│   │   │       │   │   ├── clipboards.py
│   │   │       │   │   ├── common.py
│   │   │       │   │   ├── feather_format.py
│   │   │       │   │   ├── gbq.py
│   │   │       │   │   ├── html.py
│   │   │       │   │   ├── orc.py
│   │   │       │   │   ├── parquet.py
│   │   │       │   │   ├── pickle.py
│   │   │       │   │   ├── pytables.py
│   │   │       │   │   ├── spss.py
│   │   │       │   │   ├── sql.py
│   │   │       │   │   ├── stata.py
│   │   │       │   │   └── xml.py
│   │   │       │   ├── plotting/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _core.cpython-312.pyc
│   │   │       │   │   │   └── _misc.cpython-312.pyc
│   │   │       │   │   ├── _matplotlib/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── boxplot.cpython-312.pyc
│   │   │       │   │   │   │   ├── converter.cpython-312.pyc
│   │   │       │   │   │   │   ├── core.cpython-312.pyc
│   │   │       │   │   │   │   ├── groupby.cpython-312.pyc
│   │   │       │   │   │   │   ├── hist.cpython-312.pyc
│   │   │       │   │   │   │   ├── misc.cpython-312.pyc
│   │   │       │   │   │   │   ├── style.cpython-312.pyc
│   │   │       │   │   │   │   ├── timeseries.cpython-312.pyc
│   │   │       │   │   │   │   └── tools.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── boxplot.py
│   │   │       │   │   │   ├── converter.py
│   │   │       │   │   │   ├── core.py
│   │   │       │   │   │   ├── groupby.py
│   │   │       │   │   │   ├── hist.py
│   │   │       │   │   │   ├── misc.py
│   │   │       │   │   │   ├── style.py
│   │   │       │   │   │   ├── timeseries.py
│   │   │       │   │   │   └── tools.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _core.py
│   │   │       │   │   └── _misc.py
│   │   │       │   ├── tests/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── test_aggregation.cpython-312.pyc
│   │   │       │   │   │   ├── test_algos.cpython-312.pyc
│   │   │       │   │   │   ├── test_common.cpython-312.pyc
│   │   │       │   │   │   ├── test_downstream.cpython-312.pyc
│   │   │       │   │   │   ├── test_errors.cpython-312.pyc
│   │   │       │   │   │   ├── test_expressions.cpython-312.pyc
│   │   │       │   │   │   ├── test_flags.cpython-312.pyc
│   │   │       │   │   │   ├── test_multilevel.cpython-312.pyc
│   │   │       │   │   │   ├── test_nanops.cpython-312.pyc
│   │   │       │   │   │   ├── test_optional_dependency.cpython-312.pyc
│   │   │       │   │   │   ├── test_register_accessor.cpython-312.pyc
│   │   │       │   │   │   ├── test_sorting.cpython-312.pyc
│   │   │       │   │   │   └── test_take.cpython-312.pyc
│   │   │       │   │   ├── api/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_api.cpython-312.pyc
│   │   │       │   │   │   │   └── test_types.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_api.py
│   │   │       │   │   │   └── test_types.py
│   │   │       │   │   ├── apply/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── common.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_frame_apply.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_frame_apply_relabeling.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_frame_transform.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_invalid_arg.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_numba.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_series_apply.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_series_apply_relabeling.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_series_transform.cpython-312.pyc
│   │   │       │   │   │   │   └── test_str.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── common.py
│   │   │       │   │   │   ├── test_frame_apply.py
│   │   │       │   │   │   ├── test_frame_apply_relabeling.py
│   │   │       │   │   │   ├── test_frame_transform.py
│   │   │       │   │   │   ├── test_invalid_arg.py
│   │   │       │   │   │   ├── test_numba.py
│   │   │       │   │   │   ├── test_series_apply.py
│   │   │       │   │   │   ├── test_series_apply_relabeling.py
│   │   │       │   │   │   ├── test_series_transform.py
│   │   │       │   │   │   └── test_str.py
│   │   │       │   │   ├── arithmetic/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── common.cpython-312.pyc
│   │   │       │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_array_ops.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_categorical.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_datetime64.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_interval.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_numeric.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_object.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_period.cpython-312.pyc
│   │   │       │   │   │   │   └── test_timedelta64.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── common.py
│   │   │       │   │   │   ├── conftest.py
│   │   │       │   │   │   ├── test_array_ops.py
│   │   │       │   │   │   ├── test_categorical.py
│   │   │       │   │   │   ├── test_datetime64.py
│   │   │       │   │   │   ├── test_interval.py
│   │   │       │   │   │   ├── test_numeric.py
│   │   │       │   │   │   ├── test_object.py
│   │   │       │   │   │   ├── test_period.py
│   │   │       │   │   │   └── test_timedelta64.py
│   │   │       │   │   ├── arrays/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── masked_shared.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_array.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_datetimelike.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_datetimes.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ndarray_backed.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_period.cpython-312.pyc
│   │   │       │   │   │   │   └── test_timedeltas.cpython-312.pyc
│   │   │       │   │   │   ├── boolean/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_arithmetic.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_astype.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_comparison.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_construction.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_function.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_logical.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_ops.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_reduction.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_repr.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_arithmetic.py
│   │   │       │   │   │   │   ├── test_astype.py
│   │   │       │   │   │   │   ├── test_comparison.py
│   │   │       │   │   │   │   ├── test_construction.py
│   │   │       │   │   │   │   ├── test_function.py
│   │   │       │   │   │   │   ├── test_indexing.py
│   │   │       │   │   │   │   ├── test_logical.py
│   │   │       │   │   │   │   ├── test_ops.py
│   │   │       │   │   │   │   ├── test_reduction.py
│   │   │       │   │   │   │   └── test_repr.py
│   │   │       │   │   │   ├── categorical/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_algos.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_analytics.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_api.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_astype.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_constructors.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_dtypes.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_map.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_missing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_operators.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_replace.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_repr.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_sorting.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_subclass.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_take.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_warnings.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_algos.py
│   │   │       │   │   │   │   ├── test_analytics.py
│   │   │       │   │   │   │   ├── test_api.py
│   │   │       │   │   │   │   ├── test_astype.py
│   │   │       │   │   │   │   ├── test_constructors.py
│   │   │       │   │   │   │   ├── test_dtypes.py
│   │   │       │   │   │   │   ├── test_indexing.py
│   │   │       │   │   │   │   ├── test_map.py
│   │   │       │   │   │   │   ├── test_missing.py
│   │   │       │   │   │   │   ├── test_operators.py
│   │   │       │   │   │   │   ├── test_replace.py
│   │   │       │   │   │   │   ├── test_repr.py
│   │   │       │   │   │   │   ├── test_sorting.py
│   │   │       │   │   │   │   ├── test_subclass.py
│   │   │       │   │   │   │   ├── test_take.py
│   │   │       │   │   │   │   └── test_warnings.py
│   │   │       │   │   │   ├── datetimes/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_constructors.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_cumulative.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_reductions.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_constructors.py
│   │   │       │   │   │   │   ├── test_cumulative.py
│   │   │       │   │   │   │   └── test_reductions.py
│   │   │       │   │   │   ├── floating/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_arithmetic.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_astype.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_comparison.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_concat.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_construction.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_contains.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_function.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_repr.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_to_numpy.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── conftest.py
│   │   │       │   │   │   │   ├── test_arithmetic.py
│   │   │       │   │   │   │   ├── test_astype.py
│   │   │       │   │   │   │   ├── test_comparison.py
│   │   │       │   │   │   │   ├── test_concat.py
│   │   │       │   │   │   │   ├── test_construction.py
│   │   │       │   │   │   │   ├── test_contains.py
│   │   │       │   │   │   │   ├── test_function.py
│   │   │       │   │   │   │   ├── test_repr.py
│   │   │       │   │   │   │   └── test_to_numpy.py
│   │   │       │   │   │   ├── integer/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_arithmetic.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_comparison.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_concat.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_construction.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_dtypes.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_function.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_reduction.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_repr.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── conftest.py
│   │   │       │   │   │   │   ├── test_arithmetic.py
│   │   │       │   │   │   │   ├── test_comparison.py
│   │   │       │   │   │   │   ├── test_concat.py
│   │   │       │   │   │   │   ├── test_construction.py
│   │   │       │   │   │   │   ├── test_dtypes.py
│   │   │       │   │   │   │   ├── test_function.py
│   │   │       │   │   │   │   ├── test_indexing.py
│   │   │       │   │   │   │   ├── test_reduction.py
│   │   │       │   │   │   │   └── test_repr.py
│   │   │       │   │   │   ├── interval/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_astype.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_formats.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_interval.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_interval_pyarrow.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_overlaps.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_astype.py
│   │   │       │   │   │   │   ├── test_formats.py
│   │   │       │   │   │   │   ├── test_interval.py
│   │   │       │   │   │   │   ├── test_interval_pyarrow.py
│   │   │       │   │   │   │   └── test_overlaps.py
│   │   │       │   │   │   ├── masked/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_arithmetic.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_arrow_compat.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_function.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_arithmetic.py
│   │   │       │   │   │   │   ├── test_arrow_compat.py
│   │   │       │   │   │   │   ├── test_function.py
│   │   │       │   │   │   │   └── test_indexing.py
│   │   │       │   │   │   ├── numpy_/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_numpy.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_indexing.py
│   │   │       │   │   │   │   └── test_numpy.py
│   │   │       │   │   │   ├── period/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_arrow_compat.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_astype.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_constructors.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_reductions.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_arrow_compat.py
│   │   │       │   │   │   │   ├── test_astype.py
│   │   │       │   │   │   │   ├── test_constructors.py
│   │   │       │   │   │   │   └── test_reductions.py
│   │   │       │   │   │   ├── sparse/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_accessor.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_arithmetics.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_array.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_astype.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_combine_concat.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_constructors.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_dtype.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_libsparse.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_reductions.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_unary.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_accessor.py
│   │   │       │   │   │   │   ├── test_arithmetics.py
│   │   │       │   │   │   │   ├── test_array.py
│   │   │       │   │   │   │   ├── test_astype.py
│   │   │       │   │   │   │   ├── test_combine_concat.py
│   │   │       │   │   │   │   ├── test_constructors.py
│   │   │       │   │   │   │   ├── test_dtype.py
│   │   │       │   │   │   │   ├── test_indexing.py
│   │   │       │   │   │   │   ├── test_libsparse.py
│   │   │       │   │   │   │   ├── test_reductions.py
│   │   │       │   │   │   │   └── test_unary.py
│   │   │       │   │   │   ├── string_/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_string.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_string_arrow.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_string.py
│   │   │       │   │   │   │   └── test_string_arrow.py
│   │   │       │   │   │   ├── timedeltas/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_constructors.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_cumulative.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_reductions.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_constructors.py
│   │   │       │   │   │   │   ├── test_cumulative.py
│   │   │       │   │   │   │   └── test_reductions.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── masked_shared.py
│   │   │       │   │   │   ├── test_array.py
│   │   │       │   │   │   ├── test_datetimelike.py
│   │   │       │   │   │   ├── test_datetimes.py
│   │   │       │   │   │   ├── test_ndarray_backed.py
│   │   │       │   │   │   ├── test_period.py
│   │   │       │   │   │   └── test_timedeltas.py
│   │   │       │   │   ├── base/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── common.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_constructors.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_conversion.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_fillna.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_misc.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_transpose.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_unique.cpython-312.pyc
│   │   │       │   │   │   │   └── test_value_counts.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── common.py
│   │   │       │   │   │   ├── test_constructors.py
│   │   │       │   │   │   ├── test_conversion.py
│   │   │       │   │   │   ├── test_fillna.py
│   │   │       │   │   │   ├── test_misc.py
│   │   │       │   │   │   ├── test_transpose.py
│   │   │       │   │   │   ├── test_unique.py
│   │   │       │   │   │   └── test_value_counts.py
│   │   │       │   │   ├── computation/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_compat.cpython-312.pyc
│   │   │       │   │   │   │   └── test_eval.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_compat.py
│   │   │       │   │   │   └── test_eval.py
│   │   │       │   │   ├── config/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_config.cpython-312.pyc
│   │   │       │   │   │   │   └── test_localization.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_config.py
│   │   │       │   │   │   └── test_localization.py
│   │   │       │   │   ├── construction/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── test_extract_array.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── test_extract_array.py
│   │   │       │   │   ├── copy_view/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_array.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_astype.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_chained_assignment_deprecation.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_clip.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_constructors.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_core_functionalities.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_functions.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_internals.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_interp_fillna.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_methods.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_replace.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_setitem.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_util.cpython-312.pyc
│   │   │       │   │   │   │   └── util.cpython-312.pyc
│   │   │       │   │   │   ├── index/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_datetimeindex.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_index.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_periodindex.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_timedeltaindex.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_datetimeindex.py
│   │   │       │   │   │   │   ├── test_index.py
│   │   │       │   │   │   │   ├── test_periodindex.py
│   │   │       │   │   │   │   └── test_timedeltaindex.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_array.py
│   │   │       │   │   │   ├── test_astype.py
│   │   │       │   │   │   ├── test_chained_assignment_deprecation.py
│   │   │       │   │   │   ├── test_clip.py
│   │   │       │   │   │   ├── test_constructors.py
│   │   │       │   │   │   ├── test_core_functionalities.py
│   │   │       │   │   │   ├── test_functions.py
│   │   │       │   │   │   ├── test_indexing.py
│   │   │       │   │   │   ├── test_internals.py
│   │   │       │   │   │   ├── test_interp_fillna.py
│   │   │       │   │   │   ├── test_methods.py
│   │   │       │   │   │   ├── test_replace.py
│   │   │       │   │   │   ├── test_setitem.py
│   │   │       │   │   │   ├── test_util.py
│   │   │       │   │   │   └── util.py
│   │   │       │   │   ├── dtypes/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_common.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_concat.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_dtypes.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_generic.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_inference.cpython-312.pyc
│   │   │       │   │   │   │   └── test_missing.cpython-312.pyc
│   │   │       │   │   │   ├── cast/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_can_hold_element.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_construct_from_scalar.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_construct_ndarray.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_construct_object_arr.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_dict_compat.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_downcast.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_find_common_type.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_infer_datetimelike.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_infer_dtype.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_maybe_box_native.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_promote.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_can_hold_element.py
│   │   │       │   │   │   │   ├── test_construct_from_scalar.py
│   │   │       │   │   │   │   ├── test_construct_ndarray.py
│   │   │       │   │   │   │   ├── test_construct_object_arr.py
│   │   │       │   │   │   │   ├── test_dict_compat.py
│   │   │       │   │   │   │   ├── test_downcast.py
│   │   │       │   │   │   │   ├── test_find_common_type.py
│   │   │       │   │   │   │   ├── test_infer_datetimelike.py
│   │   │       │   │   │   │   ├── test_infer_dtype.py
│   │   │       │   │   │   │   ├── test_maybe_box_native.py
│   │   │       │   │   │   │   └── test_promote.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_common.py
│   │   │       │   │   │   ├── test_concat.py
│   │   │       │   │   │   ├── test_dtypes.py
│   │   │       │   │   │   ├── test_generic.py
│   │   │       │   │   │   ├── test_inference.py
│   │   │       │   │   │   └── test_missing.py
│   │   │       │   │   ├── extension/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_arrow.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_categorical.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_common.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_datetime.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_extension.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_interval.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_masked.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_numpy.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_period.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sparse.cpython-312.pyc
│   │   │       │   │   │   │   └── test_string.cpython-312.pyc
│   │   │       │   │   │   ├── array_with_attr/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── array.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_array_with_attr.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── array.py
│   │   │       │   │   │   │   └── test_array_with_attr.py
│   │   │       │   │   │   ├── base/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── accumulate.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── base.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── casting.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── constructors.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── dim2.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── dtype.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── getitem.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── groupby.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── index.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── interface.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── io.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── methods.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── missing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── ops.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── printing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── reduce.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── reshaping.cpython-312.pyc
│   │   │       │   │   │   │   │   └── setitem.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── accumulate.py
│   │   │       │   │   │   │   ├── base.py
│   │   │       │   │   │   │   ├── casting.py
│   │   │       │   │   │   │   ├── constructors.py
│   │   │       │   │   │   │   ├── dim2.py
│   │   │       │   │   │   │   ├── dtype.py
│   │   │       │   │   │   │   ├── getitem.py
│   │   │       │   │   │   │   ├── groupby.py
│   │   │       │   │   │   │   ├── index.py
│   │   │       │   │   │   │   ├── interface.py
│   │   │       │   │   │   │   ├── io.py
│   │   │       │   │   │   │   ├── methods.py
│   │   │       │   │   │   │   ├── missing.py
│   │   │       │   │   │   │   ├── ops.py
│   │   │       │   │   │   │   ├── printing.py
│   │   │       │   │   │   │   ├── reduce.py
│   │   │       │   │   │   │   ├── reshaping.py
│   │   │       │   │   │   │   └── setitem.py
│   │   │       │   │   │   ├── date/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── array.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── array.py
│   │   │       │   │   │   ├── decimal/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── array.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_decimal.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── array.py
│   │   │       │   │   │   │   └── test_decimal.py
│   │   │       │   │   │   ├── json/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── array.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_json.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── array.py
│   │   │       │   │   │   │   └── test_json.py
│   │   │       │   │   │   ├── list/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── array.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_list.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── array.py
│   │   │       │   │   │   │   └── test_list.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── conftest.py
│   │   │       │   │   │   ├── test_arrow.py
│   │   │       │   │   │   ├── test_categorical.py
│   │   │       │   │   │   ├── test_common.py
│   │   │       │   │   │   ├── test_datetime.py
│   │   │       │   │   │   ├── test_extension.py
│   │   │       │   │   │   ├── test_interval.py
│   │   │       │   │   │   ├── test_masked.py
│   │   │       │   │   │   ├── test_numpy.py
│   │   │       │   │   │   ├── test_period.py
│   │   │       │   │   │   ├── test_sparse.py
│   │   │       │   │   │   └── test_string.py
│   │   │       │   │   ├── frame/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── common.cpython-312.pyc
│   │   │       │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_alter_axes.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_api.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_arithmetic.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_arrow_interface.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_block_internals.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_constructors.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cumulative.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_iteration.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_logical_ops.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_nonunique_indexes.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_npfuncs.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_query_eval.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_reductions.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_repr.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_stack_unstack.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_subclass.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ufunc.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_unary.cpython-312.pyc
│   │   │       │   │   │   │   └── test_validate.cpython-312.pyc
│   │   │       │   │   │   ├── constructors/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_from_dict.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_from_records.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_from_dict.py
│   │   │       │   │   │   │   └── test_from_records.py
│   │   │       │   │   │   ├── indexing/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_coercion.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_delitem.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_get.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_get_value.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_getitem.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_insert.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_mask.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_set_value.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_setitem.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_take.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_where.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_xs.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_coercion.py
│   │   │       │   │   │   │   ├── test_delitem.py
│   │   │       │   │   │   │   ├── test_get.py
│   │   │       │   │   │   │   ├── test_get_value.py
│   │   │       │   │   │   │   ├── test_getitem.py
│   │   │       │   │   │   │   ├── test_indexing.py
│   │   │       │   │   │   │   ├── test_insert.py
│   │   │       │   │   │   │   ├── test_mask.py
│   │   │       │   │   │   │   ├── test_set_value.py
│   │   │       │   │   │   │   ├── test_setitem.py
│   │   │       │   │   │   │   ├── test_take.py
│   │   │       │   │   │   │   ├── test_where.py
│   │   │       │   │   │   │   └── test_xs.py
│   │   │       │   │   │   ├── methods/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_add_prefix_suffix.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_align.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_asfreq.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_asof.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_assign.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_astype.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_at_time.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_between_time.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_clip.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_combine.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_combine_first.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_compare.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_convert_dtypes.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_copy.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_count.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_cov_corr.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_describe.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_diff.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_dot.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_drop.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_drop_duplicates.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_droplevel.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_dropna.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_dtypes.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_duplicated.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_equals.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_explode.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_fillna.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_filter.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_first_and_last.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_first_valid_index.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_get_numeric_data.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_head_tail.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_infer_objects.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_info.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_interpolate.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_is_homogeneous_dtype.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_isetitem.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_isin.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_iterrows.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_join.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_map.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_matmul.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_nlargest.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_pct_change.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_pipe.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_pop.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_quantile.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_rank.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_reindex.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_reindex_like.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_rename.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_rename_axis.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_reorder_levels.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_replace.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_reset_index.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_round.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_sample.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_select_dtypes.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_set_axis.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_set_index.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_shift.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_size.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_sort_index.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_sort_values.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_swapaxes.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_swaplevel.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_to_csv.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_to_dict.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_to_dict_of_blocks.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_to_numpy.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_to_period.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_to_records.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_to_timestamp.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_transpose.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_truncate.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_tz_convert.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_tz_localize.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_update.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_value_counts.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_values.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_add_prefix_suffix.py
│   │   │       │   │   │   │   ├── test_align.py
│   │   │       │   │   │   │   ├── test_asfreq.py
│   │   │       │   │   │   │   ├── test_asof.py
│   │   │       │   │   │   │   ├── test_assign.py
│   │   │       │   │   │   │   ├── test_astype.py
│   │   │       │   │   │   │   ├── test_at_time.py
│   │   │       │   │   │   │   ├── test_between_time.py
│   │   │       │   │   │   │   ├── test_clip.py
│   │   │       │   │   │   │   ├── test_combine.py
│   │   │       │   │   │   │   ├── test_combine_first.py
│   │   │       │   │   │   │   ├── test_compare.py
│   │   │       │   │   │   │   ├── test_convert_dtypes.py
│   │   │       │   │   │   │   ├── test_copy.py
│   │   │       │   │   │   │   ├── test_count.py
│   │   │       │   │   │   │   ├── test_cov_corr.py
│   │   │       │   │   │   │   ├── test_describe.py
│   │   │       │   │   │   │   ├── test_diff.py
│   │   │       │   │   │   │   ├── test_dot.py
│   │   │       │   │   │   │   ├── test_drop.py
│   │   │       │   │   │   │   ├── test_drop_duplicates.py
│   │   │       │   │   │   │   ├── test_droplevel.py
│   │   │       │   │   │   │   ├── test_dropna.py
│   │   │       │   │   │   │   ├── test_dtypes.py
│   │   │       │   │   │   │   ├── test_duplicated.py
│   │   │       │   │   │   │   ├── test_equals.py
│   │   │       │   │   │   │   ├── test_explode.py
│   │   │       │   │   │   │   ├── test_fillna.py
│   │   │       │   │   │   │   ├── test_filter.py
│   │   │       │   │   │   │   ├── test_first_and_last.py
│   │   │       │   │   │   │   ├── test_first_valid_index.py
│   │   │       │   │   │   │   ├── test_get_numeric_data.py
│   │   │       │   │   │   │   ├── test_head_tail.py
│   │   │       │   │   │   │   ├── test_infer_objects.py
│   │   │       │   │   │   │   ├── test_info.py
│   │   │       │   │   │   │   ├── test_interpolate.py
│   │   │       │   │   │   │   ├── test_is_homogeneous_dtype.py
│   │   │       │   │   │   │   ├── test_isetitem.py
│   │   │       │   │   │   │   ├── test_isin.py
│   │   │       │   │   │   │   ├── test_iterrows.py
│   │   │       │   │   │   │   ├── test_join.py
│   │   │       │   │   │   │   ├── test_map.py
│   │   │       │   │   │   │   ├── test_matmul.py
│   │   │       │   │   │   │   ├── test_nlargest.py
│   │   │       │   │   │   │   ├── test_pct_change.py
│   │   │       │   │   │   │   ├── test_pipe.py
│   │   │       │   │   │   │   ├── test_pop.py
│   │   │       │   │   │   │   ├── test_quantile.py
│   │   │       │   │   │   │   ├── test_rank.py
│   │   │       │   │   │   │   ├── test_reindex.py
│   │   │       │   │   │   │   ├── test_reindex_like.py
│   │   │       │   │   │   │   ├── test_rename.py
│   │   │       │   │   │   │   ├── test_rename_axis.py
│   │   │       │   │   │   │   ├── test_reorder_levels.py
│   │   │       │   │   │   │   ├── test_replace.py
│   │   │       │   │   │   │   ├── test_reset_index.py
│   │   │       │   │   │   │   ├── test_round.py
│   │   │       │   │   │   │   ├── test_sample.py
│   │   │       │   │   │   │   ├── test_select_dtypes.py
│   │   │       │   │   │   │   ├── test_set_axis.py
│   │   │       │   │   │   │   ├── test_set_index.py
│   │   │       │   │   │   │   ├── test_shift.py
│   │   │       │   │   │   │   ├── test_size.py
│   │   │       │   │   │   │   ├── test_sort_index.py
│   │   │       │   │   │   │   ├── test_sort_values.py
│   │   │       │   │   │   │   ├── test_swapaxes.py
│   │   │       │   │   │   │   ├── test_swaplevel.py
│   │   │       │   │   │   │   ├── test_to_csv.py
│   │   │       │   │   │   │   ├── test_to_dict.py
│   │   │       │   │   │   │   ├── test_to_dict_of_blocks.py
│   │   │       │   │   │   │   ├── test_to_numpy.py
│   │   │       │   │   │   │   ├── test_to_period.py
│   │   │       │   │   │   │   ├── test_to_records.py
│   │   │       │   │   │   │   ├── test_to_timestamp.py
│   │   │       │   │   │   │   ├── test_transpose.py
│   │   │       │   │   │   │   ├── test_truncate.py
│   │   │       │   │   │   │   ├── test_tz_convert.py
│   │   │       │   │   │   │   ├── test_tz_localize.py
│   │   │       │   │   │   │   ├── test_update.py
│   │   │       │   │   │   │   ├── test_value_counts.py
│   │   │       │   │   │   │   └── test_values.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── common.py
│   │   │       │   │   │   ├── conftest.py
│   │   │       │   │   │   ├── test_alter_axes.py
│   │   │       │   │   │   ├── test_api.py
│   │   │       │   │   │   ├── test_arithmetic.py
│   │   │       │   │   │   ├── test_arrow_interface.py
│   │   │       │   │   │   ├── test_block_internals.py
│   │   │       │   │   │   ├── test_constructors.py
│   │   │       │   │   │   ├── test_cumulative.py
│   │   │       │   │   │   ├── test_iteration.py
│   │   │       │   │   │   ├── test_logical_ops.py
│   │   │       │   │   │   ├── test_nonunique_indexes.py
│   │   │       │   │   │   ├── test_npfuncs.py
│   │   │       │   │   │   ├── test_query_eval.py
│   │   │       │   │   │   ├── test_reductions.py
│   │   │       │   │   │   ├── test_repr.py
│   │   │       │   │   │   ├── test_stack_unstack.py
│   │   │       │   │   │   ├── test_subclass.py
│   │   │       │   │   │   ├── test_ufunc.py
│   │   │       │   │   │   ├── test_unary.py
│   │   │       │   │   │   └── test_validate.py
│   │   │       │   │   ├── generic/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_duplicate_labels.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_finalize.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_frame.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_generic.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_label_or_level_utils.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_series.cpython-312.pyc
│   │   │       │   │   │   │   └── test_to_xarray.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_duplicate_labels.py
│   │   │       │   │   │   ├── test_finalize.py
│   │   │       │   │   │   ├── test_frame.py
│   │   │       │   │   │   ├── test_generic.py
│   │   │       │   │   │   ├── test_label_or_level_utils.py
│   │   │       │   │   │   ├── test_series.py
│   │   │       │   │   │   └── test_to_xarray.py
│   │   │       │   │   ├── groupby/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_all_methods.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_api.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_apply.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_apply_mutate.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bin_groupby.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_categorical.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_counting.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cumulative.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_filters.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_groupby.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_groupby_dropna.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_groupby_subclass.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_grouping.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_index_as_string.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_libgroupby.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_missing.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_numba.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_numeric_only.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pipe.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_raises.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_reductions.cpython-312.pyc
│   │   │       │   │   │   │   └── test_timegrouper.cpython-312.pyc
│   │   │       │   │   │   ├── aggregate/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_aggregate.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_cython.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_numba.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_other.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_aggregate.py
│   │   │       │   │   │   │   ├── test_cython.py
│   │   │       │   │   │   │   ├── test_numba.py
│   │   │       │   │   │   │   └── test_other.py
│   │   │       │   │   │   ├── methods/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_corrwith.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_describe.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_groupby_shift_diff.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_is_monotonic.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_nlargest_nsmallest.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_nth.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_quantile.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_rank.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_sample.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_size.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_skew.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_value_counts.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_corrwith.py
│   │   │       │   │   │   │   ├── test_describe.py
│   │   │       │   │   │   │   ├── test_groupby_shift_diff.py
│   │   │       │   │   │   │   ├── test_is_monotonic.py
│   │   │       │   │   │   │   ├── test_nlargest_nsmallest.py
│   │   │       │   │   │   │   ├── test_nth.py
│   │   │       │   │   │   │   ├── test_quantile.py
│   │   │       │   │   │   │   ├── test_rank.py
│   │   │       │   │   │   │   ├── test_sample.py
│   │   │       │   │   │   │   ├── test_size.py
│   │   │       │   │   │   │   ├── test_skew.py
│   │   │       │   │   │   │   └── test_value_counts.py
│   │   │       │   │   │   ├── transform/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_numba.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_transform.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_numba.py
│   │   │       │   │   │   │   └── test_transform.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── conftest.py
│   │   │       │   │   │   ├── test_all_methods.py
│   │   │       │   │   │   ├── test_api.py
│   │   │       │   │   │   ├── test_apply.py
│   │   │       │   │   │   ├── test_apply_mutate.py
│   │   │       │   │   │   ├── test_bin_groupby.py
│   │   │       │   │   │   ├── test_categorical.py
│   │   │       │   │   │   ├── test_counting.py
│   │   │       │   │   │   ├── test_cumulative.py
│   │   │       │   │   │   ├── test_filters.py
│   │   │       │   │   │   ├── test_groupby.py
│   │   │       │   │   │   ├── test_groupby_dropna.py
│   │   │       │   │   │   ├── test_groupby_subclass.py
│   │   │       │   │   │   ├── test_grouping.py
│   │   │       │   │   │   ├── test_index_as_string.py
│   │   │       │   │   │   ├── test_indexing.py
│   │   │       │   │   │   ├── test_libgroupby.py
│   │   │       │   │   │   ├── test_missing.py
│   │   │       │   │   │   ├── test_numba.py
│   │   │       │   │   │   ├── test_numeric_only.py
│   │   │       │   │   │   ├── test_pipe.py
│   │   │       │   │   │   ├── test_raises.py
│   │   │       │   │   │   ├── test_reductions.py
│   │   │       │   │   │   └── test_timegrouper.py
│   │   │       │   │   ├── indexes/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_any_index.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_base.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_common.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_datetimelike.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_engines.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_frozen.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_index_new.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_numpy_compat.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_old_base.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_setops.cpython-312.pyc
│   │   │       │   │   │   │   └── test_subclass.cpython-312.pyc
│   │   │       │   │   │   ├── base_class/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_constructors.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_formats.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_pickle.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_reshape.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_setops.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_where.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_constructors.py
│   │   │       │   │   │   │   ├── test_formats.py
│   │   │       │   │   │   │   ├── test_indexing.py
│   │   │       │   │   │   │   ├── test_pickle.py
│   │   │       │   │   │   │   ├── test_reshape.py
│   │   │       │   │   │   │   ├── test_setops.py
│   │   │       │   │   │   │   └── test_where.py
│   │   │       │   │   │   ├── categorical/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_append.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_astype.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_category.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_constructors.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_equals.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_fillna.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_formats.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_map.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_reindex.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_setops.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_append.py
│   │   │       │   │   │   │   ├── test_astype.py
│   │   │       │   │   │   │   ├── test_category.py
│   │   │       │   │   │   │   ├── test_constructors.py
│   │   │       │   │   │   │   ├── test_equals.py
│   │   │       │   │   │   │   ├── test_fillna.py
│   │   │       │   │   │   │   ├── test_formats.py
│   │   │       │   │   │   │   ├── test_indexing.py
│   │   │       │   │   │   │   ├── test_map.py
│   │   │       │   │   │   │   ├── test_reindex.py
│   │   │       │   │   │   │   └── test_setops.py
│   │   │       │   │   │   ├── datetimelike_/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_drop_duplicates.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_equals.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_is_monotonic.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_nat.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_sort_values.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_value_counts.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_drop_duplicates.py
│   │   │       │   │   │   │   ├── test_equals.py
│   │   │       │   │   │   │   ├── test_indexing.py
│   │   │       │   │   │   │   ├── test_is_monotonic.py
│   │   │       │   │   │   │   ├── test_nat.py
│   │   │       │   │   │   │   ├── test_sort_values.py
│   │   │       │   │   │   │   └── test_value_counts.py
│   │   │       │   │   │   ├── datetimes/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_arithmetic.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_constructors.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_date_range.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_datetime.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_formats.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_freq_attr.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_iter.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_join.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_npfuncs.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_ops.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_partial_slicing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_pickle.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_reindex.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_scalar_compat.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_setops.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_timezones.cpython-312.pyc
│   │   │       │   │   │   │   ├── methods/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_asof.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_astype.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_delete.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_factorize.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_fillna.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_insert.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_isocalendar.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_map.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_normalize.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_repeat.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_resolution.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_round.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_shift.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_snap.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_to_frame.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_to_julian_date.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_to_period.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_to_pydatetime.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_to_series.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_tz_convert.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_tz_localize.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── test_unique.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── test_asof.py
│   │   │       │   │   │   │   │   ├── test_astype.py
│   │   │       │   │   │   │   │   ├── test_delete.py
│   │   │       │   │   │   │   │   ├── test_factorize.py
│   │   │       │   │   │   │   │   ├── test_fillna.py
│   │   │       │   │   │   │   │   ├── test_insert.py
│   │   │       │   │   │   │   │   ├── test_isocalendar.py
│   │   │       │   │   │   │   │   ├── test_map.py
│   │   │       │   │   │   │   │   ├── test_normalize.py
│   │   │       │   │   │   │   │   ├── test_repeat.py
│   │   │       │   │   │   │   │   ├── test_resolution.py
│   │   │       │   │   │   │   │   ├── test_round.py
│   │   │       │   │   │   │   │   ├── test_shift.py
│   │   │       │   │   │   │   │   ├── test_snap.py
│   │   │       │   │   │   │   │   ├── test_to_frame.py
│   │   │       │   │   │   │   │   ├── test_to_julian_date.py
│   │   │       │   │   │   │   │   ├── test_to_period.py
│   │   │       │   │   │   │   │   ├── test_to_pydatetime.py
│   │   │       │   │   │   │   │   ├── test_to_series.py
│   │   │       │   │   │   │   │   ├── test_tz_convert.py
│   │   │       │   │   │   │   │   ├── test_tz_localize.py
│   │   │       │   │   │   │   │   └── test_unique.py
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_arithmetic.py
│   │   │       │   │   │   │   ├── test_constructors.py
│   │   │       │   │   │   │   ├── test_date_range.py
│   │   │       │   │   │   │   ├── test_datetime.py
│   │   │       │   │   │   │   ├── test_formats.py
│   │   │       │   │   │   │   ├── test_freq_attr.py
│   │   │       │   │   │   │   ├── test_indexing.py
│   │   │       │   │   │   │   ├── test_iter.py
│   │   │       │   │   │   │   ├── test_join.py
│   │   │       │   │   │   │   ├── test_npfuncs.py
│   │   │       │   │   │   │   ├── test_ops.py
│   │   │       │   │   │   │   ├── test_partial_slicing.py
│   │   │       │   │   │   │   ├── test_pickle.py
│   │   │       │   │   │   │   ├── test_reindex.py
│   │   │       │   │   │   │   ├── test_scalar_compat.py
│   │   │       │   │   │   │   ├── test_setops.py
│   │   │       │   │   │   │   └── test_timezones.py
│   │   │       │   │   │   ├── interval/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_astype.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_constructors.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_equals.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_formats.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_interval.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_interval_range.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_interval_tree.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_join.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_pickle.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_setops.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_astype.py
│   │   │       │   │   │   │   ├── test_constructors.py
│   │   │       │   │   │   │   ├── test_equals.py
│   │   │       │   │   │   │   ├── test_formats.py
│   │   │       │   │   │   │   ├── test_indexing.py
│   │   │       │   │   │   │   ├── test_interval.py
│   │   │       │   │   │   │   ├── test_interval_range.py
│   │   │       │   │   │   │   ├── test_interval_tree.py
│   │   │       │   │   │   │   ├── test_join.py
│   │   │       │   │   │   │   ├── test_pickle.py
│   │   │       │   │   │   │   └── test_setops.py
│   │   │       │   │   │   ├── multi/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_analytics.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_astype.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_compat.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_constructors.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_conversion.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_copy.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_drop.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_duplicates.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_equivalence.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_formats.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_get_level_values.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_get_set.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_integrity.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_isin.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_join.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_lexsort.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_missing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_monotonic.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_names.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_partial_indexing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_pickle.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_reindex.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_reshape.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_setops.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_sorting.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_take.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── conftest.py
│   │   │       │   │   │   │   ├── test_analytics.py
│   │   │       │   │   │   │   ├── test_astype.py
│   │   │       │   │   │   │   ├── test_compat.py
│   │   │       │   │   │   │   ├── test_constructors.py
│   │   │       │   │   │   │   ├── test_conversion.py
│   │   │       │   │   │   │   ├── test_copy.py
│   │   │       │   │   │   │   ├── test_drop.py
│   │   │       │   │   │   │   ├── test_duplicates.py
│   │   │       │   │   │   │   ├── test_equivalence.py
│   │   │       │   │   │   │   ├── test_formats.py
│   │   │       │   │   │   │   ├── test_get_level_values.py
│   │   │       │   │   │   │   ├── test_get_set.py
│   │   │       │   │   │   │   ├── test_indexing.py
│   │   │       │   │   │   │   ├── test_integrity.py
│   │   │       │   │   │   │   ├── test_isin.py
│   │   │       │   │   │   │   ├── test_join.py
│   │   │       │   │   │   │   ├── test_lexsort.py
│   │   │       │   │   │   │   ├── test_missing.py
│   │   │       │   │   │   │   ├── test_monotonic.py
│   │   │       │   │   │   │   ├── test_names.py
│   │   │       │   │   │   │   ├── test_partial_indexing.py
│   │   │       │   │   │   │   ├── test_pickle.py
│   │   │       │   │   │   │   ├── test_reindex.py
│   │   │       │   │   │   │   ├── test_reshape.py
│   │   │       │   │   │   │   ├── test_setops.py
│   │   │       │   │   │   │   ├── test_sorting.py
│   │   │       │   │   │   │   └── test_take.py
│   │   │       │   │   │   ├── numeric/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_astype.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_join.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_numeric.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_setops.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_astype.py
│   │   │       │   │   │   │   ├── test_indexing.py
│   │   │       │   │   │   │   ├── test_join.py
│   │   │       │   │   │   │   ├── test_numeric.py
│   │   │       │   │   │   │   └── test_setops.py
│   │   │       │   │   │   ├── object/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_astype.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_astype.py
│   │   │       │   │   │   │   └── test_indexing.py
│   │   │       │   │   │   ├── period/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_constructors.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_formats.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_freq_attr.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_join.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_monotonic.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_partial_slicing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_period.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_period_range.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_pickle.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_resolution.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_scalar_compat.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_searchsorted.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_setops.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_tools.cpython-312.pyc
│   │   │       │   │   │   │   ├── methods/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_asfreq.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_astype.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_factorize.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_fillna.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_insert.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_is_full.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_repeat.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_shift.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── test_to_timestamp.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── test_asfreq.py
│   │   │       │   │   │   │   │   ├── test_astype.py
│   │   │       │   │   │   │   │   ├── test_factorize.py
│   │   │       │   │   │   │   │   ├── test_fillna.py
│   │   │       │   │   │   │   │   ├── test_insert.py
│   │   │       │   │   │   │   │   ├── test_is_full.py
│   │   │       │   │   │   │   │   ├── test_repeat.py
│   │   │       │   │   │   │   │   ├── test_shift.py
│   │   │       │   │   │   │   │   └── test_to_timestamp.py
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_constructors.py
│   │   │       │   │   │   │   ├── test_formats.py
│   │   │       │   │   │   │   ├── test_freq_attr.py
│   │   │       │   │   │   │   ├── test_indexing.py
│   │   │       │   │   │   │   ├── test_join.py
│   │   │       │   │   │   │   ├── test_monotonic.py
│   │   │       │   │   │   │   ├── test_partial_slicing.py
│   │   │       │   │   │   │   ├── test_period.py
│   │   │       │   │   │   │   ├── test_period_range.py
│   │   │       │   │   │   │   ├── test_pickle.py
│   │   │       │   │   │   │   ├── test_resolution.py
│   │   │       │   │   │   │   ├── test_scalar_compat.py
│   │   │       │   │   │   │   ├── test_searchsorted.py
│   │   │       │   │   │   │   ├── test_setops.py
│   │   │       │   │   │   │   └── test_tools.py
│   │   │       │   │   │   ├── ranges/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_constructors.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_join.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_range.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_setops.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_constructors.py
│   │   │       │   │   │   │   ├── test_indexing.py
│   │   │       │   │   │   │   ├── test_join.py
│   │   │       │   │   │   │   ├── test_range.py
│   │   │       │   │   │   │   └── test_setops.py
│   │   │       │   │   │   ├── timedeltas/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_arithmetic.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_constructors.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_delete.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_formats.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_freq_attr.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_join.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_ops.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_pickle.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_scalar_compat.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_searchsorted.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_setops.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_timedelta.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_timedelta_range.cpython-312.pyc
│   │   │       │   │   │   │   ├── methods/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_astype.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_factorize.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_fillna.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_insert.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_repeat.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── test_shift.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── test_astype.py
│   │   │       │   │   │   │   │   ├── test_factorize.py
│   │   │       │   │   │   │   │   ├── test_fillna.py
│   │   │       │   │   │   │   │   ├── test_insert.py
│   │   │       │   │   │   │   │   ├── test_repeat.py
│   │   │       │   │   │   │   │   └── test_shift.py
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_arithmetic.py
│   │   │       │   │   │   │   ├── test_constructors.py
│   │   │       │   │   │   │   ├── test_delete.py
│   │   │       │   │   │   │   ├── test_formats.py
│   │   │       │   │   │   │   ├── test_freq_attr.py
│   │   │       │   │   │   │   ├── test_indexing.py
│   │   │       │   │   │   │   ├── test_join.py
│   │   │       │   │   │   │   ├── test_ops.py
│   │   │       │   │   │   │   ├── test_pickle.py
│   │   │       │   │   │   │   ├── test_scalar_compat.py
│   │   │       │   │   │   │   ├── test_searchsorted.py
│   │   │       │   │   │   │   ├── test_setops.py
│   │   │       │   │   │   │   ├── test_timedelta.py
│   │   │       │   │   │   │   └── test_timedelta_range.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── conftest.py
│   │   │       │   │   │   ├── test_any_index.py
│   │   │       │   │   │   ├── test_base.py
│   │   │       │   │   │   ├── test_common.py
│   │   │       │   │   │   ├── test_datetimelike.py
│   │   │       │   │   │   ├── test_engines.py
│   │   │       │   │   │   ├── test_frozen.py
│   │   │       │   │   │   ├── test_index_new.py
│   │   │       │   │   │   ├── test_indexing.py
│   │   │       │   │   │   ├── test_numpy_compat.py
│   │   │       │   │   │   ├── test_old_base.py
│   │   │       │   │   │   ├── test_setops.py
│   │   │       │   │   │   └── test_subclass.py
│   │   │       │   │   ├── indexing/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── common.cpython-312.pyc
│   │   │       │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_at.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_categorical.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_chaining_and_caching.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_check_indexer.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_coercion.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_datetime.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_floats.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_iat.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_iloc.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_indexers.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_loc.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_na_indexing.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_partial.cpython-312.pyc
│   │   │       │   │   │   │   └── test_scalar.cpython-312.pyc
│   │   │       │   │   │   ├── interval/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_interval.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_interval_new.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_interval.py
│   │   │       │   │   │   │   └── test_interval_new.py
│   │   │       │   │   │   ├── multiindex/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_chaining_and_caching.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_datetime.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_getitem.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_iloc.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_indexing_slow.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_loc.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_multiindex.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_partial.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_setitem.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_slice.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_sorted.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_chaining_and_caching.py
│   │   │       │   │   │   │   ├── test_datetime.py
│   │   │       │   │   │   │   ├── test_getitem.py
│   │   │       │   │   │   │   ├── test_iloc.py
│   │   │       │   │   │   │   ├── test_indexing_slow.py
│   │   │       │   │   │   │   ├── test_loc.py
│   │   │       │   │   │   │   ├── test_multiindex.py
│   │   │       │   │   │   │   ├── test_partial.py
│   │   │       │   │   │   │   ├── test_setitem.py
│   │   │       │   │   │   │   ├── test_slice.py
│   │   │       │   │   │   │   └── test_sorted.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── common.py
│   │   │       │   │   │   ├── conftest.py
│   │   │       │   │   │   ├── test_at.py
│   │   │       │   │   │   ├── test_categorical.py
│   │   │       │   │   │   ├── test_chaining_and_caching.py
│   │   │       │   │   │   ├── test_check_indexer.py
│   │   │       │   │   │   ├── test_coercion.py
│   │   │       │   │   │   ├── test_datetime.py
│   │   │       │   │   │   ├── test_floats.py
│   │   │       │   │   │   ├── test_iat.py
│   │   │       │   │   │   ├── test_iloc.py
│   │   │       │   │   │   ├── test_indexers.py
│   │   │       │   │   │   ├── test_indexing.py
│   │   │       │   │   │   ├── test_loc.py
│   │   │       │   │   │   ├── test_na_indexing.py
│   │   │       │   │   │   ├── test_partial.py
│   │   │       │   │   │   └── test_scalar.py
│   │   │       │   │   ├── interchange/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_impl.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_spec_conformance.cpython-312.pyc
│   │   │       │   │   │   │   └── test_utils.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_impl.py
│   │   │       │   │   │   ├── test_spec_conformance.py
│   │   │       │   │   │   └── test_utils.py
│   │   │       │   │   ├── internals/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_api.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_internals.cpython-312.pyc
│   │   │       │   │   │   │   └── test_managers.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_api.py
│   │   │       │   │   │   ├── test_internals.py
│   │   │       │   │   │   └── test_managers.py
│   │   │       │   │   ├── io/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   ├── generate_legacy_storage_files.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_clipboard.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_common.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_compression.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_feather.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_fsspec.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_gbq.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_gcs.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_html.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_http_headers.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_orc.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_parquet.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pickle.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_s3.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_spss.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sql.cpython-312.pyc
│   │   │       │   │   │   │   └── test_stata.cpython-312.pyc
│   │   │       │   │   │   ├── excel/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_odf.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_odswriter.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_openpyxl.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_readers.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_style.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_writers.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_xlrd.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_xlsxwriter.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_odf.py
│   │   │       │   │   │   │   ├── test_odswriter.py
│   │   │       │   │   │   │   ├── test_openpyxl.py
│   │   │       │   │   │   │   ├── test_readers.py
│   │   │       │   │   │   │   ├── test_style.py
│   │   │       │   │   │   │   ├── test_writers.py
│   │   │       │   │   │   │   ├── test_xlrd.py
│   │   │       │   │   │   │   └── test_xlsxwriter.py
│   │   │       │   │   │   ├── formats/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_console.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_css.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_eng_formatting.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_format.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_ipython_compat.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_printing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_to_csv.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_to_excel.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_to_html.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_to_latex.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_to_markdown.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_to_string.cpython-312.pyc
│   │   │       │   │   │   │   ├── style/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_bar.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_exceptions.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_format.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_highlight.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_html.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_matplotlib.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_non_unique.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_style.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_to_latex.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_to_string.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── test_tooltip.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── test_bar.py
│   │   │       │   │   │   │   │   ├── test_exceptions.py
│   │   │       │   │   │   │   │   ├── test_format.py
│   │   │       │   │   │   │   │   ├── test_highlight.py
│   │   │       │   │   │   │   │   ├── test_html.py
│   │   │       │   │   │   │   │   ├── test_matplotlib.py
│   │   │       │   │   │   │   │   ├── test_non_unique.py
│   │   │       │   │   │   │   │   ├── test_style.py
│   │   │       │   │   │   │   │   ├── test_to_latex.py
│   │   │       │   │   │   │   │   ├── test_to_string.py
│   │   │       │   │   │   │   │   └── test_tooltip.py
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_console.py
│   │   │       │   │   │   │   ├── test_css.py
│   │   │       │   │   │   │   ├── test_eng_formatting.py
│   │   │       │   │   │   │   ├── test_format.py
│   │   │       │   │   │   │   ├── test_ipython_compat.py
│   │   │       │   │   │   │   ├── test_printing.py
│   │   │       │   │   │   │   ├── test_to_csv.py
│   │   │       │   │   │   │   ├── test_to_excel.py
│   │   │       │   │   │   │   ├── test_to_html.py
│   │   │       │   │   │   │   ├── test_to_latex.py
│   │   │       │   │   │   │   ├── test_to_markdown.py
│   │   │       │   │   │   │   └── test_to_string.py
│   │   │       │   │   │   ├── json/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_compression.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_deprecated_kwargs.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_json_table_schema.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_json_table_schema_ext_dtype.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_normalize.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_pandas.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_readlines.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_ujson.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── conftest.py
│   │   │       │   │   │   │   ├── test_compression.py
│   │   │       │   │   │   │   ├── test_deprecated_kwargs.py
│   │   │       │   │   │   │   ├── test_json_table_schema.py
│   │   │       │   │   │   │   ├── test_json_table_schema_ext_dtype.py
│   │   │       │   │   │   │   ├── test_normalize.py
│   │   │       │   │   │   │   ├── test_pandas.py
│   │   │       │   │   │   │   ├── test_readlines.py
│   │   │       │   │   │   │   └── test_ujson.py
│   │   │       │   │   │   ├── parser/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_c_parser_only.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_comment.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_compression.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_concatenate_chunks.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_converters.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_dialect.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_encoding.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_header.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_index_col.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_mangle_dupes.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_multi_thread.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_na_values.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_network.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_parse_dates.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_python_parser_only.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_quoting.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_read_fwf.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_skiprows.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_textreader.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_unsupported.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_upcast.cpython-312.pyc
│   │   │       │   │   │   │   ├── common/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_chunksize.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_common_basic.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_data_list.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_decimal.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_file_buffer_url.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_float.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_index.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_inf.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_ints.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_iterator.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_read_errors.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── test_verbose.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── test_chunksize.py
│   │   │       │   │   │   │   │   ├── test_common_basic.py
│   │   │       │   │   │   │   │   ├── test_data_list.py
│   │   │       │   │   │   │   │   ├── test_decimal.py
│   │   │       │   │   │   │   │   ├── test_file_buffer_url.py
│   │   │       │   │   │   │   │   ├── test_float.py
│   │   │       │   │   │   │   │   ├── test_index.py
│   │   │       │   │   │   │   │   ├── test_inf.py
│   │   │       │   │   │   │   │   ├── test_ints.py
│   │   │       │   │   │   │   │   ├── test_iterator.py
│   │   │       │   │   │   │   │   ├── test_read_errors.py
│   │   │       │   │   │   │   │   └── test_verbose.py
│   │   │       │   │   │   │   ├── dtypes/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_categorical.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_dtypes_basic.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── test_empty.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── test_categorical.py
│   │   │       │   │   │   │   │   ├── test_dtypes_basic.py
│   │   │       │   │   │   │   │   └── test_empty.py
│   │   │       │   │   │   │   ├── usecols/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_parse_dates.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_strings.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── test_usecols_basic.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── test_parse_dates.py
│   │   │       │   │   │   │   │   ├── test_strings.py
│   │   │       │   │   │   │   │   └── test_usecols_basic.py
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── conftest.py
│   │   │       │   │   │   │   ├── test_c_parser_only.py
│   │   │       │   │   │   │   ├── test_comment.py
│   │   │       │   │   │   │   ├── test_compression.py
│   │   │       │   │   │   │   ├── test_concatenate_chunks.py
│   │   │       │   │   │   │   ├── test_converters.py
│   │   │       │   │   │   │   ├── test_dialect.py
│   │   │       │   │   │   │   ├── test_encoding.py
│   │   │       │   │   │   │   ├── test_header.py
│   │   │       │   │   │   │   ├── test_index_col.py
│   │   │       │   │   │   │   ├── test_mangle_dupes.py
│   │   │       │   │   │   │   ├── test_multi_thread.py
│   │   │       │   │   │   │   ├── test_na_values.py
│   │   │       │   │   │   │   ├── test_network.py
│   │   │       │   │   │   │   ├── test_parse_dates.py
│   │   │       │   │   │   │   ├── test_python_parser_only.py
│   │   │       │   │   │   │   ├── test_quoting.py
│   │   │       │   │   │   │   ├── test_read_fwf.py
│   │   │       │   │   │   │   ├── test_skiprows.py
│   │   │       │   │   │   │   ├── test_textreader.py
│   │   │       │   │   │   │   ├── test_unsupported.py
│   │   │       │   │   │   │   └── test_upcast.py
│   │   │       │   │   │   ├── pytables/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── common.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_append.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_categorical.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_compat.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_complex.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_errors.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_file_handling.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_keys.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_put.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_pytables_missing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_read.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_retain_attributes.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_round_trip.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_select.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_store.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_subclass.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_time_series.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_timezones.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── common.py
│   │   │       │   │   │   │   ├── conftest.py
│   │   │       │   │   │   │   ├── test_append.py
│   │   │       │   │   │   │   ├── test_categorical.py
│   │   │       │   │   │   │   ├── test_compat.py
│   │   │       │   │   │   │   ├── test_complex.py
│   │   │       │   │   │   │   ├── test_errors.py
│   │   │       │   │   │   │   ├── test_file_handling.py
│   │   │       │   │   │   │   ├── test_keys.py
│   │   │       │   │   │   │   ├── test_put.py
│   │   │       │   │   │   │   ├── test_pytables_missing.py
│   │   │       │   │   │   │   ├── test_read.py
│   │   │       │   │   │   │   ├── test_retain_attributes.py
│   │   │       │   │   │   │   ├── test_round_trip.py
│   │   │       │   │   │   │   ├── test_select.py
│   │   │       │   │   │   │   ├── test_store.py
│   │   │       │   │   │   │   ├── test_subclass.py
│   │   │       │   │   │   │   ├── test_time_series.py
│   │   │       │   │   │   │   └── test_timezones.py
│   │   │       │   │   │   ├── sas/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_byteswap.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_sas.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_sas7bdat.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_xport.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_byteswap.py
│   │   │       │   │   │   │   ├── test_sas.py
│   │   │       │   │   │   │   ├── test_sas7bdat.py
│   │   │       │   │   │   │   └── test_xport.py
│   │   │       │   │   │   ├── xml/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_to_xml.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_xml.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_xml_dtypes.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── conftest.py
│   │   │       │   │   │   │   ├── test_to_xml.py
│   │   │       │   │   │   │   ├── test_xml.py
│   │   │       │   │   │   │   └── test_xml_dtypes.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── conftest.py
│   │   │       │   │   │   ├── generate_legacy_storage_files.py
│   │   │       │   │   │   ├── test_clipboard.py
│   │   │       │   │   │   ├── test_common.py
│   │   │       │   │   │   ├── test_compression.py
│   │   │       │   │   │   ├── test_feather.py
│   │   │       │   │   │   ├── test_fsspec.py
│   │   │       │   │   │   ├── test_gbq.py
│   │   │       │   │   │   ├── test_gcs.py
│   │   │       │   │   │   ├── test_html.py
│   │   │       │   │   │   ├── test_http_headers.py
│   │   │       │   │   │   ├── test_orc.py
│   │   │       │   │   │   ├── test_parquet.py
│   │   │       │   │   │   ├── test_pickle.py
│   │   │       │   │   │   ├── test_s3.py
│   │   │       │   │   │   ├── test_spss.py
│   │   │       │   │   │   ├── test_sql.py
│   │   │       │   │   │   └── test_stata.py
│   │   │       │   │   ├── libs/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_hashtable.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_join.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_lib.cpython-312.pyc
│   │   │       │   │   │   │   └── test_libalgos.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_hashtable.py
│   │   │       │   │   │   ├── test_join.py
│   │   │       │   │   │   ├── test_lib.py
│   │   │       │   │   │   └── test_libalgos.py
│   │   │       │   │   ├── plotting/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── common.cpython-312.pyc
│   │   │       │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_backend.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_boxplot_method.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_common.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_converter.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_datetimelike.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_groupby.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_hist_method.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_misc.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_series.cpython-312.pyc
│   │   │       │   │   │   │   └── test_style.cpython-312.pyc
│   │   │       │   │   │   ├── frame/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_frame.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_frame_color.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_frame_groupby.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_frame_legend.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_frame_subplots.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_hist_box_by.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_frame.py
│   │   │       │   │   │   │   ├── test_frame_color.py
│   │   │       │   │   │   │   ├── test_frame_groupby.py
│   │   │       │   │   │   │   ├── test_frame_legend.py
│   │   │       │   │   │   │   ├── test_frame_subplots.py
│   │   │       │   │   │   │   └── test_hist_box_by.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── common.py
│   │   │       │   │   │   ├── conftest.py
│   │   │       │   │   │   ├── test_backend.py
│   │   │       │   │   │   ├── test_boxplot_method.py
│   │   │       │   │   │   ├── test_common.py
│   │   │       │   │   │   ├── test_converter.py
│   │   │       │   │   │   ├── test_datetimelike.py
│   │   │       │   │   │   ├── test_groupby.py
│   │   │       │   │   │   ├── test_hist_method.py
│   │   │       │   │   │   ├── test_misc.py
│   │   │       │   │   │   ├── test_series.py
│   │   │       │   │   │   └── test_style.py
│   │   │       │   │   ├── reductions/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_reductions.cpython-312.pyc
│   │   │       │   │   │   │   └── test_stat_reductions.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_reductions.py
│   │   │       │   │   │   └── test_stat_reductions.py
│   │   │       │   │   ├── resample/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_base.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_datetime_index.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_period_index.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_resample_api.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_resampler_grouper.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_time_grouper.cpython-312.pyc
│   │   │       │   │   │   │   └── test_timedelta.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── conftest.py
│   │   │       │   │   │   ├── test_base.py
│   │   │       │   │   │   ├── test_datetime_index.py
│   │   │       │   │   │   ├── test_period_index.py
│   │   │       │   │   │   ├── test_resample_api.py
│   │   │       │   │   │   ├── test_resampler_grouper.py
│   │   │       │   │   │   ├── test_time_grouper.py
│   │   │       │   │   │   └── test_timedelta.py
│   │   │       │   │   ├── reshape/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_crosstab.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cut.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_from_dummies.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_get_dummies.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_melt.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pivot.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pivot_multilevel.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_qcut.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_union_categoricals.cpython-312.pyc
│   │   │       │   │   │   │   └── test_util.cpython-312.pyc
│   │   │       │   │   │   ├── concat/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_append.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_append_common.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_categorical.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_concat.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_dataframe.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_datetimes.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_empty.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_index.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_invalid.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_series.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_sort.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── conftest.py
│   │   │       │   │   │   │   ├── test_append.py
│   │   │       │   │   │   │   ├── test_append_common.py
│   │   │       │   │   │   │   ├── test_categorical.py
│   │   │       │   │   │   │   ├── test_concat.py
│   │   │       │   │   │   │   ├── test_dataframe.py
│   │   │       │   │   │   │   ├── test_datetimes.py
│   │   │       │   │   │   │   ├── test_empty.py
│   │   │       │   │   │   │   ├── test_index.py
│   │   │       │   │   │   │   ├── test_invalid.py
│   │   │       │   │   │   │   ├── test_series.py
│   │   │       │   │   │   │   └── test_sort.py
│   │   │       │   │   │   ├── merge/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_join.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_merge.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_merge_asof.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_merge_cross.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_merge_index_as_string.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_merge_ordered.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_multi.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_join.py
│   │   │       │   │   │   │   ├── test_merge.py
│   │   │       │   │   │   │   ├── test_merge_asof.py
│   │   │       │   │   │   │   ├── test_merge_cross.py
│   │   │       │   │   │   │   ├── test_merge_index_as_string.py
│   │   │       │   │   │   │   ├── test_merge_ordered.py
│   │   │       │   │   │   │   └── test_multi.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_crosstab.py
│   │   │       │   │   │   ├── test_cut.py
│   │   │       │   │   │   ├── test_from_dummies.py
│   │   │       │   │   │   ├── test_get_dummies.py
│   │   │       │   │   │   ├── test_melt.py
│   │   │       │   │   │   ├── test_pivot.py
│   │   │       │   │   │   ├── test_pivot_multilevel.py
│   │   │       │   │   │   ├── test_qcut.py
│   │   │       │   │   │   ├── test_union_categoricals.py
│   │   │       │   │   │   └── test_util.py
│   │   │       │   │   ├── scalar/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_na_scalar.cpython-312.pyc
│   │   │       │   │   │   │   └── test_nat.cpython-312.pyc
│   │   │       │   │   │   ├── interval/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_arithmetic.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_constructors.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_contains.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_formats.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_interval.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_overlaps.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_arithmetic.py
│   │   │       │   │   │   │   ├── test_constructors.py
│   │   │       │   │   │   │   ├── test_contains.py
│   │   │       │   │   │   │   ├── test_formats.py
│   │   │       │   │   │   │   ├── test_interval.py
│   │   │       │   │   │   │   └── test_overlaps.py
│   │   │       │   │   │   ├── period/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_arithmetic.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_asfreq.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_period.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_arithmetic.py
│   │   │       │   │   │   │   ├── test_asfreq.py
│   │   │       │   │   │   │   └── test_period.py
│   │   │       │   │   │   ├── timedelta/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_arithmetic.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_constructors.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_formats.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_timedelta.cpython-312.pyc
│   │   │       │   │   │   │   ├── methods/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_as_unit.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── test_round.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── test_as_unit.py
│   │   │       │   │   │   │   │   └── test_round.py
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_arithmetic.py
│   │   │       │   │   │   │   ├── test_constructors.py
│   │   │       │   │   │   │   ├── test_formats.py
│   │   │       │   │   │   │   └── test_timedelta.py
│   │   │       │   │   │   ├── timestamp/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_arithmetic.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_comparisons.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_constructors.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_formats.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_timestamp.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_timezones.cpython-312.pyc
│   │   │       │   │   │   │   ├── methods/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_as_unit.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_normalize.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_replace.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_round.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_timestamp_method.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_to_julian_date.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_to_pydatetime.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_tz_convert.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── test_tz_localize.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── test_as_unit.py
│   │   │       │   │   │   │   │   ├── test_normalize.py
│   │   │       │   │   │   │   │   ├── test_replace.py
│   │   │       │   │   │   │   │   ├── test_round.py
│   │   │       │   │   │   │   │   ├── test_timestamp_method.py
│   │   │       │   │   │   │   │   ├── test_to_julian_date.py
│   │   │       │   │   │   │   │   ├── test_to_pydatetime.py
│   │   │       │   │   │   │   │   ├── test_tz_convert.py
│   │   │       │   │   │   │   │   └── test_tz_localize.py
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_arithmetic.py
│   │   │       │   │   │   │   ├── test_comparisons.py
│   │   │       │   │   │   │   ├── test_constructors.py
│   │   │       │   │   │   │   ├── test_formats.py
│   │   │       │   │   │   │   ├── test_timestamp.py
│   │   │       │   │   │   │   └── test_timezones.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_na_scalar.py
│   │   │       │   │   │   └── test_nat.py
│   │   │       │   │   ├── series/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_api.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_arithmetic.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_constructors.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cumulative.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_formats.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_iteration.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_logical_ops.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_missing.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_npfuncs.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_reductions.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_subclass.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ufunc.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_unary.cpython-312.pyc
│   │   │       │   │   │   │   └── test_validate.cpython-312.pyc
│   │   │       │   │   │   ├── accessors/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_cat_accessor.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_dt_accessor.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_list_accessor.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_sparse_accessor.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_str_accessor.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_struct_accessor.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_cat_accessor.py
│   │   │       │   │   │   │   ├── test_dt_accessor.py
│   │   │       │   │   │   │   ├── test_list_accessor.py
│   │   │       │   │   │   │   ├── test_sparse_accessor.py
│   │   │       │   │   │   │   ├── test_str_accessor.py
│   │   │       │   │   │   │   └── test_struct_accessor.py
│   │   │       │   │   │   ├── indexing/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_datetime.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_delitem.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_get.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_getitem.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_mask.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_set_value.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_setitem.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_take.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_where.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_xs.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_datetime.py
│   │   │       │   │   │   │   ├── test_delitem.py
│   │   │       │   │   │   │   ├── test_get.py
│   │   │       │   │   │   │   ├── test_getitem.py
│   │   │       │   │   │   │   ├── test_indexing.py
│   │   │       │   │   │   │   ├── test_mask.py
│   │   │       │   │   │   │   ├── test_set_value.py
│   │   │       │   │   │   │   ├── test_setitem.py
│   │   │       │   │   │   │   ├── test_take.py
│   │   │       │   │   │   │   ├── test_where.py
│   │   │       │   │   │   │   └── test_xs.py
│   │   │       │   │   │   ├── methods/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_add_prefix_suffix.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_align.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_argsort.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_asof.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_astype.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_autocorr.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_between.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_case_when.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_clip.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_combine.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_combine_first.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_compare.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_convert_dtypes.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_copy.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_count.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_cov_corr.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_describe.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_diff.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_drop.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_drop_duplicates.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_dropna.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_dtypes.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_duplicated.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_equals.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_explode.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_fillna.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_get_numeric_data.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_head_tail.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_infer_objects.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_info.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_interpolate.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_is_monotonic.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_is_unique.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_isin.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_isna.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_item.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_map.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_matmul.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_nlargest.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_nunique.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_pct_change.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_pop.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_quantile.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_rank.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_reindex.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_reindex_like.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_rename.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_rename_axis.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_repeat.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_replace.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_reset_index.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_round.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_searchsorted.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_set_name.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_size.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_sort_index.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_sort_values.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_to_csv.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_to_dict.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_to_frame.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_to_numpy.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_tolist.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_truncate.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_tz_localize.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_unique.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_unstack.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_update.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_value_counts.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_values.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_view.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_add_prefix_suffix.py
│   │   │       │   │   │   │   ├── test_align.py
│   │   │       │   │   │   │   ├── test_argsort.py
│   │   │       │   │   │   │   ├── test_asof.py
│   │   │       │   │   │   │   ├── test_astype.py
│   │   │       │   │   │   │   ├── test_autocorr.py
│   │   │       │   │   │   │   ├── test_between.py
│   │   │       │   │   │   │   ├── test_case_when.py
│   │   │       │   │   │   │   ├── test_clip.py
│   │   │       │   │   │   │   ├── test_combine.py
│   │   │       │   │   │   │   ├── test_combine_first.py
│   │   │       │   │   │   │   ├── test_compare.py
│   │   │       │   │   │   │   ├── test_convert_dtypes.py
│   │   │       │   │   │   │   ├── test_copy.py
│   │   │       │   │   │   │   ├── test_count.py
│   │   │       │   │   │   │   ├── test_cov_corr.py
│   │   │       │   │   │   │   ├── test_describe.py
│   │   │       │   │   │   │   ├── test_diff.py
│   │   │       │   │   │   │   ├── test_drop.py
│   │   │       │   │   │   │   ├── test_drop_duplicates.py
│   │   │       │   │   │   │   ├── test_dropna.py
│   │   │       │   │   │   │   ├── test_dtypes.py
│   │   │       │   │   │   │   ├── test_duplicated.py
│   │   │       │   │   │   │   ├── test_equals.py
│   │   │       │   │   │   │   ├── test_explode.py
│   │   │       │   │   │   │   ├── test_fillna.py
│   │   │       │   │   │   │   ├── test_get_numeric_data.py
│   │   │       │   │   │   │   ├── test_head_tail.py
│   │   │       │   │   │   │   ├── test_infer_objects.py
│   │   │       │   │   │   │   ├── test_info.py
│   │   │       │   │   │   │   ├── test_interpolate.py
│   │   │       │   │   │   │   ├── test_is_monotonic.py
│   │   │       │   │   │   │   ├── test_is_unique.py
│   │   │       │   │   │   │   ├── test_isin.py
│   │   │       │   │   │   │   ├── test_isna.py
│   │   │       │   │   │   │   ├── test_item.py
│   │   │       │   │   │   │   ├── test_map.py
│   │   │       │   │   │   │   ├── test_matmul.py
│   │   │       │   │   │   │   ├── test_nlargest.py
│   │   │       │   │   │   │   ├── test_nunique.py
│   │   │       │   │   │   │   ├── test_pct_change.py
│   │   │       │   │   │   │   ├── test_pop.py
│   │   │       │   │   │   │   ├── test_quantile.py
│   │   │       │   │   │   │   ├── test_rank.py
│   │   │       │   │   │   │   ├── test_reindex.py
│   │   │       │   │   │   │   ├── test_reindex_like.py
│   │   │       │   │   │   │   ├── test_rename.py
│   │   │       │   │   │   │   ├── test_rename_axis.py
│   │   │       │   │   │   │   ├── test_repeat.py
│   │   │       │   │   │   │   ├── test_replace.py
│   │   │       │   │   │   │   ├── test_reset_index.py
│   │   │       │   │   │   │   ├── test_round.py
│   │   │       │   │   │   │   ├── test_searchsorted.py
│   │   │       │   │   │   │   ├── test_set_name.py
│   │   │       │   │   │   │   ├── test_size.py
│   │   │       │   │   │   │   ├── test_sort_index.py
│   │   │       │   │   │   │   ├── test_sort_values.py
│   │   │       │   │   │   │   ├── test_to_csv.py
│   │   │       │   │   │   │   ├── test_to_dict.py
│   │   │       │   │   │   │   ├── test_to_frame.py
│   │   │       │   │   │   │   ├── test_to_numpy.py
│   │   │       │   │   │   │   ├── test_tolist.py
│   │   │       │   │   │   │   ├── test_truncate.py
│   │   │       │   │   │   │   ├── test_tz_localize.py
│   │   │       │   │   │   │   ├── test_unique.py
│   │   │       │   │   │   │   ├── test_unstack.py
│   │   │       │   │   │   │   ├── test_update.py
│   │   │       │   │   │   │   ├── test_value_counts.py
│   │   │       │   │   │   │   ├── test_values.py
│   │   │       │   │   │   │   └── test_view.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_api.py
│   │   │       │   │   │   ├── test_arithmetic.py
│   │   │       │   │   │   ├── test_constructors.py
│   │   │       │   │   │   ├── test_cumulative.py
│   │   │       │   │   │   ├── test_formats.py
│   │   │       │   │   │   ├── test_iteration.py
│   │   │       │   │   │   ├── test_logical_ops.py
│   │   │       │   │   │   ├── test_missing.py
│   │   │       │   │   │   ├── test_npfuncs.py
│   │   │       │   │   │   ├── test_reductions.py
│   │   │       │   │   │   ├── test_subclass.py
│   │   │       │   │   │   ├── test_ufunc.py
│   │   │       │   │   │   ├── test_unary.py
│   │   │       │   │   │   └── test_validate.py
│   │   │       │   │   ├── strings/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_api.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_case_justify.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cat.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_extract.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_find_replace.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_get_dummies.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_split_partition.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_string_array.cpython-312.pyc
│   │   │       │   │   │   │   └── test_strings.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── conftest.py
│   │   │       │   │   │   ├── test_api.py
│   │   │       │   │   │   ├── test_case_justify.py
│   │   │       │   │   │   ├── test_cat.py
│   │   │       │   │   │   ├── test_extract.py
│   │   │       │   │   │   ├── test_find_replace.py
│   │   │       │   │   │   ├── test_get_dummies.py
│   │   │       │   │   │   ├── test_split_partition.py
│   │   │       │   │   │   ├── test_string_array.py
│   │   │       │   │   │   └── test_strings.py
│   │   │       │   │   ├── tools/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_to_datetime.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_to_numeric.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_to_time.cpython-312.pyc
│   │   │       │   │   │   │   └── test_to_timedelta.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_to_datetime.py
│   │   │       │   │   │   ├── test_to_numeric.py
│   │   │       │   │   │   ├── test_to_time.py
│   │   │       │   │   │   └── test_to_timedelta.py
│   │   │       │   │   ├── tseries/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── frequencies/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_freq_code.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_frequencies.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_inference.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_freq_code.py
│   │   │       │   │   │   │   ├── test_frequencies.py
│   │   │       │   │   │   │   └── test_inference.py
│   │   │       │   │   │   ├── holiday/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_calendar.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_federal.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_holiday.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_observance.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_calendar.py
│   │   │       │   │   │   │   ├── test_federal.py
│   │   │       │   │   │   │   ├── test_holiday.py
│   │   │       │   │   │   │   └── test_observance.py
│   │   │       │   │   │   ├── offsets/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── common.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_business_day.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_business_hour.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_business_month.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_business_quarter.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_business_year.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_common.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_custom_business_day.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_custom_business_hour.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_custom_business_month.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_dst.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_easter.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_fiscal.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_index.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_month.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_offsets.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_offsets_properties.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_quarter.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_ticks.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_week.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_year.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── common.py
│   │   │       │   │   │   │   ├── test_business_day.py
│   │   │       │   │   │   │   ├── test_business_hour.py
│   │   │       │   │   │   │   ├── test_business_month.py
│   │   │       │   │   │   │   ├── test_business_quarter.py
│   │   │       │   │   │   │   ├── test_business_year.py
│   │   │       │   │   │   │   ├── test_common.py
│   │   │       │   │   │   │   ├── test_custom_business_day.py
│   │   │       │   │   │   │   ├── test_custom_business_hour.py
│   │   │       │   │   │   │   ├── test_custom_business_month.py
│   │   │       │   │   │   │   ├── test_dst.py
│   │   │       │   │   │   │   ├── test_easter.py
│   │   │       │   │   │   │   ├── test_fiscal.py
│   │   │       │   │   │   │   ├── test_index.py
│   │   │       │   │   │   │   ├── test_month.py
│   │   │       │   │   │   │   ├── test_offsets.py
│   │   │       │   │   │   │   ├── test_offsets_properties.py
│   │   │       │   │   │   │   ├── test_quarter.py
│   │   │       │   │   │   │   ├── test_ticks.py
│   │   │       │   │   │   │   ├── test_week.py
│   │   │       │   │   │   │   └── test_year.py
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── tslibs/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_api.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_array_to_datetime.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ccalendar.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_conversion.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_fields.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_libfrequencies.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_liboffsets.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_np_datetime.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_npy_units.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_parse_iso8601.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_parsing.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_period.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_resolution.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_strptime.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_timedeltas.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_timezones.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_to_offset.cpython-312.pyc
│   │   │       │   │   │   │   └── test_tzconversion.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_api.py
│   │   │       │   │   │   ├── test_array_to_datetime.py
│   │   │       │   │   │   ├── test_ccalendar.py
│   │   │       │   │   │   ├── test_conversion.py
│   │   │       │   │   │   ├── test_fields.py
│   │   │       │   │   │   ├── test_libfrequencies.py
│   │   │       │   │   │   ├── test_liboffsets.py
│   │   │       │   │   │   ├── test_np_datetime.py
│   │   │       │   │   │   ├── test_npy_units.py
│   │   │       │   │   │   ├── test_parse_iso8601.py
│   │   │       │   │   │   ├── test_parsing.py
│   │   │       │   │   │   ├── test_period.py
│   │   │       │   │   │   ├── test_resolution.py
│   │   │       │   │   │   ├── test_strptime.py
│   │   │       │   │   │   ├── test_timedeltas.py
│   │   │       │   │   │   ├── test_timezones.py
│   │   │       │   │   │   ├── test_to_offset.py
│   │   │       │   │   │   └── test_tzconversion.py
│   │   │       │   │   ├── util/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_assert_almost_equal.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_assert_attr_equal.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_assert_categorical_equal.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_assert_extension_array_equal.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_assert_frame_equal.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_assert_index_equal.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_assert_interval_array_equal.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_assert_numpy_array_equal.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_assert_produces_warning.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_assert_series_equal.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_deprecate.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_deprecate_kwarg.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_deprecate_nonkeyword_arguments.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_doc.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_hashing.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_numba.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_rewrite_warning.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_shares_memory.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_show_versions.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_util.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_validate_args.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_validate_args_and_kwargs.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_validate_inclusive.cpython-312.pyc
│   │   │       │   │   │   │   └── test_validate_kwargs.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── conftest.py
│   │   │       │   │   │   ├── test_assert_almost_equal.py
│   │   │       │   │   │   ├── test_assert_attr_equal.py
│   │   │       │   │   │   ├── test_assert_categorical_equal.py
│   │   │       │   │   │   ├── test_assert_extension_array_equal.py
│   │   │       │   │   │   ├── test_assert_frame_equal.py
│   │   │       │   │   │   ├── test_assert_index_equal.py
│   │   │       │   │   │   ├── test_assert_interval_array_equal.py
│   │   │       │   │   │   ├── test_assert_numpy_array_equal.py
│   │   │       │   │   │   ├── test_assert_produces_warning.py
│   │   │       │   │   │   ├── test_assert_series_equal.py
│   │   │       │   │   │   ├── test_deprecate.py
│   │   │       │   │   │   ├── test_deprecate_kwarg.py
│   │   │       │   │   │   ├── test_deprecate_nonkeyword_arguments.py
│   │   │       │   │   │   ├── test_doc.py
│   │   │       │   │   │   ├── test_hashing.py
│   │   │       │   │   │   ├── test_numba.py
│   │   │       │   │   │   ├── test_rewrite_warning.py
│   │   │       │   │   │   ├── test_shares_memory.py
│   │   │       │   │   │   ├── test_show_versions.py
│   │   │       │   │   │   ├── test_util.py
│   │   │       │   │   │   ├── test_validate_args.py
│   │   │       │   │   │   ├── test_validate_args_and_kwargs.py
│   │   │       │   │   │   ├── test_validate_inclusive.py
│   │   │       │   │   │   └── test_validate_kwargs.py
│   │   │       │   │   ├── window/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_api.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_apply.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_base_indexer.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cython_aggregations.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_dtypes.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ewm.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_expanding.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_groupby.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_numba.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_online.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pairwise.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_rolling.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_rolling_functions.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_rolling_quantile.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_rolling_skew_kurt.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_timeseries_window.cpython-312.pyc
│   │   │       │   │   │   │   └── test_win_type.cpython-312.pyc
│   │   │       │   │   │   ├── moments/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_moments_consistency_ewm.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_moments_consistency_expanding.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_moments_consistency_rolling.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── conftest.py
│   │   │       │   │   │   │   ├── test_moments_consistency_ewm.py
│   │   │       │   │   │   │   ├── test_moments_consistency_expanding.py
│   │   │       │   │   │   │   └── test_moments_consistency_rolling.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── conftest.py
│   │   │       │   │   │   ├── test_api.py
│   │   │       │   │   │   ├── test_apply.py
│   │   │       │   │   │   ├── test_base_indexer.py
│   │   │       │   │   │   ├── test_cython_aggregations.py
│   │   │       │   │   │   ├── test_dtypes.py
│   │   │       │   │   │   ├── test_ewm.py
│   │   │       │   │   │   ├── test_expanding.py
│   │   │       │   │   │   ├── test_groupby.py
│   │   │       │   │   │   ├── test_numba.py
│   │   │       │   │   │   ├── test_online.py
│   │   │       │   │   │   ├── test_pairwise.py
│   │   │       │   │   │   ├── test_rolling.py
│   │   │       │   │   │   ├── test_rolling_functions.py
│   │   │       │   │   │   ├── test_rolling_quantile.py
│   │   │       │   │   │   ├── test_rolling_skew_kurt.py
│   │   │       │   │   │   ├── test_timeseries_window.py
│   │   │       │   │   │   └── test_win_type.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── test_aggregation.py
│   │   │       │   │   ├── test_algos.py
│   │   │       │   │   ├── test_common.py
│   │   │       │   │   ├── test_downstream.py
│   │   │       │   │   ├── test_errors.py
│   │   │       │   │   ├── test_expressions.py
│   │   │       │   │   ├── test_flags.py
│   │   │       │   │   ├── test_multilevel.py
│   │   │       │   │   ├── test_nanops.py
│   │   │       │   │   ├── test_optional_dependency.py
│   │   │       │   │   ├── test_register_accessor.py
│   │   │       │   │   ├── test_sorting.py
│   │   │       │   │   └── test_take.py
│   │   │       │   ├── tseries/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   ├── frequencies.cpython-312.pyc
│   │   │       │   │   │   ├── holiday.cpython-312.pyc
│   │   │       │   │   │   └── offsets.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── api.py
│   │   │       │   │   ├── frequencies.py
│   │   │       │   │   ├── holiday.py
│   │   │       │   │   └── offsets.py
│   │   │       │   ├── util/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _decorators.cpython-312.pyc
│   │   │       │   │   │   ├── _doctools.cpython-312.pyc
│   │   │       │   │   │   ├── _exceptions.cpython-312.pyc
│   │   │       │   │   │   ├── _print_versions.cpython-312.pyc
│   │   │       │   │   │   ├── _test_decorators.cpython-312.pyc
│   │   │       │   │   │   ├── _tester.cpython-312.pyc
│   │   │       │   │   │   └── _validators.cpython-312.pyc
│   │   │       │   │   ├── version/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _decorators.py
│   │   │       │   │   ├── _doctools.py
│   │   │       │   │   ├── _exceptions.py
│   │   │       │   │   ├── _print_versions.py
│   │   │       │   │   ├── _test_decorators.py
│   │   │       │   │   ├── _tester.py
│   │   │       │   │   └── _validators.py
│   │   │       │   ├── __init__.py
│   │   │       │   ├── _typing.py
│   │   │       │   ├── _version.py
│   │   │       │   ├── _version_meson.py
│   │   │       │   ├── conftest.py
│   │   │       │   ├── pyproject.toml
│   │   │       │   └── testing.py
│   │   │       ├── pandas-2.2.2.dist-info/
│   │   │       │   ├── DELVEWHEEL
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── LICENSE
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── REQUESTED
│   │   │       │   ├── WHEEL
│   │   │       │   └── entry_points.txt
│   │   │       ├── pandas.libs/
│   │   │       │   └── msvcp140-ef6047a69b174ada5cb2eff1d2bc9a62.dll
│   │   │       ├── patsy/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── build.cpython-312.pyc
│   │   │       │   │   ├── builtins.cpython-312.pyc
│   │   │       │   │   ├── categorical.cpython-312.pyc
│   │   │       │   │   ├── compat.cpython-312.pyc
│   │   │       │   │   ├── compat_ordereddict.cpython-312.pyc
│   │   │       │   │   ├── constraint.cpython-312.pyc
│   │   │       │   │   ├── contrasts.cpython-312.pyc
│   │   │       │   │   ├── desc.cpython-312.pyc
│   │   │       │   │   ├── design_info.cpython-312.pyc
│   │   │       │   │   ├── eval.cpython-312.pyc
│   │   │       │   │   ├── highlevel.cpython-312.pyc
│   │   │       │   │   ├── infix_parser.cpython-312.pyc
│   │   │       │   │   ├── mgcv_cubic_splines.cpython-312.pyc
│   │   │       │   │   ├── missing.cpython-312.pyc
│   │   │       │   │   ├── origin.cpython-312.pyc
│   │   │       │   │   ├── parse_formula.cpython-312.pyc
│   │   │       │   │   ├── redundancy.cpython-312.pyc
│   │   │       │   │   ├── splines.cpython-312.pyc
│   │   │       │   │   ├── state.cpython-312.pyc
│   │   │       │   │   ├── test_build.cpython-312.pyc
│   │   │       │   │   ├── test_highlevel.cpython-312.pyc
│   │   │       │   │   ├── test_regressions.cpython-312.pyc
│   │   │       │   │   ├── test_splines_bs_data.cpython-312.pyc
│   │   │       │   │   ├── test_splines_crs_data.cpython-312.pyc
│   │   │       │   │   ├── test_state.cpython-312.pyc
│   │   │       │   │   ├── tokens.cpython-312.pyc
│   │   │       │   │   ├── user_util.cpython-312.pyc
│   │   │       │   │   ├── util.cpython-312.pyc
│   │   │       │   │   └── version.cpython-312.pyc
│   │   │       │   ├── __init__.py
│   │   │       │   ├── build.py
│   │   │       │   ├── builtins.py
│   │   │       │   ├── categorical.py
│   │   │       │   ├── compat.py
│   │   │       │   ├── compat_ordereddict.py
│   │   │       │   ├── constraint.py
│   │   │       │   ├── contrasts.py
│   │   │       │   ├── desc.py
│   │   │       │   ├── design_info.py
│   │   │       │   ├── eval.py
│   │   │       │   ├── highlevel.py
│   │   │       │   ├── infix_parser.py
│   │   │       │   ├── mgcv_cubic_splines.py
│   │   │       │   ├── missing.py
│   │   │       │   ├── origin.py
│   │   │       │   ├── parse_formula.py
│   │   │       │   ├── redundancy.py
│   │   │       │   ├── splines.py
│   │   │       │   ├── state.py
│   │   │       │   ├── test_build.py
│   │   │       │   ├── test_highlevel.py
│   │   │       │   ├── test_regressions.py
│   │   │       │   ├── test_splines_bs_data.py
│   │   │       │   ├── test_splines_crs_data.py
│   │   │       │   ├── test_state.py
│   │   │       │   ├── tokens.py
│   │   │       │   ├── user_util.py
│   │   │       │   ├── util.py
│   │   │       │   └── version.py
│   │   │       ├── patsy-1.0.2.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE.txt
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── WHEEL
│   │   │       │   └── top_level.txt
│   │   │       ├── pillow-12.1.0.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── WHEEL
│   │   │       │   ├── top_level.txt
│   │   │       │   └── zip-safe
│   │   │       ├── pip/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   └── __pip-runner__.cpython-312.pyc
│   │   │       │   ├── _internal/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── build_env.cpython-312.pyc
│   │   │       │   │   │   ├── cache.cpython-312.pyc
│   │   │       │   │   │   ├── configuration.cpython-312.pyc
│   │   │       │   │   │   ├── exceptions.cpython-312.pyc
│   │   │       │   │   │   ├── main.cpython-312.pyc
│   │   │       │   │   │   ├── pyproject.cpython-312.pyc
│   │   │       │   │   │   ├── self_outdated_check.cpython-312.pyc
│   │   │       │   │   │   └── wheel_builder.cpython-312.pyc
│   │   │       │   │   ├── cli/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── autocompletion.cpython-312.pyc
│   │   │       │   │   │   │   ├── base_command.cpython-312.pyc
│   │   │       │   │   │   │   ├── cmdoptions.cpython-312.pyc
│   │   │       │   │   │   │   ├── command_context.cpython-312.pyc
│   │   │       │   │   │   │   ├── index_command.cpython-312.pyc
│   │   │       │   │   │   │   ├── main.cpython-312.pyc
│   │   │       │   │   │   │   ├── main_parser.cpython-312.pyc
│   │   │       │   │   │   │   ├── parser.cpython-312.pyc
│   │   │       │   │   │   │   ├── progress_bars.cpython-312.pyc
│   │   │       │   │   │   │   ├── req_command.cpython-312.pyc
│   │   │       │   │   │   │   ├── spinners.cpython-312.pyc
│   │   │       │   │   │   │   └── status_codes.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── autocompletion.py
│   │   │       │   │   │   ├── base_command.py
│   │   │       │   │   │   ├── cmdoptions.py
│   │   │       │   │   │   ├── command_context.py
│   │   │       │   │   │   ├── index_command.py
│   │   │       │   │   │   ├── main.py
│   │   │       │   │   │   ├── main_parser.py
│   │   │       │   │   │   ├── parser.py
│   │   │       │   │   │   ├── progress_bars.py
│   │   │       │   │   │   ├── req_command.py
│   │   │       │   │   │   ├── spinners.py
│   │   │       │   │   │   └── status_codes.py
│   │   │       │   │   ├── commands/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── cache.cpython-312.pyc
│   │   │       │   │   │   │   ├── check.cpython-312.pyc
│   │   │       │   │   │   │   ├── completion.cpython-312.pyc
│   │   │       │   │   │   │   ├── configuration.cpython-312.pyc
│   │   │       │   │   │   │   ├── debug.cpython-312.pyc
│   │   │       │   │   │   │   ├── download.cpython-312.pyc
│   │   │       │   │   │   │   ├── freeze.cpython-312.pyc
│   │   │       │   │   │   │   ├── hash.cpython-312.pyc
│   │   │       │   │   │   │   ├── help.cpython-312.pyc
│   │   │       │   │   │   │   ├── index.cpython-312.pyc
│   │   │       │   │   │   │   ├── inspect.cpython-312.pyc
│   │   │       │   │   │   │   ├── install.cpython-312.pyc
│   │   │       │   │   │   │   ├── list.cpython-312.pyc
│   │   │       │   │   │   │   ├── lock.cpython-312.pyc
│   │   │       │   │   │   │   ├── search.cpython-312.pyc
│   │   │       │   │   │   │   ├── show.cpython-312.pyc
│   │   │       │   │   │   │   ├── uninstall.cpython-312.pyc
│   │   │       │   │   │   │   └── wheel.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── cache.py
│   │   │       │   │   │   ├── check.py
│   │   │       │   │   │   ├── completion.py
│   │   │       │   │   │   ├── configuration.py
│   │   │       │   │   │   ├── debug.py
│   │   │       │   │   │   ├── download.py
│   │   │       │   │   │   ├── freeze.py
│   │   │       │   │   │   ├── hash.py
│   │   │       │   │   │   ├── help.py
│   │   │       │   │   │   ├── index.py
│   │   │       │   │   │   ├── inspect.py
│   │   │       │   │   │   ├── install.py
│   │   │       │   │   │   ├── list.py
│   │   │       │   │   │   ├── lock.py
│   │   │       │   │   │   ├── search.py
│   │   │       │   │   │   ├── show.py
│   │   │       │   │   │   ├── uninstall.py
│   │   │       │   │   │   └── wheel.py
│   │   │       │   │   ├── distributions/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── base.cpython-312.pyc
│   │   │       │   │   │   │   ├── installed.cpython-312.pyc
│   │   │       │   │   │   │   ├── sdist.cpython-312.pyc
│   │   │       │   │   │   │   └── wheel.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── base.py
│   │   │       │   │   │   ├── installed.py
│   │   │       │   │   │   ├── sdist.py
│   │   │       │   │   │   └── wheel.py
│   │   │       │   │   ├── index/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── collector.cpython-312.pyc
│   │   │       │   │   │   │   ├── package_finder.cpython-312.pyc
│   │   │       │   │   │   │   └── sources.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── collector.py
│   │   │       │   │   │   ├── package_finder.py
│   │   │       │   │   │   └── sources.py
│   │   │       │   │   ├── locations/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _distutils.cpython-312.pyc
│   │   │       │   │   │   │   ├── _sysconfig.cpython-312.pyc
│   │   │       │   │   │   │   └── base.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _distutils.py
│   │   │       │   │   │   ├── _sysconfig.py
│   │   │       │   │   │   └── base.py
│   │   │       │   │   ├── metadata/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _json.cpython-312.pyc
│   │   │       │   │   │   │   ├── base.cpython-312.pyc
│   │   │       │   │   │   │   └── pkg_resources.cpython-312.pyc
│   │   │       │   │   │   ├── importlib/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _compat.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _dists.cpython-312.pyc
│   │   │       │   │   │   │   │   └── _envs.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── _compat.py
│   │   │       │   │   │   │   ├── _dists.py
│   │   │       │   │   │   │   └── _envs.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _json.py
│   │   │       │   │   │   ├── base.py
│   │   │       │   │   │   └── pkg_resources.py
│   │   │       │   │   ├── models/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── candidate.cpython-312.pyc
│   │   │       │   │   │   │   ├── direct_url.cpython-312.pyc
│   │   │       │   │   │   │   ├── format_control.cpython-312.pyc
│   │   │       │   │   │   │   ├── index.cpython-312.pyc
│   │   │       │   │   │   │   ├── installation_report.cpython-312.pyc
│   │   │       │   │   │   │   ├── link.cpython-312.pyc
│   │   │       │   │   │   │   ├── pylock.cpython-312.pyc
│   │   │       │   │   │   │   ├── scheme.cpython-312.pyc
│   │   │       │   │   │   │   ├── search_scope.cpython-312.pyc
│   │   │       │   │   │   │   ├── selection_prefs.cpython-312.pyc
│   │   │       │   │   │   │   ├── target_python.cpython-312.pyc
│   │   │       │   │   │   │   └── wheel.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── candidate.py
│   │   │       │   │   │   ├── direct_url.py
│   │   │       │   │   │   ├── format_control.py
│   │   │       │   │   │   ├── index.py
│   │   │       │   │   │   ├── installation_report.py
│   │   │       │   │   │   ├── link.py
│   │   │       │   │   │   ├── pylock.py
│   │   │       │   │   │   ├── scheme.py
│   │   │       │   │   │   ├── search_scope.py
│   │   │       │   │   │   ├── selection_prefs.py
│   │   │       │   │   │   ├── target_python.py
│   │   │       │   │   │   └── wheel.py
│   │   │       │   │   ├── network/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── auth.cpython-312.pyc
│   │   │       │   │   │   │   ├── cache.cpython-312.pyc
│   │   │       │   │   │   │   ├── download.cpython-312.pyc
│   │   │       │   │   │   │   ├── lazy_wheel.cpython-312.pyc
│   │   │       │   │   │   │   ├── session.cpython-312.pyc
│   │   │       │   │   │   │   ├── utils.cpython-312.pyc
│   │   │       │   │   │   │   └── xmlrpc.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── auth.py
│   │   │       │   │   │   ├── cache.py
│   │   │       │   │   │   ├── download.py
│   │   │       │   │   │   ├── lazy_wheel.py
│   │   │       │   │   │   ├── session.py
│   │   │       │   │   │   ├── utils.py
│   │   │       │   │   │   └── xmlrpc.py
│   │   │       │   │   ├── operations/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── check.cpython-312.pyc
│   │   │       │   │   │   │   ├── freeze.cpython-312.pyc
│   │   │       │   │   │   │   └── prepare.cpython-312.pyc
│   │   │       │   │   │   ├── build/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── build_tracker.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── metadata.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── metadata_editable.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── wheel.cpython-312.pyc
│   │   │       │   │   │   │   │   └── wheel_editable.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── build_tracker.py
│   │   │       │   │   │   │   ├── metadata.py
│   │   │       │   │   │   │   ├── metadata_editable.py
│   │   │       │   │   │   │   ├── wheel.py
│   │   │       │   │   │   │   └── wheel_editable.py
│   │   │       │   │   │   ├── install/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── wheel.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── wheel.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── check.py
│   │   │       │   │   │   ├── freeze.py
│   │   │       │   │   │   └── prepare.py
│   │   │       │   │   ├── req/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── constructors.cpython-312.pyc
│   │   │       │   │   │   │   ├── req_dependency_group.cpython-312.pyc
│   │   │       │   │   │   │   ├── req_file.cpython-312.pyc
│   │   │       │   │   │   │   ├── req_install.cpython-312.pyc
│   │   │       │   │   │   │   ├── req_set.cpython-312.pyc
│   │   │       │   │   │   │   └── req_uninstall.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── constructors.py
│   │   │       │   │   │   ├── req_dependency_group.py
│   │   │       │   │   │   ├── req_file.py
│   │   │       │   │   │   ├── req_install.py
│   │   │       │   │   │   ├── req_set.py
│   │   │       │   │   │   └── req_uninstall.py
│   │   │       │   │   ├── resolution/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── base.cpython-312.pyc
│   │   │       │   │   │   ├── legacy/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── resolver.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── resolver.py
│   │   │       │   │   │   ├── resolvelib/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── base.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── candidates.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── factory.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── found_candidates.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── provider.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── reporter.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── requirements.cpython-312.pyc
│   │   │       │   │   │   │   │   └── resolver.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── base.py
│   │   │       │   │   │   │   ├── candidates.py
│   │   │       │   │   │   │   ├── factory.py
│   │   │       │   │   │   │   ├── found_candidates.py
│   │   │       │   │   │   │   ├── provider.py
│   │   │       │   │   │   │   ├── reporter.py
│   │   │       │   │   │   │   ├── requirements.py
│   │   │       │   │   │   │   └── resolver.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── base.py
│   │   │       │   │   ├── utils/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _jaraco_text.cpython-312.pyc
│   │   │       │   │   │   │   ├── _log.cpython-312.pyc
│   │   │       │   │   │   │   ├── appdirs.cpython-312.pyc
│   │   │       │   │   │   │   ├── compat.cpython-312.pyc
│   │   │       │   │   │   │   ├── compatibility_tags.cpython-312.pyc
│   │   │       │   │   │   │   ├── datetime.cpython-312.pyc
│   │   │       │   │   │   │   ├── deprecation.cpython-312.pyc
│   │   │       │   │   │   │   ├── direct_url_helpers.cpython-312.pyc
│   │   │       │   │   │   │   ├── egg_link.cpython-312.pyc
│   │   │       │   │   │   │   ├── entrypoints.cpython-312.pyc
│   │   │       │   │   │   │   ├── filesystem.cpython-312.pyc
│   │   │       │   │   │   │   ├── filetypes.cpython-312.pyc
│   │   │       │   │   │   │   ├── glibc.cpython-312.pyc
│   │   │       │   │   │   │   ├── hashes.cpython-312.pyc
│   │   │       │   │   │   │   ├── logging.cpython-312.pyc
│   │   │       │   │   │   │   ├── misc.cpython-312.pyc
│   │   │       │   │   │   │   ├── packaging.cpython-312.pyc
│   │   │       │   │   │   │   ├── retry.cpython-312.pyc
│   │   │       │   │   │   │   ├── subprocess.cpython-312.pyc
│   │   │       │   │   │   │   ├── temp_dir.cpython-312.pyc
│   │   │       │   │   │   │   ├── unpacking.cpython-312.pyc
│   │   │       │   │   │   │   ├── urls.cpython-312.pyc
│   │   │       │   │   │   │   ├── virtualenv.cpython-312.pyc
│   │   │       │   │   │   │   └── wheel.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _jaraco_text.py
│   │   │       │   │   │   ├── _log.py
│   │   │       │   │   │   ├── appdirs.py
│   │   │       │   │   │   ├── compat.py
│   │   │       │   │   │   ├── compatibility_tags.py
│   │   │       │   │   │   ├── datetime.py
│   │   │       │   │   │   ├── deprecation.py
│   │   │       │   │   │   ├── direct_url_helpers.py
│   │   │       │   │   │   ├── egg_link.py
│   │   │       │   │   │   ├── entrypoints.py
│   │   │       │   │   │   ├── filesystem.py
│   │   │       │   │   │   ├── filetypes.py
│   │   │       │   │   │   ├── glibc.py
│   │   │       │   │   │   ├── hashes.py
│   │   │       │   │   │   ├── logging.py
│   │   │       │   │   │   ├── misc.py
│   │   │       │   │   │   ├── packaging.py
│   │   │       │   │   │   ├── retry.py
│   │   │       │   │   │   ├── subprocess.py
│   │   │       │   │   │   ├── temp_dir.py
│   │   │       │   │   │   ├── unpacking.py
│   │   │       │   │   │   ├── urls.py
│   │   │       │   │   │   ├── virtualenv.py
│   │   │       │   │   │   └── wheel.py
│   │   │       │   │   ├── vcs/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── bazaar.cpython-312.pyc
│   │   │       │   │   │   │   ├── git.cpython-312.pyc
│   │   │       │   │   │   │   ├── mercurial.cpython-312.pyc
│   │   │       │   │   │   │   ├── subversion.cpython-312.pyc
│   │   │       │   │   │   │   └── versioncontrol.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── bazaar.py
│   │   │       │   │   │   ├── git.py
│   │   │       │   │   │   ├── mercurial.py
│   │   │       │   │   │   ├── subversion.py
│   │   │       │   │   │   └── versioncontrol.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── build_env.py
│   │   │       │   │   ├── cache.py
│   │   │       │   │   ├── configuration.py
│   │   │       │   │   ├── exceptions.py
│   │   │       │   │   ├── main.py
│   │   │       │   │   ├── pyproject.py
│   │   │       │   │   ├── self_outdated_check.py
│   │   │       │   │   └── wheel_builder.py
│   │   │       │   ├── _vendor/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   ├── cachecontrol/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _cmd.cpython-312.pyc
│   │   │       │   │   │   │   ├── adapter.cpython-312.pyc
│   │   │       │   │   │   │   ├── cache.cpython-312.pyc
│   │   │       │   │   │   │   ├── controller.cpython-312.pyc
│   │   │       │   │   │   │   ├── filewrapper.cpython-312.pyc
│   │   │       │   │   │   │   ├── heuristics.cpython-312.pyc
│   │   │       │   │   │   │   ├── serialize.cpython-312.pyc
│   │   │       │   │   │   │   └── wrapper.cpython-312.pyc
│   │   │       │   │   │   ├── caches/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── file_cache.cpython-312.pyc
│   │   │       │   │   │   │   │   └── redis_cache.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── file_cache.py
│   │   │       │   │   │   │   └── redis_cache.py
│   │   │       │   │   │   ├── LICENSE.txt
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _cmd.py
│   │   │       │   │   │   ├── adapter.py
│   │   │       │   │   │   ├── cache.py
│   │   │       │   │   │   ├── controller.py
│   │   │       │   │   │   ├── filewrapper.py
│   │   │       │   │   │   ├── heuristics.py
│   │   │       │   │   │   ├── py.typed
│   │   │       │   │   │   ├── serialize.py
│   │   │       │   │   │   └── wrapper.py
│   │   │       │   │   ├── certifi/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   │   └── core.cpython-312.pyc
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── __main__.py
│   │   │       │   │   │   ├── cacert.pem
│   │   │       │   │   │   ├── core.py
│   │   │       │   │   │   └── py.typed
│   │   │       │   │   ├── dependency_groups/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _implementation.cpython-312.pyc
│   │   │       │   │   │   │   ├── _lint_dependency_groups.cpython-312.pyc
│   │   │       │   │   │   │   ├── _pip_wrapper.cpython-312.pyc
│   │   │       │   │   │   │   └── _toml_compat.cpython-312.pyc
│   │   │       │   │   │   ├── LICENSE.txt
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── __main__.py
│   │   │       │   │   │   ├── _implementation.py
│   │   │       │   │   │   ├── _lint_dependency_groups.py
│   │   │       │   │   │   ├── _pip_wrapper.py
│   │   │       │   │   │   ├── _toml_compat.py
│   │   │       │   │   │   └── py.typed
│   │   │       │   │   ├── distlib/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── compat.cpython-312.pyc
│   │   │       │   │   │   │   ├── resources.cpython-312.pyc
│   │   │       │   │   │   │   ├── scripts.cpython-312.pyc
│   │   │       │   │   │   │   └── util.cpython-312.pyc
│   │   │       │   │   │   ├── LICENSE.txt
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── compat.py
│   │   │       │   │   │   ├── resources.py
│   │   │       │   │   │   ├── scripts.py
│   │   │       │   │   │   ├── t32.exe
│   │   │       │   │   │   ├── t64-arm.exe
│   │   │       │   │   │   ├── t64.exe
│   │   │       │   │   │   ├── util.py
│   │   │       │   │   │   ├── w32.exe
│   │   │       │   │   │   ├── w64-arm.exe
│   │   │       │   │   │   └── w64.exe
│   │   │       │   │   ├── distro/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   │   └── distro.cpython-312.pyc
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── __main__.py
│   │   │       │   │   │   ├── distro.py
│   │   │       │   │   │   └── py.typed
│   │   │       │   │   ├── idna/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── codec.cpython-312.pyc
│   │   │       │   │   │   │   ├── compat.cpython-312.pyc
│   │   │       │   │   │   │   ├── core.cpython-312.pyc
│   │   │       │   │   │   │   ├── idnadata.cpython-312.pyc
│   │   │       │   │   │   │   ├── intranges.cpython-312.pyc
│   │   │       │   │   │   │   ├── package_data.cpython-312.pyc
│   │   │       │   │   │   │   └── uts46data.cpython-312.pyc
│   │   │       │   │   │   ├── LICENSE.md
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── codec.py
│   │   │       │   │   │   ├── compat.py
│   │   │       │   │   │   ├── core.py
│   │   │       │   │   │   ├── idnadata.py
│   │   │       │   │   │   ├── intranges.py
│   │   │       │   │   │   ├── package_data.py
│   │   │       │   │   │   ├── py.typed
│   │   │       │   │   │   └── uts46data.py
│   │   │       │   │   ├── msgpack/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── exceptions.cpython-312.pyc
│   │   │       │   │   │   │   ├── ext.cpython-312.pyc
│   │   │       │   │   │   │   └── fallback.cpython-312.pyc
│   │   │       │   │   │   ├── COPYING
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── exceptions.py
│   │   │       │   │   │   ├── ext.py
│   │   │       │   │   │   └── fallback.py
│   │   │       │   │   ├── packaging/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _elffile.cpython-312.pyc
│   │   │       │   │   │   │   ├── _manylinux.cpython-312.pyc
│   │   │       │   │   │   │   ├── _musllinux.cpython-312.pyc
│   │   │       │   │   │   │   ├── _parser.cpython-312.pyc
│   │   │       │   │   │   │   ├── _structures.cpython-312.pyc
│   │   │       │   │   │   │   ├── _tokenizer.cpython-312.pyc
│   │   │       │   │   │   │   ├── markers.cpython-312.pyc
│   │   │       │   │   │   │   ├── metadata.cpython-312.pyc
│   │   │       │   │   │   │   ├── requirements.cpython-312.pyc
│   │   │       │   │   │   │   ├── specifiers.cpython-312.pyc
│   │   │       │   │   │   │   ├── tags.cpython-312.pyc
│   │   │       │   │   │   │   ├── utils.cpython-312.pyc
│   │   │       │   │   │   │   └── version.cpython-312.pyc
│   │   │       │   │   │   ├── licenses/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── _spdx.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── _spdx.py
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── LICENSE.APACHE
│   │   │       │   │   │   ├── LICENSE.BSD
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _elffile.py
│   │   │       │   │   │   ├── _manylinux.py
│   │   │       │   │   │   ├── _musllinux.py
│   │   │       │   │   │   ├── _parser.py
│   │   │       │   │   │   ├── _structures.py
│   │   │       │   │   │   ├── _tokenizer.py
│   │   │       │   │   │   ├── markers.py
│   │   │       │   │   │   ├── metadata.py
│   │   │       │   │   │   ├── py.typed
│   │   │       │   │   │   ├── requirements.py
│   │   │       │   │   │   ├── specifiers.py
│   │   │       │   │   │   ├── tags.py
│   │   │       │   │   │   ├── utils.py
│   │   │       │   │   │   └── version.py
│   │   │       │   │   ├── pkg_resources/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── platformdirs/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   │   ├── android.cpython-312.pyc
│   │   │       │   │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   │   ├── macos.cpython-312.pyc
│   │   │       │   │   │   │   ├── unix.cpython-312.pyc
│   │   │       │   │   │   │   ├── version.cpython-312.pyc
│   │   │       │   │   │   │   └── windows.cpython-312.pyc
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── __main__.py
│   │   │       │   │   │   ├── android.py
│   │   │       │   │   │   ├── api.py
│   │   │       │   │   │   ├── macos.py
│   │   │       │   │   │   ├── py.typed
│   │   │       │   │   │   ├── unix.py
│   │   │       │   │   │   ├── version.py
│   │   │       │   │   │   └── windows.py
│   │   │       │   │   ├── pygments/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   │   ├── console.cpython-312.pyc
│   │   │       │   │   │   │   ├── filter.cpython-312.pyc
│   │   │       │   │   │   │   ├── formatter.cpython-312.pyc
│   │   │       │   │   │   │   ├── lexer.cpython-312.pyc
│   │   │       │   │   │   │   ├── modeline.cpython-312.pyc
│   │   │       │   │   │   │   ├── plugin.cpython-312.pyc
│   │   │       │   │   │   │   ├── regexopt.cpython-312.pyc
│   │   │       │   │   │   │   ├── scanner.cpython-312.pyc
│   │   │       │   │   │   │   ├── sphinxext.cpython-312.pyc
│   │   │       │   │   │   │   ├── style.cpython-312.pyc
│   │   │       │   │   │   │   ├── token.cpython-312.pyc
│   │   │       │   │   │   │   ├── unistring.cpython-312.pyc
│   │   │       │   │   │   │   └── util.cpython-312.pyc
│   │   │       │   │   │   ├── filters/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── __init__.py
│   │   │       │   │   │   ├── formatters/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── _mapping.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── _mapping.py
│   │   │       │   │   │   ├── lexers/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _mapping.cpython-312.pyc
│   │   │       │   │   │   │   │   └── python.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── _mapping.py
│   │   │       │   │   │   │   └── python.py
│   │   │       │   │   │   ├── styles/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── _mapping.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── _mapping.py
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── __main__.py
│   │   │       │   │   │   ├── console.py
│   │   │       │   │   │   ├── filter.py
│   │   │       │   │   │   ├── formatter.py
│   │   │       │   │   │   ├── lexer.py
│   │   │       │   │   │   ├── modeline.py
│   │   │       │   │   │   ├── plugin.py
│   │   │       │   │   │   ├── regexopt.py
│   │   │       │   │   │   ├── scanner.py
│   │   │       │   │   │   ├── sphinxext.py
│   │   │       │   │   │   ├── style.py
│   │   │       │   │   │   ├── token.py
│   │   │       │   │   │   ├── unistring.py
│   │   │       │   │   │   └── util.py
│   │   │       │   │   ├── pyproject_hooks/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── _impl.cpython-312.pyc
│   │   │       │   │   │   ├── _in_process/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── _in_process.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── _in_process.py
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _impl.py
│   │   │       │   │   │   └── py.typed
│   │   │       │   │   ├── requests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── __version__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _internal_utils.cpython-312.pyc
│   │   │       │   │   │   │   ├── adapters.cpython-312.pyc
│   │   │       │   │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   │   ├── auth.cpython-312.pyc
│   │   │       │   │   │   │   ├── certs.cpython-312.pyc
│   │   │       │   │   │   │   ├── compat.cpython-312.pyc
│   │   │       │   │   │   │   ├── cookies.cpython-312.pyc
│   │   │       │   │   │   │   ├── exceptions.cpython-312.pyc
│   │   │       │   │   │   │   ├── help.cpython-312.pyc
│   │   │       │   │   │   │   ├── hooks.cpython-312.pyc
│   │   │       │   │   │   │   ├── models.cpython-312.pyc
│   │   │       │   │   │   │   ├── packages.cpython-312.pyc
│   │   │       │   │   │   │   ├── sessions.cpython-312.pyc
│   │   │       │   │   │   │   ├── status_codes.cpython-312.pyc
│   │   │       │   │   │   │   ├── structures.cpython-312.pyc
│   │   │       │   │   │   │   └── utils.cpython-312.pyc
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── __version__.py
│   │   │       │   │   │   ├── _internal_utils.py
│   │   │       │   │   │   ├── adapters.py
│   │   │       │   │   │   ├── api.py
│   │   │       │   │   │   ├── auth.py
│   │   │       │   │   │   ├── certs.py
│   │   │       │   │   │   ├── compat.py
│   │   │       │   │   │   ├── cookies.py
│   │   │       │   │   │   ├── exceptions.py
│   │   │       │   │   │   ├── help.py
│   │   │       │   │   │   ├── hooks.py
│   │   │       │   │   │   ├── models.py
│   │   │       │   │   │   ├── packages.py
│   │   │       │   │   │   ├── sessions.py
│   │   │       │   │   │   ├── status_codes.py
│   │   │       │   │   │   ├── structures.py
│   │   │       │   │   │   └── utils.py
│   │   │       │   │   ├── resolvelib/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── providers.cpython-312.pyc
│   │   │       │   │   │   │   ├── reporters.cpython-312.pyc
│   │   │       │   │   │   │   └── structs.cpython-312.pyc
│   │   │       │   │   │   ├── resolvers/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── abstract.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── criterion.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── exceptions.cpython-312.pyc
│   │   │       │   │   │   │   │   └── resolution.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── abstract.py
│   │   │       │   │   │   │   ├── criterion.py
│   │   │       │   │   │   │   ├── exceptions.py
│   │   │       │   │   │   │   └── resolution.py
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── providers.py
│   │   │       │   │   │   ├── py.typed
│   │   │       │   │   │   ├── reporters.py
│   │   │       │   │   │   └── structs.py
│   │   │       │   │   ├── rich/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _cell_widths.cpython-312.pyc
│   │   │       │   │   │   │   ├── _emoji_codes.cpython-312.pyc
│   │   │       │   │   │   │   ├── _emoji_replace.cpython-312.pyc
│   │   │       │   │   │   │   ├── _export_format.cpython-312.pyc
│   │   │       │   │   │   │   ├── _extension.cpython-312.pyc
│   │   │       │   │   │   │   ├── _fileno.cpython-312.pyc
│   │   │       │   │   │   │   ├── _inspect.cpython-312.pyc
│   │   │       │   │   │   │   ├── _log_render.cpython-312.pyc
│   │   │       │   │   │   │   ├── _loop.cpython-312.pyc
│   │   │       │   │   │   │   ├── _null_file.cpython-312.pyc
│   │   │       │   │   │   │   ├── _palettes.cpython-312.pyc
│   │   │       │   │   │   │   ├── _pick.cpython-312.pyc
│   │   │       │   │   │   │   ├── _ratio.cpython-312.pyc
│   │   │       │   │   │   │   ├── _spinners.cpython-312.pyc
│   │   │       │   │   │   │   ├── _stack.cpython-312.pyc
│   │   │       │   │   │   │   ├── _timer.cpython-312.pyc
│   │   │       │   │   │   │   ├── _win32_console.cpython-312.pyc
│   │   │       │   │   │   │   ├── _windows.cpython-312.pyc
│   │   │       │   │   │   │   ├── _windows_renderer.cpython-312.pyc
│   │   │       │   │   │   │   ├── _wrap.cpython-312.pyc
│   │   │       │   │   │   │   ├── abc.cpython-312.pyc
│   │   │       │   │   │   │   ├── align.cpython-312.pyc
│   │   │       │   │   │   │   ├── ansi.cpython-312.pyc
│   │   │       │   │   │   │   ├── bar.cpython-312.pyc
│   │   │       │   │   │   │   ├── box.cpython-312.pyc
│   │   │       │   │   │   │   ├── cells.cpython-312.pyc
│   │   │       │   │   │   │   ├── color.cpython-312.pyc
│   │   │       │   │   │   │   ├── color_triplet.cpython-312.pyc
│   │   │       │   │   │   │   ├── columns.cpython-312.pyc
│   │   │       │   │   │   │   ├── console.cpython-312.pyc
│   │   │       │   │   │   │   ├── constrain.cpython-312.pyc
│   │   │       │   │   │   │   ├── containers.cpython-312.pyc
│   │   │       │   │   │   │   ├── control.cpython-312.pyc
│   │   │       │   │   │   │   ├── default_styles.cpython-312.pyc
│   │   │       │   │   │   │   ├── diagnose.cpython-312.pyc
│   │   │       │   │   │   │   ├── emoji.cpython-312.pyc
│   │   │       │   │   │   │   ├── errors.cpython-312.pyc
│   │   │       │   │   │   │   ├── file_proxy.cpython-312.pyc
│   │   │       │   │   │   │   ├── filesize.cpython-312.pyc
│   │   │       │   │   │   │   ├── highlighter.cpython-312.pyc
│   │   │       │   │   │   │   ├── json.cpython-312.pyc
│   │   │       │   │   │   │   ├── jupyter.cpython-312.pyc
│   │   │       │   │   │   │   ├── layout.cpython-312.pyc
│   │   │       │   │   │   │   ├── live.cpython-312.pyc
│   │   │       │   │   │   │   ├── live_render.cpython-312.pyc
│   │   │       │   │   │   │   ├── logging.cpython-312.pyc
│   │   │       │   │   │   │   ├── markup.cpython-312.pyc
│   │   │       │   │   │   │   ├── measure.cpython-312.pyc
│   │   │       │   │   │   │   ├── padding.cpython-312.pyc
│   │   │       │   │   │   │   ├── pager.cpython-312.pyc
│   │   │       │   │   │   │   ├── palette.cpython-312.pyc
│   │   │       │   │   │   │   ├── panel.cpython-312.pyc
│   │   │       │   │   │   │   ├── pretty.cpython-312.pyc
│   │   │       │   │   │   │   ├── progress.cpython-312.pyc
│   │   │       │   │   │   │   ├── progress_bar.cpython-312.pyc
│   │   │       │   │   │   │   ├── prompt.cpython-312.pyc
│   │   │       │   │   │   │   ├── protocol.cpython-312.pyc
│   │   │       │   │   │   │   ├── region.cpython-312.pyc
│   │   │       │   │   │   │   ├── repr.cpython-312.pyc
│   │   │       │   │   │   │   ├── rule.cpython-312.pyc
│   │   │       │   │   │   │   ├── scope.cpython-312.pyc
│   │   │       │   │   │   │   ├── screen.cpython-312.pyc
│   │   │       │   │   │   │   ├── segment.cpython-312.pyc
│   │   │       │   │   │   │   ├── spinner.cpython-312.pyc
│   │   │       │   │   │   │   ├── status.cpython-312.pyc
│   │   │       │   │   │   │   ├── style.cpython-312.pyc
│   │   │       │   │   │   │   ├── styled.cpython-312.pyc
│   │   │       │   │   │   │   ├── syntax.cpython-312.pyc
│   │   │       │   │   │   │   ├── table.cpython-312.pyc
│   │   │       │   │   │   │   ├── terminal_theme.cpython-312.pyc
│   │   │       │   │   │   │   ├── text.cpython-312.pyc
│   │   │       │   │   │   │   ├── theme.cpython-312.pyc
│   │   │       │   │   │   │   ├── themes.cpython-312.pyc
│   │   │       │   │   │   │   ├── traceback.cpython-312.pyc
│   │   │       │   │   │   │   └── tree.cpython-312.pyc
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── __main__.py
│   │   │       │   │   │   ├── _cell_widths.py
│   │   │       │   │   │   ├── _emoji_codes.py
│   │   │       │   │   │   ├── _emoji_replace.py
│   │   │       │   │   │   ├── _export_format.py
│   │   │       │   │   │   ├── _extension.py
│   │   │       │   │   │   ├── _fileno.py
│   │   │       │   │   │   ├── _inspect.py
│   │   │       │   │   │   ├── _log_render.py
│   │   │       │   │   │   ├── _loop.py
│   │   │       │   │   │   ├── _null_file.py
│   │   │       │   │   │   ├── _palettes.py
│   │   │       │   │   │   ├── _pick.py
│   │   │       │   │   │   ├── _ratio.py
│   │   │       │   │   │   ├── _spinners.py
│   │   │       │   │   │   ├── _stack.py
│   │   │       │   │   │   ├── _timer.py
│   │   │       │   │   │   ├── _win32_console.py
│   │   │       │   │   │   ├── _windows.py
│   │   │       │   │   │   ├── _windows_renderer.py
│   │   │       │   │   │   ├── _wrap.py
│   │   │       │   │   │   ├── abc.py
│   │   │       │   │   │   ├── align.py
│   │   │       │   │   │   ├── ansi.py
│   │   │       │   │   │   ├── bar.py
│   │   │       │   │   │   ├── box.py
│   │   │       │   │   │   ├── cells.py
│   │   │       │   │   │   ├── color.py
│   │   │       │   │   │   ├── color_triplet.py
│   │   │       │   │   │   ├── columns.py
│   │   │       │   │   │   ├── console.py
│   │   │       │   │   │   ├── constrain.py
│   │   │       │   │   │   ├── containers.py
│   │   │       │   │   │   ├── control.py
│   │   │       │   │   │   ├── default_styles.py
│   │   │       │   │   │   ├── diagnose.py
│   │   │       │   │   │   ├── emoji.py
│   │   │       │   │   │   ├── errors.py
│   │   │       │   │   │   ├── file_proxy.py
│   │   │       │   │   │   ├── filesize.py
│   │   │       │   │   │   ├── highlighter.py
│   │   │       │   │   │   ├── json.py
│   │   │       │   │   │   ├── jupyter.py
│   │   │       │   │   │   ├── layout.py
│   │   │       │   │   │   ├── live.py
│   │   │       │   │   │   ├── live_render.py
│   │   │       │   │   │   ├── logging.py
│   │   │       │   │   │   ├── markup.py
│   │   │       │   │   │   ├── measure.py
│   │   │       │   │   │   ├── padding.py
│   │   │       │   │   │   ├── pager.py
│   │   │       │   │   │   ├── palette.py
│   │   │       │   │   │   ├── panel.py
│   │   │       │   │   │   ├── pretty.py
│   │   │       │   │   │   ├── progress.py
│   │   │       │   │   │   ├── progress_bar.py
│   │   │       │   │   │   ├── prompt.py
│   │   │       │   │   │   ├── protocol.py
│   │   │       │   │   │   ├── py.typed
│   │   │       │   │   │   ├── region.py
│   │   │       │   │   │   ├── repr.py
│   │   │       │   │   │   ├── rule.py
│   │   │       │   │   │   ├── scope.py
│   │   │       │   │   │   ├── screen.py
│   │   │       │   │   │   ├── segment.py
│   │   │       │   │   │   ├── spinner.py
│   │   │       │   │   │   ├── status.py
│   │   │       │   │   │   ├── style.py
│   │   │       │   │   │   ├── styled.py
│   │   │       │   │   │   ├── syntax.py
│   │   │       │   │   │   ├── table.py
│   │   │       │   │   │   ├── terminal_theme.py
│   │   │       │   │   │   ├── text.py
│   │   │       │   │   │   ├── theme.py
│   │   │       │   │   │   ├── themes.py
│   │   │       │   │   │   ├── traceback.py
│   │   │       │   │   │   └── tree.py
│   │   │       │   │   ├── tomli/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _parser.cpython-312.pyc
│   │   │       │   │   │   │   ├── _re.cpython-312.pyc
│   │   │       │   │   │   │   └── _types.cpython-312.pyc
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _parser.py
│   │   │       │   │   │   ├── _re.py
│   │   │       │   │   │   ├── _types.py
│   │   │       │   │   │   └── py.typed
│   │   │       │   │   ├── tomli_w/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── _writer.cpython-312.pyc
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _writer.py
│   │   │       │   │   │   └── py.typed
│   │   │       │   │   ├── truststore/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _api.cpython-312.pyc
│   │   │       │   │   │   │   ├── _macos.cpython-312.pyc
│   │   │       │   │   │   │   ├── _openssl.cpython-312.pyc
│   │   │       │   │   │   │   ├── _ssl_constants.cpython-312.pyc
│   │   │       │   │   │   │   └── _windows.cpython-312.pyc
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _api.py
│   │   │       │   │   │   ├── _macos.py
│   │   │       │   │   │   ├── _openssl.py
│   │   │       │   │   │   ├── _ssl_constants.py
│   │   │       │   │   │   ├── _windows.py
│   │   │       │   │   │   └── py.typed
│   │   │       │   │   ├── urllib3/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _collections.cpython-312.pyc
│   │   │       │   │   │   │   ├── _version.cpython-312.pyc
│   │   │       │   │   │   │   ├── connection.cpython-312.pyc
│   │   │       │   │   │   │   ├── connectionpool.cpython-312.pyc
│   │   │       │   │   │   │   ├── exceptions.cpython-312.pyc
│   │   │       │   │   │   │   ├── fields.cpython-312.pyc
│   │   │       │   │   │   │   ├── filepost.cpython-312.pyc
│   │   │       │   │   │   │   ├── poolmanager.cpython-312.pyc
│   │   │       │   │   │   │   ├── request.cpython-312.pyc
│   │   │       │   │   │   │   └── response.cpython-312.pyc
│   │   │       │   │   │   ├── contrib/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _appengine_environ.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── appengine.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── ntlmpool.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── pyopenssl.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── securetransport.cpython-312.pyc
│   │   │       │   │   │   │   │   └── socks.cpython-312.pyc
│   │   │       │   │   │   │   ├── _securetransport/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── bindings.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── low_level.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── bindings.py
│   │   │       │   │   │   │   │   └── low_level.py
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── _appengine_environ.py
│   │   │       │   │   │   │   ├── appengine.py
│   │   │       │   │   │   │   ├── ntlmpool.py
│   │   │       │   │   │   │   ├── pyopenssl.py
│   │   │       │   │   │   │   ├── securetransport.py
│   │   │       │   │   │   │   └── socks.py
│   │   │       │   │   │   ├── packages/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── six.cpython-312.pyc
│   │   │       │   │   │   │   ├── backports/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── makefile.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── weakref_finalize.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── makefile.py
│   │   │       │   │   │   │   │   └── weakref_finalize.py
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── six.py
│   │   │       │   │   │   ├── util/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── connection.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── proxy.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── queue.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── request.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── response.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── retry.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── ssl_.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── ssl_match_hostname.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── ssltransport.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── timeout.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── url.cpython-312.pyc
│   │   │       │   │   │   │   │   └── wait.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── connection.py
│   │   │       │   │   │   │   ├── proxy.py
│   │   │       │   │   │   │   ├── queue.py
│   │   │       │   │   │   │   ├── request.py
│   │   │       │   │   │   │   ├── response.py
│   │   │       │   │   │   │   ├── retry.py
│   │   │       │   │   │   │   ├── ssl_.py
│   │   │       │   │   │   │   ├── ssl_match_hostname.py
│   │   │       │   │   │   │   ├── ssltransport.py
│   │   │       │   │   │   │   ├── timeout.py
│   │   │       │   │   │   │   ├── url.py
│   │   │       │   │   │   │   └── wait.py
│   │   │       │   │   │   ├── LICENSE.txt
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _collections.py
│   │   │       │   │   │   ├── _version.py
│   │   │       │   │   │   ├── connection.py
│   │   │       │   │   │   ├── connectionpool.py
│   │   │       │   │   │   ├── exceptions.py
│   │   │       │   │   │   ├── fields.py
│   │   │       │   │   │   ├── filepost.py
│   │   │       │   │   │   ├── poolmanager.py
│   │   │       │   │   │   ├── request.py
│   │   │       │   │   │   └── response.py
│   │   │       │   │   ├── README.rst
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   └── vendor.txt
│   │   │       │   ├── __init__.py
│   │   │       │   ├── __main__.py
│   │   │       │   ├── __pip-runner__.py
│   │   │       │   └── py.typed
│   │   │       ├── pip-25.3.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   ├── src/
│   │   │       │   │   │   ├── pip/
│   │   │       │   │   │       ├── _vendor/
│   │   │       │   │   │           ├── cachecontrol/
│   │   │       │   │   │           │   └── LICENSE.txt
│   │   │       │   │   │           ├── certifi/
│   │   │       │   │   │           │   └── LICENSE
│   │   │       │   │   │           ├── dependency_groups/
│   │   │       │   │   │           │   └── LICENSE.txt
│   │   │       │   │   │           ├── distlib/
│   │   │       │   │   │           │   └── LICENSE.txt
│   │   │       │   │   │           ├── distro/
│   │   │       │   │   │           │   └── LICENSE
│   │   │       │   │   │           ├── idna/
│   │   │       │   │   │           │   └── LICENSE.md
│   │   │       │   │   │           ├── msgpack/
│   │   │       │   │   │           │   └── COPYING
│   │   │       │   │   │           ├── packaging/
│   │   │       │   │   │           │   ├── LICENSE
│   │   │       │   │   │           │   ├── LICENSE.APACHE
│   │   │       │   │   │           │   └── LICENSE.BSD
│   │   │       │   │   │           ├── pkg_resources/
│   │   │       │   │   │           │   └── LICENSE
│   │   │       │   │   │           ├── platformdirs/
│   │   │       │   │   │           │   └── LICENSE
│   │   │       │   │   │           ├── pygments/
│   │   │       │   │   │           │   └── LICENSE
│   │   │       │   │   │           ├── pyproject_hooks/
│   │   │       │   │   │           │   └── LICENSE
│   │   │       │   │   │           ├── requests/
│   │   │       │   │   │           │   └── LICENSE
│   │   │       │   │   │           ├── resolvelib/
│   │   │       │   │   │           │   └── LICENSE
│   │   │       │   │   │           ├── rich/
│   │   │       │   │   │           │   └── LICENSE
│   │   │       │   │   │           ├── tomli/
│   │   │       │   │   │           │   └── LICENSE
│   │   │       │   │   │           ├── tomli_w/
│   │   │       │   │   │           │   └── LICENSE
│   │   │       │   │   │           ├── truststore/
│   │   │       │   │   │           │   └── LICENSE
│   │   │       │   │   │           ├── urllib3/
│   │   │       │   │   │               └── LICENSE.txt
│   │   │       │   │   ├── AUTHORS.txt
│   │   │       │   │   └── LICENSE.txt
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── REQUESTED
│   │   │       │   ├── WHEEL
│   │   │       │   └── entry_points.txt
│   │   │       ├── pkg_resources/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   └── __init__.cpython-312.pyc
│   │   │       │   ├── tests/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── test_find_distributions.cpython-312.pyc
│   │   │       │   │   │   ├── test_integration_zope_interface.cpython-312.pyc
│   │   │       │   │   │   ├── test_markers.cpython-312.pyc
│   │   │       │   │   │   ├── test_pkg_resources.cpython-312.pyc
│   │   │       │   │   │   ├── test_resources.cpython-312.pyc
│   │   │       │   │   │   └── test_working_set.cpython-312.pyc
│   │   │       │   │   ├── data/
│   │   │       │   │   │   ├── my-test-package-source/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   └── setup.cpython-312.pyc
│   │   │       │   │   │   │   ├── setup.cfg
│   │   │       │   │   │   │   └── setup.py
│   │   │       │   │   │   ├── my-test-package-zip/
│   │   │       │   │   │   │   └── my-test-package.zip
│   │   │       │   │   │   ├── my-test-package_unpacked-egg/
│   │   │       │   │   │   │   ├── my_test_package-1.0-py3.7.egg/
│   │   │       │   │   │   │       ├── EGG-INFO/
│   │   │       │   │   │   │           ├── PKG-INFO
│   │   │       │   │   │   │           ├── SOURCES.txt
│   │   │       │   │   │   │           ├── dependency_links.txt
│   │   │       │   │   │   │           ├── top_level.txt
│   │   │       │   │   │   │           └── zip-safe
│   │   │       │   │   │   ├── my-test-package_zipped-egg/
│   │   │       │   │   │       └── my_test_package-1.0-py3.7.egg
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── test_find_distributions.py
│   │   │       │   │   ├── test_integration_zope_interface.py
│   │   │       │   │   ├── test_markers.py
│   │   │       │   │   ├── test_pkg_resources.py
│   │   │       │   │   ├── test_resources.py
│   │   │       │   │   └── test_working_set.py
│   │   │       │   ├── __init__.py
│   │   │       │   ├── api_tests.txt
│   │   │       │   └── py.typed
│   │   │       ├── pydantic/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── _migration.cpython-312.pyc
│   │   │       │   │   ├── alias_generators.cpython-312.pyc
│   │   │       │   │   ├── aliases.cpython-312.pyc
│   │   │       │   │   ├── annotated_handlers.cpython-312.pyc
│   │   │       │   │   ├── class_validators.cpython-312.pyc
│   │   │       │   │   ├── color.cpython-312.pyc
│   │   │       │   │   ├── config.cpython-312.pyc
│   │   │       │   │   ├── dataclasses.cpython-312.pyc
│   │   │       │   │   ├── datetime_parse.cpython-312.pyc
│   │   │       │   │   ├── decorator.cpython-312.pyc
│   │   │       │   │   ├── env_settings.cpython-312.pyc
│   │   │       │   │   ├── error_wrappers.cpython-312.pyc
│   │   │       │   │   ├── errors.cpython-312.pyc
│   │   │       │   │   ├── fields.cpython-312.pyc
│   │   │       │   │   ├── functional_serializers.cpython-312.pyc
│   │   │       │   │   ├── functional_validators.cpython-312.pyc
│   │   │       │   │   ├── generics.cpython-312.pyc
│   │   │       │   │   ├── json.cpython-312.pyc
│   │   │       │   │   ├── json_schema.cpython-312.pyc
│   │   │       │   │   ├── main.cpython-312.pyc
│   │   │       │   │   ├── mypy.cpython-312.pyc
│   │   │       │   │   ├── networks.cpython-312.pyc
│   │   │       │   │   ├── parse.cpython-312.pyc
│   │   │       │   │   ├── root_model.cpython-312.pyc
│   │   │       │   │   ├── schema.cpython-312.pyc
│   │   │       │   │   ├── tools.cpython-312.pyc
│   │   │       │   │   ├── type_adapter.cpython-312.pyc
│   │   │       │   │   ├── types.cpython-312.pyc
│   │   │       │   │   ├── typing.cpython-312.pyc
│   │   │       │   │   ├── utils.cpython-312.pyc
│   │   │       │   │   ├── validate_call_decorator.cpython-312.pyc
│   │   │       │   │   ├── validators.cpython-312.pyc
│   │   │       │   │   ├── version.cpython-312.pyc
│   │   │       │   │   └── warnings.cpython-312.pyc
│   │   │       │   ├── _internal/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _config.cpython-312.pyc
│   │   │       │   │   │   ├── _core_metadata.cpython-312.pyc
│   │   │       │   │   │   ├── _core_utils.cpython-312.pyc
│   │   │       │   │   │   ├── _dataclasses.cpython-312.pyc
│   │   │       │   │   │   ├── _decorators.cpython-312.pyc
│   │   │       │   │   │   ├── _decorators_v1.cpython-312.pyc
│   │   │       │   │   │   ├── _discriminated_union.cpython-312.pyc
│   │   │       │   │   │   ├── _docs_extraction.cpython-312.pyc
│   │   │       │   │   │   ├── _fields.cpython-312.pyc
│   │   │       │   │   │   ├── _forward_ref.cpython-312.pyc
│   │   │       │   │   │   ├── _generate_schema.cpython-312.pyc
│   │   │       │   │   │   ├── _generics.cpython-312.pyc
│   │   │       │   │   │   ├── _git.cpython-312.pyc
│   │   │       │   │   │   ├── _import_utils.cpython-312.pyc
│   │   │       │   │   │   ├── _internal_dataclass.cpython-312.pyc
│   │   │       │   │   │   ├── _known_annotated_metadata.cpython-312.pyc
│   │   │       │   │   │   ├── _mock_val_ser.cpython-312.pyc
│   │   │       │   │   │   ├── _model_construction.cpython-312.pyc
│   │   │       │   │   │   ├── _namespace_utils.cpython-312.pyc
│   │   │       │   │   │   ├── _repr.cpython-312.pyc
│   │   │       │   │   │   ├── _schema_gather.cpython-312.pyc
│   │   │       │   │   │   ├── _schema_generation_shared.cpython-312.pyc
│   │   │       │   │   │   ├── _serializers.cpython-312.pyc
│   │   │       │   │   │   ├── _signature.cpython-312.pyc
│   │   │       │   │   │   ├── _typing_extra.cpython-312.pyc
│   │   │       │   │   │   ├── _utils.cpython-312.pyc
│   │   │       │   │   │   ├── _validate_call.cpython-312.pyc
│   │   │       │   │   │   └── _validators.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _config.py
│   │   │       │   │   ├── _core_metadata.py
│   │   │       │   │   ├── _core_utils.py
│   │   │       │   │   ├── _dataclasses.py
│   │   │       │   │   ├── _decorators.py
│   │   │       │   │   ├── _decorators_v1.py
│   │   │       │   │   ├── _discriminated_union.py
│   │   │       │   │   ├── _docs_extraction.py
│   │   │       │   │   ├── _fields.py
│   │   │       │   │   ├── _forward_ref.py
│   │   │       │   │   ├── _generate_schema.py
│   │   │       │   │   ├── _generics.py
│   │   │       │   │   ├── _git.py
│   │   │       │   │   ├── _import_utils.py
│   │   │       │   │   ├── _internal_dataclass.py
│   │   │       │   │   ├── _known_annotated_metadata.py
│   │   │       │   │   ├── _mock_val_ser.py
│   │   │       │   │   ├── _model_construction.py
│   │   │       │   │   ├── _namespace_utils.py
│   │   │       │   │   ├── _repr.py
│   │   │       │   │   ├── _schema_gather.py
│   │   │       │   │   ├── _schema_generation_shared.py
│   │   │       │   │   ├── _serializers.py
│   │   │       │   │   ├── _signature.py
│   │   │       │   │   ├── _typing_extra.py
│   │   │       │   │   ├── _utils.py
│   │   │       │   │   ├── _validate_call.py
│   │   │       │   │   └── _validators.py
│   │   │       │   ├── deprecated/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── class_validators.cpython-312.pyc
│   │   │       │   │   │   ├── config.cpython-312.pyc
│   │   │       │   │   │   ├── copy_internals.cpython-312.pyc
│   │   │       │   │   │   ├── decorator.cpython-312.pyc
│   │   │       │   │   │   ├── json.cpython-312.pyc
│   │   │       │   │   │   ├── parse.cpython-312.pyc
│   │   │       │   │   │   └── tools.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── class_validators.py
│   │   │       │   │   ├── config.py
│   │   │       │   │   ├── copy_internals.py
│   │   │       │   │   ├── decorator.py
│   │   │       │   │   ├── json.py
│   │   │       │   │   ├── parse.py
│   │   │       │   │   └── tools.py
│   │   │       │   ├── experimental/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── arguments_schema.cpython-312.pyc
│   │   │       │   │   │   ├── missing_sentinel.cpython-312.pyc
│   │   │       │   │   │   └── pipeline.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── arguments_schema.py
│   │   │       │   │   ├── missing_sentinel.py
│   │   │       │   │   └── pipeline.py
│   │   │       │   ├── plugin/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _loader.cpython-312.pyc
│   │   │       │   │   │   └── _schema_validator.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _loader.py
│   │   │       │   │   └── _schema_validator.py
│   │   │       │   ├── v1/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _hypothesis_plugin.cpython-312.pyc
│   │   │       │   │   │   ├── annotated_types.cpython-312.pyc
│   │   │       │   │   │   ├── class_validators.cpython-312.pyc
│   │   │       │   │   │   ├── color.cpython-312.pyc
│   │   │       │   │   │   ├── config.cpython-312.pyc
│   │   │       │   │   │   ├── dataclasses.cpython-312.pyc
│   │   │       │   │   │   ├── datetime_parse.cpython-312.pyc
│   │   │       │   │   │   ├── decorator.cpython-312.pyc
│   │   │       │   │   │   ├── env_settings.cpython-312.pyc
│   │   │       │   │   │   ├── error_wrappers.cpython-312.pyc
│   │   │       │   │   │   ├── errors.cpython-312.pyc
│   │   │       │   │   │   ├── fields.cpython-312.pyc
│   │   │       │   │   │   ├── generics.cpython-312.pyc
│   │   │       │   │   │   ├── json.cpython-312.pyc
│   │   │       │   │   │   ├── main.cpython-312.pyc
│   │   │       │   │   │   ├── mypy.cpython-312.pyc
│   │   │       │   │   │   ├── networks.cpython-312.pyc
│   │   │       │   │   │   ├── parse.cpython-312.pyc
│   │   │       │   │   │   ├── schema.cpython-312.pyc
│   │   │       │   │   │   ├── tools.cpython-312.pyc
│   │   │       │   │   │   ├── types.cpython-312.pyc
│   │   │       │   │   │   ├── typing.cpython-312.pyc
│   │   │       │   │   │   ├── utils.cpython-312.pyc
│   │   │       │   │   │   ├── validators.cpython-312.pyc
│   │   │       │   │   │   └── version.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _hypothesis_plugin.py
│   │   │       │   │   ├── annotated_types.py
│   │   │       │   │   ├── class_validators.py
│   │   │       │   │   ├── color.py
│   │   │       │   │   ├── config.py
│   │   │       │   │   ├── dataclasses.py
│   │   │       │   │   ├── datetime_parse.py
│   │   │       │   │   ├── decorator.py
│   │   │       │   │   ├── env_settings.py
│   │   │       │   │   ├── error_wrappers.py
│   │   │       │   │   ├── errors.py
│   │   │       │   │   ├── fields.py
│   │   │       │   │   ├── generics.py
│   │   │       │   │   ├── json.py
│   │   │       │   │   ├── main.py
│   │   │       │   │   ├── mypy.py
│   │   │       │   │   ├── networks.py
│   │   │       │   │   ├── parse.py
│   │   │       │   │   ├── py.typed
│   │   │       │   │   ├── schema.py
│   │   │       │   │   ├── tools.py
│   │   │       │   │   ├── types.py
│   │   │       │   │   ├── typing.py
│   │   │       │   │   ├── utils.py
│   │   │       │   │   ├── validators.py
│   │   │       │   │   └── version.py
│   │   │       │   ├── __init__.py
│   │   │       │   ├── _migration.py
│   │   │       │   ├── alias_generators.py
│   │   │       │   ├── aliases.py
│   │   │       │   ├── annotated_handlers.py
│   │   │       │   ├── class_validators.py
│   │   │       │   ├── color.py
│   │   │       │   ├── config.py
│   │   │       │   ├── dataclasses.py
│   │   │       │   ├── datetime_parse.py
│   │   │       │   ├── decorator.py
│   │   │       │   ├── env_settings.py
│   │   │       │   ├── error_wrappers.py
│   │   │       │   ├── errors.py
│   │   │       │   ├── fields.py
│   │   │       │   ├── functional_serializers.py
│   │   │       │   ├── functional_validators.py
│   │   │       │   ├── generics.py
│   │   │       │   ├── json.py
│   │   │       │   ├── json_schema.py
│   │   │       │   ├── main.py
│   │   │       │   ├── mypy.py
│   │   │       │   ├── networks.py
│   │   │       │   ├── parse.py
│   │   │       │   ├── py.typed
│   │   │       │   ├── root_model.py
│   │   │       │   ├── schema.py
│   │   │       │   ├── tools.py
│   │   │       │   ├── type_adapter.py
│   │   │       │   ├── types.py
│   │   │       │   ├── typing.py
│   │   │       │   ├── utils.py
│   │   │       │   ├── validate_call_decorator.py
│   │   │       │   ├── validators.py
│   │   │       │   ├── version.py
│   │   │       │   └── warnings.py
│   │   │       ├── pydantic-2.12.5.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   └── WHEEL
│   │   │       ├── pydantic_core/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   └── core_schema.cpython-312.pyc
│   │   │       │   ├── __init__.py
│   │   │       │   ├── _pydantic_core.cp312-win_amd64.pyd
│   │   │       │   ├── _pydantic_core.pyi
│   │   │       │   ├── core_schema.py
│   │   │       │   └── py.typed
│   │   │       ├── pydantic_core-2.41.5.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   └── WHEEL
│   │   │       ├── pyparsing/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── actions.cpython-312.pyc
│   │   │       │   │   ├── common.cpython-312.pyc
│   │   │       │   │   ├── core.cpython-312.pyc
│   │   │       │   │   ├── exceptions.cpython-312.pyc
│   │   │       │   │   ├── helpers.cpython-312.pyc
│   │   │       │   │   ├── results.cpython-312.pyc
│   │   │       │   │   ├── testing.cpython-312.pyc
│   │   │       │   │   ├── unicode.cpython-312.pyc
│   │   │       │   │   └── util.cpython-312.pyc
│   │   │       │   ├── ai/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   ├── show_best_practices/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── __main__.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── __main__.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   └── best_practices.md
│   │   │       │   ├── diagram/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   └── __init__.py
│   │   │       │   ├── tools/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   └── cvt_pyparsing_pep8_names.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   └── cvt_pyparsing_pep8_names.py
│   │   │       │   ├── __init__.py
│   │   │       │   ├── actions.py
│   │   │       │   ├── common.py
│   │   │       │   ├── core.py
│   │   │       │   ├── exceptions.py
│   │   │       │   ├── helpers.py
│   │   │       │   ├── py.typed
│   │   │       │   ├── results.py
│   │   │       │   ├── testing.py
│   │   │       │   ├── unicode.py
│   │   │       │   └── util.py
│   │   │       ├── pyparsing-3.3.1.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   └── WHEEL
│   │   │       ├── python_dateutil-2.9.0.post0.dist-info/
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── LICENSE
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── WHEEL
│   │   │       │   ├── top_level.txt
│   │   │       │   └── zip-safe
│   │   │       ├── pytz/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── exceptions.cpython-312.pyc
│   │   │       │   │   ├── lazy.cpython-312.pyc
│   │   │       │   │   ├── reference.cpython-312.pyc
│   │   │       │   │   ├── tzfile.cpython-312.pyc
│   │   │       │   │   └── tzinfo.cpython-312.pyc
│   │   │       │   ├── zoneinfo/
│   │   │       │   │   ├── Africa/
│   │   │       │   │   │   ├── Abidjan
│   │   │       │   │   │   ├── Accra
│   │   │       │   │   │   ├── Addis_Ababa
│   │   │       │   │   │   ├── Algiers
│   │   │       │   │   │   ├── Asmara
│   │   │       │   │   │   ├── Asmera
│   │   │       │   │   │   ├── Bamako
│   │   │       │   │   │   ├── Bangui
│   │   │       │   │   │   ├── Banjul
│   │   │       │   │   │   ├── Bissau
│   │   │       │   │   │   ├── Blantyre
│   │   │       │   │   │   ├── Brazzaville
│   │   │       │   │   │   ├── Bujumbura
│   │   │       │   │   │   ├── Cairo
│   │   │       │   │   │   ├── Casablanca
│   │   │       │   │   │   ├── Ceuta
│   │   │       │   │   │   ├── Conakry
│   │   │       │   │   │   ├── Dakar
│   │   │       │   │   │   ├── Dar_es_Salaam
│   │   │       │   │   │   ├── Djibouti
│   │   │       │   │   │   ├── Douala
│   │   │       │   │   │   ├── El_Aaiun
│   │   │       │   │   │   ├── Freetown
│   │   │       │   │   │   ├── Gaborone
│   │   │       │   │   │   ├── Harare
│   │   │       │   │   │   ├── Johannesburg
│   │   │       │   │   │   ├── Juba
│   │   │       │   │   │   ├── Kampala
│   │   │       │   │   │   ├── Khartoum
│   │   │       │   │   │   ├── Kigali
│   │   │       │   │   │   ├── Kinshasa
│   │   │       │   │   │   ├── Lagos
│   │   │       │   │   │   ├── Libreville
│   │   │       │   │   │   ├── Lome
│   │   │       │   │   │   ├── Luanda
│   │   │       │   │   │   ├── Lubumbashi
│   │   │       │   │   │   ├── Lusaka
│   │   │       │   │   │   ├── Malabo
│   │   │       │   │   │   ├── Maputo
│   │   │       │   │   │   ├── Maseru
│   │   │       │   │   │   ├── Mbabane
│   │   │       │   │   │   ├── Mogadishu
│   │   │       │   │   │   ├── Monrovia
│   │   │       │   │   │   ├── Nairobi
│   │   │       │   │   │   ├── Ndjamena
│   │   │       │   │   │   ├── Niamey
│   │   │       │   │   │   ├── Nouakchott
│   │   │       │   │   │   ├── Ouagadougou
│   │   │       │   │   │   ├── Porto-Novo
│   │   │       │   │   │   ├── Sao_Tome
│   │   │       │   │   │   ├── Timbuktu
│   │   │       │   │   │   ├── Tripoli
│   │   │       │   │   │   ├── Tunis
│   │   │       │   │   │   └── Windhoek
│   │   │       │   │   ├── America/
│   │   │       │   │   │   ├── Argentina/
│   │   │       │   │   │   │   ├── Buenos_Aires
│   │   │       │   │   │   │   ├── Catamarca
│   │   │       │   │   │   │   ├── ComodRivadavia
│   │   │       │   │   │   │   ├── Cordoba
│   │   │       │   │   │   │   ├── Jujuy
│   │   │       │   │   │   │   ├── La_Rioja
│   │   │       │   │   │   │   ├── Mendoza
│   │   │       │   │   │   │   ├── Rio_Gallegos
│   │   │       │   │   │   │   ├── Salta
│   │   │       │   │   │   │   ├── San_Juan
│   │   │       │   │   │   │   ├── San_Luis
│   │   │       │   │   │   │   ├── Tucuman
│   │   │       │   │   │   │   └── Ushuaia
│   │   │       │   │   │   ├── Indiana/
│   │   │       │   │   │   │   ├── Indianapolis
│   │   │       │   │   │   │   ├── Knox
│   │   │       │   │   │   │   ├── Marengo
│   │   │       │   │   │   │   ├── Petersburg
│   │   │       │   │   │   │   ├── Tell_City
│   │   │       │   │   │   │   ├── Vevay
│   │   │       │   │   │   │   ├── Vincennes
│   │   │       │   │   │   │   └── Winamac
│   │   │       │   │   │   ├── Kentucky/
│   │   │       │   │   │   │   ├── Louisville
│   │   │       │   │   │   │   └── Monticello
│   │   │       │   │   │   ├── North_Dakota/
│   │   │       │   │   │   │   ├── Beulah
│   │   │       │   │   │   │   ├── Center
│   │   │       │   │   │   │   └── New_Salem
│   │   │       │   │   │   ├── Adak
│   │   │       │   │   │   ├── Anchorage
│   │   │       │   │   │   ├── Anguilla
│   │   │       │   │   │   ├── Antigua
│   │   │       │   │   │   ├── Araguaina
│   │   │       │   │   │   ├── Aruba
│   │   │       │   │   │   ├── Asuncion
│   │   │       │   │   │   ├── Atikokan
│   │   │       │   │   │   ├── Atka
│   │   │       │   │   │   ├── Bahia
│   │   │       │   │   │   ├── Bahia_Banderas
│   │   │       │   │   │   ├── Barbados
│   │   │       │   │   │   ├── Belem
│   │   │       │   │   │   ├── Belize
│   │   │       │   │   │   ├── Blanc-Sablon
│   │   │       │   │   │   ├── Boa_Vista
│   │   │       │   │   │   ├── Bogota
│   │   │       │   │   │   ├── Boise
│   │   │       │   │   │   ├── Buenos_Aires
│   │   │       │   │   │   ├── Cambridge_Bay
│   │   │       │   │   │   ├── Campo_Grande
│   │   │       │   │   │   ├── Cancun
│   │   │       │   │   │   ├── Caracas
│   │   │       │   │   │   ├── Catamarca
│   │   │       │   │   │   ├── Cayenne
│   │   │       │   │   │   ├── Cayman
│   │   │       │   │   │   ├── Chicago
│   │   │       │   │   │   ├── Chihuahua
│   │   │       │   │   │   ├── Ciudad_Juarez
│   │   │       │   │   │   ├── Coral_Harbour
│   │   │       │   │   │   ├── Cordoba
│   │   │       │   │   │   ├── Costa_Rica
│   │   │       │   │   │   ├── Coyhaique
│   │   │       │   │   │   ├── Creston
│   │   │       │   │   │   ├── Cuiaba
│   │   │       │   │   │   ├── Curacao
│   │   │       │   │   │   ├── Danmarkshavn
│   │   │       │   │   │   ├── Dawson
│   │   │       │   │   │   ├── Dawson_Creek
│   │   │       │   │   │   ├── Denver
│   │   │       │   │   │   ├── Detroit
│   │   │       │   │   │   ├── Dominica
│   │   │       │   │   │   ├── Edmonton
│   │   │       │   │   │   ├── Eirunepe
│   │   │       │   │   │   ├── El_Salvador
│   │   │       │   │   │   ├── Ensenada
│   │   │       │   │   │   ├── Fort_Nelson
│   │   │       │   │   │   ├── Fort_Wayne
│   │   │       │   │   │   ├── Fortaleza
│   │   │       │   │   │   ├── Glace_Bay
│   │   │       │   │   │   ├── Godthab
│   │   │       │   │   │   ├── Goose_Bay
│   │   │       │   │   │   ├── Grand_Turk
│   │   │       │   │   │   ├── Grenada
│   │   │       │   │   │   ├── Guadeloupe
│   │   │       │   │   │   ├── Guatemala
│   │   │       │   │   │   ├── Guayaquil
│   │   │       │   │   │   ├── Guyana
│   │   │       │   │   │   ├── Halifax
│   │   │       │   │   │   ├── Havana
│   │   │       │   │   │   ├── Hermosillo
│   │   │       │   │   │   ├── Indianapolis
│   │   │       │   │   │   ├── Inuvik
│   │   │       │   │   │   ├── Iqaluit
│   │   │       │   │   │   ├── Jamaica
│   │   │       │   │   │   ├── Jujuy
│   │   │       │   │   │   ├── Juneau
│   │   │       │   │   │   ├── Knox_IN
│   │   │       │   │   │   ├── Kralendijk
│   │   │       │   │   │   ├── La_Paz
│   │   │       │   │   │   ├── Lima
│   │   │       │   │   │   ├── Los_Angeles
│   │   │       │   │   │   ├── Louisville
│   │   │       │   │   │   ├── Lower_Princes
│   │   │       │   │   │   ├── Maceio
│   │   │       │   │   │   ├── Managua
│   │   │       │   │   │   ├── Manaus
│   │   │       │   │   │   ├── Marigot
│   │   │       │   │   │   ├── Martinique
│   │   │       │   │   │   ├── Matamoros
│   │   │       │   │   │   ├── Mazatlan
│   │   │       │   │   │   ├── Mendoza
│   │   │       │   │   │   ├── Menominee
│   │   │       │   │   │   ├── Merida
│   │   │       │   │   │   ├── Metlakatla
│   │   │       │   │   │   ├── Mexico_City
│   │   │       │   │   │   ├── Miquelon
│   │   │       │   │   │   ├── Moncton
│   │   │       │   │   │   ├── Monterrey
│   │   │       │   │   │   ├── Montevideo
│   │   │       │   │   │   ├── Montreal
│   │   │       │   │   │   ├── Montserrat
│   │   │       │   │   │   ├── Nassau
│   │   │       │   │   │   ├── New_York
│   │   │       │   │   │   ├── Nipigon
│   │   │       │   │   │   ├── Nome
│   │   │       │   │   │   ├── Noronha
│   │   │       │   │   │   ├── Nuuk
│   │   │       │   │   │   ├── Ojinaga
│   │   │       │   │   │   ├── Panama
│   │   │       │   │   │   ├── Pangnirtung
│   │   │       │   │   │   ├── Paramaribo
│   │   │       │   │   │   ├── Phoenix
│   │   │       │   │   │   ├── Port-au-Prince
│   │   │       │   │   │   ├── Port_of_Spain
│   │   │       │   │   │   ├── Porto_Acre
│   │   │       │   │   │   ├── Porto_Velho
│   │   │       │   │   │   ├── Puerto_Rico
│   │   │       │   │   │   ├── Punta_Arenas
│   │   │       │   │   │   ├── Rainy_River
│   │   │       │   │   │   ├── Rankin_Inlet
│   │   │       │   │   │   ├── Recife
│   │   │       │   │   │   ├── Regina
│   │   │       │   │   │   ├── Resolute
│   │   │       │   │   │   ├── Rio_Branco
│   │   │       │   │   │   ├── Rosario
│   │   │       │   │   │   ├── Santa_Isabel
│   │   │       │   │   │   ├── Santarem
│   │   │       │   │   │   ├── Santiago
│   │   │       │   │   │   ├── Santo_Domingo
│   │   │       │   │   │   ├── Sao_Paulo
│   │   │       │   │   │   ├── Scoresbysund
│   │   │       │   │   │   ├── Shiprock
│   │   │       │   │   │   ├── Sitka
│   │   │       │   │   │   ├── St_Barthelemy
│   │   │       │   │   │   ├── St_Johns
│   │   │       │   │   │   ├── St_Kitts
│   │   │       │   │   │   ├── St_Lucia
│   │   │       │   │   │   ├── St_Thomas
│   │   │       │   │   │   ├── St_Vincent
│   │   │       │   │   │   ├── Swift_Current
│   │   │       │   │   │   ├── Tegucigalpa
│   │   │       │   │   │   ├── Thule
│   │   │       │   │   │   ├── Thunder_Bay
│   │   │       │   │   │   ├── Tijuana
│   │   │       │   │   │   ├── Toronto
│   │   │       │   │   │   ├── Tortola
│   │   │       │   │   │   ├── Vancouver
│   │   │       │   │   │   ├── Virgin
│   │   │       │   │   │   ├── Whitehorse
│   │   │       │   │   │   ├── Winnipeg
│   │   │       │   │   │   ├── Yakutat
│   │   │       │   │   │   └── Yellowknife
│   │   │       │   │   ├── Antarctica/
│   │   │       │   │   │   ├── Casey
│   │   │       │   │   │   ├── Davis
│   │   │       │   │   │   ├── DumontDUrville
│   │   │       │   │   │   ├── Macquarie
│   │   │       │   │   │   ├── Mawson
│   │   │       │   │   │   ├── McMurdo
│   │   │       │   │   │   ├── Palmer
│   │   │       │   │   │   ├── Rothera
│   │   │       │   │   │   ├── South_Pole
│   │   │       │   │   │   ├── Syowa
│   │   │       │   │   │   ├── Troll
│   │   │       │   │   │   └── Vostok
│   │   │       │   │   ├── Arctic/
│   │   │       │   │   │   └── Longyearbyen
│   │   │       │   │   ├── Asia/
│   │   │       │   │   │   ├── Aden
│   │   │       │   │   │   ├── Almaty
│   │   │       │   │   │   ├── Amman
│   │   │       │   │   │   ├── Anadyr
│   │   │       │   │   │   ├── Aqtau
│   │   │       │   │   │   ├── Aqtobe
│   │   │       │   │   │   ├── Ashgabat
│   │   │       │   │   │   ├── Ashkhabad
│   │   │       │   │   │   ├── Atyrau
│   │   │       │   │   │   ├── Baghdad
│   │   │       │   │   │   ├── Bahrain
│   │   │       │   │   │   ├── Baku
│   │   │       │   │   │   ├── Bangkok
│   │   │       │   │   │   ├── Barnaul
│   │   │       │   │   │   ├── Beirut
│   │   │       │   │   │   ├── Bishkek
│   │   │       │   │   │   ├── Brunei
│   │   │       │   │   │   ├── Calcutta
│   │   │       │   │   │   ├── Chita
│   │   │       │   │   │   ├── Choibalsan
│   │   │       │   │   │   ├── Chongqing
│   │   │       │   │   │   ├── Chungking
│   │   │       │   │   │   ├── Colombo
│   │   │       │   │   │   ├── Dacca
│   │   │       │   │   │   ├── Damascus
│   │   │       │   │   │   ├── Dhaka
│   │   │       │   │   │   ├── Dili
│   │   │       │   │   │   ├── Dubai
│   │   │       │   │   │   ├── Dushanbe
│   │   │       │   │   │   ├── Famagusta
│   │   │       │   │   │   ├── Gaza
│   │   │       │   │   │   ├── Harbin
│   │   │       │   │   │   ├── Hebron
│   │   │       │   │   │   ├── Ho_Chi_Minh
│   │   │       │   │   │   ├── Hong_Kong
│   │   │       │   │   │   ├── Hovd
│   │   │       │   │   │   ├── Irkutsk
│   │   │       │   │   │   ├── Istanbul
│   │   │       │   │   │   ├── Jakarta
│   │   │       │   │   │   ├── Jayapura
│   │   │       │   │   │   ├── Jerusalem
│   │   │       │   │   │   ├── Kabul
│   │   │       │   │   │   ├── Kamchatka
│   │   │       │   │   │   ├── Karachi
│   │   │       │   │   │   ├── Kashgar
│   │   │       │   │   │   ├── Kathmandu
│   │   │       │   │   │   ├── Katmandu
│   │   │       │   │   │   ├── Khandyga
│   │   │       │   │   │   ├── Kolkata
│   │   │       │   │   │   ├── Krasnoyarsk
│   │   │       │   │   │   ├── Kuala_Lumpur
│   │   │       │   │   │   ├── Kuching
│   │   │       │   │   │   ├── Kuwait
│   │   │       │   │   │   ├── Macao
│   │   │       │   │   │   ├── Macau
│   │   │       │   │   │   ├── Magadan
│   │   │       │   │   │   ├── Makassar
│   │   │       │   │   │   ├── Manila
│   │   │       │   │   │   ├── Muscat
│   │   │       │   │   │   ├── Nicosia
│   │   │       │   │   │   ├── Novokuznetsk
│   │   │       │   │   │   ├── Novosibirsk
│   │   │       │   │   │   ├── Omsk
│   │   │       │   │   │   ├── Oral
│   │   │       │   │   │   ├── Phnom_Penh
│   │   │       │   │   │   ├── Pontianak
│   │   │       │   │   │   ├── Pyongyang
│   │   │       │   │   │   ├── Qatar
│   │   │       │   │   │   ├── Qostanay
│   │   │       │   │   │   ├── Qyzylorda
│   │   │       │   │   │   ├── Rangoon
│   │   │       │   │   │   ├── Riyadh
│   │   │       │   │   │   ├── Saigon
│   │   │       │   │   │   ├── Sakhalin
│   │   │       │   │   │   ├── Samarkand
│   │   │       │   │   │   ├── Seoul
│   │   │       │   │   │   ├── Shanghai
│   │   │       │   │   │   ├── Singapore
│   │   │       │   │   │   ├── Srednekolymsk
│   │   │       │   │   │   ├── Taipei
│   │   │       │   │   │   ├── Tashkent
│   │   │       │   │   │   ├── Tbilisi
│   │   │       │   │   │   ├── Tehran
│   │   │       │   │   │   ├── Tel_Aviv
│   │   │       │   │   │   ├── Thimbu
│   │   │       │   │   │   ├── Thimphu
│   │   │       │   │   │   ├── Tokyo
│   │   │       │   │   │   ├── Tomsk
│   │   │       │   │   │   ├── Ujung_Pandang
│   │   │       │   │   │   ├── Ulaanbaatar
│   │   │       │   │   │   ├── Ulan_Bator
│   │   │       │   │   │   ├── Urumqi
│   │   │       │   │   │   ├── Ust-Nera
│   │   │       │   │   │   ├── Vientiane
│   │   │       │   │   │   ├── Vladivostok
│   │   │       │   │   │   ├── Yakutsk
│   │   │       │   │   │   ├── Yangon
│   │   │       │   │   │   ├── Yekaterinburg
│   │   │       │   │   │   └── Yerevan
│   │   │       │   │   ├── Atlantic/
│   │   │       │   │   │   ├── Azores
│   │   │       │   │   │   ├── Bermuda
│   │   │       │   │   │   ├── Canary
│   │   │       │   │   │   ├── Cape_Verde
│   │   │       │   │   │   ├── Faeroe
│   │   │       │   │   │   ├── Faroe
│   │   │       │   │   │   ├── Jan_Mayen
│   │   │       │   │   │   ├── Madeira
│   │   │       │   │   │   ├── Reykjavik
│   │   │       │   │   │   ├── South_Georgia
│   │   │       │   │   │   ├── St_Helena
│   │   │       │   │   │   └── Stanley
│   │   │       │   │   ├── Australia/
│   │   │       │   │   │   ├── ACT
│   │   │       │   │   │   ├── Adelaide
│   │   │       │   │   │   ├── Brisbane
│   │   │       │   │   │   ├── Broken_Hill
│   │   │       │   │   │   ├── Canberra
│   │   │       │   │   │   ├── Currie
│   │   │       │   │   │   ├── Darwin
│   │   │       │   │   │   ├── Eucla
│   │   │       │   │   │   ├── Hobart
│   │   │       │   │   │   ├── LHI
│   │   │       │   │   │   ├── Lindeman
│   │   │       │   │   │   ├── Lord_Howe
│   │   │       │   │   │   ├── Melbourne
│   │   │       │   │   │   ├── NSW
│   │   │       │   │   │   ├── North
│   │   │       │   │   │   ├── Perth
│   │   │       │   │   │   ├── Queensland
│   │   │       │   │   │   ├── South
│   │   │       │   │   │   ├── Sydney
│   │   │       │   │   │   ├── Tasmania
│   │   │       │   │   │   ├── Victoria
│   │   │       │   │   │   ├── West
│   │   │       │   │   │   └── Yancowinna
│   │   │       │   │   ├── Brazil/
│   │   │       │   │   │   ├── Acre
│   │   │       │   │   │   ├── DeNoronha
│   │   │       │   │   │   ├── East
│   │   │       │   │   │   └── West
│   │   │       │   │   ├── Canada/
│   │   │       │   │   │   ├── Atlantic
│   │   │       │   │   │   ├── Central
│   │   │       │   │   │   ├── Eastern
│   │   │       │   │   │   ├── Mountain
│   │   │       │   │   │   ├── Newfoundland
│   │   │       │   │   │   ├── Pacific
│   │   │       │   │   │   ├── Saskatchewan
│   │   │       │   │   │   └── Yukon
│   │   │       │   │   ├── Chile/
│   │   │       │   │   │   ├── Continental
│   │   │       │   │   │   └── EasterIsland
│   │   │       │   │   ├── Etc/
│   │   │       │   │   │   ├── GMT
│   │   │       │   │   │   ├── GMT+0
│   │   │       │   │   │   ├── GMT+1
│   │   │       │   │   │   ├── GMT+10
│   │   │       │   │   │   ├── GMT+11
│   │   │       │   │   │   ├── GMT+12
│   │   │       │   │   │   ├── GMT+2
│   │   │       │   │   │   ├── GMT+3
│   │   │       │   │   │   ├── GMT+4
│   │   │       │   │   │   ├── GMT+5
│   │   │       │   │   │   ├── GMT+6
│   │   │       │   │   │   ├── GMT+7
│   │   │       │   │   │   ├── GMT+8
│   │   │       │   │   │   ├── GMT+9
│   │   │       │   │   │   ├── GMT-0
│   │   │       │   │   │   ├── GMT-1
│   │   │       │   │   │   ├── GMT-10
│   │   │       │   │   │   ├── GMT-11
│   │   │       │   │   │   ├── GMT-12
│   │   │       │   │   │   ├── GMT-13
│   │   │       │   │   │   ├── GMT-14
│   │   │       │   │   │   ├── GMT-2
│   │   │       │   │   │   ├── GMT-3
│   │   │       │   │   │   ├── GMT-4
│   │   │       │   │   │   ├── GMT-5
│   │   │       │   │   │   ├── GMT-6
│   │   │       │   │   │   ├── GMT-7
│   │   │       │   │   │   ├── GMT-8
│   │   │       │   │   │   ├── GMT-9
│   │   │       │   │   │   ├── GMT0
│   │   │       │   │   │   ├── Greenwich
│   │   │       │   │   │   ├── UCT
│   │   │       │   │   │   ├── UTC
│   │   │       │   │   │   ├── Universal
│   │   │       │   │   │   └── Zulu
│   │   │       │   │   ├── Europe/
│   │   │       │   │   │   ├── Amsterdam
│   │   │       │   │   │   ├── Andorra
│   │   │       │   │   │   ├── Astrakhan
│   │   │       │   │   │   ├── Athens
│   │   │       │   │   │   ├── Belfast
│   │   │       │   │   │   ├── Belgrade
│   │   │       │   │   │   ├── Berlin
│   │   │       │   │   │   ├── Bratislava
│   │   │       │   │   │   ├── Brussels
│   │   │       │   │   │   ├── Bucharest
│   │   │       │   │   │   ├── Budapest
│   │   │       │   │   │   ├── Busingen
│   │   │       │   │   │   ├── Chisinau
│   │   │       │   │   │   ├── Copenhagen
│   │   │       │   │   │   ├── Dublin
│   │   │       │   │   │   ├── Gibraltar
│   │   │       │   │   │   ├── Guernsey
│   │   │       │   │   │   ├── Helsinki
│   │   │       │   │   │   ├── Isle_of_Man
│   │   │       │   │   │   ├── Istanbul
│   │   │       │   │   │   ├── Jersey
│   │   │       │   │   │   ├── Kaliningrad
│   │   │       │   │   │   ├── Kiev
│   │   │       │   │   │   ├── Kirov
│   │   │       │   │   │   ├── Kyiv
│   │   │       │   │   │   ├── Lisbon
│   │   │       │   │   │   ├── Ljubljana
│   │   │       │   │   │   ├── London
│   │   │       │   │   │   ├── Luxembourg
│   │   │       │   │   │   ├── Madrid
│   │   │       │   │   │   ├── Malta
│   │   │       │   │   │   ├── Mariehamn
│   │   │       │   │   │   ├── Minsk
│   │   │       │   │   │   ├── Monaco
│   │   │       │   │   │   ├── Moscow
│   │   │       │   │   │   ├── Nicosia
│   │   │       │   │   │   ├── Oslo
│   │   │       │   │   │   ├── Paris
│   │   │       │   │   │   ├── Podgorica
│   │   │       │   │   │   ├── Prague
│   │   │       │   │   │   ├── Riga
│   │   │       │   │   │   ├── Rome
│   │   │       │   │   │   ├── Samara
│   │   │       │   │   │   ├── San_Marino
│   │   │       │   │   │   ├── Sarajevo
│   │   │       │   │   │   ├── Saratov
│   │   │       │   │   │   ├── Simferopol
│   │   │       │   │   │   ├── Skopje
│   │   │       │   │   │   ├── Sofia
│   │   │       │   │   │   ├── Stockholm
│   │   │       │   │   │   ├── Tallinn
│   │   │       │   │   │   ├── Tirane
│   │   │       │   │   │   ├── Tiraspol
│   │   │       │   │   │   ├── Ulyanovsk
│   │   │       │   │   │   ├── Uzhgorod
│   │   │       │   │   │   ├── Vaduz
│   │   │       │   │   │   ├── Vatican
│   │   │       │   │   │   ├── Vienna
│   │   │       │   │   │   ├── Vilnius
│   │   │       │   │   │   ├── Volgograd
│   │   │       │   │   │   ├── Warsaw
│   │   │       │   │   │   ├── Zagreb
│   │   │       │   │   │   ├── Zaporozhye
│   │   │       │   │   │   └── Zurich
│   │   │       │   │   ├── Indian/
│   │   │       │   │   │   ├── Antananarivo
│   │   │       │   │   │   ├── Chagos
│   │   │       │   │   │   ├── Christmas
│   │   │       │   │   │   ├── Cocos
│   │   │       │   │   │   ├── Comoro
│   │   │       │   │   │   ├── Kerguelen
│   │   │       │   │   │   ├── Mahe
│   │   │       │   │   │   ├── Maldives
│   │   │       │   │   │   ├── Mauritius
│   │   │       │   │   │   ├── Mayotte
│   │   │       │   │   │   └── Reunion
│   │   │       │   │   ├── Mexico/
│   │   │       │   │   │   ├── BajaNorte
│   │   │       │   │   │   ├── BajaSur
│   │   │       │   │   │   └── General
│   │   │       │   │   ├── Pacific/
│   │   │       │   │   │   ├── Apia
│   │   │       │   │   │   ├── Auckland
│   │   │       │   │   │   ├── Bougainville
│   │   │       │   │   │   ├── Chatham
│   │   │       │   │   │   ├── Chuuk
│   │   │       │   │   │   ├── Easter
│   │   │       │   │   │   ├── Efate
│   │   │       │   │   │   ├── Enderbury
│   │   │       │   │   │   ├── Fakaofo
│   │   │       │   │   │   ├── Fiji
│   │   │       │   │   │   ├── Funafuti
│   │   │       │   │   │   ├── Galapagos
│   │   │       │   │   │   ├── Gambier
│   │   │       │   │   │   ├── Guadalcanal
│   │   │       │   │   │   ├── Guam
│   │   │       │   │   │   ├── Honolulu
│   │   │       │   │   │   ├── Johnston
│   │   │       │   │   │   ├── Kanton
│   │   │       │   │   │   ├── Kiritimati
│   │   │       │   │   │   ├── Kosrae
│   │   │       │   │   │   ├── Kwajalein
│   │   │       │   │   │   ├── Majuro
│   │   │       │   │   │   ├── Marquesas
│   │   │       │   │   │   ├── Midway
│   │   │       │   │   │   ├── Nauru
│   │   │       │   │   │   ├── Niue
│   │   │       │   │   │   ├── Norfolk
│   │   │       │   │   │   ├── Noumea
│   │   │       │   │   │   ├── Pago_Pago
│   │   │       │   │   │   ├── Palau
│   │   │       │   │   │   ├── Pitcairn
│   │   │       │   │   │   ├── Pohnpei
│   │   │       │   │   │   ├── Ponape
│   │   │       │   │   │   ├── Port_Moresby
│   │   │       │   │   │   ├── Rarotonga
│   │   │       │   │   │   ├── Saipan
│   │   │       │   │   │   ├── Samoa
│   │   │       │   │   │   ├── Tahiti
│   │   │       │   │   │   ├── Tarawa
│   │   │       │   │   │   ├── Tongatapu
│   │   │       │   │   │   ├── Truk
│   │   │       │   │   │   ├── Wake
│   │   │       │   │   │   ├── Wallis
│   │   │       │   │   │   └── Yap
│   │   │       │   │   ├── US/
│   │   │       │   │   │   ├── Alaska
│   │   │       │   │   │   ├── Aleutian
│   │   │       │   │   │   ├── Arizona
│   │   │       │   │   │   ├── Central
│   │   │       │   │   │   ├── East-Indiana
│   │   │       │   │   │   ├── Eastern
│   │   │       │   │   │   ├── Hawaii
│   │   │       │   │   │   ├── Indiana-Starke
│   │   │       │   │   │   ├── Michigan
│   │   │       │   │   │   ├── Mountain
│   │   │       │   │   │   ├── Pacific
│   │   │       │   │   │   └── Samoa
│   │   │       │   │   ├── CET
│   │   │       │   │   ├── CST6CDT
│   │   │       │   │   ├── Cuba
│   │   │       │   │   ├── EET
│   │   │       │   │   ├── EST
│   │   │       │   │   ├── EST5EDT
│   │   │       │   │   ├── Egypt
│   │   │       │   │   ├── Eire
│   │   │       │   │   ├── Factory
│   │   │       │   │   ├── GB
│   │   │       │   │   ├── GB-Eire
│   │   │       │   │   ├── GMT
│   │   │       │   │   ├── GMT+0
│   │   │       │   │   ├── GMT-0
│   │   │       │   │   ├── GMT0
│   │   │       │   │   ├── Greenwich
│   │   │       │   │   ├── HST
│   │   │       │   │   ├── Hongkong
│   │   │       │   │   ├── Iceland
│   │   │       │   │   ├── Iran
│   │   │       │   │   ├── Israel
│   │   │       │   │   ├── Jamaica
│   │   │       │   │   ├── Japan
│   │   │       │   │   ├── Kwajalein
│   │   │       │   │   ├── Libya
│   │   │       │   │   ├── MET
│   │   │       │   │   ├── MST
│   │   │       │   │   ├── MST7MDT
│   │   │       │   │   ├── NZ
│   │   │       │   │   ├── NZ-CHAT
│   │   │       │   │   ├── Navajo
│   │   │       │   │   ├── PRC
│   │   │       │   │   ├── PST8PDT
│   │   │       │   │   ├── Poland
│   │   │       │   │   ├── Portugal
│   │   │       │   │   ├── ROC
│   │   │       │   │   ├── ROK
│   │   │       │   │   ├── Singapore
│   │   │       │   │   ├── Turkey
│   │   │       │   │   ├── UCT
│   │   │       │   │   ├── UTC
│   │   │       │   │   ├── Universal
│   │   │       │   │   ├── W-SU
│   │   │       │   │   ├── WET
│   │   │       │   │   ├── Zulu
│   │   │       │   │   ├── iso3166.tab
│   │   │       │   │   ├── leapseconds
│   │   │       │   │   ├── tzdata.zi
│   │   │       │   │   ├── zone.tab
│   │   │       │   │   ├── zone1970.tab
│   │   │       │   │   └── zonenow.tab
│   │   │       │   ├── __init__.py
│   │   │       │   ├── exceptions.py
│   │   │       │   ├── lazy.py
│   │   │       │   ├── reference.py
│   │   │       │   ├── tzfile.py
│   │   │       │   └── tzinfo.py
│   │   │       ├── pytz-2025.2.dist-info/
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── LICENSE.txt
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── WHEEL
│   │   │       │   ├── top_level.txt
│   │   │       │   └── zip-safe
│   │   │       ├── scikit_learn-1.6.1.dist-info/
│   │   │       │   ├── COPYING
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── REQUESTED
│   │   │       │   └── WHEEL
│   │   │       ├── scipy/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __config__.cpython-312.pyc
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── _distributor_init.cpython-312.pyc
│   │   │       │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   └── version.cpython-312.pyc
│   │   │       │   ├── _lib/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _array_api.cpython-312.pyc
│   │   │       │   │   │   ├── _array_api_compat_vendor.cpython-312.pyc
│   │   │       │   │   │   ├── _array_api_no_0d.cpython-312.pyc
│   │   │       │   │   │   ├── _bunch.cpython-312.pyc
│   │   │       │   │   │   ├── _ccallback.cpython-312.pyc
│   │   │       │   │   │   ├── _disjoint_set.cpython-312.pyc
│   │   │       │   │   │   ├── _docscrape.cpython-312.pyc
│   │   │       │   │   │   ├── _elementwise_iterative_method.cpython-312.pyc
│   │   │       │   │   │   ├── _gcutils.cpython-312.pyc
│   │   │       │   │   │   ├── _pep440.cpython-312.pyc
│   │   │       │   │   │   ├── _sparse.cpython-312.pyc
│   │   │       │   │   │   ├── _testutils.cpython-312.pyc
│   │   │       │   │   │   ├── _threadsafety.cpython-312.pyc
│   │   │       │   │   │   ├── _tmpdirs.cpython-312.pyc
│   │   │       │   │   │   ├── _util.cpython-312.pyc
│   │   │       │   │   │   ├── decorator.cpython-312.pyc
│   │   │       │   │   │   ├── deprecation.cpython-312.pyc
│   │   │       │   │   │   ├── doccer.cpython-312.pyc
│   │   │       │   │   │   └── uarray.cpython-312.pyc
│   │   │       │   │   ├── _uarray/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── _backend.cpython-312.pyc
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _backend.py
│   │   │       │   │   │   ├── _uarray.cp312-win_amd64.dll.a
│   │   │       │   │   │   └── _uarray.cp312-win_amd64.pyd
│   │   │       │   │   ├── array_api_compat/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── _internal.cpython-312.pyc
│   │   │       │   │   │   ├── common/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _aliases.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _fft.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _helpers.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _linalg.cpython-312.pyc
│   │   │       │   │   │   │   │   └── _typing.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── _aliases.py
│   │   │       │   │   │   │   ├── _fft.py
│   │   │       │   │   │   │   ├── _helpers.py
│   │   │       │   │   │   │   ├── _linalg.py
│   │   │       │   │   │   │   └── _typing.py
│   │   │       │   │   │   ├── cupy/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _aliases.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _info.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _typing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── fft.cpython-312.pyc
│   │   │       │   │   │   │   │   └── linalg.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── _aliases.py
│   │   │       │   │   │   │   ├── _info.py
│   │   │       │   │   │   │   ├── _typing.py
│   │   │       │   │   │   │   ├── fft.py
│   │   │       │   │   │   │   └── linalg.py
│   │   │       │   │   │   ├── dask/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── array/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── _aliases.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── _info.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── fft.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── linalg.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── _aliases.py
│   │   │       │   │   │   │   │   ├── _info.py
│   │   │       │   │   │   │   │   ├── fft.py
│   │   │       │   │   │   │   │   └── linalg.py
│   │   │       │   │   │   │   └── __init__.py
│   │   │       │   │   │   ├── numpy/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _aliases.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _info.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _typing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── fft.cpython-312.pyc
│   │   │       │   │   │   │   │   └── linalg.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── _aliases.py
│   │   │       │   │   │   │   ├── _info.py
│   │   │       │   │   │   │   ├── _typing.py
│   │   │       │   │   │   │   ├── fft.py
│   │   │       │   │   │   │   └── linalg.py
│   │   │       │   │   │   ├── torch/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _aliases.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _info.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _typing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── fft.cpython-312.pyc
│   │   │       │   │   │   │   │   └── linalg.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── _aliases.py
│   │   │       │   │   │   │   ├── _info.py
│   │   │       │   │   │   │   ├── _typing.py
│   │   │       │   │   │   │   ├── fft.py
│   │   │       │   │   │   │   └── linalg.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── _internal.py
│   │   │       │   │   ├── array_api_extra/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _delegation.cpython-312.pyc
│   │   │       │   │   │   │   └── testing.cpython-312.pyc
│   │   │       │   │   │   ├── _lib/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _at.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _backends.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _funcs.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _lazy.cpython-312.pyc
│   │   │       │   │   │   │   │   └── _testing.cpython-312.pyc
│   │   │       │   │   │   │   ├── _utils/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── _compat.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── _helpers.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── _typing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── _compat.py
│   │   │       │   │   │   │   │   ├── _compat.pyi
│   │   │       │   │   │   │   │   ├── _helpers.py
│   │   │       │   │   │   │   │   ├── _typing.py
│   │   │       │   │   │   │   │   └── _typing.pyi
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── _at.py
│   │   │       │   │   │   │   ├── _backends.py
│   │   │       │   │   │   │   ├── _funcs.py
│   │   │       │   │   │   │   ├── _lazy.py
│   │   │       │   │   │   │   └── _testing.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _delegation.py
│   │   │       │   │   │   └── testing.py
│   │   │       │   │   ├── cobyqa/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── framework.cpython-312.pyc
│   │   │       │   │   │   │   ├── main.cpython-312.pyc
│   │   │       │   │   │   │   ├── models.cpython-312.pyc
│   │   │       │   │   │   │   ├── problem.cpython-312.pyc
│   │   │       │   │   │   │   └── settings.cpython-312.pyc
│   │   │       │   │   │   ├── subsolvers/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── geometry.cpython-312.pyc
│   │   │       │   │   │   │   │   └── optim.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── geometry.py
│   │   │       │   │   │   │   └── optim.py
│   │   │       │   │   │   ├── utils/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── exceptions.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── math.cpython-312.pyc
│   │   │       │   │   │   │   │   └── versions.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── exceptions.py
│   │   │       │   │   │   │   ├── math.py
│   │   │       │   │   │   │   └── versions.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── framework.py
│   │   │       │   │   │   ├── main.py
│   │   │       │   │   │   ├── models.py
│   │   │       │   │   │   ├── problem.py
│   │   │       │   │   │   └── settings.py
│   │   │       │   │   ├── pyprima/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── cobyla/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── cobyla.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── cobylb.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── geometry.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── initialize.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── trustregion.cpython-312.pyc
│   │   │       │   │   │   │   │   └── update.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── cobyla.py
│   │   │       │   │   │   │   ├── cobylb.py
│   │   │       │   │   │   │   ├── geometry.py
│   │   │       │   │   │   │   ├── initialize.py
│   │   │       │   │   │   │   ├── trustregion.py
│   │   │       │   │   │   │   └── update.py
│   │   │       │   │   │   ├── common/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _bounds.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _linear_constraints.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _nonlinear_constraints.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _project.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── checkbreak.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── consts.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── evaluate.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── history.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── infos.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── linalg.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── message.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── powalg.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── preproc.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── present.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── ratio.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── redrho.cpython-312.pyc
│   │   │       │   │   │   │   │   └── selectx.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── _bounds.py
│   │   │       │   │   │   │   ├── _linear_constraints.py
│   │   │       │   │   │   │   ├── _nonlinear_constraints.py
│   │   │       │   │   │   │   ├── _project.py
│   │   │       │   │   │   │   ├── checkbreak.py
│   │   │       │   │   │   │   ├── consts.py
│   │   │       │   │   │   │   ├── evaluate.py
│   │   │       │   │   │   │   ├── history.py
│   │   │       │   │   │   │   ├── infos.py
│   │   │       │   │   │   │   ├── linalg.py
│   │   │       │   │   │   │   ├── message.py
│   │   │       │   │   │   │   ├── powalg.py
│   │   │       │   │   │   │   ├── preproc.py
│   │   │       │   │   │   │   ├── present.py
│   │   │       │   │   │   │   ├── ratio.py
│   │   │       │   │   │   │   ├── redrho.py
│   │   │       │   │   │   │   └── selectx.py
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__gcutils.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__pep440.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__testutils.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__threadsafety.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__util.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_array_api.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bunch.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ccallback.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_config.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_deprecation.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_doccer.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_import_cycles.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_public_api.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_scipy_version.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_tmpdirs.cpython-312.pyc
│   │   │       │   │   │   │   └── test_warnings.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test__gcutils.py
│   │   │       │   │   │   ├── test__pep440.py
│   │   │       │   │   │   ├── test__testutils.py
│   │   │       │   │   │   ├── test__threadsafety.py
│   │   │       │   │   │   ├── test__util.py
│   │   │       │   │   │   ├── test_array_api.py
│   │   │       │   │   │   ├── test_bunch.py
│   │   │       │   │   │   ├── test_ccallback.py
│   │   │       │   │   │   ├── test_config.py
│   │   │       │   │   │   ├── test_deprecation.py
│   │   │       │   │   │   ├── test_doccer.py
│   │   │       │   │   │   ├── test_import_cycles.py
│   │   │       │   │   │   ├── test_public_api.py
│   │   │       │   │   │   ├── test_scipy_version.py
│   │   │       │   │   │   ├── test_tmpdirs.py
│   │   │       │   │   │   └── test_warnings.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _array_api.py
│   │   │       │   │   ├── _array_api_compat_vendor.py
│   │   │       │   │   ├── _array_api_no_0d.py
│   │   │       │   │   ├── _bunch.py
│   │   │       │   │   ├── _ccallback.py
│   │   │       │   │   ├── _ccallback_c.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _ccallback_c.cp312-win_amd64.pyd
│   │   │       │   │   ├── _disjoint_set.py
│   │   │       │   │   ├── _docscrape.py
│   │   │       │   │   ├── _elementwise_iterative_method.py
│   │   │       │   │   ├── _fpumode.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _fpumode.cp312-win_amd64.pyd
│   │   │       │   │   ├── _gcutils.py
│   │   │       │   │   ├── _pep440.py
│   │   │       │   │   ├── _sparse.py
│   │   │       │   │   ├── _test_ccallback.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _test_ccallback.cp312-win_amd64.pyd
│   │   │       │   │   ├── _test_deprecation_call.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _test_deprecation_call.cp312-win_amd64.pyd
│   │   │       │   │   ├── _test_deprecation_def.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _test_deprecation_def.cp312-win_amd64.pyd
│   │   │       │   │   ├── _testutils.py
│   │   │       │   │   ├── _threadsafety.py
│   │   │       │   │   ├── _tmpdirs.py
│   │   │       │   │   ├── _util.py
│   │   │       │   │   ├── decorator.py
│   │   │       │   │   ├── deprecation.py
│   │   │       │   │   ├── doccer.py
│   │   │       │   │   ├── messagestream.cp312-win_amd64.dll.a
│   │   │       │   │   ├── messagestream.cp312-win_amd64.pyd
│   │   │       │   │   └── uarray.py
│   │   │       │   ├── cluster/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── hierarchy.cpython-312.pyc
│   │   │       │   │   │   └── vq.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── hierarchy_test_data.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_disjoint_set.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_hierarchy.cpython-312.pyc
│   │   │       │   │   │   │   └── test_vq.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── hierarchy_test_data.py
│   │   │       │   │   │   ├── test_disjoint_set.py
│   │   │       │   │   │   ├── test_hierarchy.py
│   │   │       │   │   │   └── test_vq.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _hierarchy.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _hierarchy.cp312-win_amd64.pyd
│   │   │       │   │   ├── _optimal_leaf_ordering.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _optimal_leaf_ordering.cp312-win_amd64.pyd
│   │   │       │   │   ├── _vq.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _vq.cp312-win_amd64.pyd
│   │   │       │   │   ├── hierarchy.py
│   │   │       │   │   └── vq.py
│   │   │       │   ├── constants/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _codata.cpython-312.pyc
│   │   │       │   │   │   ├── _constants.cpython-312.pyc
│   │   │       │   │   │   ├── codata.cpython-312.pyc
│   │   │       │   │   │   └── constants.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_codata.cpython-312.pyc
│   │   │       │   │   │   │   └── test_constants.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_codata.py
│   │   │       │   │   │   └── test_constants.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _codata.py
│   │   │       │   │   ├── _constants.py
│   │   │       │   │   ├── codata.py
│   │   │       │   │   └── constants.py
│   │   │       │   ├── datasets/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _download_all.cpython-312.pyc
│   │   │       │   │   │   ├── _fetchers.cpython-312.pyc
│   │   │       │   │   │   ├── _registry.cpython-312.pyc
│   │   │       │   │   │   └── _utils.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── test_data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── test_data.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _download_all.py
│   │   │       │   │   ├── _fetchers.py
│   │   │       │   │   ├── _registry.py
│   │   │       │   │   └── _utils.py
│   │   │       │   ├── differentiate/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   └── _differentiate.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── test_differentiate.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── test_differentiate.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   └── _differentiate.py
│   │   │       │   ├── fft/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _backend.cpython-312.pyc
│   │   │       │   │   │   ├── _basic.cpython-312.pyc
│   │   │       │   │   │   ├── _basic_backend.cpython-312.pyc
│   │   │       │   │   │   ├── _debug_backends.cpython-312.pyc
│   │   │       │   │   │   ├── _fftlog.cpython-312.pyc
│   │   │       │   │   │   ├── _fftlog_backend.cpython-312.pyc
│   │   │       │   │   │   ├── _helper.cpython-312.pyc
│   │   │       │   │   │   ├── _realtransforms.cpython-312.pyc
│   │   │       │   │   │   └── _realtransforms_backend.cpython-312.pyc
│   │   │       │   │   ├── _pocketfft/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── basic.cpython-312.pyc
│   │   │       │   │   │   │   ├── helper.cpython-312.pyc
│   │   │       │   │   │   │   └── realtransforms.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_basic.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_real_transforms.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_basic.py
│   │   │       │   │   │   │   └── test_real_transforms.py
│   │   │       │   │   │   ├── LICENSE.md
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── basic.py
│   │   │       │   │   │   ├── helper.py
│   │   │       │   │   │   ├── pypocketfft.cp312-win_amd64.dll.a
│   │   │       │   │   │   ├── pypocketfft.cp312-win_amd64.pyd
│   │   │       │   │   │   └── realtransforms.py
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── mock_backend.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_backend.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_basic.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_fftlog.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_helper.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_multithreading.cpython-312.pyc
│   │   │       │   │   │   │   └── test_real_transforms.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── mock_backend.py
│   │   │       │   │   │   ├── test_backend.py
│   │   │       │   │   │   ├── test_basic.py
│   │   │       │   │   │   ├── test_fftlog.py
│   │   │       │   │   │   ├── test_helper.py
│   │   │       │   │   │   ├── test_multithreading.py
│   │   │       │   │   │   └── test_real_transforms.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _backend.py
│   │   │       │   │   ├── _basic.py
│   │   │       │   │   ├── _basic_backend.py
│   │   │       │   │   ├── _debug_backends.py
│   │   │       │   │   ├── _fftlog.py
│   │   │       │   │   ├── _fftlog_backend.py
│   │   │       │   │   ├── _helper.py
│   │   │       │   │   ├── _realtransforms.py
│   │   │       │   │   └── _realtransforms_backend.py
│   │   │       │   ├── fftpack/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _basic.cpython-312.pyc
│   │   │       │   │   │   ├── _helper.cpython-312.pyc
│   │   │       │   │   │   ├── _pseudo_diffs.cpython-312.pyc
│   │   │       │   │   │   ├── _realtransforms.cpython-312.pyc
│   │   │       │   │   │   ├── basic.cpython-312.pyc
│   │   │       │   │   │   ├── helper.cpython-312.pyc
│   │   │       │   │   │   ├── pseudo_diffs.cpython-312.pyc
│   │   │       │   │   │   └── realtransforms.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_basic.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_helper.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_import.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pseudo_diffs.cpython-312.pyc
│   │   │       │   │   │   │   └── test_real_transforms.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── fftw_double_ref.npz
│   │   │       │   │   │   ├── fftw_longdouble_ref.npz
│   │   │       │   │   │   ├── fftw_single_ref.npz
│   │   │       │   │   │   ├── test.npz
│   │   │       │   │   │   ├── test_basic.py
│   │   │       │   │   │   ├── test_helper.py
│   │   │       │   │   │   ├── test_import.py
│   │   │       │   │   │   ├── test_pseudo_diffs.py
│   │   │       │   │   │   └── test_real_transforms.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _basic.py
│   │   │       │   │   ├── _helper.py
│   │   │       │   │   ├── _pseudo_diffs.py
│   │   │       │   │   ├── _realtransforms.py
│   │   │       │   │   ├── basic.py
│   │   │       │   │   ├── convolve.cp312-win_amd64.dll.a
│   │   │       │   │   ├── convolve.cp312-win_amd64.pyd
│   │   │       │   │   ├── helper.py
│   │   │       │   │   ├── pseudo_diffs.py
│   │   │       │   │   └── realtransforms.py
│   │   │       │   ├── integrate/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _bvp.cpython-312.pyc
│   │   │       │   │   │   ├── _cubature.cpython-312.pyc
│   │   │       │   │   │   ├── _lebedev.cpython-312.pyc
│   │   │       │   │   │   ├── _ode.cpython-312.pyc
│   │   │       │   │   │   ├── _odepack_py.cpython-312.pyc
│   │   │       │   │   │   ├── _quad_vec.cpython-312.pyc
│   │   │       │   │   │   ├── _quadpack_py.cpython-312.pyc
│   │   │       │   │   │   ├── _quadrature.cpython-312.pyc
│   │   │       │   │   │   ├── _tanhsinh.cpython-312.pyc
│   │   │       │   │   │   ├── dop.cpython-312.pyc
│   │   │       │   │   │   ├── lsoda.cpython-312.pyc
│   │   │       │   │   │   ├── odepack.cpython-312.pyc
│   │   │       │   │   │   ├── quadpack.cpython-312.pyc
│   │   │       │   │   │   └── vode.cpython-312.pyc
│   │   │       │   │   ├── _ivp/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── base.cpython-312.pyc
│   │   │       │   │   │   │   ├── bdf.cpython-312.pyc
│   │   │       │   │   │   │   ├── common.cpython-312.pyc
│   │   │       │   │   │   │   ├── dop853_coefficients.cpython-312.pyc
│   │   │       │   │   │   │   ├── ivp.cpython-312.pyc
│   │   │       │   │   │   │   ├── lsoda.cpython-312.pyc
│   │   │       │   │   │   │   ├── radau.cpython-312.pyc
│   │   │       │   │   │   │   └── rk.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_ivp.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_rk.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_ivp.py
│   │   │       │   │   │   │   └── test_rk.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── base.py
│   │   │       │   │   │   ├── bdf.py
│   │   │       │   │   │   ├── common.py
│   │   │       │   │   │   ├── dop853_coefficients.py
│   │   │       │   │   │   ├── ivp.py
│   │   │       │   │   │   ├── lsoda.py
│   │   │       │   │   │   ├── radau.py
│   │   │       │   │   │   └── rk.py
│   │   │       │   │   ├── _rules/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _base.cpython-312.pyc
│   │   │       │   │   │   │   ├── _gauss_kronrod.cpython-312.pyc
│   │   │       │   │   │   │   ├── _gauss_legendre.cpython-312.pyc
│   │   │       │   │   │   │   └── _genz_malik.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _base.py
│   │   │       │   │   │   ├── _gauss_kronrod.py
│   │   │       │   │   │   ├── _gauss_legendre.py
│   │   │       │   │   │   └── _genz_malik.py
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__quad_vec.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_banded_ode_solvers.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bvp.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cubature.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_integrate.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_odeint_jac.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_quadpack.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_quadrature.cpython-312.pyc
│   │   │       │   │   │   │   └── test_tanhsinh.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test__quad_vec.py
│   │   │       │   │   │   ├── test_banded_ode_solvers.py
│   │   │       │   │   │   ├── test_bvp.py
│   │   │       │   │   │   ├── test_cubature.py
│   │   │       │   │   │   ├── test_integrate.py
│   │   │       │   │   │   ├── test_odeint_jac.py
│   │   │       │   │   │   ├── test_quadpack.py
│   │   │       │   │   │   ├── test_quadrature.py
│   │   │       │   │   │   └── test_tanhsinh.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _bvp.py
│   │   │       │   │   ├── _cubature.py
│   │   │       │   │   ├── _dop.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _dop.cp312-win_amd64.pyd
│   │   │       │   │   ├── _lebedev.py
│   │   │       │   │   ├── _lsoda.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _lsoda.cp312-win_amd64.pyd
│   │   │       │   │   ├── _ode.py
│   │   │       │   │   ├── _odepack.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _odepack.cp312-win_amd64.pyd
│   │   │       │   │   ├── _odepack_py.py
│   │   │       │   │   ├── _quad_vec.py
│   │   │       │   │   ├── _quadpack.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _quadpack.cp312-win_amd64.pyd
│   │   │       │   │   ├── _quadpack_py.py
│   │   │       │   │   ├── _quadrature.py
│   │   │       │   │   ├── _tanhsinh.py
│   │   │       │   │   ├── _test_multivariate.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _test_multivariate.cp312-win_amd64.pyd
│   │   │       │   │   ├── _test_odeint_banded.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _test_odeint_banded.cp312-win_amd64.pyd
│   │   │       │   │   ├── _vode.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _vode.cp312-win_amd64.pyd
│   │   │       │   │   ├── dop.py
│   │   │       │   │   ├── lsoda.py
│   │   │       │   │   ├── odepack.py
│   │   │       │   │   ├── quadpack.py
│   │   │       │   │   └── vode.py
│   │   │       │   ├── interpolate/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _bary_rational.cpython-312.pyc
│   │   │       │   │   │   ├── _bsplines.cpython-312.pyc
│   │   │       │   │   │   ├── _cubic.cpython-312.pyc
│   │   │       │   │   │   ├── _fitpack2.cpython-312.pyc
│   │   │       │   │   │   ├── _fitpack_impl.cpython-312.pyc
│   │   │       │   │   │   ├── _fitpack_py.cpython-312.pyc
│   │   │       │   │   │   ├── _fitpack_repro.cpython-312.pyc
│   │   │       │   │   │   ├── _interpolate.cpython-312.pyc
│   │   │       │   │   │   ├── _ndbspline.cpython-312.pyc
│   │   │       │   │   │   ├── _ndgriddata.cpython-312.pyc
│   │   │       │   │   │   ├── _pade.cpython-312.pyc
│   │   │       │   │   │   ├── _polyint.cpython-312.pyc
│   │   │       │   │   │   ├── _rbf.cpython-312.pyc
│   │   │       │   │   │   ├── _rbfinterp.cpython-312.pyc
│   │   │       │   │   │   ├── _rgi.cpython-312.pyc
│   │   │       │   │   │   ├── dfitpack.cpython-312.pyc
│   │   │       │   │   │   ├── fitpack.cpython-312.pyc
│   │   │       │   │   │   ├── fitpack2.cpython-312.pyc
│   │   │       │   │   │   ├── interpnd.cpython-312.pyc
│   │   │       │   │   │   ├── interpolate.cpython-312.pyc
│   │   │       │   │   │   ├── ndgriddata.cpython-312.pyc
│   │   │       │   │   │   ├── polyint.cpython-312.pyc
│   │   │       │   │   │   └── rbf.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bary_rational.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bsplines.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_fitpack.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_fitpack2.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_gil.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_interpnd.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_interpolate.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ndgriddata.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pade.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_polyint.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_rbf.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_rbfinterp.cpython-312.pyc
│   │   │       │   │   │   │   └── test_rgi.cpython-312.pyc
│   │   │       │   │   │   ├── data/
│   │   │       │   │   │   │   ├── bug-1310.npz
│   │   │       │   │   │   │   ├── estimate_gradients_hang.npy
│   │   │       │   │   │   │   └── gcvspl.npz
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_bary_rational.py
│   │   │       │   │   │   ├── test_bsplines.py
│   │   │       │   │   │   ├── test_fitpack.py
│   │   │       │   │   │   ├── test_fitpack2.py
│   │   │       │   │   │   ├── test_gil.py
│   │   │       │   │   │   ├── test_interpnd.py
│   │   │       │   │   │   ├── test_interpolate.py
│   │   │       │   │   │   ├── test_ndgriddata.py
│   │   │       │   │   │   ├── test_pade.py
│   │   │       │   │   │   ├── test_polyint.py
│   │   │       │   │   │   ├── test_rbf.py
│   │   │       │   │   │   ├── test_rbfinterp.py
│   │   │       │   │   │   └── test_rgi.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _bary_rational.py
│   │   │       │   │   ├── _bsplines.py
│   │   │       │   │   ├── _cubic.py
│   │   │       │   │   ├── _dfitpack.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _dfitpack.cp312-win_amd64.pyd
│   │   │       │   │   ├── _dierckx.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _dierckx.cp312-win_amd64.pyd
│   │   │       │   │   ├── _fitpack.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _fitpack.cp312-win_amd64.pyd
│   │   │       │   │   ├── _fitpack2.py
│   │   │       │   │   ├── _fitpack_impl.py
│   │   │       │   │   ├── _fitpack_py.py
│   │   │       │   │   ├── _fitpack_repro.py
│   │   │       │   │   ├── _interpnd.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _interpnd.cp312-win_amd64.pyd
│   │   │       │   │   ├── _interpolate.py
│   │   │       │   │   ├── _ndbspline.py
│   │   │       │   │   ├── _ndgriddata.py
│   │   │       │   │   ├── _pade.py
│   │   │       │   │   ├── _polyint.py
│   │   │       │   │   ├── _ppoly.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _ppoly.cp312-win_amd64.pyd
│   │   │       │   │   ├── _rbf.py
│   │   │       │   │   ├── _rbfinterp.py
│   │   │       │   │   ├── _rbfinterp_pythran.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _rbfinterp_pythran.cp312-win_amd64.pyd
│   │   │       │   │   ├── _rgi.py
│   │   │       │   │   ├── _rgi_cython.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _rgi_cython.cp312-win_amd64.pyd
│   │   │       │   │   ├── dfitpack.py
│   │   │       │   │   ├── fitpack.py
│   │   │       │   │   ├── fitpack2.py
│   │   │       │   │   ├── interpnd.py
│   │   │       │   │   ├── interpolate.py
│   │   │       │   │   ├── ndgriddata.py
│   │   │       │   │   ├── polyint.py
│   │   │       │   │   └── rbf.py
│   │   │       │   ├── io/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _fortran.cpython-312.pyc
│   │   │       │   │   │   ├── _idl.cpython-312.pyc
│   │   │       │   │   │   ├── _mmio.cpython-312.pyc
│   │   │       │   │   │   ├── _netcdf.cpython-312.pyc
│   │   │       │   │   │   ├── harwell_boeing.cpython-312.pyc
│   │   │       │   │   │   ├── idl.cpython-312.pyc
│   │   │       │   │   │   ├── mmio.cpython-312.pyc
│   │   │       │   │   │   ├── netcdf.cpython-312.pyc
│   │   │       │   │   │   └── wavfile.cpython-312.pyc
│   │   │       │   │   ├── _fast_matrix_market/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _fmm_core.cp312-win_amd64.dll.a
│   │   │       │   │   │   └── _fmm_core.cp312-win_amd64.pyd
│   │   │       │   │   ├── _harwell_boeing/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _fortran_format_parser.cpython-312.pyc
│   │   │       │   │   │   │   └── hb.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_fortran_format.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_hb.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_fortran_format.py
│   │   │       │   │   │   │   └── test_hb.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _fortran_format_parser.py
│   │   │       │   │   │   └── hb.py
│   │   │       │   │   ├── arff/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _arffread.cpython-312.pyc
│   │   │       │   │   │   │   └── arffread.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_arffread.cpython-312.pyc
│   │   │       │   │   │   │   ├── data/
│   │   │       │   │   │   │   │   ├── iris.arff
│   │   │       │   │   │   │   │   ├── missing.arff
│   │   │       │   │   │   │   │   ├── nodata.arff
│   │   │       │   │   │   │   │   ├── quoted_nominal.arff
│   │   │       │   │   │   │   │   ├── quoted_nominal_spaces.arff
│   │   │       │   │   │   │   │   ├── test1.arff
│   │   │       │   │   │   │   │   ├── test10.arff
│   │   │       │   │   │   │   │   ├── test11.arff
│   │   │       │   │   │   │   │   ├── test2.arff
│   │   │       │   │   │   │   │   ├── test3.arff
│   │   │       │   │   │   │   │   ├── test4.arff
│   │   │       │   │   │   │   │   ├── test5.arff
│   │   │       │   │   │   │   │   ├── test6.arff
│   │   │       │   │   │   │   │   ├── test7.arff
│   │   │       │   │   │   │   │   ├── test8.arff
│   │   │       │   │   │   │   │   └── test9.arff
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── test_arffread.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _arffread.py
│   │   │       │   │   │   └── arffread.py
│   │   │       │   │   ├── matlab/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _byteordercodes.cpython-312.pyc
│   │   │       │   │   │   │   ├── _mio.cpython-312.pyc
│   │   │       │   │   │   │   ├── _mio4.cpython-312.pyc
│   │   │       │   │   │   │   ├── _mio5.cpython-312.pyc
│   │   │       │   │   │   │   ├── _mio5_params.cpython-312.pyc
│   │   │       │   │   │   │   ├── _miobase.cpython-312.pyc
│   │   │       │   │   │   │   ├── byteordercodes.cpython-312.pyc
│   │   │       │   │   │   │   ├── mio.cpython-312.pyc
│   │   │       │   │   │   │   ├── mio4.cpython-312.pyc
│   │   │       │   │   │   │   ├── mio5.cpython-312.pyc
│   │   │       │   │   │   │   ├── mio5_params.cpython-312.pyc
│   │   │       │   │   │   │   ├── mio5_utils.cpython-312.pyc
│   │   │       │   │   │   │   ├── mio_utils.cpython-312.pyc
│   │   │       │   │   │   │   ├── miobase.cpython-312.pyc
│   │   │       │   │   │   │   └── streams.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_byteordercodes.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_mio.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_mio5_utils.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_mio_funcs.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_mio_utils.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_miobase.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_pathological.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_streams.cpython-312.pyc
│   │   │       │   │   │   │   ├── data/
│   │   │       │   │   │   │   │   ├── bad_miuint32.mat
│   │   │       │   │   │   │   │   ├── bad_miutf8_array_name.mat
│   │   │       │   │   │   │   │   ├── big_endian.mat
│   │   │       │   │   │   │   │   ├── broken_utf8.mat
│   │   │       │   │   │   │   │   ├── corrupted_zlib_checksum.mat
│   │   │       │   │   │   │   │   ├── corrupted_zlib_data.mat
│   │   │       │   │   │   │   │   ├── debigged_m4.mat
│   │   │       │   │   │   │   │   ├── japanese_utf8.txt
│   │   │       │   │   │   │   │   ├── little_endian.mat
│   │   │       │   │   │   │   │   ├── logical_sparse.mat
│   │   │       │   │   │   │   │   ├── malformed1.mat
│   │   │       │   │   │   │   │   ├── miuint32_for_miint32.mat
│   │   │       │   │   │   │   │   ├── miutf8_array_name.mat
│   │   │       │   │   │   │   │   ├── nasty_duplicate_fieldnames.mat
│   │   │       │   │   │   │   │   ├── one_by_zero_char.mat
│   │   │       │   │   │   │   │   ├── parabola.mat
│   │   │       │   │   │   │   │   ├── single_empty_string.mat
│   │   │       │   │   │   │   │   ├── some_functions.mat
│   │   │       │   │   │   │   │   ├── sqr.mat
│   │   │       │   │   │   │   │   ├── test3dmatrix_6.1_SOL2.mat
│   │   │       │   │   │   │   │   ├── test3dmatrix_6.5.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── test3dmatrix_7.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── test3dmatrix_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── test_empty_struct.mat
│   │   │       │   │   │   │   │   ├── test_mat4_le_floats.mat
│   │   │       │   │   │   │   │   ├── test_skip_variable.mat
│   │   │       │   │   │   │   │   ├── testbool_8_WIN64.mat
│   │   │       │   │   │   │   │   ├── testcell_6.1_SOL2.mat
│   │   │       │   │   │   │   │   ├── testcell_6.5.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testcell_7.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testcell_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testcellnest_6.1_SOL2.mat
│   │   │       │   │   │   │   │   ├── testcellnest_6.5.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testcellnest_7.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testcellnest_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testcomplex_4.2c_SOL2.mat
│   │   │       │   │   │   │   │   ├── testcomplex_6.1_SOL2.mat
│   │   │       │   │   │   │   │   ├── testcomplex_6.5.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testcomplex_7.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testcomplex_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testdouble_4.2c_SOL2.mat
│   │   │       │   │   │   │   │   ├── testdouble_6.1_SOL2.mat
│   │   │       │   │   │   │   │   ├── testdouble_6.5.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testdouble_7.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testdouble_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testemptycell_5.3_SOL2.mat
│   │   │       │   │   │   │   │   ├── testemptycell_6.5.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testemptycell_7.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testemptycell_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testfunc_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testhdf5_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testmatrix_4.2c_SOL2.mat
│   │   │       │   │   │   │   │   ├── testmatrix_6.1_SOL2.mat
│   │   │       │   │   │   │   │   ├── testmatrix_6.5.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testmatrix_7.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testmatrix_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testminus_4.2c_SOL2.mat
│   │   │       │   │   │   │   │   ├── testminus_6.1_SOL2.mat
│   │   │       │   │   │   │   │   ├── testminus_6.5.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testminus_7.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testminus_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testmulti_4.2c_SOL2.mat
│   │   │       │   │   │   │   │   ├── testmulti_7.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testmulti_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testobject_6.1_SOL2.mat
│   │   │       │   │   │   │   │   ├── testobject_6.5.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testobject_7.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testobject_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testonechar_4.2c_SOL2.mat
│   │   │       │   │   │   │   │   ├── testonechar_6.1_SOL2.mat
│   │   │       │   │   │   │   │   ├── testonechar_6.5.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testonechar_7.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testonechar_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testscalarcell_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testsimplecell.mat
│   │   │       │   │   │   │   │   ├── testsparse_4.2c_SOL2.mat
│   │   │       │   │   │   │   │   ├── testsparse_6.1_SOL2.mat
│   │   │       │   │   │   │   │   ├── testsparse_6.5.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testsparse_7.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testsparse_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testsparsecomplex_4.2c_SOL2.mat
│   │   │       │   │   │   │   │   ├── testsparsecomplex_6.1_SOL2.mat
│   │   │       │   │   │   │   │   ├── testsparsecomplex_6.5.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testsparsecomplex_7.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testsparsecomplex_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testsparsefloat_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── teststring_4.2c_SOL2.mat
│   │   │       │   │   │   │   │   ├── teststring_6.1_SOL2.mat
│   │   │       │   │   │   │   │   ├── teststring_6.5.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── teststring_7.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── teststring_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── teststringarray_4.2c_SOL2.mat
│   │   │       │   │   │   │   │   ├── teststringarray_6.1_SOL2.mat
│   │   │       │   │   │   │   │   ├── teststringarray_6.5.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── teststringarray_7.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── teststringarray_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── teststruct_6.1_SOL2.mat
│   │   │       │   │   │   │   │   ├── teststruct_6.5.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── teststruct_7.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── teststruct_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── teststructarr_6.1_SOL2.mat
│   │   │       │   │   │   │   │   ├── teststructarr_6.5.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── teststructarr_7.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── teststructarr_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── teststructnest_6.1_SOL2.mat
│   │   │       │   │   │   │   │   ├── teststructnest_6.5.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── teststructnest_7.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── teststructnest_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testunicode_7.1_GLNX86.mat
│   │   │       │   │   │   │   │   ├── testunicode_7.4_GLNX86.mat
│   │   │       │   │   │   │   │   └── testvec_4_GLNX86.mat
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_byteordercodes.py
│   │   │       │   │   │   │   ├── test_mio.py
│   │   │       │   │   │   │   ├── test_mio5_utils.py
│   │   │       │   │   │   │   ├── test_mio_funcs.py
│   │   │       │   │   │   │   ├── test_mio_utils.py
│   │   │       │   │   │   │   ├── test_miobase.py
│   │   │       │   │   │   │   ├── test_pathological.py
│   │   │       │   │   │   │   └── test_streams.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _byteordercodes.py
│   │   │       │   │   │   ├── _mio.py
│   │   │       │   │   │   ├── _mio4.py
│   │   │       │   │   │   ├── _mio5.py
│   │   │       │   │   │   ├── _mio5_params.py
│   │   │       │   │   │   ├── _mio5_utils.cp312-win_amd64.dll.a
│   │   │       │   │   │   ├── _mio5_utils.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _mio_utils.cp312-win_amd64.dll.a
│   │   │       │   │   │   ├── _mio_utils.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _miobase.py
│   │   │       │   │   │   ├── _streams.cp312-win_amd64.dll.a
│   │   │       │   │   │   ├── _streams.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── byteordercodes.py
│   │   │       │   │   │   ├── mio.py
│   │   │       │   │   │   ├── mio4.py
│   │   │       │   │   │   ├── mio5.py
│   │   │       │   │   │   ├── mio5_params.py
│   │   │       │   │   │   ├── mio5_utils.py
│   │   │       │   │   │   ├── mio_utils.py
│   │   │       │   │   │   ├── miobase.py
│   │   │       │   │   │   └── streams.py
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_fortran.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_idl.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mmio.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_netcdf.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_paths.cpython-312.pyc
│   │   │       │   │   │   │   └── test_wavfile.cpython-312.pyc
│   │   │       │   │   │   ├── data/
│   │   │       │   │   │   │   ├── Transparent Busy.ani
│   │   │       │   │   │   │   ├── array_float32_1d.sav
│   │   │       │   │   │   │   ├── array_float32_2d.sav
│   │   │       │   │   │   │   ├── array_float32_3d.sav
│   │   │       │   │   │   │   ├── array_float32_4d.sav
│   │   │       │   │   │   │   ├── array_float32_5d.sav
│   │   │       │   │   │   │   ├── array_float32_6d.sav
│   │   │       │   │   │   │   ├── array_float32_7d.sav
│   │   │       │   │   │   │   ├── array_float32_8d.sav
│   │   │       │   │   │   │   ├── array_float32_pointer_1d.sav
│   │   │       │   │   │   │   ├── array_float32_pointer_2d.sav
│   │   │       │   │   │   │   ├── array_float32_pointer_3d.sav
│   │   │       │   │   │   │   ├── array_float32_pointer_4d.sav
│   │   │       │   │   │   │   ├── array_float32_pointer_5d.sav
│   │   │       │   │   │   │   ├── array_float32_pointer_6d.sav
│   │   │       │   │   │   │   ├── array_float32_pointer_7d.sav
│   │   │       │   │   │   │   ├── array_float32_pointer_8d.sav
│   │   │       │   │   │   │   ├── example_1.nc
│   │   │       │   │   │   │   ├── example_2.nc
│   │   │       │   │   │   │   ├── example_3_maskedvals.nc
│   │   │       │   │   │   │   ├── fortran-3x3d-2i.dat
│   │   │       │   │   │   │   ├── fortran-mixed.dat
│   │   │       │   │   │   │   ├── fortran-sf8-11x1x10.dat
│   │   │       │   │   │   │   ├── fortran-sf8-15x10x22.dat
│   │   │       │   │   │   │   ├── fortran-sf8-1x1x1.dat
│   │   │       │   │   │   │   ├── fortran-sf8-1x1x5.dat
│   │   │       │   │   │   │   ├── fortran-sf8-1x1x7.dat
│   │   │       │   │   │   │   ├── fortran-sf8-1x3x5.dat
│   │   │       │   │   │   │   ├── fortran-si4-11x1x10.dat
│   │   │       │   │   │   │   ├── fortran-si4-15x10x22.dat
│   │   │       │   │   │   │   ├── fortran-si4-1x1x1.dat
│   │   │       │   │   │   │   ├── fortran-si4-1x1x5.dat
│   │   │       │   │   │   │   ├── fortran-si4-1x1x7.dat
│   │   │       │   │   │   │   ├── fortran-si4-1x3x5.dat
│   │   │       │   │   │   │   ├── invalid_pointer.sav
│   │   │       │   │   │   │   ├── null_pointer.sav
│   │   │       │   │   │   │   ├── scalar_byte.sav
│   │   │       │   │   │   │   ├── scalar_byte_descr.sav
│   │   │       │   │   │   │   ├── scalar_complex32.sav
│   │   │       │   │   │   │   ├── scalar_complex64.sav
│   │   │       │   │   │   │   ├── scalar_float32.sav
│   │   │       │   │   │   │   ├── scalar_float64.sav
│   │   │       │   │   │   │   ├── scalar_heap_pointer.sav
│   │   │       │   │   │   │   ├── scalar_int16.sav
│   │   │       │   │   │   │   ├── scalar_int32.sav
│   │   │       │   │   │   │   ├── scalar_int64.sav
│   │   │       │   │   │   │   ├── scalar_string.sav
│   │   │       │   │   │   │   ├── scalar_uint16.sav
│   │   │       │   │   │   │   ├── scalar_uint32.sav
│   │   │       │   │   │   │   ├── scalar_uint64.sav
│   │   │       │   │   │   │   ├── struct_arrays.sav
│   │   │       │   │   │   │   ├── struct_arrays_byte_idl80.sav
│   │   │       │   │   │   │   ├── struct_arrays_replicated.sav
│   │   │       │   │   │   │   ├── struct_arrays_replicated_3d.sav
│   │   │       │   │   │   │   ├── struct_inherit.sav
│   │   │       │   │   │   │   ├── struct_pointer_arrays.sav
│   │   │       │   │   │   │   ├── struct_pointer_arrays_replicated.sav
│   │   │       │   │   │   │   ├── struct_pointer_arrays_replicated_3d.sav
│   │   │       │   │   │   │   ├── struct_pointers.sav
│   │   │       │   │   │   │   ├── struct_pointers_replicated.sav
│   │   │       │   │   │   │   ├── struct_pointers_replicated_3d.sav
│   │   │       │   │   │   │   ├── struct_scalars.sav
│   │   │       │   │   │   │   ├── struct_scalars_replicated.sav
│   │   │       │   │   │   │   ├── struct_scalars_replicated_3d.sav
│   │   │       │   │   │   │   ├── test-1234Hz-le-1ch-10S-20bit-extra.wav
│   │   │       │   │   │   │   ├── test-44100Hz-2ch-32bit-float-be.wav
│   │   │       │   │   │   │   ├── test-44100Hz-2ch-32bit-float-le.wav
│   │   │       │   │   │   │   ├── test-44100Hz-be-1ch-4bytes.wav
│   │   │       │   │   │   │   ├── test-44100Hz-le-1ch-4bytes-early-eof-no-data.wav
│   │   │       │   │   │   │   ├── test-44100Hz-le-1ch-4bytes-early-eof.wav
│   │   │       │   │   │   │   ├── test-44100Hz-le-1ch-4bytes-incomplete-chunk.wav
│   │   │       │   │   │   │   ├── test-44100Hz-le-1ch-4bytes-rf64.wav
│   │   │       │   │   │   │   ├── test-44100Hz-le-1ch-4bytes.wav
│   │   │       │   │   │   │   ├── test-48000Hz-2ch-64bit-float-le-wavex.wav
│   │   │       │   │   │   │   ├── test-8000Hz-be-3ch-5S-24bit.wav
│   │   │       │   │   │   │   ├── test-8000Hz-le-1ch-1byte-ulaw.wav
│   │   │       │   │   │   │   ├── test-8000Hz-le-2ch-1byteu.wav
│   │   │       │   │   │   │   ├── test-8000Hz-le-3ch-5S-24bit-inconsistent.wav
│   │   │       │   │   │   │   ├── test-8000Hz-le-3ch-5S-24bit-rf64.wav
│   │   │       │   │   │   │   ├── test-8000Hz-le-3ch-5S-24bit.wav
│   │   │       │   │   │   │   ├── test-8000Hz-le-3ch-5S-36bit.wav
│   │   │       │   │   │   │   ├── test-8000Hz-le-3ch-5S-45bit.wav
│   │   │       │   │   │   │   ├── test-8000Hz-le-3ch-5S-53bit.wav
│   │   │       │   │   │   │   ├── test-8000Hz-le-3ch-5S-64bit.wav
│   │   │       │   │   │   │   ├── test-8000Hz-le-4ch-9S-12bit.wav
│   │   │       │   │   │   │   ├── test-8000Hz-le-5ch-9S-5bit.wav
│   │   │       │   │   │   │   └── various_compressed.sav
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_fortran.py
│   │   │       │   │   │   ├── test_idl.py
│   │   │       │   │   │   ├── test_mmio.py
│   │   │       │   │   │   ├── test_netcdf.py
│   │   │       │   │   │   ├── test_paths.py
│   │   │       │   │   │   └── test_wavfile.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _fortran.py
│   │   │       │   │   ├── _idl.py
│   │   │       │   │   ├── _mmio.py
│   │   │       │   │   ├── _netcdf.py
│   │   │       │   │   ├── _test_fortran.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _test_fortran.cp312-win_amd64.pyd
│   │   │       │   │   ├── harwell_boeing.py
│   │   │       │   │   ├── idl.py
│   │   │       │   │   ├── mmio.py
│   │   │       │   │   ├── netcdf.py
│   │   │       │   │   └── wavfile.py
│   │   │       │   ├── linalg/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _basic.cpython-312.pyc
│   │   │       │   │   │   ├── _decomp.cpython-312.pyc
│   │   │       │   │   │   ├── _decomp_cholesky.cpython-312.pyc
│   │   │       │   │   │   ├── _decomp_cossin.cpython-312.pyc
│   │   │       │   │   │   ├── _decomp_ldl.cpython-312.pyc
│   │   │       │   │   │   ├── _decomp_lu.cpython-312.pyc
│   │   │       │   │   │   ├── _decomp_polar.cpython-312.pyc
│   │   │       │   │   │   ├── _decomp_qr.cpython-312.pyc
│   │   │       │   │   │   ├── _decomp_qz.cpython-312.pyc
│   │   │       │   │   │   ├── _decomp_schur.cpython-312.pyc
│   │   │       │   │   │   ├── _decomp_svd.cpython-312.pyc
│   │   │       │   │   │   ├── _expm_frechet.cpython-312.pyc
│   │   │       │   │   │   ├── _matfuncs.cpython-312.pyc
│   │   │       │   │   │   ├── _matfuncs_inv_ssq.cpython-312.pyc
│   │   │       │   │   │   ├── _matfuncs_sqrtm.cpython-312.pyc
│   │   │       │   │   │   ├── _misc.cpython-312.pyc
│   │   │       │   │   │   ├── _procrustes.cpython-312.pyc
│   │   │       │   │   │   ├── _sketches.cpython-312.pyc
│   │   │       │   │   │   ├── _solvers.cpython-312.pyc
│   │   │       │   │   │   ├── _special_matrices.cpython-312.pyc
│   │   │       │   │   │   ├── _testutils.cpython-312.pyc
│   │   │       │   │   │   ├── basic.cpython-312.pyc
│   │   │       │   │   │   ├── blas.cpython-312.pyc
│   │   │       │   │   │   ├── decomp.cpython-312.pyc
│   │   │       │   │   │   ├── decomp_cholesky.cpython-312.pyc
│   │   │       │   │   │   ├── decomp_lu.cpython-312.pyc
│   │   │       │   │   │   ├── decomp_qr.cpython-312.pyc
│   │   │       │   │   │   ├── decomp_schur.cpython-312.pyc
│   │   │       │   │   │   ├── decomp_svd.cpython-312.pyc
│   │   │       │   │   │   ├── interpolative.cpython-312.pyc
│   │   │       │   │   │   ├── lapack.cpython-312.pyc
│   │   │       │   │   │   ├── matfuncs.cpython-312.pyc
│   │   │       │   │   │   ├── misc.cpython-312.pyc
│   │   │       │   │   │   └── special_matrices.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_basic.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_batch.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_blas.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cython_blas.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cython_lapack.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cythonized_array_utils.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_decomp.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_decomp_cholesky.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_decomp_cossin.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_decomp_ldl.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_decomp_lu.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_decomp_polar.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_decomp_update.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_extending.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_fblas.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_interpolative.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_lapack.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_matfuncs.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_matmul_toeplitz.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_procrustes.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sketches.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_solve_toeplitz.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_solvers.cpython-312.pyc
│   │   │       │   │   │   │   └── test_special_matrices.cpython-312.pyc
│   │   │       │   │   │   ├── _cython_examples/
│   │   │       │   │   │   │   ├── extending.pyx
│   │   │       │   │   │   │   └── meson.build
│   │   │       │   │   │   ├── data/
│   │   │       │   │   │   │   ├── carex_15_data.npz
│   │   │       │   │   │   │   ├── carex_18_data.npz
│   │   │       │   │   │   │   ├── carex_19_data.npz
│   │   │       │   │   │   │   ├── carex_20_data.npz
│   │   │       │   │   │   │   ├── carex_6_data.npz
│   │   │       │   │   │   │   └── gendare_20170120_data.npz
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_basic.py
│   │   │       │   │   │   ├── test_batch.py
│   │   │       │   │   │   ├── test_blas.py
│   │   │       │   │   │   ├── test_cython_blas.py
│   │   │       │   │   │   ├── test_cython_lapack.py
│   │   │       │   │   │   ├── test_cythonized_array_utils.py
│   │   │       │   │   │   ├── test_decomp.py
│   │   │       │   │   │   ├── test_decomp_cholesky.py
│   │   │       │   │   │   ├── test_decomp_cossin.py
│   │   │       │   │   │   ├── test_decomp_ldl.py
│   │   │       │   │   │   ├── test_decomp_lu.py
│   │   │       │   │   │   ├── test_decomp_polar.py
│   │   │       │   │   │   ├── test_decomp_update.py
│   │   │       │   │   │   ├── test_extending.py
│   │   │       │   │   │   ├── test_fblas.py
│   │   │       │   │   │   ├── test_interpolative.py
│   │   │       │   │   │   ├── test_lapack.py
│   │   │       │   │   │   ├── test_matfuncs.py
│   │   │       │   │   │   ├── test_matmul_toeplitz.py
│   │   │       │   │   │   ├── test_procrustes.py
│   │   │       │   │   │   ├── test_sketches.py
│   │   │       │   │   │   ├── test_solve_toeplitz.py
│   │   │       │   │   │   ├── test_solvers.py
│   │   │       │   │   │   └── test_special_matrices.py
│   │   │       │   │   ├── __init__.pxd
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _basic.py
│   │   │       │   │   ├── _blas_subroutines.h
│   │   │       │   │   ├── _cythonized_array_utils.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _cythonized_array_utils.cp312-win_amd64.pyd
│   │   │       │   │   ├── _cythonized_array_utils.pxd
│   │   │       │   │   ├── _cythonized_array_utils.pyi
│   │   │       │   │   ├── _decomp.py
│   │   │       │   │   ├── _decomp_cholesky.py
│   │   │       │   │   ├── _decomp_cossin.py
│   │   │       │   │   ├── _decomp_interpolative.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _decomp_interpolative.cp312-win_amd64.pyd
│   │   │       │   │   ├── _decomp_ldl.py
│   │   │       │   │   ├── _decomp_lu.py
│   │   │       │   │   ├── _decomp_lu_cython.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _decomp_lu_cython.cp312-win_amd64.pyd
│   │   │       │   │   ├── _decomp_lu_cython.pyi
│   │   │       │   │   ├── _decomp_polar.py
│   │   │       │   │   ├── _decomp_qr.py
│   │   │       │   │   ├── _decomp_qz.py
│   │   │       │   │   ├── _decomp_schur.py
│   │   │       │   │   ├── _decomp_svd.py
│   │   │       │   │   ├── _decomp_update.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _decomp_update.cp312-win_amd64.pyd
│   │   │       │   │   ├── _expm_frechet.py
│   │   │       │   │   ├── _fblas.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _fblas.cp312-win_amd64.pyd
│   │   │       │   │   ├── _flapack.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _flapack.cp312-win_amd64.pyd
│   │   │       │   │   ├── _lapack_subroutines.h
│   │   │       │   │   ├── _linalg_pythran.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _linalg_pythran.cp312-win_amd64.pyd
│   │   │       │   │   ├── _matfuncs.py
│   │   │       │   │   ├── _matfuncs_expm.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _matfuncs_expm.cp312-win_amd64.pyd
│   │   │       │   │   ├── _matfuncs_expm.pyi
│   │   │       │   │   ├── _matfuncs_inv_ssq.py
│   │   │       │   │   ├── _matfuncs_schur_sqrtm.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _matfuncs_schur_sqrtm.cp312-win_amd64.pyd
│   │   │       │   │   ├── _matfuncs_sqrtm.py
│   │   │       │   │   ├── _matfuncs_sqrtm_triu.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _matfuncs_sqrtm_triu.cp312-win_amd64.pyd
│   │   │       │   │   ├── _misc.py
│   │   │       │   │   ├── _procrustes.py
│   │   │       │   │   ├── _sketches.py
│   │   │       │   │   ├── _solve_toeplitz.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _solve_toeplitz.cp312-win_amd64.pyd
│   │   │       │   │   ├── _solvers.py
│   │   │       │   │   ├── _special_matrices.py
│   │   │       │   │   ├── _testutils.py
│   │   │       │   │   ├── basic.py
│   │   │       │   │   ├── blas.py
│   │   │       │   │   ├── cython_blas.cp312-win_amd64.dll.a
│   │   │       │   │   ├── cython_blas.cp312-win_amd64.pyd
│   │   │       │   │   ├── cython_blas.pxd
│   │   │       │   │   ├── cython_blas.pyx
│   │   │       │   │   ├── cython_lapack.cp312-win_amd64.dll.a
│   │   │       │   │   ├── cython_lapack.cp312-win_amd64.pyd
│   │   │       │   │   ├── cython_lapack.pxd
│   │   │       │   │   ├── cython_lapack.pyx
│   │   │       │   │   ├── decomp.py
│   │   │       │   │   ├── decomp_cholesky.py
│   │   │       │   │   ├── decomp_lu.py
│   │   │       │   │   ├── decomp_qr.py
│   │   │       │   │   ├── decomp_schur.py
│   │   │       │   │   ├── decomp_svd.py
│   │   │       │   │   ├── interpolative.py
│   │   │       │   │   ├── lapack.py
│   │   │       │   │   ├── matfuncs.py
│   │   │       │   │   ├── misc.py
│   │   │       │   │   └── special_matrices.py
│   │   │       │   ├── misc/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── common.cpython-312.pyc
│   │   │       │   │   │   └── doccer.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── common.py
│   │   │       │   │   └── doccer.py
│   │   │       │   ├── ndimage/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _delegators.cpython-312.pyc
│   │   │       │   │   │   ├── _filters.cpython-312.pyc
│   │   │       │   │   │   ├── _fourier.cpython-312.pyc
│   │   │       │   │   │   ├── _interpolation.cpython-312.pyc
│   │   │       │   │   │   ├── _measurements.cpython-312.pyc
│   │   │       │   │   │   ├── _morphology.cpython-312.pyc
│   │   │       │   │   │   ├── _ndimage_api.cpython-312.pyc
│   │   │       │   │   │   ├── _ni_docstrings.cpython-312.pyc
│   │   │       │   │   │   ├── _ni_support.cpython-312.pyc
│   │   │       │   │   │   ├── _support_alternative_backends.cpython-312.pyc
│   │   │       │   │   │   ├── filters.cpython-312.pyc
│   │   │       │   │   │   ├── fourier.cpython-312.pyc
│   │   │       │   │   │   ├── interpolation.cpython-312.pyc
│   │   │       │   │   │   ├── measurements.cpython-312.pyc
│   │   │       │   │   │   └── morphology.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_c_api.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_datatypes.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_filters.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_fourier.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_interpolation.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_measurements.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_morphology.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ni_support.cpython-312.pyc
│   │   │       │   │   │   │   └── test_splines.cpython-312.pyc
│   │   │       │   │   │   ├── data/
│   │   │       │   │   │   │   ├── label_inputs.txt
│   │   │       │   │   │   │   ├── label_results.txt
│   │   │       │   │   │   │   └── label_strels.txt
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── dots.png
│   │   │       │   │   │   ├── test_c_api.py
│   │   │       │   │   │   ├── test_datatypes.py
│   │   │       │   │   │   ├── test_filters.py
│   │   │       │   │   │   ├── test_fourier.py
│   │   │       │   │   │   ├── test_interpolation.py
│   │   │       │   │   │   ├── test_measurements.py
│   │   │       │   │   │   ├── test_morphology.py
│   │   │       │   │   │   ├── test_ni_support.py
│   │   │       │   │   │   └── test_splines.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _ctest.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _ctest.cp312-win_amd64.pyd
│   │   │       │   │   ├── _cytest.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _cytest.cp312-win_amd64.pyd
│   │   │       │   │   ├── _delegators.py
│   │   │       │   │   ├── _filters.py
│   │   │       │   │   ├── _fourier.py
│   │   │       │   │   ├── _interpolation.py
│   │   │       │   │   ├── _measurements.py
│   │   │       │   │   ├── _morphology.py
│   │   │       │   │   ├── _nd_image.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _nd_image.cp312-win_amd64.pyd
│   │   │       │   │   ├── _ndimage_api.py
│   │   │       │   │   ├── _ni_docstrings.py
│   │   │       │   │   ├── _ni_label.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _ni_label.cp312-win_amd64.pyd
│   │   │       │   │   ├── _ni_support.py
│   │   │       │   │   ├── _rank_filter_1d.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _rank_filter_1d.cp312-win_amd64.pyd
│   │   │       │   │   ├── _support_alternative_backends.py
│   │   │       │   │   ├── filters.py
│   │   │       │   │   ├── fourier.py
│   │   │       │   │   ├── interpolation.py
│   │   │       │   │   ├── measurements.py
│   │   │       │   │   └── morphology.py
│   │   │       │   ├── odr/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _add_newdocs.cpython-312.pyc
│   │   │       │   │   │   ├── _models.cpython-312.pyc
│   │   │       │   │   │   ├── _odrpack.cpython-312.pyc
│   │   │       │   │   │   ├── models.cpython-312.pyc
│   │   │       │   │   │   └── odrpack.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── test_odr.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── test_odr.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── __odrpack.cp312-win_amd64.dll.a
│   │   │       │   │   ├── __odrpack.cp312-win_amd64.pyd
│   │   │       │   │   ├── _add_newdocs.py
│   │   │       │   │   ├── _models.py
│   │   │       │   │   ├── _odrpack.py
│   │   │       │   │   ├── models.py
│   │   │       │   │   └── odrpack.py
│   │   │       │   ├── optimize/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _basinhopping.cpython-312.pyc
│   │   │       │   │   │   ├── _bracket.cpython-312.pyc
│   │   │       │   │   │   ├── _chandrupatla.cpython-312.pyc
│   │   │       │   │   │   ├── _cobyla_py.cpython-312.pyc
│   │   │       │   │   │   ├── _cobyqa_py.cpython-312.pyc
│   │   │       │   │   │   ├── _constraints.cpython-312.pyc
│   │   │       │   │   │   ├── _dcsrch.cpython-312.pyc
│   │   │       │   │   │   ├── _differentiable_functions.cpython-312.pyc
│   │   │       │   │   │   ├── _differentialevolution.cpython-312.pyc
│   │   │       │   │   │   ├── _direct_py.cpython-312.pyc
│   │   │       │   │   │   ├── _dual_annealing.cpython-312.pyc
│   │   │       │   │   │   ├── _elementwise.cpython-312.pyc
│   │   │       │   │   │   ├── _hessian_update_strategy.cpython-312.pyc
│   │   │       │   │   │   ├── _isotonic.cpython-312.pyc
│   │   │       │   │   │   ├── _lbfgsb_py.cpython-312.pyc
│   │   │       │   │   │   ├── _linesearch.cpython-312.pyc
│   │   │       │   │   │   ├── _linprog.cpython-312.pyc
│   │   │       │   │   │   ├── _linprog_doc.cpython-312.pyc
│   │   │       │   │   │   ├── _linprog_highs.cpython-312.pyc
│   │   │       │   │   │   ├── _linprog_ip.cpython-312.pyc
│   │   │       │   │   │   ├── _linprog_rs.cpython-312.pyc
│   │   │       │   │   │   ├── _linprog_simplex.cpython-312.pyc
│   │   │       │   │   │   ├── _linprog_util.cpython-312.pyc
│   │   │       │   │   │   ├── _milp.cpython-312.pyc
│   │   │       │   │   │   ├── _minimize.cpython-312.pyc
│   │   │       │   │   │   ├── _minpack_py.cpython-312.pyc
│   │   │       │   │   │   ├── _nnls.cpython-312.pyc
│   │   │       │   │   │   ├── _nonlin.cpython-312.pyc
│   │   │       │   │   │   ├── _numdiff.cpython-312.pyc
│   │   │       │   │   │   ├── _optimize.cpython-312.pyc
│   │   │       │   │   │   ├── _qap.cpython-312.pyc
│   │   │       │   │   │   ├── _remove_redundancy.cpython-312.pyc
│   │   │       │   │   │   ├── _root.cpython-312.pyc
│   │   │       │   │   │   ├── _root_scalar.cpython-312.pyc
│   │   │       │   │   │   ├── _shgo.cpython-312.pyc
│   │   │       │   │   │   ├── _slsqp_py.cpython-312.pyc
│   │   │       │   │   │   ├── _spectral.cpython-312.pyc
│   │   │       │   │   │   ├── _tnc.cpython-312.pyc
│   │   │       │   │   │   ├── _trustregion.cpython-312.pyc
│   │   │       │   │   │   ├── _trustregion_dogleg.cpython-312.pyc
│   │   │       │   │   │   ├── _trustregion_exact.cpython-312.pyc
│   │   │       │   │   │   ├── _trustregion_krylov.cpython-312.pyc
│   │   │       │   │   │   ├── _trustregion_ncg.cpython-312.pyc
│   │   │       │   │   │   ├── _tstutils.cpython-312.pyc
│   │   │       │   │   │   ├── _zeros_py.cpython-312.pyc
│   │   │       │   │   │   ├── cobyla.cpython-312.pyc
│   │   │       │   │   │   ├── elementwise.cpython-312.pyc
│   │   │       │   │   │   ├── lbfgsb.cpython-312.pyc
│   │   │       │   │   │   ├── linesearch.cpython-312.pyc
│   │   │       │   │   │   ├── minpack.cpython-312.pyc
│   │   │       │   │   │   ├── minpack2.cpython-312.pyc
│   │   │       │   │   │   ├── moduleTNC.cpython-312.pyc
│   │   │       │   │   │   ├── nonlin.cpython-312.pyc
│   │   │       │   │   │   ├── optimize.cpython-312.pyc
│   │   │       │   │   │   ├── slsqp.cpython-312.pyc
│   │   │       │   │   │   ├── tnc.cpython-312.pyc
│   │   │       │   │   │   └── zeros.cpython-312.pyc
│   │   │       │   │   ├── _highspy/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── _highs_wrapper.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _core.cp312-win_amd64.dll.a
│   │   │       │   │   │   ├── _core.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _highs_options.cp312-win_amd64.dll.a
│   │   │       │   │   │   ├── _highs_options.cp312-win_amd64.pyd
│   │   │       │   │   │   └── _highs_wrapper.py
│   │   │       │   │   ├── _lsq/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── bvls.cpython-312.pyc
│   │   │       │   │   │   │   ├── common.cpython-312.pyc
│   │   │       │   │   │   │   ├── dogbox.cpython-312.pyc
│   │   │       │   │   │   │   ├── least_squares.cpython-312.pyc
│   │   │       │   │   │   │   ├── lsq_linear.cpython-312.pyc
│   │   │       │   │   │   │   ├── trf.cpython-312.pyc
│   │   │       │   │   │   │   └── trf_linear.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── bvls.py
│   │   │       │   │   │   ├── common.py
│   │   │       │   │   │   ├── dogbox.py
│   │   │       │   │   │   ├── givens_elimination.cp312-win_amd64.dll.a
│   │   │       │   │   │   ├── givens_elimination.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── least_squares.py
│   │   │       │   │   │   ├── lsq_linear.py
│   │   │       │   │   │   ├── trf.py
│   │   │       │   │   │   └── trf_linear.py
│   │   │       │   │   ├── _shgo_lib/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _complex.cpython-312.pyc
│   │   │       │   │   │   │   └── _vertex.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _complex.py
│   │   │       │   │   │   └── _vertex.py
│   │   │       │   │   ├── _trlib/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _trlib.cp312-win_amd64.dll.a
│   │   │       │   │   │   └── _trlib.cp312-win_amd64.pyd
│   │   │       │   │   ├── _trustregion_constr/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── canonical_constraint.cpython-312.pyc
│   │   │       │   │   │   │   ├── equality_constrained_sqp.cpython-312.pyc
│   │   │       │   │   │   │   ├── minimize_trustregion_constr.cpython-312.pyc
│   │   │       │   │   │   │   ├── projections.cpython-312.pyc
│   │   │       │   │   │   │   ├── qp_subproblem.cpython-312.pyc
│   │   │       │   │   │   │   ├── report.cpython-312.pyc
│   │   │       │   │   │   │   └── tr_interior_point.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_canonical_constraint.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_nested_minimize.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_projections.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_qp_subproblem.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_report.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_canonical_constraint.py
│   │   │       │   │   │   │   ├── test_nested_minimize.py
│   │   │       │   │   │   │   ├── test_projections.py
│   │   │       │   │   │   │   ├── test_qp_subproblem.py
│   │   │       │   │   │   │   └── test_report.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── canonical_constraint.py
│   │   │       │   │   │   ├── equality_constrained_sqp.py
│   │   │       │   │   │   ├── minimize_trustregion_constr.py
│   │   │       │   │   │   ├── projections.py
│   │   │       │   │   │   ├── qp_subproblem.py
│   │   │       │   │   │   ├── report.py
│   │   │       │   │   │   └── tr_interior_point.py
│   │   │       │   │   ├── cython_optimize/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _zeros.cp312-win_amd64.dll.a
│   │   │       │   │   │   ├── _zeros.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _zeros.pxd
│   │   │       │   │   │   └── c_zeros.pxd
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__basinhopping.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__differential_evolution.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__dual_annealing.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__linprog_clean_inputs.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__numdiff.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__remove_redundancy.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__root.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__shgo.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__spectral.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bracket.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_chandrupatla.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cobyla.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cobyqa.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_constraint_conversion.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_constraints.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cython_optimize.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_differentiable_functions.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_direct.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_extending.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_hessian_update_strategy.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_isotonic_regression.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_lbfgsb_hessinv.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_lbfgsb_setulb.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_least_squares.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_linear_assignment.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_linesearch.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_linprog.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_lsq_common.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_lsq_linear.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_milp.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_minimize_constrained.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_minpack.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_nnls.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_nonlin.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_optimize.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_quadratic_assignment.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_regression.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_slsqp.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_tnc.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_trustregion.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_trustregion_exact.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_trustregion_krylov.cpython-312.pyc
│   │   │       │   │   │   │   └── test_zeros.cpython-312.pyc
│   │   │       │   │   │   ├── _cython_examples/
│   │   │       │   │   │   │   ├── extending.pyx
│   │   │       │   │   │   │   └── meson.build
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test__basinhopping.py
│   │   │       │   │   │   ├── test__differential_evolution.py
│   │   │       │   │   │   ├── test__dual_annealing.py
│   │   │       │   │   │   ├── test__linprog_clean_inputs.py
│   │   │       │   │   │   ├── test__numdiff.py
│   │   │       │   │   │   ├── test__remove_redundancy.py
│   │   │       │   │   │   ├── test__root.py
│   │   │       │   │   │   ├── test__shgo.py
│   │   │       │   │   │   ├── test__spectral.py
│   │   │       │   │   │   ├── test_bracket.py
│   │   │       │   │   │   ├── test_chandrupatla.py
│   │   │       │   │   │   ├── test_cobyla.py
│   │   │       │   │   │   ├── test_cobyqa.py
│   │   │       │   │   │   ├── test_constraint_conversion.py
│   │   │       │   │   │   ├── test_constraints.py
│   │   │       │   │   │   ├── test_cython_optimize.py
│   │   │       │   │   │   ├── test_differentiable_functions.py
│   │   │       │   │   │   ├── test_direct.py
│   │   │       │   │   │   ├── test_extending.py
│   │   │       │   │   │   ├── test_hessian_update_strategy.py
│   │   │       │   │   │   ├── test_isotonic_regression.py
│   │   │       │   │   │   ├── test_lbfgsb_hessinv.py
│   │   │       │   │   │   ├── test_lbfgsb_setulb.py
│   │   │       │   │   │   ├── test_least_squares.py
│   │   │       │   │   │   ├── test_linear_assignment.py
│   │   │       │   │   │   ├── test_linesearch.py
│   │   │       │   │   │   ├── test_linprog.py
│   │   │       │   │   │   ├── test_lsq_common.py
│   │   │       │   │   │   ├── test_lsq_linear.py
│   │   │       │   │   │   ├── test_milp.py
│   │   │       │   │   │   ├── test_minimize_constrained.py
│   │   │       │   │   │   ├── test_minpack.py
│   │   │       │   │   │   ├── test_nnls.py
│   │   │       │   │   │   ├── test_nonlin.py
│   │   │       │   │   │   ├── test_optimize.py
│   │   │       │   │   │   ├── test_quadratic_assignment.py
│   │   │       │   │   │   ├── test_regression.py
│   │   │       │   │   │   ├── test_slsqp.py
│   │   │       │   │   │   ├── test_tnc.py
│   │   │       │   │   │   ├── test_trustregion.py
│   │   │       │   │   │   ├── test_trustregion_exact.py
│   │   │       │   │   │   ├── test_trustregion_krylov.py
│   │   │       │   │   │   └── test_zeros.py
│   │   │       │   │   ├── __init__.pxd
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _basinhopping.py
│   │   │       │   │   ├── _bglu_dense.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _bglu_dense.cp312-win_amd64.pyd
│   │   │       │   │   ├── _bracket.py
│   │   │       │   │   ├── _chandrupatla.py
│   │   │       │   │   ├── _cobyla_py.py
│   │   │       │   │   ├── _cobyqa_py.py
│   │   │       │   │   ├── _constraints.py
│   │   │       │   │   ├── _dcsrch.py
│   │   │       │   │   ├── _differentiable_functions.py
│   │   │       │   │   ├── _differentialevolution.py
│   │   │       │   │   ├── _direct.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _direct.cp312-win_amd64.pyd
│   │   │       │   │   ├── _direct_py.py
│   │   │       │   │   ├── _dual_annealing.py
│   │   │       │   │   ├── _elementwise.py
│   │   │       │   │   ├── _group_columns.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _group_columns.cp312-win_amd64.pyd
│   │   │       │   │   ├── _hessian_update_strategy.py
│   │   │       │   │   ├── _isotonic.py
│   │   │       │   │   ├── _lbfgsb.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _lbfgsb.cp312-win_amd64.pyd
│   │   │       │   │   ├── _lbfgsb_py.py
│   │   │       │   │   ├── _linesearch.py
│   │   │       │   │   ├── _linprog.py
│   │   │       │   │   ├── _linprog_doc.py
│   │   │       │   │   ├── _linprog_highs.py
│   │   │       │   │   ├── _linprog_ip.py
│   │   │       │   │   ├── _linprog_rs.py
│   │   │       │   │   ├── _linprog_simplex.py
│   │   │       │   │   ├── _linprog_util.py
│   │   │       │   │   ├── _lsap.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _lsap.cp312-win_amd64.pyd
│   │   │       │   │   ├── _milp.py
│   │   │       │   │   ├── _minimize.py
│   │   │       │   │   ├── _minpack.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _minpack.cp312-win_amd64.pyd
│   │   │       │   │   ├── _minpack_py.py
│   │   │       │   │   ├── _moduleTNC.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _moduleTNC.cp312-win_amd64.pyd
│   │   │       │   │   ├── _nnls.py
│   │   │       │   │   ├── _nonlin.py
│   │   │       │   │   ├── _numdiff.py
│   │   │       │   │   ├── _optimize.py
│   │   │       │   │   ├── _pava_pybind.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _pava_pybind.cp312-win_amd64.pyd
│   │   │       │   │   ├── _qap.py
│   │   │       │   │   ├── _remove_redundancy.py
│   │   │       │   │   ├── _root.py
│   │   │       │   │   ├── _root_scalar.py
│   │   │       │   │   ├── _shgo.py
│   │   │       │   │   ├── _slsqp_py.py
│   │   │       │   │   ├── _slsqplib.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _slsqplib.cp312-win_amd64.pyd
│   │   │       │   │   ├── _spectral.py
│   │   │       │   │   ├── _tnc.py
│   │   │       │   │   ├── _trustregion.py
│   │   │       │   │   ├── _trustregion_dogleg.py
│   │   │       │   │   ├── _trustregion_exact.py
│   │   │       │   │   ├── _trustregion_krylov.py
│   │   │       │   │   ├── _trustregion_ncg.py
│   │   │       │   │   ├── _tstutils.py
│   │   │       │   │   ├── _zeros.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _zeros.cp312-win_amd64.pyd
│   │   │       │   │   ├── _zeros_py.py
│   │   │       │   │   ├── cobyla.py
│   │   │       │   │   ├── cython_optimize.pxd
│   │   │       │   │   ├── elementwise.py
│   │   │       │   │   ├── lbfgsb.py
│   │   │       │   │   ├── linesearch.py
│   │   │       │   │   ├── minpack.py
│   │   │       │   │   ├── minpack2.py
│   │   │       │   │   ├── moduleTNC.py
│   │   │       │   │   ├── nonlin.py
│   │   │       │   │   ├── optimize.py
│   │   │       │   │   ├── slsqp.py
│   │   │       │   │   ├── tnc.py
│   │   │       │   │   └── zeros.py
│   │   │       │   ├── signal/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _arraytools.cpython-312.pyc
│   │   │       │   │   │   ├── _czt.cpython-312.pyc
│   │   │       │   │   │   ├── _delegators.cpython-312.pyc
│   │   │       │   │   │   ├── _filter_design.cpython-312.pyc
│   │   │       │   │   │   ├── _fir_filter_design.cpython-312.pyc
│   │   │       │   │   │   ├── _lti_conversion.cpython-312.pyc
│   │   │       │   │   │   ├── _ltisys.cpython-312.pyc
│   │   │       │   │   │   ├── _max_len_seq.cpython-312.pyc
│   │   │       │   │   │   ├── _peak_finding.cpython-312.pyc
│   │   │       │   │   │   ├── _polyutils.cpython-312.pyc
│   │   │       │   │   │   ├── _savitzky_golay.cpython-312.pyc
│   │   │       │   │   │   ├── _short_time_fft.cpython-312.pyc
│   │   │       │   │   │   ├── _signal_api.cpython-312.pyc
│   │   │       │   │   │   ├── _signaltools.cpython-312.pyc
│   │   │       │   │   │   ├── _spectral_py.cpython-312.pyc
│   │   │       │   │   │   ├── _spline_filters.cpython-312.pyc
│   │   │       │   │   │   ├── _support_alternative_backends.cpython-312.pyc
│   │   │       │   │   │   ├── _upfirdn.cpython-312.pyc
│   │   │       │   │   │   ├── _waveforms.cpython-312.pyc
│   │   │       │   │   │   ├── _wavelets.cpython-312.pyc
│   │   │       │   │   │   ├── bsplines.cpython-312.pyc
│   │   │       │   │   │   ├── filter_design.cpython-312.pyc
│   │   │       │   │   │   ├── fir_filter_design.cpython-312.pyc
│   │   │       │   │   │   ├── lti_conversion.cpython-312.pyc
│   │   │       │   │   │   ├── ltisys.cpython-312.pyc
│   │   │       │   │   │   ├── signaltools.cpython-312.pyc
│   │   │       │   │   │   ├── spectral.cpython-312.pyc
│   │   │       │   │   │   ├── spline.cpython-312.pyc
│   │   │       │   │   │   ├── waveforms.cpython-312.pyc
│   │   │       │   │   │   └── wavelets.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _scipy_spectral_test_shim.cpython-312.pyc
│   │   │       │   │   │   │   ├── mpsig.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_array_tools.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bsplines.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cont2discrete.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_czt.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_dltisys.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_filter_design.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_fir_filter_design.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ltisys.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_max_len_seq.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_peak_finding.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_result_type.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_savitzky_golay.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_short_time_fft.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_signaltools.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_spectral.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_splines.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_upfirdn.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_waveforms.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_wavelets.cpython-312.pyc
│   │   │       │   │   │   │   └── test_windows.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _scipy_spectral_test_shim.py
│   │   │       │   │   │   ├── mpsig.py
│   │   │       │   │   │   ├── test_array_tools.py
│   │   │       │   │   │   ├── test_bsplines.py
│   │   │       │   │   │   ├── test_cont2discrete.py
│   │   │       │   │   │   ├── test_czt.py
│   │   │       │   │   │   ├── test_dltisys.py
│   │   │       │   │   │   ├── test_filter_design.py
│   │   │       │   │   │   ├── test_fir_filter_design.py
│   │   │       │   │   │   ├── test_ltisys.py
│   │   │       │   │   │   ├── test_max_len_seq.py
│   │   │       │   │   │   ├── test_peak_finding.py
│   │   │       │   │   │   ├── test_result_type.py
│   │   │       │   │   │   ├── test_savitzky_golay.py
│   │   │       │   │   │   ├── test_short_time_fft.py
│   │   │       │   │   │   ├── test_signaltools.py
│   │   │       │   │   │   ├── test_spectral.py
│   │   │       │   │   │   ├── test_splines.py
│   │   │       │   │   │   ├── test_upfirdn.py
│   │   │       │   │   │   ├── test_waveforms.py
│   │   │       │   │   │   ├── test_wavelets.py
│   │   │       │   │   │   └── test_windows.py
│   │   │       │   │   ├── windows/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _windows.cpython-312.pyc
│   │   │       │   │   │   │   └── windows.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _windows.py
│   │   │       │   │   │   └── windows.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _arraytools.py
│   │   │       │   │   ├── _czt.py
│   │   │       │   │   ├── _delegators.py
│   │   │       │   │   ├── _filter_design.py
│   │   │       │   │   ├── _fir_filter_design.py
│   │   │       │   │   ├── _lti_conversion.py
│   │   │       │   │   ├── _ltisys.py
│   │   │       │   │   ├── _max_len_seq.py
│   │   │       │   │   ├── _max_len_seq_inner.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _max_len_seq_inner.cp312-win_amd64.pyd
│   │   │       │   │   ├── _peak_finding.py
│   │   │       │   │   ├── _peak_finding_utils.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _peak_finding_utils.cp312-win_amd64.pyd
│   │   │       │   │   ├── _polyutils.py
│   │   │       │   │   ├── _savitzky_golay.py
│   │   │       │   │   ├── _short_time_fft.py
│   │   │       │   │   ├── _signal_api.py
│   │   │       │   │   ├── _signaltools.py
│   │   │       │   │   ├── _sigtools.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _sigtools.cp312-win_amd64.pyd
│   │   │       │   │   ├── _sosfilt.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _sosfilt.cp312-win_amd64.pyd
│   │   │       │   │   ├── _spectral_py.py
│   │   │       │   │   ├── _spline.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _spline.cp312-win_amd64.pyd
│   │   │       │   │   ├── _spline.pyi
│   │   │       │   │   ├── _spline_filters.py
│   │   │       │   │   ├── _support_alternative_backends.py
│   │   │       │   │   ├── _upfirdn.py
│   │   │       │   │   ├── _upfirdn_apply.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _upfirdn_apply.cp312-win_amd64.pyd
│   │   │       │   │   ├── _waveforms.py
│   │   │       │   │   ├── _wavelets.py
│   │   │       │   │   ├── bsplines.py
│   │   │       │   │   ├── filter_design.py
│   │   │       │   │   ├── fir_filter_design.py
│   │   │       │   │   ├── lti_conversion.py
│   │   │       │   │   ├── ltisys.py
│   │   │       │   │   ├── signaltools.py
│   │   │       │   │   ├── spectral.py
│   │   │       │   │   ├── spline.py
│   │   │       │   │   ├── waveforms.py
│   │   │       │   │   └── wavelets.py
│   │   │       │   ├── sparse/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _base.cpython-312.pyc
│   │   │       │   │   │   ├── _bsr.cpython-312.pyc
│   │   │       │   │   │   ├── _compressed.cpython-312.pyc
│   │   │       │   │   │   ├── _construct.cpython-312.pyc
│   │   │       │   │   │   ├── _coo.cpython-312.pyc
│   │   │       │   │   │   ├── _csc.cpython-312.pyc
│   │   │       │   │   │   ├── _csr.cpython-312.pyc
│   │   │       │   │   │   ├── _data.cpython-312.pyc
│   │   │       │   │   │   ├── _dia.cpython-312.pyc
│   │   │       │   │   │   ├── _dok.cpython-312.pyc
│   │   │       │   │   │   ├── _extract.cpython-312.pyc
│   │   │       │   │   │   ├── _index.cpython-312.pyc
│   │   │       │   │   │   ├── _lil.cpython-312.pyc
│   │   │       │   │   │   ├── _matrix.cpython-312.pyc
│   │   │       │   │   │   ├── _matrix_io.cpython-312.pyc
│   │   │       │   │   │   ├── _spfuncs.cpython-312.pyc
│   │   │       │   │   │   ├── _sputils.cpython-312.pyc
│   │   │       │   │   │   ├── base.cpython-312.pyc
│   │   │       │   │   │   ├── bsr.cpython-312.pyc
│   │   │       │   │   │   ├── compressed.cpython-312.pyc
│   │   │       │   │   │   ├── construct.cpython-312.pyc
│   │   │       │   │   │   ├── coo.cpython-312.pyc
│   │   │       │   │   │   ├── csc.cpython-312.pyc
│   │   │       │   │   │   ├── csr.cpython-312.pyc
│   │   │       │   │   │   ├── data.cpython-312.pyc
│   │   │       │   │   │   ├── dia.cpython-312.pyc
│   │   │       │   │   │   ├── dok.cpython-312.pyc
│   │   │       │   │   │   ├── extract.cpython-312.pyc
│   │   │       │   │   │   ├── lil.cpython-312.pyc
│   │   │       │   │   │   ├── sparsetools.cpython-312.pyc
│   │   │       │   │   │   ├── spfuncs.cpython-312.pyc
│   │   │       │   │   │   └── sputils.cpython-312.pyc
│   │   │       │   │   ├── csgraph/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _laplacian.cpython-312.pyc
│   │   │       │   │   │   │   └── _validation.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_connected_components.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_conversions.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_flow.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_graph_laplacian.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_matching.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_pydata_sparse.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_reordering.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_shortest_path.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_spanning_tree.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_traversal.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_connected_components.py
│   │   │       │   │   │   │   ├── test_conversions.py
│   │   │       │   │   │   │   ├── test_flow.py
│   │   │       │   │   │   │   ├── test_graph_laplacian.py
│   │   │       │   │   │   │   ├── test_matching.py
│   │   │       │   │   │   │   ├── test_pydata_sparse.py
│   │   │       │   │   │   │   ├── test_reordering.py
│   │   │       │   │   │   │   ├── test_shortest_path.py
│   │   │       │   │   │   │   ├── test_spanning_tree.py
│   │   │       │   │   │   │   └── test_traversal.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _flow.cp312-win_amd64.dll.a
│   │   │       │   │   │   ├── _flow.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _laplacian.py
│   │   │       │   │   │   ├── _matching.cp312-win_amd64.dll.a
│   │   │       │   │   │   ├── _matching.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _min_spanning_tree.cp312-win_amd64.dll.a
│   │   │       │   │   │   ├── _min_spanning_tree.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _reordering.cp312-win_amd64.dll.a
│   │   │       │   │   │   ├── _reordering.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _shortest_path.cp312-win_amd64.dll.a
│   │   │       │   │   │   ├── _shortest_path.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _tools.cp312-win_amd64.dll.a
│   │   │       │   │   │   ├── _tools.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _traversal.cp312-win_amd64.dll.a
│   │   │       │   │   │   ├── _traversal.cp312-win_amd64.pyd
│   │   │       │   │   │   └── _validation.py
│   │   │       │   │   ├── linalg/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _expm_multiply.cpython-312.pyc
│   │   │       │   │   │   │   ├── _interface.cpython-312.pyc
│   │   │       │   │   │   │   ├── _matfuncs.cpython-312.pyc
│   │   │       │   │   │   │   ├── _norm.cpython-312.pyc
│   │   │       │   │   │   │   ├── _onenormest.cpython-312.pyc
│   │   │       │   │   │   │   ├── _special_sparse_arrays.cpython-312.pyc
│   │   │       │   │   │   │   ├── _svdp.cpython-312.pyc
│   │   │       │   │   │   │   ├── dsolve.cpython-312.pyc
│   │   │       │   │   │   │   ├── eigen.cpython-312.pyc
│   │   │       │   │   │   │   ├── interface.cpython-312.pyc
│   │   │       │   │   │   │   ├── isolve.cpython-312.pyc
│   │   │       │   │   │   │   └── matfuncs.cpython-312.pyc
│   │   │       │   │   │   ├── _dsolve/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _add_newdocs.cpython-312.pyc
│   │   │       │   │   │   │   │   └── linsolve.cpython-312.pyc
│   │   │       │   │   │   │   ├── tests/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── test_linsolve.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   └── test_linsolve.py
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── _add_newdocs.py
│   │   │       │   │   │   │   ├── _superlu.cp312-win_amd64.dll.a
│   │   │       │   │   │   │   ├── _superlu.cp312-win_amd64.pyd
│   │   │       │   │   │   │   └── linsolve.py
│   │   │       │   │   │   ├── _eigen/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _svds.cpython-312.pyc
│   │   │       │   │   │   │   │   └── _svds_doc.cpython-312.pyc
│   │   │       │   │   │   │   ├── arpack/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── arpack.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── tests/
│   │   │       │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   │   └── test_arpack.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   │   └── test_arpack.py
│   │   │       │   │   │   │   │   ├── COPYING
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── _arpack.cp312-win_amd64.dll.a
│   │   │       │   │   │   │   │   ├── _arpack.cp312-win_amd64.pyd
│   │   │       │   │   │   │   │   └── arpack.py
│   │   │       │   │   │   │   ├── lobpcg/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── lobpcg.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── tests/
│   │   │       │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   │   └── test_lobpcg.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   │   └── test_lobpcg.py
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   └── lobpcg.py
│   │   │       │   │   │   │   ├── tests/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── test_svds.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   └── test_svds.py
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── _svds.py
│   │   │       │   │   │   │   └── _svds_doc.py
│   │   │       │   │   │   ├── _isolve/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _gcrotmk.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── iterative.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── lgmres.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── lsmr.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── lsqr.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── minres.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── tfqmr.cpython-312.pyc
│   │   │       │   │   │   │   │   └── utils.cpython-312.pyc
│   │   │       │   │   │   │   ├── tests/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_gcrotmk.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_iterative.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_lgmres.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_lsmr.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_lsqr.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_minres.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── test_utils.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── test_gcrotmk.py
│   │   │       │   │   │   │   │   ├── test_iterative.py
│   │   │       │   │   │   │   │   ├── test_lgmres.py
│   │   │       │   │   │   │   │   ├── test_lsmr.py
│   │   │       │   │   │   │   │   ├── test_lsqr.py
│   │   │       │   │   │   │   │   ├── test_minres.py
│   │   │       │   │   │   │   │   └── test_utils.py
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── _gcrotmk.py
│   │   │       │   │   │   │   ├── iterative.py
│   │   │       │   │   │   │   ├── lgmres.py
│   │   │       │   │   │   │   ├── lsmr.py
│   │   │       │   │   │   │   ├── lsqr.py
│   │   │       │   │   │   │   ├── minres.py
│   │   │       │   │   │   │   ├── tfqmr.py
│   │   │       │   │   │   │   └── utils.py
│   │   │       │   │   │   ├── _propack/
│   │   │       │   │   │   │   ├── _cpropack.cp312-win_amd64.dll.a
│   │   │       │   │   │   │   ├── _cpropack.cp312-win_amd64.pyd
│   │   │       │   │   │   │   ├── _dpropack.cp312-win_amd64.dll.a
│   │   │       │   │   │   │   ├── _dpropack.cp312-win_amd64.pyd
│   │   │       │   │   │   │   ├── _spropack.cp312-win_amd64.dll.a
│   │   │       │   │   │   │   ├── _spropack.cp312-win_amd64.pyd
│   │   │       │   │   │   │   ├── _zpropack.cp312-win_amd64.dll.a
│   │   │       │   │   │   │   └── _zpropack.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_expm_multiply.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_interface.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_matfuncs.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_norm.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_onenormest.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_propack.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_pydata_sparse.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_special_sparse_arrays.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── propack_test_data.npz
│   │   │       │   │   │   │   ├── test_expm_multiply.py
│   │   │       │   │   │   │   ├── test_interface.py
│   │   │       │   │   │   │   ├── test_matfuncs.py
│   │   │       │   │   │   │   ├── test_norm.py
│   │   │       │   │   │   │   ├── test_onenormest.py
│   │   │       │   │   │   │   ├── test_propack.py
│   │   │       │   │   │   │   ├── test_pydata_sparse.py
│   │   │       │   │   │   │   └── test_special_sparse_arrays.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _expm_multiply.py
│   │   │       │   │   │   ├── _interface.py
│   │   │       │   │   │   ├── _matfuncs.py
│   │   │       │   │   │   ├── _norm.py
│   │   │       │   │   │   ├── _onenormest.py
│   │   │       │   │   │   ├── _special_sparse_arrays.py
│   │   │       │   │   │   ├── _svdp.py
│   │   │       │   │   │   ├── dsolve.py
│   │   │       │   │   │   ├── eigen.py
│   │   │       │   │   │   ├── interface.py
│   │   │       │   │   │   ├── isolve.py
│   │   │       │   │   │   └── matfuncs.py
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_arithmetic1d.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_array_api.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_base.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_common1d.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_construct.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_coo.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_csc.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_csr.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_dok.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_extract.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_indexing1d.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_matrix_io.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_minmax1d.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sparsetools.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_spfuncs.cpython-312.pyc
│   │   │       │   │   │   │   └── test_sputils.cpython-312.pyc
│   │   │       │   │   │   ├── data/
│   │   │       │   │   │   │   ├── csc_py2.npz
│   │   │       │   │   │   │   └── csc_py3.npz
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_arithmetic1d.py
│   │   │       │   │   │   ├── test_array_api.py
│   │   │       │   │   │   ├── test_base.py
│   │   │       │   │   │   ├── test_common1d.py
│   │   │       │   │   │   ├── test_construct.py
│   │   │       │   │   │   ├── test_coo.py
│   │   │       │   │   │   ├── test_csc.py
│   │   │       │   │   │   ├── test_csr.py
│   │   │       │   │   │   ├── test_dok.py
│   │   │       │   │   │   ├── test_extract.py
│   │   │       │   │   │   ├── test_indexing1d.py
│   │   │       │   │   │   ├── test_matrix_io.py
│   │   │       │   │   │   ├── test_minmax1d.py
│   │   │       │   │   │   ├── test_sparsetools.py
│   │   │       │   │   │   ├── test_spfuncs.py
│   │   │       │   │   │   └── test_sputils.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _base.py
│   │   │       │   │   ├── _bsr.py
│   │   │       │   │   ├── _compressed.py
│   │   │       │   │   ├── _construct.py
│   │   │       │   │   ├── _coo.py
│   │   │       │   │   ├── _csc.py
│   │   │       │   │   ├── _csparsetools.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _csparsetools.cp312-win_amd64.pyd
│   │   │       │   │   ├── _csr.py
│   │   │       │   │   ├── _data.py
│   │   │       │   │   ├── _dia.py
│   │   │       │   │   ├── _dok.py
│   │   │       │   │   ├── _extract.py
│   │   │       │   │   ├── _index.py
│   │   │       │   │   ├── _lil.py
│   │   │       │   │   ├── _matrix.py
│   │   │       │   │   ├── _matrix_io.py
│   │   │       │   │   ├── _sparsetools.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _sparsetools.cp312-win_amd64.pyd
│   │   │       │   │   ├── _spfuncs.py
│   │   │       │   │   ├── _sputils.py
│   │   │       │   │   ├── base.py
│   │   │       │   │   ├── bsr.py
│   │   │       │   │   ├── compressed.py
│   │   │       │   │   ├── construct.py
│   │   │       │   │   ├── coo.py
│   │   │       │   │   ├── csc.py
│   │   │       │   │   ├── csr.py
│   │   │       │   │   ├── data.py
│   │   │       │   │   ├── dia.py
│   │   │       │   │   ├── dok.py
│   │   │       │   │   ├── extract.py
│   │   │       │   │   ├── lil.py
│   │   │       │   │   ├── sparsetools.py
│   │   │       │   │   ├── spfuncs.py
│   │   │       │   │   └── sputils.py
│   │   │       │   ├── spatial/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _geometric_slerp.cpython-312.pyc
│   │   │       │   │   │   ├── _kdtree.cpython-312.pyc
│   │   │       │   │   │   ├── _plotutils.cpython-312.pyc
│   │   │       │   │   │   ├── _procrustes.cpython-312.pyc
│   │   │       │   │   │   ├── _spherical_voronoi.cpython-312.pyc
│   │   │       │   │   │   ├── ckdtree.cpython-312.pyc
│   │   │       │   │   │   ├── distance.cpython-312.pyc
│   │   │       │   │   │   ├── kdtree.cpython-312.pyc
│   │   │       │   │   │   └── qhull.cpython-312.pyc
│   │   │       │   │   ├── qhull_src/
│   │   │       │   │   │   └── COPYING_QHULL.txt
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__plotutils.cpython-312.pyc
│   │   │       │   │   │   │   ├── test__procrustes.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_distance.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_hausdorff.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_kdtree.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_qhull.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_slerp.cpython-312.pyc
│   │   │       │   │   │   │   └── test_spherical_voronoi.cpython-312.pyc
│   │   │       │   │   │   ├── data/
│   │   │       │   │   │   │   ├── cdist-X1.txt
│   │   │       │   │   │   │   ├── cdist-X2.txt
│   │   │       │   │   │   │   ├── degenerate_pointset.npz
│   │   │       │   │   │   │   ├── iris.txt
│   │   │       │   │   │   │   ├── pdist-boolean-inp.txt
│   │   │       │   │   │   │   ├── pdist-chebyshev-ml-iris.txt
│   │   │       │   │   │   │   ├── pdist-chebyshev-ml.txt
│   │   │       │   │   │   │   ├── pdist-cityblock-ml-iris.txt
│   │   │       │   │   │   │   ├── pdist-cityblock-ml.txt
│   │   │       │   │   │   │   ├── pdist-correlation-ml-iris.txt
│   │   │       │   │   │   │   ├── pdist-correlation-ml.txt
│   │   │       │   │   │   │   ├── pdist-cosine-ml-iris.txt
│   │   │       │   │   │   │   ├── pdist-cosine-ml.txt
│   │   │       │   │   │   │   ├── pdist-double-inp.txt
│   │   │       │   │   │   │   ├── pdist-euclidean-ml-iris.txt
│   │   │       │   │   │   │   ├── pdist-euclidean-ml.txt
│   │   │       │   │   │   │   ├── pdist-hamming-ml.txt
│   │   │       │   │   │   │   ├── pdist-jaccard-ml.txt
│   │   │       │   │   │   │   ├── pdist-jensenshannon-ml-iris.txt
│   │   │       │   │   │   │   ├── pdist-jensenshannon-ml.txt
│   │   │       │   │   │   │   ├── pdist-minkowski-3.2-ml-iris.txt
│   │   │       │   │   │   │   ├── pdist-minkowski-3.2-ml.txt
│   │   │       │   │   │   │   ├── pdist-minkowski-5.8-ml-iris.txt
│   │   │       │   │   │   │   ├── pdist-seuclidean-ml-iris.txt
│   │   │       │   │   │   │   ├── pdist-seuclidean-ml.txt
│   │   │       │   │   │   │   ├── pdist-spearman-ml.txt
│   │   │       │   │   │   │   ├── random-bool-data.txt
│   │   │       │   │   │   │   ├── random-double-data.txt
│   │   │       │   │   │   │   ├── random-int-data.txt
│   │   │       │   │   │   │   ├── random-uint-data.txt
│   │   │       │   │   │   │   └── selfdual-4d-polytope.txt
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test__plotutils.py
│   │   │       │   │   │   ├── test__procrustes.py
│   │   │       │   │   │   ├── test_distance.py
│   │   │       │   │   │   ├── test_hausdorff.py
│   │   │       │   │   │   ├── test_kdtree.py
│   │   │       │   │   │   ├── test_qhull.py
│   │   │       │   │   │   ├── test_slerp.py
│   │   │       │   │   │   └── test_spherical_voronoi.py
│   │   │       │   │   ├── transform/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _rotation_groups.cpython-312.pyc
│   │   │       │   │   │   │   ├── _rotation_spline.cpython-312.pyc
│   │   │       │   │   │   │   └── rotation.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_rigid_transform.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_rotation.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_rotation_groups.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_rotation_spline.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_rigid_transform.py
│   │   │       │   │   │   │   ├── test_rotation.py
│   │   │       │   │   │   │   ├── test_rotation_groups.py
│   │   │       │   │   │   │   └── test_rotation_spline.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _rigid_transform.cp312-win_amd64.dll.a
│   │   │       │   │   │   ├── _rigid_transform.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _rotation.cp312-win_amd64.dll.a
│   │   │       │   │   │   ├── _rotation.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _rotation_groups.py
│   │   │       │   │   │   ├── _rotation_spline.py
│   │   │       │   │   │   └── rotation.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _ckdtree.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _ckdtree.cp312-win_amd64.pyd
│   │   │       │   │   ├── _distance_pybind.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _distance_pybind.cp312-win_amd64.pyd
│   │   │       │   │   ├── _distance_wrap.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _distance_wrap.cp312-win_amd64.pyd
│   │   │       │   │   ├── _geometric_slerp.py
│   │   │       │   │   ├── _hausdorff.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _hausdorff.cp312-win_amd64.pyd
│   │   │       │   │   ├── _kdtree.py
│   │   │       │   │   ├── _plotutils.py
│   │   │       │   │   ├── _procrustes.py
│   │   │       │   │   ├── _qhull.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _qhull.cp312-win_amd64.pyd
│   │   │       │   │   ├── _qhull.pyi
│   │   │       │   │   ├── _spherical_voronoi.py
│   │   │       │   │   ├── _voronoi.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _voronoi.cp312-win_amd64.pyd
│   │   │       │   │   ├── _voronoi.pyi
│   │   │       │   │   ├── ckdtree.py
│   │   │       │   │   ├── distance.py
│   │   │       │   │   ├── distance.pyi
│   │   │       │   │   ├── kdtree.py
│   │   │       │   │   └── qhull.py
│   │   │       │   ├── special/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _add_newdocs.cpython-312.pyc
│   │   │       │   │   │   ├── _basic.cpython-312.pyc
│   │   │       │   │   │   ├── _ellip_harm.cpython-312.pyc
│   │   │       │   │   │   ├── _input_validation.cpython-312.pyc
│   │   │       │   │   │   ├── _lambertw.cpython-312.pyc
│   │   │       │   │   │   ├── _logsumexp.cpython-312.pyc
│   │   │       │   │   │   ├── _mptestutils.cpython-312.pyc
│   │   │       │   │   │   ├── _multiufuncs.cpython-312.pyc
│   │   │       │   │   │   ├── _orthogonal.cpython-312.pyc
│   │   │       │   │   │   ├── _sf_error.cpython-312.pyc
│   │   │       │   │   │   ├── _spfun_stats.cpython-312.pyc
│   │   │       │   │   │   ├── _spherical_bessel.cpython-312.pyc
│   │   │       │   │   │   ├── _support_alternative_backends.cpython-312.pyc
│   │   │       │   │   │   ├── _testutils.cpython-312.pyc
│   │   │       │   │   │   ├── add_newdocs.cpython-312.pyc
│   │   │       │   │   │   ├── basic.cpython-312.pyc
│   │   │       │   │   │   ├── orthogonal.cpython-312.pyc
│   │   │       │   │   │   ├── sf_error.cpython-312.pyc
│   │   │       │   │   │   ├── specfun.cpython-312.pyc
│   │   │       │   │   │   └── spfun_stats.cpython-312.pyc
│   │   │       │   │   ├── _precompute/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── cosine_cdf.cpython-312.pyc
│   │   │       │   │   │   │   ├── expn_asy.cpython-312.pyc
│   │   │       │   │   │   │   ├── gammainc_asy.cpython-312.pyc
│   │   │       │   │   │   │   ├── gammainc_data.cpython-312.pyc
│   │   │       │   │   │   │   ├── hyp2f1_data.cpython-312.pyc
│   │   │       │   │   │   │   ├── lambertw.cpython-312.pyc
│   │   │       │   │   │   │   ├── loggamma.cpython-312.pyc
│   │   │       │   │   │   │   ├── struve_convergence.cpython-312.pyc
│   │   │       │   │   │   │   ├── utils.cpython-312.pyc
│   │   │       │   │   │   │   ├── wright_bessel.cpython-312.pyc
│   │   │       │   │   │   │   ├── wright_bessel_data.cpython-312.pyc
│   │   │       │   │   │   │   ├── wrightomega.cpython-312.pyc
│   │   │       │   │   │   │   └── zetac.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── cosine_cdf.py
│   │   │       │   │   │   ├── expn_asy.py
│   │   │       │   │   │   ├── gammainc_asy.py
│   │   │       │   │   │   ├── gammainc_data.py
│   │   │       │   │   │   ├── hyp2f1_data.py
│   │   │       │   │   │   ├── lambertw.py
│   │   │       │   │   │   ├── loggamma.py
│   │   │       │   │   │   ├── struve_convergence.py
│   │   │       │   │   │   ├── utils.py
│   │   │       │   │   │   ├── wright_bessel.py
│   │   │       │   │   │   ├── wright_bessel_data.py
│   │   │       │   │   │   ├── wrightomega.py
│   │   │       │   │   │   └── zetac.py
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_basic.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bdtr.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_boost_ufuncs.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_boxcox.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cdflib.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cdft_asymptotic.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cephes_intp_cast.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cosine_distr.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cython_special.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_data.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_dd.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_digamma.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ellip_harm.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_erfinv.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_exponential_integrals.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_extending.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_faddeeva.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_gamma.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_gammainc.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_hyp2f1.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_hypergeometric.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_iv_ratio.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_kolmogorov.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_lambertw.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_legendre.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_log1mexp.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_loggamma.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_logit.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_logsumexp.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mpmath.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_nan_inputs.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ndtr.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ndtri_exp.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_orthogonal.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_orthogonal_eval.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_owens_t.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pcf.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pdtr.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_powm1.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_precompute_expn_asy.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_precompute_gammainc.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_precompute_utils.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_round.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sf_error.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sici.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_specfun.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_spence.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_spfun_stats.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sph_harm.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_spherical_bessel.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_support_alternative_backends.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_trig.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ufunc_signatures.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_wright_bessel.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_wrightomega.cpython-312.pyc
│   │   │       │   │   │   │   └── test_zeta.cpython-312.pyc
│   │   │       │   │   │   ├── _cython_examples/
│   │   │       │   │   │   │   ├── extending.pyx
│   │   │       │   │   │   │   └── meson.build
│   │   │       │   │   │   ├── data/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── boost.npz
│   │   │       │   │   │   │   ├── gsl.npz
│   │   │       │   │   │   │   └── local.npz
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_basic.py
│   │   │       │   │   │   ├── test_bdtr.py
│   │   │       │   │   │   ├── test_boost_ufuncs.py
│   │   │       │   │   │   ├── test_boxcox.py
│   │   │       │   │   │   ├── test_cdflib.py
│   │   │       │   │   │   ├── test_cdft_asymptotic.py
│   │   │       │   │   │   ├── test_cephes_intp_cast.py
│   │   │       │   │   │   ├── test_cosine_distr.py
│   │   │       │   │   │   ├── test_cython_special.py
│   │   │       │   │   │   ├── test_data.py
│   │   │       │   │   │   ├── test_dd.py
│   │   │       │   │   │   ├── test_digamma.py
│   │   │       │   │   │   ├── test_ellip_harm.py
│   │   │       │   │   │   ├── test_erfinv.py
│   │   │       │   │   │   ├── test_exponential_integrals.py
│   │   │       │   │   │   ├── test_extending.py
│   │   │       │   │   │   ├── test_faddeeva.py
│   │   │       │   │   │   ├── test_gamma.py
│   │   │       │   │   │   ├── test_gammainc.py
│   │   │       │   │   │   ├── test_hyp2f1.py
│   │   │       │   │   │   ├── test_hypergeometric.py
│   │   │       │   │   │   ├── test_iv_ratio.py
│   │   │       │   │   │   ├── test_kolmogorov.py
│   │   │       │   │   │   ├── test_lambertw.py
│   │   │       │   │   │   ├── test_legendre.py
│   │   │       │   │   │   ├── test_log1mexp.py
│   │   │       │   │   │   ├── test_loggamma.py
│   │   │       │   │   │   ├── test_logit.py
│   │   │       │   │   │   ├── test_logsumexp.py
│   │   │       │   │   │   ├── test_mpmath.py
│   │   │       │   │   │   ├── test_nan_inputs.py
│   │   │       │   │   │   ├── test_ndtr.py
│   │   │       │   │   │   ├── test_ndtri_exp.py
│   │   │       │   │   │   ├── test_orthogonal.py
│   │   │       │   │   │   ├── test_orthogonal_eval.py
│   │   │       │   │   │   ├── test_owens_t.py
│   │   │       │   │   │   ├── test_pcf.py
│   │   │       │   │   │   ├── test_pdtr.py
│   │   │       │   │   │   ├── test_powm1.py
│   │   │       │   │   │   ├── test_precompute_expn_asy.py
│   │   │       │   │   │   ├── test_precompute_gammainc.py
│   │   │       │   │   │   ├── test_precompute_utils.py
│   │   │       │   │   │   ├── test_round.py
│   │   │       │   │   │   ├── test_sf_error.py
│   │   │       │   │   │   ├── test_sici.py
│   │   │       │   │   │   ├── test_specfun.py
│   │   │       │   │   │   ├── test_spence.py
│   │   │       │   │   │   ├── test_spfun_stats.py
│   │   │       │   │   │   ├── test_sph_harm.py
│   │   │       │   │   │   ├── test_spherical_bessel.py
│   │   │       │   │   │   ├── test_support_alternative_backends.py
│   │   │       │   │   │   ├── test_trig.py
│   │   │       │   │   │   ├── test_ufunc_signatures.py
│   │   │       │   │   │   ├── test_wright_bessel.py
│   │   │       │   │   │   ├── test_wrightomega.py
│   │   │       │   │   │   └── test_zeta.py
│   │   │       │   │   ├── __init__.pxd
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _add_newdocs.py
│   │   │       │   │   ├── _basic.py
│   │   │       │   │   ├── _comb.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _comb.cp312-win_amd64.pyd
│   │   │       │   │   ├── _ellip_harm.py
│   │   │       │   │   ├── _ellip_harm_2.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _ellip_harm_2.cp312-win_amd64.pyd
│   │   │       │   │   ├── _gufuncs.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _gufuncs.cp312-win_amd64.pyd
│   │   │       │   │   ├── _input_validation.py
│   │   │       │   │   ├── _lambertw.py
│   │   │       │   │   ├── _logsumexp.py
│   │   │       │   │   ├── _mptestutils.py
│   │   │       │   │   ├── _multiufuncs.py
│   │   │       │   │   ├── _orthogonal.py
│   │   │       │   │   ├── _orthogonal.pyi
│   │   │       │   │   ├── _sf_error.py
│   │   │       │   │   ├── _specfun.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _specfun.cp312-win_amd64.pyd
│   │   │       │   │   ├── _special_ufuncs.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _special_ufuncs.cp312-win_amd64.pyd
│   │   │       │   │   ├── _spfun_stats.py
│   │   │       │   │   ├── _spherical_bessel.py
│   │   │       │   │   ├── _support_alternative_backends.py
│   │   │       │   │   ├── _test_internal.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _test_internal.cp312-win_amd64.pyd
│   │   │       │   │   ├── _test_internal.pyi
│   │   │       │   │   ├── _testutils.py
│   │   │       │   │   ├── _ufuncs.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _ufuncs.cp312-win_amd64.pyd
│   │   │       │   │   ├── _ufuncs.pyi
│   │   │       │   │   ├── _ufuncs.pyx
│   │   │       │   │   ├── _ufuncs_cxx.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _ufuncs_cxx.cp312-win_amd64.pyd
│   │   │       │   │   ├── _ufuncs_cxx.pxd
│   │   │       │   │   ├── _ufuncs_cxx.pyx
│   │   │       │   │   ├── _ufuncs_cxx_defs.h
│   │   │       │   │   ├── _ufuncs_defs.h
│   │   │       │   │   ├── add_newdocs.py
│   │   │       │   │   ├── basic.py
│   │   │       │   │   ├── cython_special.cp312-win_amd64.dll.a
│   │   │       │   │   ├── cython_special.cp312-win_amd64.pyd
│   │   │       │   │   ├── cython_special.pxd
│   │   │       │   │   ├── cython_special.pyi
│   │   │       │   │   ├── orthogonal.py
│   │   │       │   │   ├── sf_error.py
│   │   │       │   │   ├── specfun.py
│   │   │       │   │   └── spfun_stats.py
│   │   │       │   ├── stats/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _axis_nan_policy.cpython-312.pyc
│   │   │       │   │   │   ├── _binned_statistic.cpython-312.pyc
│   │   │       │   │   │   ├── _binomtest.cpython-312.pyc
│   │   │       │   │   │   ├── _bws_test.cpython-312.pyc
│   │   │       │   │   │   ├── _censored_data.cpython-312.pyc
│   │   │       │   │   │   ├── _common.cpython-312.pyc
│   │   │       │   │   │   ├── _constants.cpython-312.pyc
│   │   │       │   │   │   ├── _continued_fraction.cpython-312.pyc
│   │   │       │   │   │   ├── _continuous_distns.cpython-312.pyc
│   │   │       │   │   │   ├── _correlation.cpython-312.pyc
│   │   │       │   │   │   ├── _covariance.cpython-312.pyc
│   │   │       │   │   │   ├── _crosstab.cpython-312.pyc
│   │   │       │   │   │   ├── _discrete_distns.cpython-312.pyc
│   │   │       │   │   │   ├── _distn_infrastructure.cpython-312.pyc
│   │   │       │   │   │   ├── _distr_params.cpython-312.pyc
│   │   │       │   │   │   ├── _distribution_infrastructure.cpython-312.pyc
│   │   │       │   │   │   ├── _entropy.cpython-312.pyc
│   │   │       │   │   │   ├── _finite_differences.cpython-312.pyc
│   │   │       │   │   │   ├── _fit.cpython-312.pyc
│   │   │       │   │   │   ├── _hypotests.cpython-312.pyc
│   │   │       │   │   │   ├── _kde.cpython-312.pyc
│   │   │       │   │   │   ├── _ksstats.cpython-312.pyc
│   │   │       │   │   │   ├── _mannwhitneyu.cpython-312.pyc
│   │   │       │   │   │   ├── _mgc.cpython-312.pyc
│   │   │       │   │   │   ├── _morestats.cpython-312.pyc
│   │   │       │   │   │   ├── _mstats_basic.cpython-312.pyc
│   │   │       │   │   │   ├── _mstats_extras.cpython-312.pyc
│   │   │       │   │   │   ├── _multicomp.cpython-312.pyc
│   │   │       │   │   │   ├── _multivariate.cpython-312.pyc
│   │   │       │   │   │   ├── _new_distributions.cpython-312.pyc
│   │   │       │   │   │   ├── _odds_ratio.cpython-312.pyc
│   │   │       │   │   │   ├── _page_trend_test.cpython-312.pyc
│   │   │       │   │   │   ├── _probability_distribution.cpython-312.pyc
│   │   │       │   │   │   ├── _qmc.cpython-312.pyc
│   │   │       │   │   │   ├── _qmvnt.cpython-312.pyc
│   │   │       │   │   │   ├── _quantile.cpython-312.pyc
│   │   │       │   │   │   ├── _relative_risk.cpython-312.pyc
│   │   │       │   │   │   ├── _resampling.cpython-312.pyc
│   │   │       │   │   │   ├── _result_classes.cpython-312.pyc
│   │   │       │   │   │   ├── _sampling.cpython-312.pyc
│   │   │       │   │   │   ├── _sensitivity_analysis.cpython-312.pyc
│   │   │       │   │   │   ├── _stats_mstats_common.cpython-312.pyc
│   │   │       │   │   │   ├── _stats_py.cpython-312.pyc
│   │   │       │   │   │   ├── _survival.cpython-312.pyc
│   │   │       │   │   │   ├── _tukeylambda_stats.cpython-312.pyc
│   │   │       │   │   │   ├── _variation.cpython-312.pyc
│   │   │       │   │   │   ├── _warnings_errors.cpython-312.pyc
│   │   │       │   │   │   ├── _wilcoxon.cpython-312.pyc
│   │   │       │   │   │   ├── biasedurn.cpython-312.pyc
│   │   │       │   │   │   ├── contingency.cpython-312.pyc
│   │   │       │   │   │   ├── distributions.cpython-312.pyc
│   │   │       │   │   │   ├── kde.cpython-312.pyc
│   │   │       │   │   │   ├── morestats.cpython-312.pyc
│   │   │       │   │   │   ├── mstats.cpython-312.pyc
│   │   │       │   │   │   ├── mstats_basic.cpython-312.pyc
│   │   │       │   │   │   ├── mstats_extras.cpython-312.pyc
│   │   │       │   │   │   ├── mvn.cpython-312.pyc
│   │   │       │   │   │   ├── qmc.cpython-312.pyc
│   │   │       │   │   │   ├── sampling.cpython-312.pyc
│   │   │       │   │   │   └── stats.cpython-312.pyc
│   │   │       │   │   ├── _levy_stable/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── levyst.cp312-win_amd64.dll.a
│   │   │       │   │   │   └── levyst.cp312-win_amd64.pyd
│   │   │       │   │   ├── _rcont/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── rcont.cp312-win_amd64.dll.a
│   │   │       │   │   │   └── rcont.cp312-win_amd64.pyd
│   │   │       │   │   ├── _unuran/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── unuran_wrapper.cp312-win_amd64.dll.a
│   │   │       │   │   │   ├── unuran_wrapper.cp312-win_amd64.pyd
│   │   │       │   │   │   └── unuran_wrapper.pyi
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── common_tests.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_axis_nan_policy.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_binned_statistic.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_censored_data.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_contingency.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_continued_fraction.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_continuous.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_continuous_basic.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_continuous_fit_censored.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_correlation.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_crosstab.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_discrete_basic.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_discrete_distns.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_distributions.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_entropy.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_fast_gen_inversion.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_fit.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_hypotests.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_kdeoth.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_marray.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mgc.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_morestats.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mstats_basic.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mstats_extras.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_multicomp.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_multivariate.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_odds_ratio.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_qmc.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_quantile.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_rank.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_relative_risk.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_resampling.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sampling.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sensitivity_analysis.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_stats.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_survival.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_tukeylambda_stats.cpython-312.pyc
│   │   │       │   │   │   │   └── test_variation.cpython-312.pyc
│   │   │       │   │   │   ├── data/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── _mvt.cpython-312.pyc
│   │   │       │   │   │   │   │   └── fisher_exact_results_from_r.cpython-312.pyc
│   │   │       │   │   │   │   ├── levy_stable/
│   │   │       │   │   │   │   │   ├── stable-Z1-cdf-sample-data.npy
│   │   │       │   │   │   │   │   ├── stable-Z1-pdf-sample-data.npy
│   │   │       │   │   │   │   │   └── stable-loc-scale-sample-data.npy
│   │   │       │   │   │   │   ├── nist_anova/
│   │   │       │   │   │   │   │   ├── AtmWtAg.dat
│   │   │       │   │   │   │   │   ├── SiRstv.dat
│   │   │       │   │   │   │   │   ├── SmLs01.dat
│   │   │       │   │   │   │   │   ├── SmLs02.dat
│   │   │       │   │   │   │   │   ├── SmLs03.dat
│   │   │       │   │   │   │   │   ├── SmLs04.dat
│   │   │       │   │   │   │   │   ├── SmLs05.dat
│   │   │       │   │   │   │   │   ├── SmLs06.dat
│   │   │       │   │   │   │   │   ├── SmLs07.dat
│   │   │       │   │   │   │   │   ├── SmLs08.dat
│   │   │       │   │   │   │   │   └── SmLs09.dat
│   │   │       │   │   │   │   ├── nist_linregress/
│   │   │       │   │   │   │   │   └── Norris.dat
│   │   │       │   │   │   │   ├── _mvt.py
│   │   │       │   │   │   │   ├── fisher_exact_results_from_r.py
│   │   │       │   │   │   │   ├── jf_skew_t_gamlss_pdf_data.npy
│   │   │       │   │   │   │   ├── rel_breitwigner_pdf_sample_data_ROOT.npy
│   │   │       │   │   │   │   └── studentized_range_mpmath_ref.json
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── common_tests.py
│   │   │       │   │   │   ├── test_axis_nan_policy.py
│   │   │       │   │   │   ├── test_binned_statistic.py
│   │   │       │   │   │   ├── test_censored_data.py
│   │   │       │   │   │   ├── test_contingency.py
│   │   │       │   │   │   ├── test_continued_fraction.py
│   │   │       │   │   │   ├── test_continuous.py
│   │   │       │   │   │   ├── test_continuous_basic.py
│   │   │       │   │   │   ├── test_continuous_fit_censored.py
│   │   │       │   │   │   ├── test_correlation.py
│   │   │       │   │   │   ├── test_crosstab.py
│   │   │       │   │   │   ├── test_discrete_basic.py
│   │   │       │   │   │   ├── test_discrete_distns.py
│   │   │       │   │   │   ├── test_distributions.py
│   │   │       │   │   │   ├── test_entropy.py
│   │   │       │   │   │   ├── test_fast_gen_inversion.py
│   │   │       │   │   │   ├── test_fit.py
│   │   │       │   │   │   ├── test_hypotests.py
│   │   │       │   │   │   ├── test_kdeoth.py
│   │   │       │   │   │   ├── test_marray.py
│   │   │       │   │   │   ├── test_mgc.py
│   │   │       │   │   │   ├── test_morestats.py
│   │   │       │   │   │   ├── test_mstats_basic.py
│   │   │       │   │   │   ├── test_mstats_extras.py
│   │   │       │   │   │   ├── test_multicomp.py
│   │   │       │   │   │   ├── test_multivariate.py
│   │   │       │   │   │   ├── test_odds_ratio.py
│   │   │       │   │   │   ├── test_qmc.py
│   │   │       │   │   │   ├── test_quantile.py
│   │   │       │   │   │   ├── test_rank.py
│   │   │       │   │   │   ├── test_relative_risk.py
│   │   │       │   │   │   ├── test_resampling.py
│   │   │       │   │   │   ├── test_sampling.py
│   │   │       │   │   │   ├── test_sensitivity_analysis.py
│   │   │       │   │   │   ├── test_stats.py
│   │   │       │   │   │   ├── test_survival.py
│   │   │       │   │   │   ├── test_tukeylambda_stats.py
│   │   │       │   │   │   └── test_variation.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _ansari_swilk_statistics.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _ansari_swilk_statistics.cp312-win_amd64.pyd
│   │   │       │   │   ├── _axis_nan_policy.py
│   │   │       │   │   ├── _biasedurn.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _biasedurn.cp312-win_amd64.pyd
│   │   │       │   │   ├── _biasedurn.pxd
│   │   │       │   │   ├── _binned_statistic.py
│   │   │       │   │   ├── _binomtest.py
│   │   │       │   │   ├── _bws_test.py
│   │   │       │   │   ├── _censored_data.py
│   │   │       │   │   ├── _common.py
│   │   │       │   │   ├── _constants.py
│   │   │       │   │   ├── _continued_fraction.py
│   │   │       │   │   ├── _continuous_distns.py
│   │   │       │   │   ├── _correlation.py
│   │   │       │   │   ├── _covariance.py
│   │   │       │   │   ├── _crosstab.py
│   │   │       │   │   ├── _discrete_distns.py
│   │   │       │   │   ├── _distn_infrastructure.py
│   │   │       │   │   ├── _distr_params.py
│   │   │       │   │   ├── _distribution_infrastructure.py
│   │   │       │   │   ├── _entropy.py
│   │   │       │   │   ├── _finite_differences.py
│   │   │       │   │   ├── _fit.py
│   │   │       │   │   ├── _hypotests.py
│   │   │       │   │   ├── _kde.py
│   │   │       │   │   ├── _ksstats.py
│   │   │       │   │   ├── _mannwhitneyu.py
│   │   │       │   │   ├── _mgc.py
│   │   │       │   │   ├── _morestats.py
│   │   │       │   │   ├── _mstats_basic.py
│   │   │       │   │   ├── _mstats_extras.py
│   │   │       │   │   ├── _multicomp.py
│   │   │       │   │   ├── _multivariate.py
│   │   │       │   │   ├── _new_distributions.py
│   │   │       │   │   ├── _odds_ratio.py
│   │   │       │   │   ├── _page_trend_test.py
│   │   │       │   │   ├── _probability_distribution.py
│   │   │       │   │   ├── _qmc.py
│   │   │       │   │   ├── _qmc_cy.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _qmc_cy.cp312-win_amd64.pyd
│   │   │       │   │   ├── _qmc_cy.pyi
│   │   │       │   │   ├── _qmvnt.py
│   │   │       │   │   ├── _qmvnt_cy.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _qmvnt_cy.cp312-win_amd64.pyd
│   │   │       │   │   ├── _quantile.py
│   │   │       │   │   ├── _relative_risk.py
│   │   │       │   │   ├── _resampling.py
│   │   │       │   │   ├── _result_classes.py
│   │   │       │   │   ├── _sampling.py
│   │   │       │   │   ├── _sensitivity_analysis.py
│   │   │       │   │   ├── _sobol.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _sobol.cp312-win_amd64.pyd
│   │   │       │   │   ├── _sobol.pyi
│   │   │       │   │   ├── _sobol_direction_numbers.npz
│   │   │       │   │   ├── _stats.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _stats.cp312-win_amd64.pyd
│   │   │       │   │   ├── _stats.pxd
│   │   │       │   │   ├── _stats_mstats_common.py
│   │   │       │   │   ├── _stats_py.py
│   │   │       │   │   ├── _stats_pythran.cp312-win_amd64.dll.a
│   │   │       │   │   ├── _stats_pythran.cp312-win_amd64.pyd
│   │   │       │   │   ├── _survival.py
│   │   │       │   │   ├── _tukeylambda_stats.py
│   │   │       │   │   ├── _variation.py
│   │   │       │   │   ├── _warnings_errors.py
│   │   │       │   │   ├── _wilcoxon.py
│   │   │       │   │   ├── biasedurn.py
│   │   │       │   │   ├── contingency.py
│   │   │       │   │   ├── distributions.py
│   │   │       │   │   ├── kde.py
│   │   │       │   │   ├── morestats.py
│   │   │       │   │   ├── mstats.py
│   │   │       │   │   ├── mstats_basic.py
│   │   │       │   │   ├── mstats_extras.py
│   │   │       │   │   ├── mvn.py
│   │   │       │   │   ├── qmc.py
│   │   │       │   │   ├── sampling.py
│   │   │       │   │   └── stats.py
│   │   │       │   ├── __config__.py
│   │   │       │   ├── __init__.py
│   │   │       │   ├── _cyutility.cp312-win_amd64.dll.a
│   │   │       │   ├── _cyutility.cp312-win_amd64.pyd
│   │   │       │   ├── _distributor_init.py
│   │   │       │   ├── conftest.py
│   │   │       │   └── version.py
│   │   │       ├── scipy-1.16.3.dist-info/
│   │   │       │   ├── DELVEWHEEL
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── LICENSE.txt
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── REQUESTED
│   │   │       │   └── WHEEL
│   │   │       ├── scipy.libs/
│   │   │       │   └── libscipy_openblas-48c358d105077551cc9cc3ba79387ed5.dll
│   │   │       ├── seaborn/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── _base.cpython-312.pyc
│   │   │       │   │   ├── _compat.cpython-312.pyc
│   │   │       │   │   ├── _docstrings.cpython-312.pyc
│   │   │       │   │   ├── _statistics.cpython-312.pyc
│   │   │       │   │   ├── _testing.cpython-312.pyc
│   │   │       │   │   ├── algorithms.cpython-312.pyc
│   │   │       │   │   ├── axisgrid.cpython-312.pyc
│   │   │       │   │   ├── categorical.cpython-312.pyc
│   │   │       │   │   ├── cm.cpython-312.pyc
│   │   │       │   │   ├── distributions.cpython-312.pyc
│   │   │       │   │   ├── matrix.cpython-312.pyc
│   │   │       │   │   ├── miscplot.cpython-312.pyc
│   │   │       │   │   ├── objects.cpython-312.pyc
│   │   │       │   │   ├── palettes.cpython-312.pyc
│   │   │       │   │   ├── rcmod.cpython-312.pyc
│   │   │       │   │   ├── regression.cpython-312.pyc
│   │   │       │   │   ├── relational.cpython-312.pyc
│   │   │       │   │   ├── utils.cpython-312.pyc
│   │   │       │   │   └── widgets.cpython-312.pyc
│   │   │       │   ├── _core/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── data.cpython-312.pyc
│   │   │       │   │   │   ├── exceptions.cpython-312.pyc
│   │   │       │   │   │   ├── groupby.cpython-312.pyc
│   │   │       │   │   │   ├── moves.cpython-312.pyc
│   │   │       │   │   │   ├── plot.cpython-312.pyc
│   │   │       │   │   │   ├── properties.cpython-312.pyc
│   │   │       │   │   │   ├── rules.cpython-312.pyc
│   │   │       │   │   │   ├── scales.cpython-312.pyc
│   │   │       │   │   │   ├── subplots.cpython-312.pyc
│   │   │       │   │   │   └── typing.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── data.py
│   │   │       │   │   ├── exceptions.py
│   │   │       │   │   ├── groupby.py
│   │   │       │   │   ├── moves.py
│   │   │       │   │   ├── plot.py
│   │   │       │   │   ├── properties.py
│   │   │       │   │   ├── rules.py
│   │   │       │   │   ├── scales.py
│   │   │       │   │   ├── subplots.py
│   │   │       │   │   └── typing.py
│   │   │       │   ├── _marks/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── area.cpython-312.pyc
│   │   │       │   │   │   ├── bar.cpython-312.pyc
│   │   │       │   │   │   ├── base.cpython-312.pyc
│   │   │       │   │   │   ├── dot.cpython-312.pyc
│   │   │       │   │   │   ├── line.cpython-312.pyc
│   │   │       │   │   │   └── text.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── area.py
│   │   │       │   │   ├── bar.py
│   │   │       │   │   ├── base.py
│   │   │       │   │   ├── dot.py
│   │   │       │   │   ├── line.py
│   │   │       │   │   └── text.py
│   │   │       │   ├── _stats/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── aggregation.cpython-312.pyc
│   │   │       │   │   │   ├── base.cpython-312.pyc
│   │   │       │   │   │   ├── counting.cpython-312.pyc
│   │   │       │   │   │   ├── density.cpython-312.pyc
│   │   │       │   │   │   ├── order.cpython-312.pyc
│   │   │       │   │   │   └── regression.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── aggregation.py
│   │   │       │   │   ├── base.py
│   │   │       │   │   ├── counting.py
│   │   │       │   │   ├── density.py
│   │   │       │   │   ├── order.py
│   │   │       │   │   └── regression.py
│   │   │       │   ├── colors/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── crayons.cpython-312.pyc
│   │   │       │   │   │   └── xkcd_rgb.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── crayons.py
│   │   │       │   │   └── xkcd_rgb.py
│   │   │       │   ├── external/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── appdirs.cpython-312.pyc
│   │   │       │   │   │   ├── docscrape.cpython-312.pyc
│   │   │       │   │   │   ├── husl.cpython-312.pyc
│   │   │       │   │   │   ├── kde.cpython-312.pyc
│   │   │       │   │   │   └── version.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── appdirs.py
│   │   │       │   │   ├── docscrape.py
│   │   │       │   │   ├── husl.py
│   │   │       │   │   ├── kde.py
│   │   │       │   │   └── version.py
│   │   │       │   ├── __init__.py
│   │   │       │   ├── _base.py
│   │   │       │   ├── _compat.py
│   │   │       │   ├── _docstrings.py
│   │   │       │   ├── _statistics.py
│   │   │       │   ├── _testing.py
│   │   │       │   ├── algorithms.py
│   │   │       │   ├── axisgrid.py
│   │   │       │   ├── categorical.py
│   │   │       │   ├── cm.py
│   │   │       │   ├── distributions.py
│   │   │       │   ├── matrix.py
│   │   │       │   ├── miscplot.py
│   │   │       │   ├── objects.py
│   │   │       │   ├── palettes.py
│   │   │       │   ├── rcmod.py
│   │   │       │   ├── regression.py
│   │   │       │   ├── relational.py
│   │   │       │   ├── utils.py
│   │   │       │   └── widgets.py
│   │   │       ├── seaborn-0.13.2.dist-info/
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── LICENSE.md
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── REQUESTED
│   │   │       │   └── WHEEL
│   │   │       ├── setuptools/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── _core_metadata.cpython-312.pyc
│   │   │       │   │   ├── _discovery.cpython-312.pyc
│   │   │       │   │   ├── _entry_points.cpython-312.pyc
│   │   │       │   │   ├── _imp.cpython-312.pyc
│   │   │       │   │   ├── _importlib.cpython-312.pyc
│   │   │       │   │   ├── _itertools.cpython-312.pyc
│   │   │       │   │   ├── _normalization.cpython-312.pyc
│   │   │       │   │   ├── _path.cpython-312.pyc
│   │   │       │   │   ├── _reqs.cpython-312.pyc
│   │   │       │   │   ├── _scripts.cpython-312.pyc
│   │   │       │   │   ├── _shutil.cpython-312.pyc
│   │   │       │   │   ├── _static.cpython-312.pyc
│   │   │       │   │   ├── archive_util.cpython-312.pyc
│   │   │       │   │   ├── build_meta.cpython-312.pyc
│   │   │       │   │   ├── depends.cpython-312.pyc
│   │   │       │   │   ├── discovery.cpython-312.pyc
│   │   │       │   │   ├── dist.cpython-312.pyc
│   │   │       │   │   ├── errors.cpython-312.pyc
│   │   │       │   │   ├── extension.cpython-312.pyc
│   │   │       │   │   ├── glob.cpython-312.pyc
│   │   │       │   │   ├── installer.cpython-312.pyc
│   │   │       │   │   ├── launch.cpython-312.pyc
│   │   │       │   │   ├── logging.cpython-312.pyc
│   │   │       │   │   ├── modified.cpython-312.pyc
│   │   │       │   │   ├── monkey.cpython-312.pyc
│   │   │       │   │   ├── msvc.cpython-312.pyc
│   │   │       │   │   ├── namespaces.cpython-312.pyc
│   │   │       │   │   ├── unicode_utils.cpython-312.pyc
│   │   │       │   │   ├── version.cpython-312.pyc
│   │   │       │   │   ├── warnings.cpython-312.pyc
│   │   │       │   │   ├── wheel.cpython-312.pyc
│   │   │       │   │   └── windows_support.cpython-312.pyc
│   │   │       │   ├── _distutils/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _log.cpython-312.pyc
│   │   │       │   │   │   ├── _macos_compat.cpython-312.pyc
│   │   │       │   │   │   ├── _modified.cpython-312.pyc
│   │   │       │   │   │   ├── _msvccompiler.cpython-312.pyc
│   │   │       │   │   │   ├── archive_util.cpython-312.pyc
│   │   │       │   │   │   ├── ccompiler.cpython-312.pyc
│   │   │       │   │   │   ├── cmd.cpython-312.pyc
│   │   │       │   │   │   ├── core.cpython-312.pyc
│   │   │       │   │   │   ├── cygwinccompiler.cpython-312.pyc
│   │   │       │   │   │   ├── debug.cpython-312.pyc
│   │   │       │   │   │   ├── dep_util.cpython-312.pyc
│   │   │       │   │   │   ├── dir_util.cpython-312.pyc
│   │   │       │   │   │   ├── dist.cpython-312.pyc
│   │   │       │   │   │   ├── errors.cpython-312.pyc
│   │   │       │   │   │   ├── extension.cpython-312.pyc
│   │   │       │   │   │   ├── fancy_getopt.cpython-312.pyc
│   │   │       │   │   │   ├── file_util.cpython-312.pyc
│   │   │       │   │   │   ├── filelist.cpython-312.pyc
│   │   │       │   │   │   ├── log.cpython-312.pyc
│   │   │       │   │   │   ├── spawn.cpython-312.pyc
│   │   │       │   │   │   ├── sysconfig.cpython-312.pyc
│   │   │       │   │   │   ├── text_file.cpython-312.pyc
│   │   │       │   │   │   ├── unixccompiler.cpython-312.pyc
│   │   │       │   │   │   ├── util.cpython-312.pyc
│   │   │       │   │   │   ├── version.cpython-312.pyc
│   │   │       │   │   │   ├── versionpredicate.cpython-312.pyc
│   │   │       │   │   │   └── zosccompiler.cpython-312.pyc
│   │   │       │   │   ├── command/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _framework_compat.cpython-312.pyc
│   │   │       │   │   │   │   ├── bdist.cpython-312.pyc
│   │   │       │   │   │   │   ├── bdist_dumb.cpython-312.pyc
│   │   │       │   │   │   │   ├── bdist_rpm.cpython-312.pyc
│   │   │       │   │   │   │   ├── build.cpython-312.pyc
│   │   │       │   │   │   │   ├── build_clib.cpython-312.pyc
│   │   │       │   │   │   │   ├── build_ext.cpython-312.pyc
│   │   │       │   │   │   │   ├── build_py.cpython-312.pyc
│   │   │       │   │   │   │   ├── build_scripts.cpython-312.pyc
│   │   │       │   │   │   │   ├── check.cpython-312.pyc
│   │   │       │   │   │   │   ├── clean.cpython-312.pyc
│   │   │       │   │   │   │   ├── config.cpython-312.pyc
│   │   │       │   │   │   │   ├── install.cpython-312.pyc
│   │   │       │   │   │   │   ├── install_data.cpython-312.pyc
│   │   │       │   │   │   │   ├── install_egg_info.cpython-312.pyc
│   │   │       │   │   │   │   ├── install_headers.cpython-312.pyc
│   │   │       │   │   │   │   ├── install_lib.cpython-312.pyc
│   │   │       │   │   │   │   ├── install_scripts.cpython-312.pyc
│   │   │       │   │   │   │   └── sdist.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _framework_compat.py
│   │   │       │   │   │   ├── bdist.py
│   │   │       │   │   │   ├── bdist_dumb.py
│   │   │       │   │   │   ├── bdist_rpm.py
│   │   │       │   │   │   ├── build.py
│   │   │       │   │   │   ├── build_clib.py
│   │   │       │   │   │   ├── build_ext.py
│   │   │       │   │   │   ├── build_py.py
│   │   │       │   │   │   ├── build_scripts.py
│   │   │       │   │   │   ├── check.py
│   │   │       │   │   │   ├── clean.py
│   │   │       │   │   │   ├── config.py
│   │   │       │   │   │   ├── install.py
│   │   │       │   │   │   ├── install_data.py
│   │   │       │   │   │   ├── install_egg_info.py
│   │   │       │   │   │   ├── install_headers.py
│   │   │       │   │   │   ├── install_lib.py
│   │   │       │   │   │   ├── install_scripts.py
│   │   │       │   │   │   └── sdist.py
│   │   │       │   │   ├── compat/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── numpy.cpython-312.pyc
│   │   │       │   │   │   │   └── py39.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── numpy.py
│   │   │       │   │   │   └── py39.py
│   │   │       │   │   ├── compilers/
│   │   │       │   │   │   ├── C/
│   │   │       │   │   │       ├── __pycache__/
│   │   │       │   │   │       │   ├── base.cpython-312.pyc
│   │   │       │   │   │       │   ├── cygwin.cpython-312.pyc
│   │   │       │   │   │       │   ├── errors.cpython-312.pyc
│   │   │       │   │   │       │   ├── msvc.cpython-312.pyc
│   │   │       │   │   │       │   ├── unix.cpython-312.pyc
│   │   │       │   │   │       │   └── zos.cpython-312.pyc
│   │   │       │   │   │       ├── tests/
│   │   │       │   │   │       │   ├── __pycache__/
│   │   │       │   │   │       │   │   ├── test_base.cpython-312.pyc
│   │   │       │   │   │       │   │   ├── test_cygwin.cpython-312.pyc
│   │   │       │   │   │       │   │   ├── test_mingw.cpython-312.pyc
│   │   │       │   │   │       │   │   ├── test_msvc.cpython-312.pyc
│   │   │       │   │   │       │   │   └── test_unix.cpython-312.pyc
│   │   │       │   │   │       │   ├── test_base.py
│   │   │       │   │   │       │   ├── test_cygwin.py
│   │   │       │   │   │       │   ├── test_mingw.py
│   │   │       │   │   │       │   ├── test_msvc.py
│   │   │       │   │   │       │   └── test_unix.py
│   │   │       │   │   │       ├── base.py
│   │   │       │   │   │       ├── cygwin.py
│   │   │       │   │   │       ├── errors.py
│   │   │       │   │   │       ├── msvc.py
│   │   │       │   │   │       ├── unix.py
│   │   │       │   │   │       └── zos.py
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── support.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_archive_util.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bdist.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bdist_dumb.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bdist_rpm.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_build.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_build_clib.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_build_ext.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_build_py.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_build_scripts.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_check.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_clean.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cmd.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_config_cmd.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_core.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_dir_util.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_dist.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_extension.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_file_util.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_filelist.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_install.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_install_data.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_install_headers.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_install_lib.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_install_scripts.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_log.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_modified.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sdist.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_spawn.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sysconfig.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_text_file.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_util.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_version.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_versionpredicate.cpython-312.pyc
│   │   │       │   │   │   │   └── unix_compat.cpython-312.pyc
│   │   │       │   │   │   ├── compat/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── py39.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── py39.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── support.py
│   │   │       │   │   │   ├── test_archive_util.py
│   │   │       │   │   │   ├── test_bdist.py
│   │   │       │   │   │   ├── test_bdist_dumb.py
│   │   │       │   │   │   ├── test_bdist_rpm.py
│   │   │       │   │   │   ├── test_build.py
│   │   │       │   │   │   ├── test_build_clib.py
│   │   │       │   │   │   ├── test_build_ext.py
│   │   │       │   │   │   ├── test_build_py.py
│   │   │       │   │   │   ├── test_build_scripts.py
│   │   │       │   │   │   ├── test_check.py
│   │   │       │   │   │   ├── test_clean.py
│   │   │       │   │   │   ├── test_cmd.py
│   │   │       │   │   │   ├── test_config_cmd.py
│   │   │       │   │   │   ├── test_core.py
│   │   │       │   │   │   ├── test_dir_util.py
│   │   │       │   │   │   ├── test_dist.py
│   │   │       │   │   │   ├── test_extension.py
│   │   │       │   │   │   ├── test_file_util.py
│   │   │       │   │   │   ├── test_filelist.py
│   │   │       │   │   │   ├── test_install.py
│   │   │       │   │   │   ├── test_install_data.py
│   │   │       │   │   │   ├── test_install_headers.py
│   │   │       │   │   │   ├── test_install_lib.py
│   │   │       │   │   │   ├── test_install_scripts.py
│   │   │       │   │   │   ├── test_log.py
│   │   │       │   │   │   ├── test_modified.py
│   │   │       │   │   │   ├── test_sdist.py
│   │   │       │   │   │   ├── test_spawn.py
│   │   │       │   │   │   ├── test_sysconfig.py
│   │   │       │   │   │   ├── test_text_file.py
│   │   │       │   │   │   ├── test_util.py
│   │   │       │   │   │   ├── test_version.py
│   │   │       │   │   │   ├── test_versionpredicate.py
│   │   │       │   │   │   └── unix_compat.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _log.py
│   │   │       │   │   ├── _macos_compat.py
│   │   │       │   │   ├── _modified.py
│   │   │       │   │   ├── _msvccompiler.py
│   │   │       │   │   ├── archive_util.py
│   │   │       │   │   ├── ccompiler.py
│   │   │       │   │   ├── cmd.py
│   │   │       │   │   ├── core.py
│   │   │       │   │   ├── cygwinccompiler.py
│   │   │       │   │   ├── debug.py
│   │   │       │   │   ├── dep_util.py
│   │   │       │   │   ├── dir_util.py
│   │   │       │   │   ├── dist.py
│   │   │       │   │   ├── errors.py
│   │   │       │   │   ├── extension.py
│   │   │       │   │   ├── fancy_getopt.py
│   │   │       │   │   ├── file_util.py
│   │   │       │   │   ├── filelist.py
│   │   │       │   │   ├── log.py
│   │   │       │   │   ├── spawn.py
│   │   │       │   │   ├── sysconfig.py
│   │   │       │   │   ├── text_file.py
│   │   │       │   │   ├── unixccompiler.py
│   │   │       │   │   ├── util.py
│   │   │       │   │   ├── version.py
│   │   │       │   │   ├── versionpredicate.py
│   │   │       │   │   └── zosccompiler.py
│   │   │       │   ├── _vendor/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── typing_extensions.cpython-312.pyc
│   │   │       │   │   ├── autocommand/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── autoasync.cpython-312.pyc
│   │   │       │   │   │   │   ├── autocommand.cpython-312.pyc
│   │   │       │   │   │   │   ├── automain.cpython-312.pyc
│   │   │       │   │   │   │   ├── autoparse.cpython-312.pyc
│   │   │       │   │   │   │   └── errors.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── autoasync.py
│   │   │       │   │   │   ├── autocommand.py
│   │   │       │   │   │   ├── automain.py
│   │   │       │   │   │   ├── autoparse.py
│   │   │       │   │   │   └── errors.py
│   │   │       │   │   ├── autocommand-2.2.2.dist-info/
│   │   │       │   │   │   ├── INSTALLER
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── METADATA
│   │   │       │   │   │   ├── RECORD
│   │   │       │   │   │   ├── WHEEL
│   │   │       │   │   │   └── top_level.txt
│   │   │       │   │   ├── backports/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── tarfile/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── __main__.cpython-312.pyc
│   │   │       │   │   │   │   ├── compat/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── py38.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   └── py38.py
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── __main__.py
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── backports.tarfile-1.2.0.dist-info/
│   │   │       │   │   │   ├── INSTALLER
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── METADATA
│   │   │       │   │   │   ├── RECORD
│   │   │       │   │   │   ├── REQUESTED
│   │   │       │   │   │   ├── WHEEL
│   │   │       │   │   │   └── top_level.txt
│   │   │       │   │   ├── importlib_metadata/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _adapters.cpython-312.pyc
│   │   │       │   │   │   │   ├── _collections.cpython-312.pyc
│   │   │       │   │   │   │   ├── _compat.cpython-312.pyc
│   │   │       │   │   │   │   ├── _functools.cpython-312.pyc
│   │   │       │   │   │   │   ├── _itertools.cpython-312.pyc
│   │   │       │   │   │   │   ├── _meta.cpython-312.pyc
│   │   │       │   │   │   │   ├── _text.cpython-312.pyc
│   │   │       │   │   │   │   └── diagnose.cpython-312.pyc
│   │   │       │   │   │   ├── compat/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── py311.cpython-312.pyc
│   │   │       │   │   │   │   │   └── py39.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── py311.py
│   │   │       │   │   │   │   └── py39.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _adapters.py
│   │   │       │   │   │   ├── _collections.py
│   │   │       │   │   │   ├── _compat.py
│   │   │       │   │   │   ├── _functools.py
│   │   │       │   │   │   ├── _itertools.py
│   │   │       │   │   │   ├── _meta.py
│   │   │       │   │   │   ├── _text.py
│   │   │       │   │   │   ├── diagnose.py
│   │   │       │   │   │   └── py.typed
│   │   │       │   │   ├── importlib_metadata-8.0.0.dist-info/
│   │   │       │   │   │   ├── INSTALLER
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── METADATA
│   │   │       │   │   │   ├── RECORD
│   │   │       │   │   │   ├── REQUESTED
│   │   │       │   │   │   ├── WHEEL
│   │   │       │   │   │   └── top_level.txt
│   │   │       │   │   ├── inflect/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── compat/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── py38.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── py38.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── py.typed
│   │   │       │   │   ├── inflect-7.3.1.dist-info/
│   │   │       │   │   │   ├── INSTALLER
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── METADATA
│   │   │       │   │   │   ├── RECORD
│   │   │       │   │   │   ├── WHEEL
│   │   │       │   │   │   └── top_level.txt
│   │   │       │   │   ├── jaraco/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── context.cpython-312.pyc
│   │   │       │   │   │   ├── collections/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── py.typed
│   │   │       │   │   │   ├── functools/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── __init__.pyi
│   │   │       │   │   │   │   └── py.typed
│   │   │       │   │   │   ├── text/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── layouts.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── show-newlines.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── strip-prefix.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── to-dvorak.cpython-312.pyc
│   │   │       │   │   │   │   │   └── to-qwerty.cpython-312.pyc
│   │   │       │   │   │   │   ├── Lorem ipsum.txt
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── layouts.py
│   │   │       │   │   │   │   ├── show-newlines.py
│   │   │       │   │   │   │   ├── strip-prefix.py
│   │   │       │   │   │   │   ├── to-dvorak.py
│   │   │       │   │   │   │   └── to-qwerty.py
│   │   │       │   │   │   └── context.py
│   │   │       │   │   ├── jaraco.collections-5.1.0.dist-info/
│   │   │       │   │   │   ├── INSTALLER
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── METADATA
│   │   │       │   │   │   ├── RECORD
│   │   │       │   │   │   ├── REQUESTED
│   │   │       │   │   │   ├── WHEEL
│   │   │       │   │   │   └── top_level.txt
│   │   │       │   │   ├── jaraco.context-5.3.0.dist-info/
│   │   │       │   │   │   ├── INSTALLER
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── METADATA
│   │   │       │   │   │   ├── RECORD
│   │   │       │   │   │   ├── WHEEL
│   │   │       │   │   │   └── top_level.txt
│   │   │       │   │   ├── jaraco.functools-4.0.1.dist-info/
│   │   │       │   │   │   ├── INSTALLER
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── METADATA
│   │   │       │   │   │   ├── RECORD
│   │   │       │   │   │   ├── WHEEL
│   │   │       │   │   │   └── top_level.txt
│   │   │       │   │   ├── jaraco.text-3.12.1.dist-info/
│   │   │       │   │   │   ├── INSTALLER
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── METADATA
│   │   │       │   │   │   ├── RECORD
│   │   │       │   │   │   ├── REQUESTED
│   │   │       │   │   │   ├── WHEEL
│   │   │       │   │   │   └── top_level.txt
│   │   │       │   │   ├── more_itertools/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── more.cpython-312.pyc
│   │   │       │   │   │   │   └── recipes.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── __init__.pyi
│   │   │       │   │   │   ├── more.py
│   │   │       │   │   │   ├── more.pyi
│   │   │       │   │   │   ├── py.typed
│   │   │       │   │   │   ├── recipes.py
│   │   │       │   │   │   └── recipes.pyi
│   │   │       │   │   ├── more_itertools-10.3.0.dist-info/
│   │   │       │   │   │   ├── INSTALLER
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── METADATA
│   │   │       │   │   │   ├── RECORD
│   │   │       │   │   │   ├── REQUESTED
│   │   │       │   │   │   └── WHEEL
│   │   │       │   │   ├── packaging/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _elffile.cpython-312.pyc
│   │   │       │   │   │   │   ├── _manylinux.cpython-312.pyc
│   │   │       │   │   │   │   ├── _musllinux.cpython-312.pyc
│   │   │       │   │   │   │   ├── _parser.cpython-312.pyc
│   │   │       │   │   │   │   ├── _structures.cpython-312.pyc
│   │   │       │   │   │   │   ├── _tokenizer.cpython-312.pyc
│   │   │       │   │   │   │   ├── markers.cpython-312.pyc
│   │   │       │   │   │   │   ├── metadata.cpython-312.pyc
│   │   │       │   │   │   │   ├── requirements.cpython-312.pyc
│   │   │       │   │   │   │   ├── specifiers.cpython-312.pyc
│   │   │       │   │   │   │   ├── tags.cpython-312.pyc
│   │   │       │   │   │   │   ├── utils.cpython-312.pyc
│   │   │       │   │   │   │   └── version.cpython-312.pyc
│   │   │       │   │   │   ├── licenses/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── _spdx.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── _spdx.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _elffile.py
│   │   │       │   │   │   ├── _manylinux.py
│   │   │       │   │   │   ├── _musllinux.py
│   │   │       │   │   │   ├── _parser.py
│   │   │       │   │   │   ├── _structures.py
│   │   │       │   │   │   ├── _tokenizer.py
│   │   │       │   │   │   ├── markers.py
│   │   │       │   │   │   ├── metadata.py
│   │   │       │   │   │   ├── py.typed
│   │   │       │   │   │   ├── requirements.py
│   │   │       │   │   │   ├── specifiers.py
│   │   │       │   │   │   ├── tags.py
│   │   │       │   │   │   ├── utils.py
│   │   │       │   │   │   └── version.py
│   │   │       │   │   ├── packaging-24.2.dist-info/
│   │   │       │   │   │   ├── INSTALLER
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── LICENSE.APACHE
│   │   │       │   │   │   ├── LICENSE.BSD
│   │   │       │   │   │   ├── METADATA
│   │   │       │   │   │   ├── RECORD
│   │   │       │   │   │   ├── REQUESTED
│   │   │       │   │   │   └── WHEEL
│   │   │       │   │   ├── platformdirs/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   │   ├── android.cpython-312.pyc
│   │   │       │   │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   │   ├── macos.cpython-312.pyc
│   │   │       │   │   │   │   ├── unix.cpython-312.pyc
│   │   │       │   │   │   │   ├── version.cpython-312.pyc
│   │   │       │   │   │   │   └── windows.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── __main__.py
│   │   │       │   │   │   ├── android.py
│   │   │       │   │   │   ├── api.py
│   │   │       │   │   │   ├── macos.py
│   │   │       │   │   │   ├── py.typed
│   │   │       │   │   │   ├── unix.py
│   │   │       │   │   │   ├── version.py
│   │   │       │   │   │   └── windows.py
│   │   │       │   │   ├── platformdirs-4.2.2.dist-info/
│   │   │       │   │   │   ├── licenses/
│   │   │       │   │   │   │   └── LICENSE
│   │   │       │   │   │   ├── INSTALLER
│   │   │       │   │   │   ├── METADATA
│   │   │       │   │   │   ├── RECORD
│   │   │       │   │   │   ├── REQUESTED
│   │   │       │   │   │   └── WHEEL
│   │   │       │   │   ├── tomli/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _parser.cpython-312.pyc
│   │   │       │   │   │   │   ├── _re.cpython-312.pyc
│   │   │       │   │   │   │   └── _types.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _parser.py
│   │   │       │   │   │   ├── _re.py
│   │   │       │   │   │   ├── _types.py
│   │   │       │   │   │   └── py.typed
│   │   │       │   │   ├── tomli-2.0.1.dist-info/
│   │   │       │   │   │   ├── INSTALLER
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── METADATA
│   │   │       │   │   │   ├── RECORD
│   │   │       │   │   │   ├── REQUESTED
│   │   │       │   │   │   └── WHEEL
│   │   │       │   │   ├── typeguard/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _checkers.cpython-312.pyc
│   │   │       │   │   │   │   ├── _config.cpython-312.pyc
│   │   │       │   │   │   │   ├── _decorators.cpython-312.pyc
│   │   │       │   │   │   │   ├── _exceptions.cpython-312.pyc
│   │   │       │   │   │   │   ├── _functions.cpython-312.pyc
│   │   │       │   │   │   │   ├── _importhook.cpython-312.pyc
│   │   │       │   │   │   │   ├── _memo.cpython-312.pyc
│   │   │       │   │   │   │   ├── _pytest_plugin.cpython-312.pyc
│   │   │       │   │   │   │   ├── _suppression.cpython-312.pyc
│   │   │       │   │   │   │   ├── _transformer.cpython-312.pyc
│   │   │       │   │   │   │   ├── _union_transformer.cpython-312.pyc
│   │   │       │   │   │   │   └── _utils.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _checkers.py
│   │   │       │   │   │   ├── _config.py
│   │   │       │   │   │   ├── _decorators.py
│   │   │       │   │   │   ├── _exceptions.py
│   │   │       │   │   │   ├── _functions.py
│   │   │       │   │   │   ├── _importhook.py
│   │   │       │   │   │   ├── _memo.py
│   │   │       │   │   │   ├── _pytest_plugin.py
│   │   │       │   │   │   ├── _suppression.py
│   │   │       │   │   │   ├── _transformer.py
│   │   │       │   │   │   ├── _union_transformer.py
│   │   │       │   │   │   ├── _utils.py
│   │   │       │   │   │   └── py.typed
│   │   │       │   │   ├── typeguard-4.3.0.dist-info/
│   │   │       │   │   │   ├── INSTALLER
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── METADATA
│   │   │       │   │   │   ├── RECORD
│   │   │       │   │   │   ├── WHEEL
│   │   │       │   │   │   ├── entry_points.txt
│   │   │       │   │   │   └── top_level.txt
│   │   │       │   │   ├── typing_extensions-4.12.2.dist-info/
│   │   │       │   │   │   ├── INSTALLER
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── METADATA
│   │   │       │   │   │   ├── RECORD
│   │   │       │   │   │   └── WHEEL
│   │   │       │   │   ├── wheel/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _bdist_wheel.cpython-312.pyc
│   │   │       │   │   │   │   ├── _setuptools_logging.cpython-312.pyc
│   │   │       │   │   │   │   ├── bdist_wheel.cpython-312.pyc
│   │   │       │   │   │   │   ├── macosx_libfile.cpython-312.pyc
│   │   │       │   │   │   │   ├── metadata.cpython-312.pyc
│   │   │       │   │   │   │   ├── util.cpython-312.pyc
│   │   │       │   │   │   │   └── wheelfile.cpython-312.pyc
│   │   │       │   │   │   ├── cli/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── convert.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── pack.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── tags.cpython-312.pyc
│   │   │       │   │   │   │   │   └── unpack.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── convert.py
│   │   │       │   │   │   │   ├── pack.py
│   │   │       │   │   │   │   ├── tags.py
│   │   │       │   │   │   │   └── unpack.py
│   │   │       │   │   │   ├── vendored/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── packaging/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── _elffile.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── _manylinux.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── _musllinux.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── _parser.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── _structures.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── _tokenizer.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── markers.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── requirements.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── specifiers.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── tags.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── utils.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── version.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── LICENSE
│   │   │       │   │   │   │   │   ├── LICENSE.APACHE
│   │   │       │   │   │   │   │   ├── LICENSE.BSD
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── _elffile.py
│   │   │       │   │   │   │   │   ├── _manylinux.py
│   │   │       │   │   │   │   │   ├── _musllinux.py
│   │   │       │   │   │   │   │   ├── _parser.py
│   │   │       │   │   │   │   │   ├── _structures.py
│   │   │       │   │   │   │   │   ├── _tokenizer.py
│   │   │       │   │   │   │   │   ├── markers.py
│   │   │       │   │   │   │   │   ├── requirements.py
│   │   │       │   │   │   │   │   ├── specifiers.py
│   │   │       │   │   │   │   │   ├── tags.py
│   │   │       │   │   │   │   │   ├── utils.py
│   │   │       │   │   │   │   │   └── version.py
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── vendor.txt
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── __main__.py
│   │   │       │   │   │   ├── _bdist_wheel.py
│   │   │       │   │   │   ├── _setuptools_logging.py
│   │   │       │   │   │   ├── bdist_wheel.py
│   │   │       │   │   │   ├── macosx_libfile.py
│   │   │       │   │   │   ├── metadata.py
│   │   │       │   │   │   ├── util.py
│   │   │       │   │   │   └── wheelfile.py
│   │   │       │   │   ├── wheel-0.45.1.dist-info/
│   │   │       │   │   │   ├── INSTALLER
│   │   │       │   │   │   ├── LICENSE.txt
│   │   │       │   │   │   ├── METADATA
│   │   │       │   │   │   ├── RECORD
│   │   │       │   │   │   ├── REQUESTED
│   │   │       │   │   │   ├── WHEEL
│   │   │       │   │   │   └── entry_points.txt
│   │   │       │   │   ├── zipp/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── glob.cpython-312.pyc
│   │   │       │   │   │   ├── compat/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── py310.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── py310.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── glob.py
│   │   │       │   │   ├── zipp-3.19.2.dist-info/
│   │   │       │   │   │   ├── INSTALLER
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── METADATA
│   │   │       │   │   │   ├── RECORD
│   │   │       │   │   │   ├── REQUESTED
│   │   │       │   │   │   ├── WHEEL
│   │   │       │   │   │   └── top_level.txt
│   │   │       │   │   └── typing_extensions.py
│   │   │       │   ├── command/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _requirestxt.cpython-312.pyc
│   │   │       │   │   │   ├── alias.cpython-312.pyc
│   │   │       │   │   │   ├── bdist_egg.cpython-312.pyc
│   │   │       │   │   │   ├── bdist_rpm.cpython-312.pyc
│   │   │       │   │   │   ├── bdist_wheel.cpython-312.pyc
│   │   │       │   │   │   ├── build.cpython-312.pyc
│   │   │       │   │   │   ├── build_clib.cpython-312.pyc
│   │   │       │   │   │   ├── build_ext.cpython-312.pyc
│   │   │       │   │   │   ├── build_py.cpython-312.pyc
│   │   │       │   │   │   ├── develop.cpython-312.pyc
│   │   │       │   │   │   ├── dist_info.cpython-312.pyc
│   │   │       │   │   │   ├── easy_install.cpython-312.pyc
│   │   │       │   │   │   ├── editable_wheel.cpython-312.pyc
│   │   │       │   │   │   ├── egg_info.cpython-312.pyc
│   │   │       │   │   │   ├── install.cpython-312.pyc
│   │   │       │   │   │   ├── install_egg_info.cpython-312.pyc
│   │   │       │   │   │   ├── install_lib.cpython-312.pyc
│   │   │       │   │   │   ├── install_scripts.cpython-312.pyc
│   │   │       │   │   │   ├── rotate.cpython-312.pyc
│   │   │       │   │   │   ├── saveopts.cpython-312.pyc
│   │   │       │   │   │   ├── sdist.cpython-312.pyc
│   │   │       │   │   │   ├── setopt.cpython-312.pyc
│   │   │       │   │   │   └── test.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _requirestxt.py
│   │   │       │   │   ├── alias.py
│   │   │       │   │   ├── bdist_egg.py
│   │   │       │   │   ├── bdist_rpm.py
│   │   │       │   │   ├── bdist_wheel.py
│   │   │       │   │   ├── build.py
│   │   │       │   │   ├── build_clib.py
│   │   │       │   │   ├── build_ext.py
│   │   │       │   │   ├── build_py.py
│   │   │       │   │   ├── develop.py
│   │   │       │   │   ├── dist_info.py
│   │   │       │   │   ├── easy_install.py
│   │   │       │   │   ├── editable_wheel.py
│   │   │       │   │   ├── egg_info.py
│   │   │       │   │   ├── install.py
│   │   │       │   │   ├── install_egg_info.py
│   │   │       │   │   ├── install_lib.py
│   │   │       │   │   ├── install_scripts.py
│   │   │       │   │   ├── launcher manifest.xml
│   │   │       │   │   ├── rotate.py
│   │   │       │   │   ├── saveopts.py
│   │   │       │   │   ├── sdist.py
│   │   │       │   │   ├── setopt.py
│   │   │       │   │   └── test.py
│   │   │       │   ├── compat/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── py310.cpython-312.pyc
│   │   │       │   │   │   ├── py311.cpython-312.pyc
│   │   │       │   │   │   ├── py312.cpython-312.pyc
│   │   │       │   │   │   └── py39.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── py310.py
│   │   │       │   │   ├── py311.py
│   │   │       │   │   ├── py312.py
│   │   │       │   │   └── py39.py
│   │   │       │   ├── config/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _apply_pyprojecttoml.cpython-312.pyc
│   │   │       │   │   │   ├── expand.cpython-312.pyc
│   │   │       │   │   │   ├── pyprojecttoml.cpython-312.pyc
│   │   │       │   │   │   └── setupcfg.cpython-312.pyc
│   │   │       │   │   ├── _validate_pyproject/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── error_reporting.cpython-312.pyc
│   │   │       │   │   │   │   ├── extra_validations.cpython-312.pyc
│   │   │       │   │   │   │   ├── fastjsonschema_exceptions.cpython-312.pyc
│   │   │       │   │   │   │   ├── fastjsonschema_validations.cpython-312.pyc
│   │   │       │   │   │   │   └── formats.cpython-312.pyc
│   │   │       │   │   │   ├── NOTICE
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── error_reporting.py
│   │   │       │   │   │   ├── extra_validations.py
│   │   │       │   │   │   ├── fastjsonschema_exceptions.py
│   │   │       │   │   │   ├── fastjsonschema_validations.py
│   │   │       │   │   │   └── formats.py
│   │   │       │   │   ├── NOTICE
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _apply_pyprojecttoml.py
│   │   │       │   │   ├── distutils.schema.json
│   │   │       │   │   ├── expand.py
│   │   │       │   │   ├── pyprojecttoml.py
│   │   │       │   │   ├── setupcfg.py
│   │   │       │   │   └── setuptools.schema.json
│   │   │       │   ├── tests/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── contexts.cpython-312.pyc
│   │   │       │   │   │   ├── environment.cpython-312.pyc
│   │   │       │   │   │   ├── fixtures.cpython-312.pyc
│   │   │       │   │   │   ├── mod_with_constant.cpython-312.pyc
│   │   │       │   │   │   ├── namespaces.cpython-312.pyc
│   │   │       │   │   │   ├── script-with-bom.cpython-312.pyc
│   │   │       │   │   │   ├── test_archive_util.cpython-312.pyc
│   │   │       │   │   │   ├── test_bdist_deprecations.cpython-312.pyc
│   │   │       │   │   │   ├── test_bdist_egg.cpython-312.pyc
│   │   │       │   │   │   ├── test_bdist_wheel.cpython-312.pyc
│   │   │       │   │   │   ├── test_build.cpython-312.pyc
│   │   │       │   │   │   ├── test_build_clib.cpython-312.pyc
│   │   │       │   │   │   ├── test_build_ext.cpython-312.pyc
│   │   │       │   │   │   ├── test_build_meta.cpython-312.pyc
│   │   │       │   │   │   ├── test_build_py.cpython-312.pyc
│   │   │       │   │   │   ├── test_config_discovery.cpython-312.pyc
│   │   │       │   │   │   ├── test_core_metadata.cpython-312.pyc
│   │   │       │   │   │   ├── test_depends.cpython-312.pyc
│   │   │       │   │   │   ├── test_develop.cpython-312.pyc
│   │   │       │   │   │   ├── test_dist.cpython-312.pyc
│   │   │       │   │   │   ├── test_dist_info.cpython-312.pyc
│   │   │       │   │   │   ├── test_distutils_adoption.cpython-312.pyc
│   │   │       │   │   │   ├── test_editable_install.cpython-312.pyc
│   │   │       │   │   │   ├── test_egg_info.cpython-312.pyc
│   │   │       │   │   │   ├── test_extern.cpython-312.pyc
│   │   │       │   │   │   ├── test_find_packages.cpython-312.pyc
│   │   │       │   │   │   ├── test_find_py_modules.cpython-312.pyc
│   │   │       │   │   │   ├── test_glob.cpython-312.pyc
│   │   │       │   │   │   ├── test_install_scripts.cpython-312.pyc
│   │   │       │   │   │   ├── test_logging.cpython-312.pyc
│   │   │       │   │   │   ├── test_manifest.cpython-312.pyc
│   │   │       │   │   │   ├── test_namespaces.cpython-312.pyc
│   │   │       │   │   │   ├── test_scripts.cpython-312.pyc
│   │   │       │   │   │   ├── test_sdist.cpython-312.pyc
│   │   │       │   │   │   ├── test_setopt.cpython-312.pyc
│   │   │       │   │   │   ├── test_setuptools.cpython-312.pyc
│   │   │       │   │   │   ├── test_shutil_wrapper.cpython-312.pyc
│   │   │       │   │   │   ├── test_unicode_utils.cpython-312.pyc
│   │   │       │   │   │   ├── test_virtualenv.cpython-312.pyc
│   │   │       │   │   │   ├── test_warnings.cpython-312.pyc
│   │   │       │   │   │   ├── test_wheel.cpython-312.pyc
│   │   │       │   │   │   ├── test_windows_wrappers.cpython-312.pyc
│   │   │       │   │   │   ├── text.cpython-312.pyc
│   │   │       │   │   │   └── textwrap.cpython-312.pyc
│   │   │       │   │   ├── compat/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── py39.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── py39.py
│   │   │       │   │   ├── config/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_apply_pyprojecttoml.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_expand.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pyprojecttoml.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pyprojecttoml_dynamic_deps.cpython-312.pyc
│   │   │       │   │   │   │   └── test_setupcfg.cpython-312.pyc
│   │   │       │   │   │   ├── downloads/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── preload.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── preload.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── setupcfg_examples.txt
│   │   │       │   │   │   ├── test_apply_pyprojecttoml.py
│   │   │       │   │   │   ├── test_expand.py
│   │   │       │   │   │   ├── test_pyprojecttoml.py
│   │   │       │   │   │   ├── test_pyprojecttoml_dynamic_deps.py
│   │   │       │   │   │   └── test_setupcfg.py
│   │   │       │   │   ├── indexes/
│   │   │       │   │   │   ├── test_links_priority/
│   │   │       │   │   │       ├── simple/
│   │   │       │   │   │       │   ├── foobar/
│   │   │       │   │   │       │       └── index.html
│   │   │       │   │   │       └── external.html
│   │   │       │   │   ├── integration/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── helpers.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pbr.cpython-312.pyc
│   │   │       │   │   │   │   └── test_pip_install_sdist.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── helpers.py
│   │   │       │   │   │   ├── test_pbr.py
│   │   │       │   │   │   └── test_pip_install_sdist.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── contexts.py
│   │   │       │   │   ├── environment.py
│   │   │       │   │   ├── fixtures.py
│   │   │       │   │   ├── mod_with_constant.py
│   │   │       │   │   ├── namespaces.py
│   │   │       │   │   ├── script-with-bom.py
│   │   │       │   │   ├── test_archive_util.py
│   │   │       │   │   ├── test_bdist_deprecations.py
│   │   │       │   │   ├── test_bdist_egg.py
│   │   │       │   │   ├── test_bdist_wheel.py
│   │   │       │   │   ├── test_build.py
│   │   │       │   │   ├── test_build_clib.py
│   │   │       │   │   ├── test_build_ext.py
│   │   │       │   │   ├── test_build_meta.py
│   │   │       │   │   ├── test_build_py.py
│   │   │       │   │   ├── test_config_discovery.py
│   │   │       │   │   ├── test_core_metadata.py
│   │   │       │   │   ├── test_depends.py
│   │   │       │   │   ├── test_develop.py
│   │   │       │   │   ├── test_dist.py
│   │   │       │   │   ├── test_dist_info.py
│   │   │       │   │   ├── test_distutils_adoption.py
│   │   │       │   │   ├── test_editable_install.py
│   │   │       │   │   ├── test_egg_info.py
│   │   │       │   │   ├── test_extern.py
│   │   │       │   │   ├── test_find_packages.py
│   │   │       │   │   ├── test_find_py_modules.py
│   │   │       │   │   ├── test_glob.py
│   │   │       │   │   ├── test_install_scripts.py
│   │   │       │   │   ├── test_logging.py
│   │   │       │   │   ├── test_manifest.py
│   │   │       │   │   ├── test_namespaces.py
│   │   │       │   │   ├── test_scripts.py
│   │   │       │   │   ├── test_sdist.py
│   │   │       │   │   ├── test_setopt.py
│   │   │       │   │   ├── test_setuptools.py
│   │   │       │   │   ├── test_shutil_wrapper.py
│   │   │       │   │   ├── test_unicode_utils.py
│   │   │       │   │   ├── test_virtualenv.py
│   │   │       │   │   ├── test_warnings.py
│   │   │       │   │   ├── test_wheel.py
│   │   │       │   │   ├── test_windows_wrappers.py
│   │   │       │   │   ├── text.py
│   │   │       │   │   └── textwrap.py
│   │   │       │   ├── __init__.py
│   │   │       │   ├── _core_metadata.py
│   │   │       │   ├── _discovery.py
│   │   │       │   ├── _entry_points.py
│   │   │       │   ├── _imp.py
│   │   │       │   ├── _importlib.py
│   │   │       │   ├── _itertools.py
│   │   │       │   ├── _normalization.py
│   │   │       │   ├── _path.py
│   │   │       │   ├── _reqs.py
│   │   │       │   ├── _scripts.py
│   │   │       │   ├── _shutil.py
│   │   │       │   ├── _static.py
│   │   │       │   ├── archive_util.py
│   │   │       │   ├── build_meta.py
│   │   │       │   ├── cli-32.exe
│   │   │       │   ├── cli-64.exe
│   │   │       │   ├── cli-arm64.exe
│   │   │       │   ├── cli.exe
│   │   │       │   ├── depends.py
│   │   │       │   ├── discovery.py
│   │   │       │   ├── dist.py
│   │   │       │   ├── errors.py
│   │   │       │   ├── extension.py
│   │   │       │   ├── glob.py
│   │   │       │   ├── gui-32.exe
│   │   │       │   ├── gui-64.exe
│   │   │       │   ├── gui-arm64.exe
│   │   │       │   ├── gui.exe
│   │   │       │   ├── installer.py
│   │   │       │   ├── launch.py
│   │   │       │   ├── logging.py
│   │   │       │   ├── modified.py
│   │   │       │   ├── monkey.py
│   │   │       │   ├── msvc.py
│   │   │       │   ├── namespaces.py
│   │   │       │   ├── script (dev).tmpl
│   │   │       │   ├── script.tmpl
│   │   │       │   ├── unicode_utils.py
│   │   │       │   ├── version.py
│   │   │       │   ├── warnings.py
│   │   │       │   ├── wheel.py
│   │   │       │   └── windows_support.py
│   │   │       ├── setuptools-80.9.0.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── REQUESTED
│   │   │       │   ├── WHEEL
│   │   │       │   ├── entry_points.txt
│   │   │       │   └── top_level.txt
│   │   │       ├── six-1.17.0.dist-info/
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── LICENSE
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── WHEEL
│   │   │       │   └── top_level.txt
│   │   │       ├── sklearn/
│   │   │       │   ├── __check_build/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _check_build.cp312-win_amd64.lib
│   │   │       │   │   ├── _check_build.cp312-win_amd64.pyd
│   │   │       │   │   ├── _check_build.pyx
│   │   │       │   │   └── meson.build
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── _built_with_meson.cpython-312.pyc
│   │   │       │   │   ├── _config.cpython-312.pyc
│   │   │       │   │   ├── _distributor_init.cpython-312.pyc
│   │   │       │   │   ├── _min_dependencies.cpython-312.pyc
│   │   │       │   │   ├── base.cpython-312.pyc
│   │   │       │   │   ├── calibration.cpython-312.pyc
│   │   │       │   │   ├── conftest.cpython-312.pyc
│   │   │       │   │   ├── discriminant_analysis.cpython-312.pyc
│   │   │       │   │   ├── dummy.cpython-312.pyc
│   │   │       │   │   ├── exceptions.cpython-312.pyc
│   │   │       │   │   ├── isotonic.cpython-312.pyc
│   │   │       │   │   ├── kernel_approximation.cpython-312.pyc
│   │   │       │   │   ├── kernel_ridge.cpython-312.pyc
│   │   │       │   │   ├── multiclass.cpython-312.pyc
│   │   │       │   │   ├── multioutput.cpython-312.pyc
│   │   │       │   │   ├── naive_bayes.cpython-312.pyc
│   │   │       │   │   ├── pipeline.cpython-312.pyc
│   │   │       │   │   └── random_projection.cpython-312.pyc
│   │   │       │   ├── _build_utils/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── tempita.cpython-312.pyc
│   │   │       │   │   │   └── version.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── tempita.py
│   │   │       │   │   └── version.py
│   │   │       │   ├── _loss/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── link.cpython-312.pyc
│   │   │       │   │   │   └── loss.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_link.cpython-312.pyc
│   │   │       │   │   │   │   └── test_loss.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_link.py
│   │   │       │   │   │   └── test_loss.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _loss.cp312-win_amd64.lib
│   │   │       │   │   ├── _loss.cp312-win_amd64.pyd
│   │   │       │   │   ├── _loss.pxd
│   │   │       │   │   ├── _loss.pyx.tp
│   │   │       │   │   ├── link.py
│   │   │       │   │   ├── loss.py
│   │   │       │   │   └── meson.build
│   │   │       │   ├── cluster/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _affinity_propagation.cpython-312.pyc
│   │   │       │   │   │   ├── _agglomerative.cpython-312.pyc
│   │   │       │   │   │   ├── _bicluster.cpython-312.pyc
│   │   │       │   │   │   ├── _birch.cpython-312.pyc
│   │   │       │   │   │   ├── _bisect_k_means.cpython-312.pyc
│   │   │       │   │   │   ├── _dbscan.cpython-312.pyc
│   │   │       │   │   │   ├── _feature_agglomeration.cpython-312.pyc
│   │   │       │   │   │   ├── _kmeans.cpython-312.pyc
│   │   │       │   │   │   ├── _mean_shift.cpython-312.pyc
│   │   │       │   │   │   ├── _optics.cpython-312.pyc
│   │   │       │   │   │   └── _spectral.cpython-312.pyc
│   │   │       │   │   ├── _hdbscan/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── hdbscan.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_reachibility.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── test_reachibility.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _linkage.cp312-win_amd64.lib
│   │   │       │   │   │   ├── _linkage.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _linkage.pyx
│   │   │       │   │   │   ├── _reachability.cp312-win_amd64.lib
│   │   │       │   │   │   ├── _reachability.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _reachability.pyx
│   │   │       │   │   │   ├── _tree.cp312-win_amd64.lib
│   │   │       │   │   │   ├── _tree.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _tree.pxd
│   │   │       │   │   │   ├── _tree.pyx
│   │   │       │   │   │   ├── hdbscan.py
│   │   │       │   │   │   └── meson.build
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── common.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_affinity_propagation.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bicluster.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_birch.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bisect_k_means.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_dbscan.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_feature_agglomeration.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_hdbscan.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_hierarchical.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_k_means.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mean_shift.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_optics.cpython-312.pyc
│   │   │       │   │   │   │   └── test_spectral.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── common.py
│   │   │       │   │   │   ├── test_affinity_propagation.py
│   │   │       │   │   │   ├── test_bicluster.py
│   │   │       │   │   │   ├── test_birch.py
│   │   │       │   │   │   ├── test_bisect_k_means.py
│   │   │       │   │   │   ├── test_dbscan.py
│   │   │       │   │   │   ├── test_feature_agglomeration.py
│   │   │       │   │   │   ├── test_hdbscan.py
│   │   │       │   │   │   ├── test_hierarchical.py
│   │   │       │   │   │   ├── test_k_means.py
│   │   │       │   │   │   ├── test_mean_shift.py
│   │   │       │   │   │   ├── test_optics.py
│   │   │       │   │   │   └── test_spectral.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _affinity_propagation.py
│   │   │       │   │   ├── _agglomerative.py
│   │   │       │   │   ├── _bicluster.py
│   │   │       │   │   ├── _birch.py
│   │   │       │   │   ├── _bisect_k_means.py
│   │   │       │   │   ├── _dbscan.py
│   │   │       │   │   ├── _dbscan_inner.cp312-win_amd64.lib
│   │   │       │   │   ├── _dbscan_inner.cp312-win_amd64.pyd
│   │   │       │   │   ├── _dbscan_inner.pyx
│   │   │       │   │   ├── _feature_agglomeration.py
│   │   │       │   │   ├── _hierarchical_fast.cp312-win_amd64.lib
│   │   │       │   │   ├── _hierarchical_fast.cp312-win_amd64.pyd
│   │   │       │   │   ├── _hierarchical_fast.pxd
│   │   │       │   │   ├── _hierarchical_fast.pyx
│   │   │       │   │   ├── _k_means_common.cp312-win_amd64.lib
│   │   │       │   │   ├── _k_means_common.cp312-win_amd64.pyd
│   │   │       │   │   ├── _k_means_common.pxd
│   │   │       │   │   ├── _k_means_common.pyx
│   │   │       │   │   ├── _k_means_elkan.cp312-win_amd64.lib
│   │   │       │   │   ├── _k_means_elkan.cp312-win_amd64.pyd
│   │   │       │   │   ├── _k_means_elkan.pyx
│   │   │       │   │   ├── _k_means_lloyd.cp312-win_amd64.lib
│   │   │       │   │   ├── _k_means_lloyd.cp312-win_amd64.pyd
│   │   │       │   │   ├── _k_means_lloyd.pyx
│   │   │       │   │   ├── _k_means_minibatch.cp312-win_amd64.lib
│   │   │       │   │   ├── _k_means_minibatch.cp312-win_amd64.pyd
│   │   │       │   │   ├── _k_means_minibatch.pyx
│   │   │       │   │   ├── _kmeans.py
│   │   │       │   │   ├── _mean_shift.py
│   │   │       │   │   ├── _optics.py
│   │   │       │   │   ├── _spectral.py
│   │   │       │   │   └── meson.build
│   │   │       │   ├── compose/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _column_transformer.cpython-312.pyc
│   │   │       │   │   │   └── _target.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_column_transformer.cpython-312.pyc
│   │   │       │   │   │   │   └── test_target.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_column_transformer.py
│   │   │       │   │   │   └── test_target.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _column_transformer.py
│   │   │       │   │   └── _target.py
│   │   │       │   ├── covariance/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _elliptic_envelope.cpython-312.pyc
│   │   │       │   │   │   ├── _empirical_covariance.cpython-312.pyc
│   │   │       │   │   │   ├── _graph_lasso.cpython-312.pyc
│   │   │       │   │   │   ├── _robust_covariance.cpython-312.pyc
│   │   │       │   │   │   └── _shrunk_covariance.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_covariance.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_elliptic_envelope.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_graphical_lasso.cpython-312.pyc
│   │   │       │   │   │   │   └── test_robust_covariance.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_covariance.py
│   │   │       │   │   │   ├── test_elliptic_envelope.py
│   │   │       │   │   │   ├── test_graphical_lasso.py
│   │   │       │   │   │   └── test_robust_covariance.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _elliptic_envelope.py
│   │   │       │   │   ├── _empirical_covariance.py
│   │   │       │   │   ├── _graph_lasso.py
│   │   │       │   │   ├── _robust_covariance.py
│   │   │       │   │   └── _shrunk_covariance.py
│   │   │       │   ├── cross_decomposition/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   └── _pls.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── test_pls.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── test_pls.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   └── _pls.py
│   │   │       │   ├── datasets/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _arff_parser.cpython-312.pyc
│   │   │       │   │   │   ├── _base.cpython-312.pyc
│   │   │       │   │   │   ├── _california_housing.cpython-312.pyc
│   │   │       │   │   │   ├── _covtype.cpython-312.pyc
│   │   │       │   │   │   ├── _kddcup99.cpython-312.pyc
│   │   │       │   │   │   ├── _lfw.cpython-312.pyc
│   │   │       │   │   │   ├── _olivetti_faces.cpython-312.pyc
│   │   │       │   │   │   ├── _openml.cpython-312.pyc
│   │   │       │   │   │   ├── _rcv1.cpython-312.pyc
│   │   │       │   │   │   ├── _samples_generator.cpython-312.pyc
│   │   │       │   │   │   ├── _species_distributions.cpython-312.pyc
│   │   │       │   │   │   ├── _svmlight_format_io.cpython-312.pyc
│   │   │       │   │   │   └── _twenty_newsgroups.cpython-312.pyc
│   │   │       │   │   ├── data/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── boston_house_prices.csv
│   │   │       │   │   │   ├── breast_cancer.csv
│   │   │       │   │   │   ├── diabetes_data_raw.csv.gz
│   │   │       │   │   │   ├── diabetes_target.csv.gz
│   │   │       │   │   │   ├── digits.csv.gz
│   │   │       │   │   │   ├── iris.csv
│   │   │       │   │   │   ├── linnerud_exercise.csv
│   │   │       │   │   │   ├── linnerud_physiological.csv
│   │   │       │   │   │   └── wine_data.csv
│   │   │       │   │   ├── descr/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── breast_cancer.rst
│   │   │       │   │   │   ├── california_housing.rst
│   │   │       │   │   │   ├── covtype.rst
│   │   │       │   │   │   ├── diabetes.rst
│   │   │       │   │   │   ├── digits.rst
│   │   │       │   │   │   ├── iris.rst
│   │   │       │   │   │   ├── kddcup99.rst
│   │   │       │   │   │   ├── lfw.rst
│   │   │       │   │   │   ├── linnerud.rst
│   │   │       │   │   │   ├── olivetti_faces.rst
│   │   │       │   │   │   ├── rcv1.rst
│   │   │       │   │   │   ├── species_distributions.rst
│   │   │       │   │   │   ├── twenty_newsgroups.rst
│   │   │       │   │   │   └── wine_data.rst
│   │   │       │   │   ├── images/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── README.txt
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── china.jpg
│   │   │       │   │   │   └── flower.jpg
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_20news.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_arff_parser.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_base.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_california_housing.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_common.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_covtype.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_kddcup99.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_lfw.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_olivetti_faces.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_openml.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_rcv1.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_samples_generator.cpython-312.pyc
│   │   │       │   │   │   │   └── test_svmlight_format.cpython-312.pyc
│   │   │       │   │   │   ├── data/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── openml/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── id_1/
│   │   │       │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   │   ├── api-v1-jd-1.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdf-1.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdq-1.json.gz
│   │   │       │   │   │   │   │   │   └── data-v1-dl-1.arff.gz
│   │   │       │   │   │   │   │   ├── id_1119/
│   │   │       │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   │   ├── api-v1-jd-1119.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdf-1119.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdl-dn-adult-census-l-2-dv-1.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdl-dn-adult-census-l-2-s-act-.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdq-1119.json.gz
│   │   │       │   │   │   │   │   │   └── data-v1-dl-54002.arff.gz
│   │   │       │   │   │   │   │   ├── id_1590/
│   │   │       │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   │   ├── api-v1-jd-1590.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdf-1590.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdq-1590.json.gz
│   │   │       │   │   │   │   │   │   └── data-v1-dl-1595261.arff.gz
│   │   │       │   │   │   │   │   ├── id_2/
│   │   │       │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   │   ├── api-v1-jd-2.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdf-2.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdl-dn-anneal-l-2-dv-1.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdl-dn-anneal-l-2-s-act-.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdq-2.json.gz
│   │   │       │   │   │   │   │   │   └── data-v1-dl-1666876.arff.gz
│   │   │       │   │   │   │   │   ├── id_292/
│   │   │       │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   │   ├── api-v1-jd-292.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jd-40981.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdf-292.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdf-40981.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdl-dn-australian-l-2-dv-1-s-dact.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdl-dn-australian-l-2-dv-1.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdl-dn-australian-l-2-s-act-.json.gz
│   │   │       │   │   │   │   │   │   └── data-v1-dl-49822.arff.gz
│   │   │       │   │   │   │   │   ├── id_3/
│   │   │       │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   │   ├── api-v1-jd-3.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdf-3.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdq-3.json.gz
│   │   │       │   │   │   │   │   │   └── data-v1-dl-3.arff.gz
│   │   │       │   │   │   │   │   ├── id_40589/
│   │   │       │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   │   ├── api-v1-jd-40589.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdf-40589.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdl-dn-emotions-l-2-dv-3.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdl-dn-emotions-l-2-s-act-.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdq-40589.json.gz
│   │   │       │   │   │   │   │   │   └── data-v1-dl-4644182.arff.gz
│   │   │       │   │   │   │   │   ├── id_40675/
│   │   │       │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   │   ├── api-v1-jd-40675.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdf-40675.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdl-dn-glass2-l-2-dv-1-s-dact.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdl-dn-glass2-l-2-dv-1.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdl-dn-glass2-l-2-s-act-.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdq-40675.json.gz
│   │   │       │   │   │   │   │   │   └── data-v1-dl-4965250.arff.gz
│   │   │       │   │   │   │   │   ├── id_40945/
│   │   │       │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   │   ├── api-v1-jd-40945.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdf-40945.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdq-40945.json.gz
│   │   │       │   │   │   │   │   │   └── data-v1-dl-16826755.arff.gz
│   │   │       │   │   │   │   │   ├── id_40966/
│   │   │       │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   │   ├── api-v1-jd-40966.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdf-40966.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdl-dn-miceprotein-l-2-dv-4.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdl-dn-miceprotein-l-2-s-act-.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdq-40966.json.gz
│   │   │       │   │   │   │   │   │   └── data-v1-dl-17928620.arff.gz
│   │   │       │   │   │   │   │   ├── id_42074/
│   │   │       │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   │   ├── api-v1-jd-42074.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdf-42074.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdq-42074.json.gz
│   │   │       │   │   │   │   │   │   └── data-v1-dl-21552912.arff.gz
│   │   │       │   │   │   │   │   ├── id_42585/
│   │   │       │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   │   ├── api-v1-jd-42585.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdf-42585.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdq-42585.json.gz
│   │   │       │   │   │   │   │   │   └── data-v1-dl-21854866.arff.gz
│   │   │       │   │   │   │   │   ├── id_561/
│   │   │       │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   │   ├── api-v1-jd-561.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdf-561.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdl-dn-cpu-l-2-dv-1.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdl-dn-cpu-l-2-s-act-.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdq-561.json.gz
│   │   │       │   │   │   │   │   │   └── data-v1-dl-52739.arff.gz
│   │   │       │   │   │   │   │   ├── id_61/
│   │   │       │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   │   ├── api-v1-jd-61.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdf-61.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdl-dn-iris-l-2-dv-1.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdl-dn-iris-l-2-s-act-.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdq-61.json.gz
│   │   │       │   │   │   │   │   │   └── data-v1-dl-61.arff.gz
│   │   │       │   │   │   │   │   ├── id_62/
│   │   │       │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   │   ├── api-v1-jd-62.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdf-62.json.gz
│   │   │       │   │   │   │   │   │   ├── api-v1-jdq-62.json.gz
│   │   │       │   │   │   │   │   │   └── data-v1-dl-52352.arff.gz
│   │   │       │   │   │   │   │   └── __init__.py
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── svmlight_classification.txt
│   │   │       │   │   │   │   ├── svmlight_invalid.txt
│   │   │       │   │   │   │   ├── svmlight_invalid_order.txt
│   │   │       │   │   │   │   └── svmlight_multilabel.txt
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_20news.py
│   │   │       │   │   │   ├── test_arff_parser.py
│   │   │       │   │   │   ├── test_base.py
│   │   │       │   │   │   ├── test_california_housing.py
│   │   │       │   │   │   ├── test_common.py
│   │   │       │   │   │   ├── test_covtype.py
│   │   │       │   │   │   ├── test_kddcup99.py
│   │   │       │   │   │   ├── test_lfw.py
│   │   │       │   │   │   ├── test_olivetti_faces.py
│   │   │       │   │   │   ├── test_openml.py
│   │   │       │   │   │   ├── test_rcv1.py
│   │   │       │   │   │   ├── test_samples_generator.py
│   │   │       │   │   │   └── test_svmlight_format.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _arff_parser.py
│   │   │       │   │   ├── _base.py
│   │   │       │   │   ├── _california_housing.py
│   │   │       │   │   ├── _covtype.py
│   │   │       │   │   ├── _kddcup99.py
│   │   │       │   │   ├── _lfw.py
│   │   │       │   │   ├── _olivetti_faces.py
│   │   │       │   │   ├── _openml.py
│   │   │       │   │   ├── _rcv1.py
│   │   │       │   │   ├── _samples_generator.py
│   │   │       │   │   ├── _species_distributions.py
│   │   │       │   │   ├── _svmlight_format_fast.cp312-win_amd64.lib
│   │   │       │   │   ├── _svmlight_format_fast.cp312-win_amd64.pyd
│   │   │       │   │   ├── _svmlight_format_fast.pyx
│   │   │       │   │   ├── _svmlight_format_io.py
│   │   │       │   │   ├── _twenty_newsgroups.py
│   │   │       │   │   └── meson.build
│   │   │       │   ├── decomposition/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _base.cpython-312.pyc
│   │   │       │   │   │   ├── _dict_learning.cpython-312.pyc
│   │   │       │   │   │   ├── _factor_analysis.cpython-312.pyc
│   │   │       │   │   │   ├── _fastica.cpython-312.pyc
│   │   │       │   │   │   ├── _incremental_pca.cpython-312.pyc
│   │   │       │   │   │   ├── _kernel_pca.cpython-312.pyc
│   │   │       │   │   │   ├── _lda.cpython-312.pyc
│   │   │       │   │   │   ├── _nmf.cpython-312.pyc
│   │   │       │   │   │   ├── _pca.cpython-312.pyc
│   │   │       │   │   │   ├── _sparse_pca.cpython-312.pyc
│   │   │       │   │   │   └── _truncated_svd.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_dict_learning.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_factor_analysis.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_fastica.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_incremental_pca.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_kernel_pca.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_nmf.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_online_lda.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pca.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sparse_pca.cpython-312.pyc
│   │   │       │   │   │   │   └── test_truncated_svd.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_dict_learning.py
│   │   │       │   │   │   ├── test_factor_analysis.py
│   │   │       │   │   │   ├── test_fastica.py
│   │   │       │   │   │   ├── test_incremental_pca.py
│   │   │       │   │   │   ├── test_kernel_pca.py
│   │   │       │   │   │   ├── test_nmf.py
│   │   │       │   │   │   ├── test_online_lda.py
│   │   │       │   │   │   ├── test_pca.py
│   │   │       │   │   │   ├── test_sparse_pca.py
│   │   │       │   │   │   └── test_truncated_svd.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _base.py
│   │   │       │   │   ├── _cdnmf_fast.cp312-win_amd64.lib
│   │   │       │   │   ├── _cdnmf_fast.cp312-win_amd64.pyd
│   │   │       │   │   ├── _cdnmf_fast.pyx
│   │   │       │   │   ├── _dict_learning.py
│   │   │       │   │   ├── _factor_analysis.py
│   │   │       │   │   ├── _fastica.py
│   │   │       │   │   ├── _incremental_pca.py
│   │   │       │   │   ├── _kernel_pca.py
│   │   │       │   │   ├── _lda.py
│   │   │       │   │   ├── _nmf.py
│   │   │       │   │   ├── _online_lda_fast.cp312-win_amd64.lib
│   │   │       │   │   ├── _online_lda_fast.cp312-win_amd64.pyd
│   │   │       │   │   ├── _online_lda_fast.pyx
│   │   │       │   │   ├── _pca.py
│   │   │       │   │   ├── _sparse_pca.py
│   │   │       │   │   ├── _truncated_svd.py
│   │   │       │   │   └── meson.build
│   │   │       │   ├── ensemble/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _bagging.cpython-312.pyc
│   │   │       │   │   │   ├── _base.cpython-312.pyc
│   │   │       │   │   │   ├── _forest.cpython-312.pyc
│   │   │       │   │   │   ├── _gb.cpython-312.pyc
│   │   │       │   │   │   ├── _iforest.cpython-312.pyc
│   │   │       │   │   │   ├── _stacking.cpython-312.pyc
│   │   │       │   │   │   ├── _voting.cpython-312.pyc
│   │   │       │   │   │   └── _weight_boosting.cpython-312.pyc
│   │   │       │   │   ├── _hist_gradient_boosting/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── binning.cpython-312.pyc
│   │   │       │   │   │   │   ├── gradient_boosting.cpython-312.pyc
│   │   │       │   │   │   │   ├── grower.cpython-312.pyc
│   │   │       │   │   │   │   ├── predictor.cpython-312.pyc
│   │   │       │   │   │   │   └── utils.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_binning.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_bitset.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_compare_lightgbm.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_gradient_boosting.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_grower.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_histogram.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_monotonic_constraints.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_predictor.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_splitting.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_warm_start.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_binning.py
│   │   │       │   │   │   │   ├── test_bitset.py
│   │   │       │   │   │   │   ├── test_compare_lightgbm.py
│   │   │       │   │   │   │   ├── test_gradient_boosting.py
│   │   │       │   │   │   │   ├── test_grower.py
│   │   │       │   │   │   │   ├── test_histogram.py
│   │   │       │   │   │   │   ├── test_monotonic_constraints.py
│   │   │       │   │   │   │   ├── test_predictor.py
│   │   │       │   │   │   │   ├── test_splitting.py
│   │   │       │   │   │   │   └── test_warm_start.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _binning.cp312-win_amd64.lib
│   │   │       │   │   │   ├── _binning.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _binning.pyx
│   │   │       │   │   │   ├── _bitset.cp312-win_amd64.lib
│   │   │       │   │   │   ├── _bitset.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _bitset.pxd
│   │   │       │   │   │   ├── _bitset.pyx
│   │   │       │   │   │   ├── _gradient_boosting.cp312-win_amd64.lib
│   │   │       │   │   │   ├── _gradient_boosting.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _gradient_boosting.pyx
│   │   │       │   │   │   ├── _predictor.cp312-win_amd64.lib
│   │   │       │   │   │   ├── _predictor.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _predictor.pyx
│   │   │       │   │   │   ├── binning.py
│   │   │       │   │   │   ├── common.cp312-win_amd64.lib
│   │   │       │   │   │   ├── common.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── common.pxd
│   │   │       │   │   │   ├── common.pyx
│   │   │       │   │   │   ├── gradient_boosting.py
│   │   │       │   │   │   ├── grower.py
│   │   │       │   │   │   ├── histogram.cp312-win_amd64.lib
│   │   │       │   │   │   ├── histogram.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── histogram.pyx
│   │   │       │   │   │   ├── meson.build
│   │   │       │   │   │   ├── predictor.py
│   │   │       │   │   │   ├── splitting.cp312-win_amd64.lib
│   │   │       │   │   │   ├── splitting.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── splitting.pyx
│   │   │       │   │   │   └── utils.py
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bagging.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_base.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_common.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_forest.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_gradient_boosting.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_iforest.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_stacking.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_voting.cpython-312.pyc
│   │   │       │   │   │   │   └── test_weight_boosting.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_bagging.py
│   │   │       │   │   │   ├── test_base.py
│   │   │       │   │   │   ├── test_common.py
│   │   │       │   │   │   ├── test_forest.py
│   │   │       │   │   │   ├── test_gradient_boosting.py
│   │   │       │   │   │   ├── test_iforest.py
│   │   │       │   │   │   ├── test_stacking.py
│   │   │       │   │   │   ├── test_voting.py
│   │   │       │   │   │   └── test_weight_boosting.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _bagging.py
│   │   │       │   │   ├── _base.py
│   │   │       │   │   ├── _forest.py
│   │   │       │   │   ├── _gb.py
│   │   │       │   │   ├── _gradient_boosting.cp312-win_amd64.lib
│   │   │       │   │   ├── _gradient_boosting.cp312-win_amd64.pyd
│   │   │       │   │   ├── _gradient_boosting.pyx
│   │   │       │   │   ├── _iforest.py
│   │   │       │   │   ├── _stacking.py
│   │   │       │   │   ├── _voting.py
│   │   │       │   │   ├── _weight_boosting.py
│   │   │       │   │   └── meson.build
│   │   │       │   ├── experimental/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── enable_halving_search_cv.cpython-312.pyc
│   │   │       │   │   │   ├── enable_hist_gradient_boosting.cpython-312.pyc
│   │   │       │   │   │   └── enable_iterative_imputer.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_enable_hist_gradient_boosting.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_enable_iterative_imputer.cpython-312.pyc
│   │   │       │   │   │   │   └── test_enable_successive_halving.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_enable_hist_gradient_boosting.py
│   │   │       │   │   │   ├── test_enable_iterative_imputer.py
│   │   │       │   │   │   └── test_enable_successive_halving.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── enable_halving_search_cv.py
│   │   │       │   │   ├── enable_hist_gradient_boosting.py
│   │   │       │   │   └── enable_iterative_imputer.py
│   │   │       │   ├── externals/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _arff.cpython-312.pyc
│   │   │       │   │   │   └── conftest.cpython-312.pyc
│   │   │       │   │   ├── _packaging/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _structures.cpython-312.pyc
│   │   │       │   │   │   │   └── version.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _structures.py
│   │   │       │   │   │   └── version.py
│   │   │       │   │   ├── _scipy/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── sparse/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── csgraph/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── _laplacian.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   └── _laplacian.py
│   │   │       │   │   │   │   └── __init__.py
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── README
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _arff.py
│   │   │       │   │   └── conftest.py
│   │   │       │   ├── feature_extraction/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _dict_vectorizer.cpython-312.pyc
│   │   │       │   │   │   ├── _hash.cpython-312.pyc
│   │   │       │   │   │   ├── _stop_words.cpython-312.pyc
│   │   │       │   │   │   ├── image.cpython-312.pyc
│   │   │       │   │   │   └── text.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_dict_vectorizer.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_feature_hasher.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_image.cpython-312.pyc
│   │   │       │   │   │   │   └── test_text.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_dict_vectorizer.py
│   │   │       │   │   │   ├── test_feature_hasher.py
│   │   │       │   │   │   ├── test_image.py
│   │   │       │   │   │   └── test_text.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _dict_vectorizer.py
│   │   │       │   │   ├── _hash.py
│   │   │       │   │   ├── _hashing_fast.cp312-win_amd64.lib
│   │   │       │   │   ├── _hashing_fast.cp312-win_amd64.pyd
│   │   │       │   │   ├── _hashing_fast.pyx
│   │   │       │   │   ├── _stop_words.py
│   │   │       │   │   ├── image.py
│   │   │       │   │   ├── meson.build
│   │   │       │   │   └── text.py
│   │   │       │   ├── feature_selection/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _base.cpython-312.pyc
│   │   │       │   │   │   ├── _from_model.cpython-312.pyc
│   │   │       │   │   │   ├── _mutual_info.cpython-312.pyc
│   │   │       │   │   │   ├── _rfe.cpython-312.pyc
│   │   │       │   │   │   ├── _sequential.cpython-312.pyc
│   │   │       │   │   │   ├── _univariate_selection.cpython-312.pyc
│   │   │       │   │   │   └── _variance_threshold.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_base.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_chi2.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_feature_select.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_from_model.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mutual_info.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_rfe.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sequential.cpython-312.pyc
│   │   │       │   │   │   │   └── test_variance_threshold.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_base.py
│   │   │       │   │   │   ├── test_chi2.py
│   │   │       │   │   │   ├── test_feature_select.py
│   │   │       │   │   │   ├── test_from_model.py
│   │   │       │   │   │   ├── test_mutual_info.py
│   │   │       │   │   │   ├── test_rfe.py
│   │   │       │   │   │   ├── test_sequential.py
│   │   │       │   │   │   └── test_variance_threshold.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _base.py
│   │   │       │   │   ├── _from_model.py
│   │   │       │   │   ├── _mutual_info.py
│   │   │       │   │   ├── _rfe.py
│   │   │       │   │   ├── _sequential.py
│   │   │       │   │   ├── _univariate_selection.py
│   │   │       │   │   └── _variance_threshold.py
│   │   │       │   ├── frozen/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   └── _frozen.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── test_frozen.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── test_frozen.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   └── _frozen.py
│   │   │       │   ├── gaussian_process/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _gpc.cpython-312.pyc
│   │   │       │   │   │   ├── _gpr.cpython-312.pyc
│   │   │       │   │   │   └── kernels.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _mini_sequence_kernel.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_gpc.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_gpr.cpython-312.pyc
│   │   │       │   │   │   │   └── test_kernels.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _mini_sequence_kernel.py
│   │   │       │   │   │   ├── test_gpc.py
│   │   │       │   │   │   ├── test_gpr.py
│   │   │       │   │   │   └── test_kernels.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _gpc.py
│   │   │       │   │   ├── _gpr.py
│   │   │       │   │   └── kernels.py
│   │   │       │   ├── impute/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _base.cpython-312.pyc
│   │   │       │   │   │   ├── _iterative.cpython-312.pyc
│   │   │       │   │   │   └── _knn.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_base.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_common.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_impute.cpython-312.pyc
│   │   │       │   │   │   │   └── test_knn.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_base.py
│   │   │       │   │   │   ├── test_common.py
│   │   │       │   │   │   ├── test_impute.py
│   │   │       │   │   │   └── test_knn.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _base.py
│   │   │       │   │   ├── _iterative.py
│   │   │       │   │   └── _knn.py
│   │   │       │   ├── inspection/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _partial_dependence.cpython-312.pyc
│   │   │       │   │   │   ├── _pd_utils.cpython-312.pyc
│   │   │       │   │   │   └── _permutation_importance.cpython-312.pyc
│   │   │       │   │   ├── _plot/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── decision_boundary.cpython-312.pyc
│   │   │       │   │   │   │   └── partial_dependence.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_boundary_decision_display.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_plot_partial_dependence.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_boundary_decision_display.py
│   │   │       │   │   │   │   └── test_plot_partial_dependence.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── decision_boundary.py
│   │   │       │   │   │   └── partial_dependence.py
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_partial_dependence.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pd_utils.cpython-312.pyc
│   │   │       │   │   │   │   └── test_permutation_importance.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_partial_dependence.py
│   │   │       │   │   │   ├── test_pd_utils.py
│   │   │       │   │   │   └── test_permutation_importance.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _partial_dependence.py
│   │   │       │   │   ├── _pd_utils.py
│   │   │       │   │   └── _permutation_importance.py
│   │   │       │   ├── linear_model/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _base.cpython-312.pyc
│   │   │       │   │   │   ├── _bayes.cpython-312.pyc
│   │   │       │   │   │   ├── _coordinate_descent.cpython-312.pyc
│   │   │       │   │   │   ├── _huber.cpython-312.pyc
│   │   │       │   │   │   ├── _least_angle.cpython-312.pyc
│   │   │       │   │   │   ├── _linear_loss.cpython-312.pyc
│   │   │       │   │   │   ├── _logistic.cpython-312.pyc
│   │   │       │   │   │   ├── _omp.cpython-312.pyc
│   │   │       │   │   │   ├── _passive_aggressive.cpython-312.pyc
│   │   │       │   │   │   ├── _perceptron.cpython-312.pyc
│   │   │       │   │   │   ├── _quantile.cpython-312.pyc
│   │   │       │   │   │   ├── _ransac.cpython-312.pyc
│   │   │       │   │   │   ├── _ridge.cpython-312.pyc
│   │   │       │   │   │   ├── _sag.cpython-312.pyc
│   │   │       │   │   │   ├── _stochastic_gradient.cpython-312.pyc
│   │   │       │   │   │   └── _theil_sen.cpython-312.pyc
│   │   │       │   │   ├── _glm/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _newton_solver.cpython-312.pyc
│   │   │       │   │   │   │   └── glm.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_glm.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── test_glm.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _newton_solver.py
│   │   │       │   │   │   └── glm.py
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_base.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bayes.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_common.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_coordinate_descent.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_huber.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_least_angle.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_linear_loss.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_logistic.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_omp.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_passive_aggressive.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_perceptron.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_quantile.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ransac.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ridge.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sag.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sgd.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sparse_coordinate_descent.cpython-312.pyc
│   │   │       │   │   │   │   └── test_theil_sen.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_base.py
│   │   │       │   │   │   ├── test_bayes.py
│   │   │       │   │   │   ├── test_common.py
│   │   │       │   │   │   ├── test_coordinate_descent.py
│   │   │       │   │   │   ├── test_huber.py
│   │   │       │   │   │   ├── test_least_angle.py
│   │   │       │   │   │   ├── test_linear_loss.py
│   │   │       │   │   │   ├── test_logistic.py
│   │   │       │   │   │   ├── test_omp.py
│   │   │       │   │   │   ├── test_passive_aggressive.py
│   │   │       │   │   │   ├── test_perceptron.py
│   │   │       │   │   │   ├── test_quantile.py
│   │   │       │   │   │   ├── test_ransac.py
│   │   │       │   │   │   ├── test_ridge.py
│   │   │       │   │   │   ├── test_sag.py
│   │   │       │   │   │   ├── test_sgd.py
│   │   │       │   │   │   ├── test_sparse_coordinate_descent.py
│   │   │       │   │   │   └── test_theil_sen.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _base.py
│   │   │       │   │   ├── _bayes.py
│   │   │       │   │   ├── _cd_fast.cp312-win_amd64.lib
│   │   │       │   │   ├── _cd_fast.cp312-win_amd64.pyd
│   │   │       │   │   ├── _cd_fast.pyx
│   │   │       │   │   ├── _coordinate_descent.py
│   │   │       │   │   ├── _huber.py
│   │   │       │   │   ├── _least_angle.py
│   │   │       │   │   ├── _linear_loss.py
│   │   │       │   │   ├── _logistic.py
│   │   │       │   │   ├── _omp.py
│   │   │       │   │   ├── _passive_aggressive.py
│   │   │       │   │   ├── _perceptron.py
│   │   │       │   │   ├── _quantile.py
│   │   │       │   │   ├── _ransac.py
│   │   │       │   │   ├── _ridge.py
│   │   │       │   │   ├── _sag.py
│   │   │       │   │   ├── _sag_fast.cp312-win_amd64.lib
│   │   │       │   │   ├── _sag_fast.cp312-win_amd64.pyd
│   │   │       │   │   ├── _sag_fast.pyx.tp
│   │   │       │   │   ├── _sgd_fast.cp312-win_amd64.lib
│   │   │       │   │   ├── _sgd_fast.cp312-win_amd64.pyd
│   │   │       │   │   ├── _sgd_fast.pyx.tp
│   │   │       │   │   ├── _stochastic_gradient.py
│   │   │       │   │   ├── _theil_sen.py
│   │   │       │   │   └── meson.build
│   │   │       │   ├── manifold/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _isomap.cpython-312.pyc
│   │   │       │   │   │   ├── _locally_linear.cpython-312.pyc
│   │   │       │   │   │   ├── _mds.cpython-312.pyc
│   │   │       │   │   │   ├── _spectral_embedding.cpython-312.pyc
│   │   │       │   │   │   └── _t_sne.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_isomap.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_locally_linear.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mds.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_spectral_embedding.cpython-312.pyc
│   │   │       │   │   │   │   └── test_t_sne.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_isomap.py
│   │   │       │   │   │   ├── test_locally_linear.py
│   │   │       │   │   │   ├── test_mds.py
│   │   │       │   │   │   ├── test_spectral_embedding.py
│   │   │       │   │   │   └── test_t_sne.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _barnes_hut_tsne.cp312-win_amd64.lib
│   │   │       │   │   ├── _barnes_hut_tsne.cp312-win_amd64.pyd
│   │   │       │   │   ├── _barnes_hut_tsne.pyx
│   │   │       │   │   ├── _isomap.py
│   │   │       │   │   ├── _locally_linear.py
│   │   │       │   │   ├── _mds.py
│   │   │       │   │   ├── _spectral_embedding.py
│   │   │       │   │   ├── _t_sne.py
│   │   │       │   │   ├── _utils.cp312-win_amd64.lib
│   │   │       │   │   ├── _utils.cp312-win_amd64.pyd
│   │   │       │   │   ├── _utils.pyx
│   │   │       │   │   └── meson.build
│   │   │       │   ├── metrics/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _base.cpython-312.pyc
│   │   │       │   │   │   ├── _classification.cpython-312.pyc
│   │   │       │   │   │   ├── _ranking.cpython-312.pyc
│   │   │       │   │   │   ├── _regression.cpython-312.pyc
│   │   │       │   │   │   ├── _scorer.cpython-312.pyc
│   │   │       │   │   │   └── pairwise.cpython-312.pyc
│   │   │       │   │   ├── _pairwise_distances_reduction/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── _dispatcher.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _argkmin.cp312-win_amd64.lib
│   │   │       │   │   │   ├── _argkmin.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _argkmin.pxd.tp
│   │   │       │   │   │   ├── _argkmin.pyx.tp
│   │   │       │   │   │   ├── _argkmin_classmode.cp312-win_amd64.lib
│   │   │       │   │   │   ├── _argkmin_classmode.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _argkmin_classmode.pyx.tp
│   │   │       │   │   │   ├── _base.cp312-win_amd64.lib
│   │   │       │   │   │   ├── _base.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _base.pxd.tp
│   │   │       │   │   │   ├── _base.pyx.tp
│   │   │       │   │   │   ├── _classmode.pxd
│   │   │       │   │   │   ├── _datasets_pair.cp312-win_amd64.lib
│   │   │       │   │   │   ├── _datasets_pair.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _datasets_pair.pxd.tp
│   │   │       │   │   │   ├── _datasets_pair.pyx.tp
│   │   │       │   │   │   ├── _dispatcher.py
│   │   │       │   │   │   ├── _middle_term_computer.cp312-win_amd64.lib
│   │   │       │   │   │   ├── _middle_term_computer.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _middle_term_computer.pxd.tp
│   │   │       │   │   │   ├── _middle_term_computer.pyx.tp
│   │   │       │   │   │   ├── _radius_neighbors.cp312-win_amd64.lib
│   │   │       │   │   │   ├── _radius_neighbors.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _radius_neighbors.pxd.tp
│   │   │       │   │   │   ├── _radius_neighbors.pyx.tp
│   │   │       │   │   │   ├── _radius_neighbors_classmode.cp312-win_amd64.lib
│   │   │       │   │   │   ├── _radius_neighbors_classmode.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _radius_neighbors_classmode.pyx.tp
│   │   │       │   │   │   └── meson.build
│   │   │       │   │   ├── _plot/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── confusion_matrix.cpython-312.pyc
│   │   │       │   │   │   │   ├── det_curve.cpython-312.pyc
│   │   │       │   │   │   │   ├── precision_recall_curve.cpython-312.pyc
│   │   │       │   │   │   │   ├── regression.cpython-312.pyc
│   │   │       │   │   │   │   └── roc_curve.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_common_curve_display.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_confusion_matrix_display.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_det_curve_display.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_precision_recall_display.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_predict_error_display.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_roc_curve_display.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_common_curve_display.py
│   │   │       │   │   │   │   ├── test_confusion_matrix_display.py
│   │   │       │   │   │   │   ├── test_det_curve_display.py
│   │   │       │   │   │   │   ├── test_precision_recall_display.py
│   │   │       │   │   │   │   ├── test_predict_error_display.py
│   │   │       │   │   │   │   └── test_roc_curve_display.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── confusion_matrix.py
│   │   │       │   │   │   ├── det_curve.py
│   │   │       │   │   │   ├── precision_recall_curve.py
│   │   │       │   │   │   ├── regression.py
│   │   │       │   │   │   └── roc_curve.py
│   │   │       │   │   ├── cluster/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _bicluster.cpython-312.pyc
│   │   │       │   │   │   │   ├── _supervised.cpython-312.pyc
│   │   │       │   │   │   │   └── _unsupervised.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_bicluster.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_common.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_supervised.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_unsupervised.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_bicluster.py
│   │   │       │   │   │   │   ├── test_common.py
│   │   │       │   │   │   │   ├── test_supervised.py
│   │   │       │   │   │   │   └── test_unsupervised.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _bicluster.py
│   │   │       │   │   │   ├── _expected_mutual_info_fast.cp312-win_amd64.lib
│   │   │       │   │   │   ├── _expected_mutual_info_fast.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _expected_mutual_info_fast.pyx
│   │   │       │   │   │   ├── _supervised.py
│   │   │       │   │   │   ├── _unsupervised.py
│   │   │       │   │   │   └── meson.build
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_classification.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_common.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_dist_metrics.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pairwise.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pairwise_distances_reduction.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ranking.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_regression.cpython-312.pyc
│   │   │       │   │   │   │   └── test_score_objects.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_classification.py
│   │   │       │   │   │   ├── test_common.py
│   │   │       │   │   │   ├── test_dist_metrics.py
│   │   │       │   │   │   ├── test_pairwise.py
│   │   │       │   │   │   ├── test_pairwise_distances_reduction.py
│   │   │       │   │   │   ├── test_ranking.py
│   │   │       │   │   │   ├── test_regression.py
│   │   │       │   │   │   └── test_score_objects.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _base.py
│   │   │       │   │   ├── _classification.py
│   │   │       │   │   ├── _dist_metrics.cp312-win_amd64.lib
│   │   │       │   │   ├── _dist_metrics.cp312-win_amd64.pyd
│   │   │       │   │   ├── _dist_metrics.pxd
│   │   │       │   │   ├── _dist_metrics.pxd.tp
│   │   │       │   │   ├── _dist_metrics.pyx.tp
│   │   │       │   │   ├── _pairwise_fast.cp312-win_amd64.lib
│   │   │       │   │   ├── _pairwise_fast.cp312-win_amd64.pyd
│   │   │       │   │   ├── _pairwise_fast.pyx
│   │   │       │   │   ├── _ranking.py
│   │   │       │   │   ├── _regression.py
│   │   │       │   │   ├── _scorer.py
│   │   │       │   │   ├── meson.build
│   │   │       │   │   └── pairwise.py
│   │   │       │   ├── mixture/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _base.cpython-312.pyc
│   │   │       │   │   │   ├── _bayesian_mixture.cpython-312.pyc
│   │   │       │   │   │   └── _gaussian_mixture.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bayesian_mixture.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_gaussian_mixture.cpython-312.pyc
│   │   │       │   │   │   │   └── test_mixture.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_bayesian_mixture.py
│   │   │       │   │   │   ├── test_gaussian_mixture.py
│   │   │       │   │   │   └── test_mixture.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _base.py
│   │   │       │   │   ├── _bayesian_mixture.py
│   │   │       │   │   └── _gaussian_mixture.py
│   │   │       │   ├── model_selection/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _classification_threshold.cpython-312.pyc
│   │   │       │   │   │   ├── _plot.cpython-312.pyc
│   │   │       │   │   │   ├── _search.cpython-312.pyc
│   │   │       │   │   │   ├── _search_successive_halving.cpython-312.pyc
│   │   │       │   │   │   ├── _split.cpython-312.pyc
│   │   │       │   │   │   └── _validation.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── common.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_classification_threshold.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_plot.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_search.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_split.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_successive_halving.cpython-312.pyc
│   │   │       │   │   │   │   └── test_validation.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── common.py
│   │   │       │   │   │   ├── test_classification_threshold.py
│   │   │       │   │   │   ├── test_plot.py
│   │   │       │   │   │   ├── test_search.py
│   │   │       │   │   │   ├── test_split.py
│   │   │       │   │   │   ├── test_successive_halving.py
│   │   │       │   │   │   └── test_validation.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _classification_threshold.py
│   │   │       │   │   ├── _plot.py
│   │   │       │   │   ├── _search.py
│   │   │       │   │   ├── _search_successive_halving.py
│   │   │       │   │   ├── _split.py
│   │   │       │   │   └── _validation.py
│   │   │       │   ├── neighbors/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _base.cpython-312.pyc
│   │   │       │   │   │   ├── _classification.cpython-312.pyc
│   │   │       │   │   │   ├── _graph.cpython-312.pyc
│   │   │       │   │   │   ├── _kde.cpython-312.pyc
│   │   │       │   │   │   ├── _lof.cpython-312.pyc
│   │   │       │   │   │   ├── _nca.cpython-312.pyc
│   │   │       │   │   │   ├── _nearest_centroid.cpython-312.pyc
│   │   │       │   │   │   ├── _regression.cpython-312.pyc
│   │   │       │   │   │   └── _unsupervised.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ball_tree.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_graph.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_kd_tree.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_kde.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_lof.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_nca.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_nearest_centroid.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_neighbors.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_neighbors_pipeline.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_neighbors_tree.cpython-312.pyc
│   │   │       │   │   │   │   └── test_quad_tree.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_ball_tree.py
│   │   │       │   │   │   ├── test_graph.py
│   │   │       │   │   │   ├── test_kd_tree.py
│   │   │       │   │   │   ├── test_kde.py
│   │   │       │   │   │   ├── test_lof.py
│   │   │       │   │   │   ├── test_nca.py
│   │   │       │   │   │   ├── test_nearest_centroid.py
│   │   │       │   │   │   ├── test_neighbors.py
│   │   │       │   │   │   ├── test_neighbors_pipeline.py
│   │   │       │   │   │   ├── test_neighbors_tree.py
│   │   │       │   │   │   └── test_quad_tree.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _ball_tree.cp312-win_amd64.lib
│   │   │       │   │   ├── _ball_tree.cp312-win_amd64.pyd
│   │   │       │   │   ├── _ball_tree.pyx.tp
│   │   │       │   │   ├── _base.py
│   │   │       │   │   ├── _binary_tree.pxi.tp
│   │   │       │   │   ├── _classification.py
│   │   │       │   │   ├── _graph.py
│   │   │       │   │   ├── _kd_tree.cp312-win_amd64.lib
│   │   │       │   │   ├── _kd_tree.cp312-win_amd64.pyd
│   │   │       │   │   ├── _kd_tree.pyx.tp
│   │   │       │   │   ├── _kde.py
│   │   │       │   │   ├── _lof.py
│   │   │       │   │   ├── _nca.py
│   │   │       │   │   ├── _nearest_centroid.py
│   │   │       │   │   ├── _partition_nodes.cp312-win_amd64.lib
│   │   │       │   │   ├── _partition_nodes.cp312-win_amd64.pyd
│   │   │       │   │   ├── _partition_nodes.pxd
│   │   │       │   │   ├── _partition_nodes.pyx
│   │   │       │   │   ├── _quad_tree.cp312-win_amd64.lib
│   │   │       │   │   ├── _quad_tree.cp312-win_amd64.pyd
│   │   │       │   │   ├── _quad_tree.pxd
│   │   │       │   │   ├── _quad_tree.pyx
│   │   │       │   │   ├── _regression.py
│   │   │       │   │   ├── _unsupervised.py
│   │   │       │   │   └── meson.build
│   │   │       │   ├── neural_network/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _base.cpython-312.pyc
│   │   │       │   │   │   ├── _multilayer_perceptron.cpython-312.pyc
│   │   │       │   │   │   ├── _rbm.cpython-312.pyc
│   │   │       │   │   │   └── _stochastic_optimizers.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_base.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mlp.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_rbm.cpython-312.pyc
│   │   │       │   │   │   │   └── test_stochastic_optimizers.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_base.py
│   │   │       │   │   │   ├── test_mlp.py
│   │   │       │   │   │   ├── test_rbm.py
│   │   │       │   │   │   └── test_stochastic_optimizers.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _base.py
│   │   │       │   │   ├── _multilayer_perceptron.py
│   │   │       │   │   ├── _rbm.py
│   │   │       │   │   └── _stochastic_optimizers.py
│   │   │       │   ├── preprocessing/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _data.cpython-312.pyc
│   │   │       │   │   │   ├── _discretization.cpython-312.pyc
│   │   │       │   │   │   ├── _encoders.cpython-312.pyc
│   │   │       │   │   │   ├── _function_transformer.cpython-312.pyc
│   │   │       │   │   │   ├── _label.cpython-312.pyc
│   │   │       │   │   │   ├── _polynomial.cpython-312.pyc
│   │   │       │   │   │   └── _target_encoder.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_common.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_data.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_discretization.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_encoders.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_function_transformer.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_label.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_polynomial.cpython-312.pyc
│   │   │       │   │   │   │   └── test_target_encoder.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_common.py
│   │   │       │   │   │   ├── test_data.py
│   │   │       │   │   │   ├── test_discretization.py
│   │   │       │   │   │   ├── test_encoders.py
│   │   │       │   │   │   ├── test_function_transformer.py
│   │   │       │   │   │   ├── test_label.py
│   │   │       │   │   │   ├── test_polynomial.py
│   │   │       │   │   │   └── test_target_encoder.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _csr_polynomial_expansion.cp312-win_amd64.lib
│   │   │       │   │   ├── _csr_polynomial_expansion.cp312-win_amd64.pyd
│   │   │       │   │   ├── _csr_polynomial_expansion.pyx
│   │   │       │   │   ├── _data.py
│   │   │       │   │   ├── _discretization.py
│   │   │       │   │   ├── _encoders.py
│   │   │       │   │   ├── _function_transformer.py
│   │   │       │   │   ├── _label.py
│   │   │       │   │   ├── _polynomial.py
│   │   │       │   │   ├── _target_encoder.py
│   │   │       │   │   ├── _target_encoder_fast.cp312-win_amd64.lib
│   │   │       │   │   ├── _target_encoder_fast.cp312-win_amd64.pyd
│   │   │       │   │   ├── _target_encoder_fast.pyx
│   │   │       │   │   └── meson.build
│   │   │       │   ├── semi_supervised/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _label_propagation.cpython-312.pyc
│   │   │       │   │   │   └── _self_training.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_label_propagation.cpython-312.pyc
│   │   │       │   │   │   │   └── test_self_training.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_label_propagation.py
│   │   │       │   │   │   └── test_self_training.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _label_propagation.py
│   │   │       │   │   └── _self_training.py
│   │   │       │   ├── svm/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _base.cpython-312.pyc
│   │   │       │   │   │   ├── _bounds.cpython-312.pyc
│   │   │       │   │   │   └── _classes.cpython-312.pyc
│   │   │       │   │   ├── src/
│   │   │       │   │   │   ├── liblinear/
│   │   │       │   │   │   │   ├── COPYRIGHT
│   │   │       │   │   │   │   ├── _cython_blas_helpers.h
│   │   │       │   │   │   │   ├── liblinear_helper.c
│   │   │       │   │   │   │   ├── linear.cpp
│   │   │       │   │   │   │   ├── linear.h
│   │   │       │   │   │   │   ├── tron.cpp
│   │   │       │   │   │   │   └── tron.h
│   │   │       │   │   │   ├── libsvm/
│   │   │       │   │   │   │   ├── LIBSVM_CHANGES
│   │   │       │   │   │   │   ├── _svm_cython_blas_helpers.h
│   │   │       │   │   │   │   ├── libsvm_helper.c
│   │   │       │   │   │   │   ├── libsvm_sparse_helper.c
│   │   │       │   │   │   │   ├── libsvm_template.cpp
│   │   │       │   │   │   │   ├── svm.cpp
│   │   │       │   │   │   │   └── svm.h
│   │   │       │   │   │   ├── newrand/
│   │   │       │   │   │       └── newrand.h
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bounds.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sparse.cpython-312.pyc
│   │   │       │   │   │   │   └── test_svm.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_bounds.py
│   │   │       │   │   │   ├── test_sparse.py
│   │   │       │   │   │   └── test_svm.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _base.py
│   │   │       │   │   ├── _bounds.py
│   │   │       │   │   ├── _classes.py
│   │   │       │   │   ├── _liblinear.cp312-win_amd64.lib
│   │   │       │   │   ├── _liblinear.cp312-win_amd64.pyd
│   │   │       │   │   ├── _liblinear.pxi
│   │   │       │   │   ├── _liblinear.pyx
│   │   │       │   │   ├── _libsvm.cp312-win_amd64.lib
│   │   │       │   │   ├── _libsvm.cp312-win_amd64.pyd
│   │   │       │   │   ├── _libsvm.pxi
│   │   │       │   │   ├── _libsvm.pyx
│   │   │       │   │   ├── _libsvm_sparse.cp312-win_amd64.lib
│   │   │       │   │   ├── _libsvm_sparse.cp312-win_amd64.pyd
│   │   │       │   │   ├── _libsvm_sparse.pyx
│   │   │       │   │   ├── _newrand.cp312-win_amd64.lib
│   │   │       │   │   ├── _newrand.cp312-win_amd64.pyd
│   │   │       │   │   ├── _newrand.pyx
│   │   │       │   │   └── meson.build
│   │   │       │   ├── tests/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── metadata_routing_common.cpython-312.pyc
│   │   │       │   │   │   ├── test_base.cpython-312.pyc
│   │   │       │   │   │   ├── test_build.cpython-312.pyc
│   │   │       │   │   │   ├── test_calibration.cpython-312.pyc
│   │   │       │   │   │   ├── test_check_build.cpython-312.pyc
│   │   │       │   │   │   ├── test_common.cpython-312.pyc
│   │   │       │   │   │   ├── test_config.cpython-312.pyc
│   │   │       │   │   │   ├── test_discriminant_analysis.cpython-312.pyc
│   │   │       │   │   │   ├── test_docstring_parameters.cpython-312.pyc
│   │   │       │   │   │   ├── test_docstrings.cpython-312.pyc
│   │   │       │   │   │   ├── test_dummy.cpython-312.pyc
│   │   │       │   │   │   ├── test_init.cpython-312.pyc
│   │   │       │   │   │   ├── test_isotonic.cpython-312.pyc
│   │   │       │   │   │   ├── test_kernel_approximation.cpython-312.pyc
│   │   │       │   │   │   ├── test_kernel_ridge.cpython-312.pyc
│   │   │       │   │   │   ├── test_metadata_routing.cpython-312.pyc
│   │   │       │   │   │   ├── test_metaestimators.cpython-312.pyc
│   │   │       │   │   │   ├── test_metaestimators_metadata_routing.cpython-312.pyc
│   │   │       │   │   │   ├── test_min_dependencies_readme.cpython-312.pyc
│   │   │       │   │   │   ├── test_multiclass.cpython-312.pyc
│   │   │       │   │   │   ├── test_multioutput.cpython-312.pyc
│   │   │       │   │   │   ├── test_naive_bayes.cpython-312.pyc
│   │   │       │   │   │   ├── test_pipeline.cpython-312.pyc
│   │   │       │   │   │   ├── test_public_functions.cpython-312.pyc
│   │   │       │   │   │   └── test_random_projection.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── metadata_routing_common.py
│   │   │       │   │   ├── test_base.py
│   │   │       │   │   ├── test_build.py
│   │   │       │   │   ├── test_calibration.py
│   │   │       │   │   ├── test_check_build.py
│   │   │       │   │   ├── test_common.py
│   │   │       │   │   ├── test_config.py
│   │   │       │   │   ├── test_discriminant_analysis.py
│   │   │       │   │   ├── test_docstring_parameters.py
│   │   │       │   │   ├── test_docstrings.py
│   │   │       │   │   ├── test_dummy.py
│   │   │       │   │   ├── test_init.py
│   │   │       │   │   ├── test_isotonic.py
│   │   │       │   │   ├── test_kernel_approximation.py
│   │   │       │   │   ├── test_kernel_ridge.py
│   │   │       │   │   ├── test_metadata_routing.py
│   │   │       │   │   ├── test_metaestimators.py
│   │   │       │   │   ├── test_metaestimators_metadata_routing.py
│   │   │       │   │   ├── test_min_dependencies_readme.py
│   │   │       │   │   ├── test_multiclass.py
│   │   │       │   │   ├── test_multioutput.py
│   │   │       │   │   ├── test_naive_bayes.py
│   │   │       │   │   ├── test_pipeline.py
│   │   │       │   │   ├── test_public_functions.py
│   │   │       │   │   └── test_random_projection.py
│   │   │       │   ├── tree/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _classes.cpython-312.pyc
│   │   │       │   │   │   ├── _export.cpython-312.pyc
│   │   │       │   │   │   └── _reingold_tilford.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_export.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_monotonic_tree.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_reingold_tilford.cpython-312.pyc
│   │   │       │   │   │   │   └── test_tree.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_export.py
│   │   │       │   │   │   ├── test_monotonic_tree.py
│   │   │       │   │   │   ├── test_reingold_tilford.py
│   │   │       │   │   │   └── test_tree.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _classes.py
│   │   │       │   │   ├── _criterion.cp312-win_amd64.lib
│   │   │       │   │   ├── _criterion.cp312-win_amd64.pyd
│   │   │       │   │   ├── _criterion.pxd
│   │   │       │   │   ├── _criterion.pyx
│   │   │       │   │   ├── _export.py
│   │   │       │   │   ├── _partitioner.cp312-win_amd64.lib
│   │   │       │   │   ├── _partitioner.cp312-win_amd64.pyd
│   │   │       │   │   ├── _partitioner.pxd
│   │   │       │   │   ├── _partitioner.pyx
│   │   │       │   │   ├── _reingold_tilford.py
│   │   │       │   │   ├── _splitter.cp312-win_amd64.lib
│   │   │       │   │   ├── _splitter.cp312-win_amd64.pyd
│   │   │       │   │   ├── _splitter.pxd
│   │   │       │   │   ├── _splitter.pyx
│   │   │       │   │   ├── _tree.cp312-win_amd64.lib
│   │   │       │   │   ├── _tree.cp312-win_amd64.pyd
│   │   │       │   │   ├── _tree.pxd
│   │   │       │   │   ├── _tree.pyx
│   │   │       │   │   ├── _utils.cp312-win_amd64.lib
│   │   │       │   │   ├── _utils.cp312-win_amd64.pyd
│   │   │       │   │   ├── _utils.pxd
│   │   │       │   │   ├── _utils.pyx
│   │   │       │   │   └── meson.build
│   │   │       │   ├── utils/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _arpack.cpython-312.pyc
│   │   │       │   │   │   ├── _array_api.cpython-312.pyc
│   │   │       │   │   │   ├── _available_if.cpython-312.pyc
│   │   │       │   │   │   ├── _bunch.cpython-312.pyc
│   │   │       │   │   │   ├── _chunking.cpython-312.pyc
│   │   │       │   │   │   ├── _encode.cpython-312.pyc
│   │   │       │   │   │   ├── _estimator_html_repr.cpython-312.pyc
│   │   │       │   │   │   ├── _indexing.cpython-312.pyc
│   │   │       │   │   │   ├── _joblib.cpython-312.pyc
│   │   │       │   │   │   ├── _mask.cpython-312.pyc
│   │   │       │   │   │   ├── _metadata_requests.cpython-312.pyc
│   │   │       │   │   │   ├── _missing.cpython-312.pyc
│   │   │       │   │   │   ├── _mocking.cpython-312.pyc
│   │   │       │   │   │   ├── _optional_dependencies.cpython-312.pyc
│   │   │       │   │   │   ├── _param_validation.cpython-312.pyc
│   │   │       │   │   │   ├── _plotting.cpython-312.pyc
│   │   │       │   │   │   ├── _pprint.cpython-312.pyc
│   │   │       │   │   │   ├── _response.cpython-312.pyc
│   │   │       │   │   │   ├── _set_output.cpython-312.pyc
│   │   │       │   │   │   ├── _show_versions.cpython-312.pyc
│   │   │       │   │   │   ├── _tags.cpython-312.pyc
│   │   │       │   │   │   ├── _testing.cpython-312.pyc
│   │   │       │   │   │   ├── _unique.cpython-312.pyc
│   │   │       │   │   │   ├── _user_interface.cpython-312.pyc
│   │   │       │   │   │   ├── class_weight.cpython-312.pyc
│   │   │       │   │   │   ├── deprecation.cpython-312.pyc
│   │   │       │   │   │   ├── discovery.cpython-312.pyc
│   │   │       │   │   │   ├── estimator_checks.cpython-312.pyc
│   │   │       │   │   │   ├── extmath.cpython-312.pyc
│   │   │       │   │   │   ├── fixes.cpython-312.pyc
│   │   │       │   │   │   ├── graph.cpython-312.pyc
│   │   │       │   │   │   ├── metadata_routing.cpython-312.pyc
│   │   │       │   │   │   ├── metaestimators.cpython-312.pyc
│   │   │       │   │   │   ├── multiclass.cpython-312.pyc
│   │   │       │   │   │   ├── optimize.cpython-312.pyc
│   │   │       │   │   │   ├── parallel.cpython-312.pyc
│   │   │       │   │   │   ├── random.cpython-312.pyc
│   │   │       │   │   │   ├── sparsefuncs.cpython-312.pyc
│   │   │       │   │   │   ├── stats.cpython-312.pyc
│   │   │       │   │   │   └── validation.cpython-312.pyc
│   │   │       │   │   ├── _test_common/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── instance_generator.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── instance_generator.py
│   │   │       │   │   ├── src/
│   │   │       │   │   │   ├── MurmurHash3.cpp
│   │   │       │   │   │   └── MurmurHash3.h
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_arpack.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_array_api.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_arrayfuncs.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bunch.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_chunking.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_class_weight.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cython_blas.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_deprecation.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_encode.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_estimator_checks.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_estimator_html_repr.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_extmath.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_fast_dict.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_fixes.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_graph.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_indexing.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mask.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_metaestimators.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_missing.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mocking.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_multiclass.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_murmurhash.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_optimize.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_parallel.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_param_validation.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_plotting.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pprint.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_random.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_response.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_seq_dataset.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_set_output.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_shortest_path.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_show_versions.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sparsefuncs.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_stats.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_tags.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_testing.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_typedefs.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_unique.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_user_interface.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_utils.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_validation.cpython-312.pyc
│   │   │       │   │   │   │   └── test_weight_vector.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_arpack.py
│   │   │       │   │   │   ├── test_array_api.py
│   │   │       │   │   │   ├── test_arrayfuncs.py
│   │   │       │   │   │   ├── test_bunch.py
│   │   │       │   │   │   ├── test_chunking.py
│   │   │       │   │   │   ├── test_class_weight.py
│   │   │       │   │   │   ├── test_cython_blas.py
│   │   │       │   │   │   ├── test_deprecation.py
│   │   │       │   │   │   ├── test_encode.py
│   │   │       │   │   │   ├── test_estimator_checks.py
│   │   │       │   │   │   ├── test_estimator_html_repr.py
│   │   │       │   │   │   ├── test_extmath.py
│   │   │       │   │   │   ├── test_fast_dict.py
│   │   │       │   │   │   ├── test_fixes.py
│   │   │       │   │   │   ├── test_graph.py
│   │   │       │   │   │   ├── test_indexing.py
│   │   │       │   │   │   ├── test_mask.py
│   │   │       │   │   │   ├── test_metaestimators.py
│   │   │       │   │   │   ├── test_missing.py
│   │   │       │   │   │   ├── test_mocking.py
│   │   │       │   │   │   ├── test_multiclass.py
│   │   │       │   │   │   ├── test_murmurhash.py
│   │   │       │   │   │   ├── test_optimize.py
│   │   │       │   │   │   ├── test_parallel.py
│   │   │       │   │   │   ├── test_param_validation.py
│   │   │       │   │   │   ├── test_plotting.py
│   │   │       │   │   │   ├── test_pprint.py
│   │   │       │   │   │   ├── test_random.py
│   │   │       │   │   │   ├── test_response.py
│   │   │       │   │   │   ├── test_seq_dataset.py
│   │   │       │   │   │   ├── test_set_output.py
│   │   │       │   │   │   ├── test_shortest_path.py
│   │   │       │   │   │   ├── test_show_versions.py
│   │   │       │   │   │   ├── test_sparsefuncs.py
│   │   │       │   │   │   ├── test_stats.py
│   │   │       │   │   │   ├── test_tags.py
│   │   │       │   │   │   ├── test_testing.py
│   │   │       │   │   │   ├── test_typedefs.py
│   │   │       │   │   │   ├── test_unique.py
│   │   │       │   │   │   ├── test_user_interface.py
│   │   │       │   │   │   ├── test_utils.py
│   │   │       │   │   │   ├── test_validation.py
│   │   │       │   │   │   └── test_weight_vector.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _arpack.py
│   │   │       │   │   ├── _array_api.py
│   │   │       │   │   ├── _available_if.py
│   │   │       │   │   ├── _bunch.py
│   │   │       │   │   ├── _chunking.py
│   │   │       │   │   ├── _cython_blas.cp312-win_amd64.lib
│   │   │       │   │   ├── _cython_blas.cp312-win_amd64.pyd
│   │   │       │   │   ├── _cython_blas.pxd
│   │   │       │   │   ├── _cython_blas.pyx
│   │   │       │   │   ├── _encode.py
│   │   │       │   │   ├── _estimator_html_repr.css
│   │   │       │   │   ├── _estimator_html_repr.py
│   │   │       │   │   ├── _fast_dict.cp312-win_amd64.lib
│   │   │       │   │   ├── _fast_dict.cp312-win_amd64.pyd
│   │   │       │   │   ├── _fast_dict.pxd
│   │   │       │   │   ├── _fast_dict.pyx
│   │   │       │   │   ├── _heap.cp312-win_amd64.lib
│   │   │       │   │   ├── _heap.cp312-win_amd64.pyd
│   │   │       │   │   ├── _heap.pxd
│   │   │       │   │   ├── _heap.pyx
│   │   │       │   │   ├── _indexing.py
│   │   │       │   │   ├── _isfinite.cp312-win_amd64.lib
│   │   │       │   │   ├── _isfinite.cp312-win_amd64.pyd
│   │   │       │   │   ├── _isfinite.pyx
│   │   │       │   │   ├── _joblib.py
│   │   │       │   │   ├── _mask.py
│   │   │       │   │   ├── _metadata_requests.py
│   │   │       │   │   ├── _missing.py
│   │   │       │   │   ├── _mocking.py
│   │   │       │   │   ├── _openmp_helpers.cp312-win_amd64.lib
│   │   │       │   │   ├── _openmp_helpers.cp312-win_amd64.pyd
│   │   │       │   │   ├── _openmp_helpers.pxd
│   │   │       │   │   ├── _openmp_helpers.pyx
│   │   │       │   │   ├── _optional_dependencies.py
│   │   │       │   │   ├── _param_validation.py
│   │   │       │   │   ├── _plotting.py
│   │   │       │   │   ├── _pprint.py
│   │   │       │   │   ├── _random.cp312-win_amd64.lib
│   │   │       │   │   ├── _random.cp312-win_amd64.pyd
│   │   │       │   │   ├── _random.pxd
│   │   │       │   │   ├── _random.pyx
│   │   │       │   │   ├── _response.py
│   │   │       │   │   ├── _seq_dataset.cp312-win_amd64.lib
│   │   │       │   │   ├── _seq_dataset.cp312-win_amd64.pyd
│   │   │       │   │   ├── _seq_dataset.pxd.tp
│   │   │       │   │   ├── _seq_dataset.pyx.tp
│   │   │       │   │   ├── _set_output.py
│   │   │       │   │   ├── _show_versions.py
│   │   │       │   │   ├── _sorting.cp312-win_amd64.lib
│   │   │       │   │   ├── _sorting.cp312-win_amd64.pyd
│   │   │       │   │   ├── _sorting.pxd
│   │   │       │   │   ├── _sorting.pyx
│   │   │       │   │   ├── _tags.py
│   │   │       │   │   ├── _testing.py
│   │   │       │   │   ├── _typedefs.cp312-win_amd64.lib
│   │   │       │   │   ├── _typedefs.cp312-win_amd64.pyd
│   │   │       │   │   ├── _typedefs.pxd
│   │   │       │   │   ├── _typedefs.pyx
│   │   │       │   │   ├── _unique.py
│   │   │       │   │   ├── _user_interface.py
│   │   │       │   │   ├── _vector_sentinel.cp312-win_amd64.lib
│   │   │       │   │   ├── _vector_sentinel.cp312-win_amd64.pyd
│   │   │       │   │   ├── _vector_sentinel.pxd
│   │   │       │   │   ├── _vector_sentinel.pyx
│   │   │       │   │   ├── _weight_vector.cp312-win_amd64.lib
│   │   │       │   │   ├── _weight_vector.cp312-win_amd64.pyd
│   │   │       │   │   ├── _weight_vector.pxd.tp
│   │   │       │   │   ├── _weight_vector.pyx.tp
│   │   │       │   │   ├── arrayfuncs.cp312-win_amd64.lib
│   │   │       │   │   ├── arrayfuncs.cp312-win_amd64.pyd
│   │   │       │   │   ├── arrayfuncs.pyx
│   │   │       │   │   ├── class_weight.py
│   │   │       │   │   ├── deprecation.py
│   │   │       │   │   ├── discovery.py
│   │   │       │   │   ├── estimator_checks.py
│   │   │       │   │   ├── extmath.py
│   │   │       │   │   ├── fixes.py
│   │   │       │   │   ├── graph.py
│   │   │       │   │   ├── meson.build
│   │   │       │   │   ├── metadata_routing.py
│   │   │       │   │   ├── metaestimators.py
│   │   │       │   │   ├── multiclass.py
│   │   │       │   │   ├── murmurhash.cp312-win_amd64.lib
│   │   │       │   │   ├── murmurhash.cp312-win_amd64.pyd
│   │   │       │   │   ├── murmurhash.pxd
│   │   │       │   │   ├── murmurhash.pyx
│   │   │       │   │   ├── optimize.py
│   │   │       │   │   ├── parallel.py
│   │   │       │   │   ├── random.py
│   │   │       │   │   ├── sparsefuncs.py
│   │   │       │   │   ├── sparsefuncs_fast.cp312-win_amd64.lib
│   │   │       │   │   ├── sparsefuncs_fast.cp312-win_amd64.pyd
│   │   │       │   │   ├── sparsefuncs_fast.pyx
│   │   │       │   │   ├── stats.py
│   │   │       │   │   └── validation.py
│   │   │       │   ├── __init__.py
│   │   │       │   ├── _built_with_meson.py
│   │   │       │   ├── _config.py
│   │   │       │   ├── _distributor_init.py
│   │   │       │   ├── _isotonic.cp312-win_amd64.lib
│   │   │       │   ├── _isotonic.cp312-win_amd64.pyd
│   │   │       │   ├── _isotonic.pyx
│   │   │       │   ├── _min_dependencies.py
│   │   │       │   ├── base.py
│   │   │       │   ├── calibration.py
│   │   │       │   ├── conftest.py
│   │   │       │   ├── discriminant_analysis.py
│   │   │       │   ├── dummy.py
│   │   │       │   ├── exceptions.py
│   │   │       │   ├── isotonic.py
│   │   │       │   ├── kernel_approximation.py
│   │   │       │   ├── kernel_ridge.py
│   │   │       │   ├── meson.build
│   │   │       │   ├── multiclass.py
│   │   │       │   ├── multioutput.py
│   │   │       │   ├── naive_bayes.py
│   │   │       │   ├── pipeline.py
│   │   │       │   └── random_projection.py
│   │   │       ├── starlette/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── _compat.cpython-312.pyc
│   │   │       │   │   ├── _exception_handler.cpython-312.pyc
│   │   │       │   │   ├── _utils.cpython-312.pyc
│   │   │       │   │   ├── applications.cpython-312.pyc
│   │   │       │   │   ├── authentication.cpython-312.pyc
│   │   │       │   │   ├── background.cpython-312.pyc
│   │   │       │   │   ├── concurrency.cpython-312.pyc
│   │   │       │   │   ├── config.cpython-312.pyc
│   │   │       │   │   ├── convertors.cpython-312.pyc
│   │   │       │   │   ├── datastructures.cpython-312.pyc
│   │   │       │   │   ├── endpoints.cpython-312.pyc
│   │   │       │   │   ├── exceptions.cpython-312.pyc
│   │   │       │   │   ├── formparsers.cpython-312.pyc
│   │   │       │   │   ├── requests.cpython-312.pyc
│   │   │       │   │   ├── responses.cpython-312.pyc
│   │   │       │   │   ├── routing.cpython-312.pyc
│   │   │       │   │   ├── schemas.cpython-312.pyc
│   │   │       │   │   ├── staticfiles.cpython-312.pyc
│   │   │       │   │   ├── status.cpython-312.pyc
│   │   │       │   │   ├── templating.cpython-312.pyc
│   │   │       │   │   ├── testclient.cpython-312.pyc
│   │   │       │   │   ├── types.cpython-312.pyc
│   │   │       │   │   └── websockets.cpython-312.pyc
│   │   │       │   ├── middleware/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── authentication.cpython-312.pyc
│   │   │       │   │   │   ├── base.cpython-312.pyc
│   │   │       │   │   │   ├── cors.cpython-312.pyc
│   │   │       │   │   │   ├── errors.cpython-312.pyc
│   │   │       │   │   │   ├── exceptions.cpython-312.pyc
│   │   │       │   │   │   ├── gzip.cpython-312.pyc
│   │   │       │   │   │   ├── httpsredirect.cpython-312.pyc
│   │   │       │   │   │   ├── sessions.cpython-312.pyc
│   │   │       │   │   │   ├── trustedhost.cpython-312.pyc
│   │   │       │   │   │   └── wsgi.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── authentication.py
│   │   │       │   │   ├── base.py
│   │   │       │   │   ├── cors.py
│   │   │       │   │   ├── errors.py
│   │   │       │   │   ├── exceptions.py
│   │   │       │   │   ├── gzip.py
│   │   │       │   │   ├── httpsredirect.py
│   │   │       │   │   ├── sessions.py
│   │   │       │   │   ├── trustedhost.py
│   │   │       │   │   └── wsgi.py
│   │   │       │   ├── __init__.py
│   │   │       │   ├── _compat.py
│   │   │       │   ├── _exception_handler.py
│   │   │       │   ├── _utils.py
│   │   │       │   ├── applications.py
│   │   │       │   ├── authentication.py
│   │   │       │   ├── background.py
│   │   │       │   ├── concurrency.py
│   │   │       │   ├── config.py
│   │   │       │   ├── convertors.py
│   │   │       │   ├── datastructures.py
│   │   │       │   ├── endpoints.py
│   │   │       │   ├── exceptions.py
│   │   │       │   ├── formparsers.py
│   │   │       │   ├── py.typed
│   │   │       │   ├── requests.py
│   │   │       │   ├── responses.py
│   │   │       │   ├── routing.py
│   │   │       │   ├── schemas.py
│   │   │       │   ├── staticfiles.py
│   │   │       │   ├── status.py
│   │   │       │   ├── templating.py
│   │   │       │   ├── testclient.py
│   │   │       │   ├── types.py
│   │   │       │   └── websockets.py
│   │   │       ├── starlette-0.36.3.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE.md
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   └── WHEEL
│   │   │       ├── statsmodels/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── _version.cpython-312.pyc
│   │   │       │   │   ├── api.cpython-312.pyc
│   │   │       │   │   └── conftest.cpython-312.pyc
│   │   │       │   ├── base/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _constraints.cpython-312.pyc
│   │   │       │   │   │   ├── _parameter_inference.cpython-312.pyc
│   │   │       │   │   │   ├── _penalized.cpython-312.pyc
│   │   │       │   │   │   ├── _penalties.cpython-312.pyc
│   │   │       │   │   │   ├── _prediction_inference.cpython-312.pyc
│   │   │       │   │   │   ├── _screening.cpython-312.pyc
│   │   │       │   │   │   ├── covtype.cpython-312.pyc
│   │   │       │   │   │   ├── data.cpython-312.pyc
│   │   │       │   │   │   ├── distributed_estimation.cpython-312.pyc
│   │   │       │   │   │   ├── elastic_net.cpython-312.pyc
│   │   │       │   │   │   ├── l1_cvxopt.cpython-312.pyc
│   │   │       │   │   │   ├── l1_slsqp.cpython-312.pyc
│   │   │       │   │   │   ├── l1_solvers_common.cpython-312.pyc
│   │   │       │   │   │   ├── model.cpython-312.pyc
│   │   │       │   │   │   ├── optimizer.cpython-312.pyc
│   │   │       │   │   │   ├── transform.cpython-312.pyc
│   │   │       │   │   │   └── wrapper.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_data.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_distributed_estimation.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_generic_methods.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_optimize.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_penalized.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_penalties.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_predict.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_screening.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_shrink_pickle.cpython-312.pyc
│   │   │       │   │   │   │   └── test_transform.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_data.py
│   │   │       │   │   │   ├── test_distributed_estimation.py
│   │   │       │   │   │   ├── test_generic_methods.py
│   │   │       │   │   │   ├── test_optimize.py
│   │   │       │   │   │   ├── test_penalized.py
│   │   │       │   │   │   ├── test_penalties.py
│   │   │       │   │   │   ├── test_predict.py
│   │   │       │   │   │   ├── test_screening.py
│   │   │       │   │   │   ├── test_shrink_pickle.py
│   │   │       │   │   │   └── test_transform.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _constraints.py
│   │   │       │   │   ├── _parameter_inference.py
│   │   │       │   │   ├── _penalized.py
│   │   │       │   │   ├── _penalties.py
│   │   │       │   │   ├── _prediction_inference.py
│   │   │       │   │   ├── _screening.py
│   │   │       │   │   ├── covtype.py
│   │   │       │   │   ├── data.py
│   │   │       │   │   ├── distributed_estimation.py
│   │   │       │   │   ├── elastic_net.py
│   │   │       │   │   ├── l1_cvxopt.py
│   │   │       │   │   ├── l1_slsqp.py
│   │   │       │   │   ├── l1_solvers_common.py
│   │   │       │   │   ├── model.py
│   │   │       │   │   ├── optimizer.py
│   │   │       │   │   ├── transform.py
│   │   │       │   │   └── wrapper.py
│   │   │       │   ├── compat/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _scipy_multivariate_t.cpython-312.pyc
│   │   │       │   │   │   ├── numpy.cpython-312.pyc
│   │   │       │   │   │   ├── pandas.cpython-312.pyc
│   │   │       │   │   │   ├── patsy.cpython-312.pyc
│   │   │       │   │   │   ├── platform.cpython-312.pyc
│   │   │       │   │   │   ├── pytest.cpython-312.pyc
│   │   │       │   │   │   ├── python.cpython-312.pyc
│   │   │       │   │   │   └── scipy.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_itercompat.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pandas.cpython-312.pyc
│   │   │       │   │   │   │   └── test_scipy_compat.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_itercompat.py
│   │   │       │   │   │   ├── test_pandas.py
│   │   │       │   │   │   └── test_scipy_compat.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _scipy_multivariate_t.py
│   │   │       │   │   ├── numpy.py
│   │   │       │   │   ├── pandas.py
│   │   │       │   │   ├── patsy.py
│   │   │       │   │   ├── platform.py
│   │   │       │   │   ├── pytest.py
│   │   │       │   │   ├── python.py
│   │   │       │   │   └── scipy.py
│   │   │       │   ├── datasets/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── template_data.cpython-312.pyc
│   │   │       │   │   │   └── utils.cpython-312.pyc
│   │   │       │   │   ├── anes96/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── anes96.csv
│   │   │       │   │   │   └── data.py
│   │   │       │   │   ├── cancer/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── cancer.csv
│   │   │       │   │   │   └── data.py
│   │   │       │   │   ├── ccard/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── ccard.csv
│   │   │       │   │   │   └── data.py
│   │   │       │   │   ├── china_smoking/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── china_smoking.csv
│   │   │       │   │   │   └── data.py
│   │   │       │   │   ├── co2/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── co2.csv
│   │   │       │   │   │   └── data.py
│   │   │       │   │   ├── committee/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── committee.csv
│   │   │       │   │   │   └── data.py
│   │   │       │   │   ├── copper/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── copper.csv
│   │   │       │   │   │   └── data.py
│   │   │       │   │   ├── cpunish/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── cpunish.csv
│   │   │       │   │   │   └── data.py
│   │   │       │   │   ├── danish_data/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── data.csv
│   │   │       │   │   │   └── data.py
│   │   │       │   │   ├── elec_equip/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── data.py
│   │   │       │   │   │   └── elec_equip.csv
│   │   │       │   │   ├── elnino/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── data.py
│   │   │       │   │   │   └── elnino.csv
│   │   │       │   │   ├── engel/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── data.py
│   │   │       │   │   │   └── engel.csv
│   │   │       │   │   ├── fair/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── data.py
│   │   │       │   │   │   ├── fair.csv
│   │   │       │   │   │   └── fair_pt.csv
│   │   │       │   │   ├── fertility/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── data.py
│   │   │       │   │   │   └── fertility.csv
│   │   │       │   │   ├── grunfeld/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── data.py
│   │   │       │   │   │   └── grunfeld.csv
│   │   │       │   │   ├── heart/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── data.py
│   │   │       │   │   │   └── heart.csv
│   │   │       │   │   ├── interest_inflation/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── E6.csv
│   │   │       │   │   │   ├── E6_jmulti.csv
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── data.py
│   │   │       │   │   ├── longley/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── data.py
│   │   │       │   │   │   └── longley.csv
│   │   │       │   │   ├── macrodata/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── data.py
│   │   │       │   │   │   ├── macrodata.csv
│   │   │       │   │   │   └── macrodata.dta
│   │   │       │   │   ├── modechoice/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── data.py
│   │   │       │   │   │   └── modechoice.csv
│   │   │       │   │   ├── nile/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── data.py
│   │   │       │   │   │   └── nile.csv
│   │   │       │   │   ├── randhie/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── data.py
│   │   │       │   │   │   └── randhie.csv
│   │   │       │   │   ├── scotland/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── data.py
│   │   │       │   │   │   └── scotvote.csv
│   │   │       │   │   ├── spector/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── data.py
│   │   │       │   │   │   └── spector.csv
│   │   │       │   │   ├── stackloss/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── data.py
│   │   │       │   │   │   └── stackloss.csv
│   │   │       │   │   ├── star98/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── data.py
│   │   │       │   │   │   └── star98.csv
│   │   │       │   │   ├── statecrime/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── data.py
│   │   │       │   │   │   └── statecrime.csv
│   │   │       │   │   ├── strikes/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── data.py
│   │   │       │   │   │   └── strikes.csv
│   │   │       │   │   ├── sunspots/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── data.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── data.py
│   │   │       │   │   │   └── sunspots.csv
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_data.cpython-312.pyc
│   │   │       │   │   │   │   └── test_utils.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_data.py
│   │   │       │   │   │   └── test_utils.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── template_data.py
│   │   │       │   │   └── utils.py
│   │   │       │   ├── discrete/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _diagnostics_count.cpython-312.pyc
│   │   │       │   │   │   ├── conditional_models.cpython-312.pyc
│   │   │       │   │   │   ├── count_model.cpython-312.pyc
│   │   │       │   │   │   ├── diagnostic.cpython-312.pyc
│   │   │       │   │   │   ├── discrete_margins.cpython-312.pyc
│   │   │       │   │   │   ├── discrete_model.cpython-312.pyc
│   │   │       │   │   │   └── truncated_model.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_conditional.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_constrained.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_count_model.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_diagnostic.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_discrete.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_margins.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_predict.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sandwich_cov.cpython-312.pyc
│   │   │       │   │   │   │   └── test_truncated_model.cpython-312.pyc
│   │   │       │   │   │   ├── results/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_count_margins.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_count_robust_cluster.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_discrete.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_glm_logit_constrained.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_poisson_constrained.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_predict.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_truncated.cpython-312.pyc
│   │   │       │   │   │   │   │   └── results_truncated_st.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── mn_logit_summary.txt
│   │   │       │   │   │   │   ├── mnlogit_resid.csv
│   │   │       │   │   │   │   ├── nbinom_resids.csv
│   │   │       │   │   │   │   ├── phat_mnlogit.csv
│   │   │       │   │   │   │   ├── poisson_resid.csv
│   │   │       │   │   │   │   ├── predict_prob_poisson.csv
│   │   │       │   │   │   │   ├── results_count_margins.py
│   │   │       │   │   │   │   ├── results_count_robust_cluster.py
│   │   │       │   │   │   │   ├── results_discrete.py
│   │   │       │   │   │   │   ├── results_glm_logit_constrained.py
│   │   │       │   │   │   │   ├── results_poisson_constrained.py
│   │   │       │   │   │   │   ├── results_predict.py
│   │   │       │   │   │   │   ├── results_truncated.py
│   │   │       │   │   │   │   ├── results_truncated_st.py
│   │   │       │   │   │   │   ├── ships.csv
│   │   │       │   │   │   │   ├── sm3533.csv
│   │   │       │   │   │   │   ├── yhat_mnlogit.csv
│   │   │       │   │   │   │   └── yhat_poisson.csv
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_conditional.py
│   │   │       │   │   │   ├── test_constrained.py
│   │   │       │   │   │   ├── test_count_model.py
│   │   │       │   │   │   ├── test_diagnostic.py
│   │   │       │   │   │   ├── test_discrete.py
│   │   │       │   │   │   ├── test_margins.py
│   │   │       │   │   │   ├── test_predict.py
│   │   │       │   │   │   ├── test_sandwich_cov.py
│   │   │       │   │   │   └── test_truncated_model.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _diagnostics_count.py
│   │   │       │   │   ├── conditional_models.py
│   │   │       │   │   ├── count_model.py
│   │   │       │   │   ├── diagnostic.py
│   │   │       │   │   ├── discrete_margins.py
│   │   │       │   │   ├── discrete_model.py
│   │   │       │   │   └── truncated_model.py
│   │   │       │   ├── distributions/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── bernstein.cpython-312.pyc
│   │   │       │   │   │   ├── discrete.cpython-312.pyc
│   │   │       │   │   │   ├── edgeworth.cpython-312.pyc
│   │   │       │   │   │   ├── empirical_distribution.cpython-312.pyc
│   │   │       │   │   │   ├── mixture_rvs.cpython-312.pyc
│   │   │       │   │   │   └── tools.cpython-312.pyc
│   │   │       │   │   ├── copula/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _special.cpython-312.pyc
│   │   │       │   │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   │   ├── archimedean.cpython-312.pyc
│   │   │       │   │   │   │   ├── copulas.cpython-312.pyc
│   │   │       │   │   │   │   ├── depfunc_ev.cpython-312.pyc
│   │   │       │   │   │   │   ├── elliptical.cpython-312.pyc
│   │   │       │   │   │   │   ├── extreme_value.cpython-312.pyc
│   │   │       │   │   │   │   ├── other_copulas.cpython-312.pyc
│   │   │       │   │   │   │   └── transforms.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _special.py
│   │   │       │   │   │   ├── api.py
│   │   │       │   │   │   ├── archimedean.py
│   │   │       │   │   │   ├── copulas.py
│   │   │       │   │   │   ├── depfunc_ev.py
│   │   │       │   │   │   ├── elliptical.py
│   │   │       │   │   │   ├── extreme_value.py
│   │   │       │   │   │   ├── other_copulas.py
│   │   │       │   │   │   └── transforms.py
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bernstein.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_discrete.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ecdf.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_edgeworth.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mixture.cpython-312.pyc
│   │   │       │   │   │   │   └── test_tools.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_bernstein.py
│   │   │       │   │   │   ├── test_discrete.py
│   │   │       │   │   │   ├── test_ecdf.py
│   │   │       │   │   │   ├── test_edgeworth.py
│   │   │       │   │   │   ├── test_mixture.py
│   │   │       │   │   │   └── test_tools.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── bernstein.py
│   │   │       │   │   ├── discrete.py
│   │   │       │   │   ├── edgeworth.py
│   │   │       │   │   ├── empirical_distribution.py
│   │   │       │   │   ├── mixture_rvs.py
│   │   │       │   │   └── tools.py
│   │   │       │   ├── duration/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _kernel_estimates.cpython-312.pyc
│   │   │       │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   ├── hazard_regression.cpython-312.pyc
│   │   │       │   │   │   └── survfunc.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_phreg.cpython-312.pyc
│   │   │       │   │   │   │   └── test_survfunc.cpython-312.pyc
│   │   │       │   │   │   ├── results/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── phreg_gentests.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── survival_enet_r_results.cpython-312.pyc
│   │   │       │   │   │   │   │   └── survival_r_results.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── bmt.csv
│   │   │       │   │   │   │   ├── bmt_results.csv
│   │   │       │   │   │   │   ├── phreg_gentests.py
│   │   │       │   │   │   │   ├── survival_data_1000_10.csv
│   │   │       │   │   │   │   ├── survival_data_100_5.csv
│   │   │       │   │   │   │   ├── survival_data_20_1.csv
│   │   │       │   │   │   │   ├── survival_data_50_1.csv
│   │   │       │   │   │   │   ├── survival_data_50_2.csv
│   │   │       │   │   │   │   ├── survival_enet_r_results.py
│   │   │       │   │   │   │   └── survival_r_results.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_phreg.py
│   │   │       │   │   │   └── test_survfunc.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _kernel_estimates.py
│   │   │       │   │   ├── api.py
│   │   │       │   │   ├── hazard_regression.py
│   │   │       │   │   └── survfunc.py
│   │   │       │   ├── emplike/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── aft_el.cpython-312.pyc
│   │   │       │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   ├── descriptive.cpython-312.pyc
│   │   │       │   │   │   ├── elanova.cpython-312.pyc
│   │   │       │   │   │   ├── elregress.cpython-312.pyc
│   │   │       │   │   │   └── originregress.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_aft.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_anova.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_descriptive.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_origin.cpython-312.pyc
│   │   │       │   │   │   │   └── test_regression.cpython-312.pyc
│   │   │       │   │   │   ├── results/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── el_results.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── el_results.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_aft.py
│   │   │       │   │   │   ├── test_anova.py
│   │   │       │   │   │   ├── test_descriptive.py
│   │   │       │   │   │   ├── test_origin.py
│   │   │       │   │   │   └── test_regression.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── aft_el.py
│   │   │       │   │   ├── api.py
│   │   │       │   │   ├── descriptive.py
│   │   │       │   │   ├── elanova.py
│   │   │       │   │   ├── elregress.py
│   │   │       │   │   └── originregress.py
│   │   │       │   ├── formula/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   └── formulatools.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── test_formula.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── test_formula.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── api.py
│   │   │       │   │   └── formulatools.py
│   │   │       │   ├── gam/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   ├── gam_penalties.cpython-312.pyc
│   │   │       │   │   │   ├── generalized_additive_model.cpython-312.pyc
│   │   │       │   │   │   └── smooth_basis.cpython-312.pyc
│   │   │       │   │   ├── gam_cross_validation/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── cross_validators.cpython-312.pyc
│   │   │       │   │   │   │   └── gam_cross_validation.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── cross_validators.py
│   │   │       │   │   │   └── gam_cross_validation.py
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_gam.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_penalized.cpython-312.pyc
│   │   │       │   │   │   │   └── test_smooth_basis.cpython-312.pyc
│   │   │       │   │   │   ├── results/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_mpg_bs.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_mpg_bs_poisson.cpython-312.pyc
│   │   │       │   │   │   │   │   └── results_pls.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── autos.csv
│   │   │       │   │   │   │   ├── autos_exog.csv
│   │   │       │   │   │   │   ├── autos_predict.csv
│   │   │       │   │   │   │   ├── cubic_cyclic_splines_from_mgcv.csv
│   │   │       │   │   │   │   ├── gam_PIRLS_results.csv
│   │   │       │   │   │   │   ├── logit_gam_mgcv.csv
│   │   │       │   │   │   │   ├── motorcycle.csv
│   │   │       │   │   │   │   ├── prediction_from_mgcv.csv
│   │   │       │   │   │   │   ├── results_mpg_bs.py
│   │   │       │   │   │   │   ├── results_mpg_bs_poisson.py
│   │   │       │   │   │   │   └── results_pls.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_gam.py
│   │   │       │   │   │   ├── test_penalized.py
│   │   │       │   │   │   └── test_smooth_basis.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── api.py
│   │   │       │   │   ├── gam_penalties.py
│   │   │       │   │   ├── generalized_additive_model.py
│   │   │       │   │   └── smooth_basis.py
│   │   │       │   ├── genmod/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _tweedie_compound_poisson.cpython-312.pyc
│   │   │       │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   ├── bayes_mixed_glm.cpython-312.pyc
│   │   │       │   │   │   ├── cov_struct.cpython-312.pyc
│   │   │       │   │   │   ├── generalized_estimating_equations.cpython-312.pyc
│   │   │       │   │   │   ├── generalized_linear_model.cpython-312.pyc
│   │   │       │   │   │   └── qif.cpython-312.pyc
│   │   │       │   │   ├── families/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── family.cpython-312.pyc
│   │   │       │   │   │   │   ├── links.cpython-312.pyc
│   │   │       │   │   │   │   └── varfuncs.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_family.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_link.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_family.py
│   │   │       │   │   │   │   └── test_link.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── family.py
│   │   │       │   │   │   ├── links.py
│   │   │       │   │   │   └── varfuncs.py
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── gee_categorical_simulation_check.cpython-312.pyc
│   │   │       │   │   │   │   ├── gee_gaussian_simulation_check.cpython-312.pyc
│   │   │       │   │   │   │   ├── gee_poisson_simulation_check.cpython-312.pyc
│   │   │       │   │   │   │   ├── gee_simulation_check.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bayes_mixed_glm.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_constrained.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_gee.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_gee_glm.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_glm.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_glm_weights.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_qif.cpython-312.pyc
│   │   │       │   │   │   │   └── test_score_test.cpython-312.pyc
│   │   │       │   │   │   ├── results/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── elastic_net_generate_tests.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── gee_generate_tests.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── glm_test_resids.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── glmnet_r_results.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── res_R_var_weight.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_glm.cpython-312.pyc
│   │   │       │   │   │   │   │   └── results_glm_poisson_weights.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── elastic_net_generate_tests.py
│   │   │       │   │   │   │   ├── enet_binomial.csv
│   │   │       │   │   │   │   ├── enet_poisson.csv
│   │   │       │   │   │   │   ├── epil.csv
│   │   │       │   │   │   │   ├── gee_generate_tests.py
│   │   │       │   │   │   │   ├── gee_linear_1.csv
│   │   │       │   │   │   │   ├── gee_logistic_1.csv
│   │   │       │   │   │   │   ├── gee_nested_linear_1.csv
│   │   │       │   │   │   │   ├── gee_nominal_1.csv
│   │   │       │   │   │   │   ├── gee_ordinal_1.csv
│   │   │       │   │   │   │   ├── gee_poisson_1.csv
│   │   │       │   │   │   │   ├── glm_test_resids.py
│   │   │       │   │   │   │   ├── glmnet_r_results.py
│   │   │       │   │   │   │   ├── igaussident_resids.csv
│   │   │       │   │   │   │   ├── inv_gaussian.csv
│   │   │       │   │   │   │   ├── iris.csv
│   │   │       │   │   │   │   ├── medparlogresids.csv
│   │   │       │   │   │   │   ├── res_R_var_weight.py
│   │   │       │   │   │   │   ├── results_glm.py
│   │   │       │   │   │   │   ├── results_glm_poisson_weights.py
│   │   │       │   │   │   │   ├── results_tweedie_aweights_nonrobust.csv
│   │   │       │   │   │   │   ├── stata_cancer_glm.csv
│   │   │       │   │   │   │   ├── stata_lbw_glm.csv
│   │   │       │   │   │   │   └── stata_medpar1_glm.csv
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── gee_categorical_simulation_check.py
│   │   │       │   │   │   ├── gee_gaussian_simulation_check.py
│   │   │       │   │   │   ├── gee_poisson_simulation_check.py
│   │   │       │   │   │   ├── gee_simulation_check.py
│   │   │       │   │   │   ├── test_bayes_mixed_glm.py
│   │   │       │   │   │   ├── test_constrained.py
│   │   │       │   │   │   ├── test_gee.py
│   │   │       │   │   │   ├── test_gee_glm.py
│   │   │       │   │   │   ├── test_glm.py
│   │   │       │   │   │   ├── test_glm_weights.py
│   │   │       │   │   │   ├── test_qif.py
│   │   │       │   │   │   └── test_score_test.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _tweedie_compound_poisson.py
│   │   │       │   │   ├── api.py
│   │   │       │   │   ├── bayes_mixed_glm.py
│   │   │       │   │   ├── cov_struct.py
│   │   │       │   │   ├── generalized_estimating_equations.py
│   │   │       │   │   ├── generalized_linear_model.py
│   │   │       │   │   └── qif.py
│   │   │       │   ├── graphics/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _regressionplots_doc.cpython-312.pyc
│   │   │       │   │   │   ├── agreement.cpython-312.pyc
│   │   │       │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   ├── boxplots.cpython-312.pyc
│   │   │       │   │   │   ├── correlation.cpython-312.pyc
│   │   │       │   │   │   ├── dotplots.cpython-312.pyc
│   │   │       │   │   │   ├── factorplots.cpython-312.pyc
│   │   │       │   │   │   ├── functional.cpython-312.pyc
│   │   │       │   │   │   ├── gofplots.cpython-312.pyc
│   │   │       │   │   │   ├── mosaicplot.cpython-312.pyc
│   │   │       │   │   │   ├── plot_grids.cpython-312.pyc
│   │   │       │   │   │   ├── plottools.cpython-312.pyc
│   │   │       │   │   │   ├── regressionplots.cpython-312.pyc
│   │   │       │   │   │   ├── tsaplots.cpython-312.pyc
│   │   │       │   │   │   ├── tukeyplot.cpython-312.pyc
│   │   │       │   │   │   └── utils.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_agreement.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_boxplots.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_correlation.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_dotplot.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_factorplots.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_functional.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_gofplots.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mosaicplot.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_regressionplots.cpython-312.pyc
│   │   │       │   │   │   │   └── test_tsaplots.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_agreement.py
│   │   │       │   │   │   ├── test_boxplots.py
│   │   │       │   │   │   ├── test_correlation.py
│   │   │       │   │   │   ├── test_dotplot.py
│   │   │       │   │   │   ├── test_factorplots.py
│   │   │       │   │   │   ├── test_functional.py
│   │   │       │   │   │   ├── test_gofplots.py
│   │   │       │   │   │   ├── test_mosaicplot.py
│   │   │       │   │   │   ├── test_regressionplots.py
│   │   │       │   │   │   └── test_tsaplots.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _regressionplots_doc.py
│   │   │       │   │   ├── agreement.py
│   │   │       │   │   ├── api.py
│   │   │       │   │   ├── boxplots.py
│   │   │       │   │   ├── correlation.py
│   │   │       │   │   ├── dotplots.py
│   │   │       │   │   ├── factorplots.py
│   │   │       │   │   ├── functional.py
│   │   │       │   │   ├── gofplots.py
│   │   │       │   │   ├── mosaicplot.py
│   │   │       │   │   ├── plot_grids.py
│   │   │       │   │   ├── plottools.py
│   │   │       │   │   ├── regressionplots.py
│   │   │       │   │   ├── tsaplots.py
│   │   │       │   │   ├── tukeyplot.py
│   │   │       │   │   └── utils.py
│   │   │       │   ├── imputation/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── bayes_mi.cpython-312.pyc
│   │   │       │   │   │   ├── mice.cpython-312.pyc
│   │   │       │   │   │   └── ros.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bayes_mi.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mice.cpython-312.pyc
│   │   │       │   │   │   │   └── test_ros.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_bayes_mi.py
│   │   │       │   │   │   ├── test_mice.py
│   │   │       │   │   │   └── test_ros.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── bayes_mi.py
│   │   │       │   │   ├── mice.py
│   │   │       │   │   └── ros.py
│   │   │       │   ├── interface/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   └── __init__.py
│   │   │       │   ├── iolib/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   ├── foreign.cpython-312.pyc
│   │   │       │   │   │   ├── openfile.cpython-312.pyc
│   │   │       │   │   │   ├── smpickle.cpython-312.pyc
│   │   │       │   │   │   ├── stata_summary_examples.cpython-312.pyc
│   │   │       │   │   │   ├── summary.cpython-312.pyc
│   │   │       │   │   │   ├── summary2.cpython-312.pyc
│   │   │       │   │   │   ├── table.cpython-312.pyc
│   │   │       │   │   │   └── tableformatting.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pickle.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_summary.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_summary2.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_summary_old.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_table.cpython-312.pyc
│   │   │       │   │   │   │   └── test_table_econpy.cpython-312.pyc
│   │   │       │   │   │   ├── results/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── macrodata.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── data_missing.dta
│   │   │       │   │   │   │   ├── macrodata.py
│   │   │       │   │   │   │   └── time_series_examples.dta
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_pickle.py
│   │   │       │   │   │   ├── test_summary.py
│   │   │       │   │   │   ├── test_summary2.py
│   │   │       │   │   │   ├── test_summary_old.py
│   │   │       │   │   │   ├── test_table.py
│   │   │       │   │   │   └── test_table_econpy.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── api.py
│   │   │       │   │   ├── foreign.py
│   │   │       │   │   ├── openfile.py
│   │   │       │   │   ├── smpickle.py
│   │   │       │   │   ├── stata_summary_examples.py
│   │   │       │   │   ├── summary.py
│   │   │       │   │   ├── summary2.py
│   │   │       │   │   ├── table.py
│   │   │       │   │   └── tableformatting.py
│   │   │       │   ├── miscmodels/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   ├── count.cpython-312.pyc
│   │   │       │   │   │   ├── nonlinls.cpython-312.pyc
│   │   │       │   │   │   ├── ordinal_model.cpython-312.pyc
│   │   │       │   │   │   ├── tmodel.cpython-312.pyc
│   │   │       │   │   │   └── try_mlecov.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── results_tmodel.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_generic_mle.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ordinal_model.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_poisson.cpython-312.pyc
│   │   │       │   │   │   │   └── test_tmodel.cpython-312.pyc
│   │   │       │   │   │   ├── results/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── results_ordinal_model.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── ologit_ucla.csv
│   │   │       │   │   │   │   └── results_ordinal_model.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── results_tmodel.py
│   │   │       │   │   │   ├── test_generic_mle.py
│   │   │       │   │   │   ├── test_ordinal_model.py
│   │   │       │   │   │   ├── test_poisson.py
│   │   │       │   │   │   └── test_tmodel.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── api.py
│   │   │       │   │   ├── count.py
│   │   │       │   │   ├── nonlinls.py
│   │   │       │   │   ├── ordinal_model.py
│   │   │       │   │   ├── tmodel.py
│   │   │       │   │   └── try_mlecov.py
│   │   │       │   ├── multivariate/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   ├── cancorr.cpython-312.pyc
│   │   │       │   │   │   ├── factor.cpython-312.pyc
│   │   │       │   │   │   ├── manova.cpython-312.pyc
│   │   │       │   │   │   ├── multivariate_ols.cpython-312.pyc
│   │   │       │   │   │   ├── pca.cpython-312.pyc
│   │   │       │   │   │   └── plots.cpython-312.pyc
│   │   │       │   │   ├── factor_rotation/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _analytic_rotation.cpython-312.pyc
│   │   │       │   │   │   │   ├── _gpa_rotation.cpython-312.pyc
│   │   │       │   │   │   │   └── _wrappers.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_rotation.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── test_rotation.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _analytic_rotation.py
│   │   │       │   │   │   ├── _gpa_rotation.py
│   │   │       │   │   │   └── _wrappers.py
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cancorr.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_factor.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_manova.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ml_factor.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_multivariate_ols.cpython-312.pyc
│   │   │       │   │   │   │   └── test_pca.cpython-312.pyc
│   │   │       │   │   │   ├── results/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── datamlw.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── datamlw.py
│   │   │       │   │   │   │   ├── factor_data.csv
│   │   │       │   │   │   │   └── factors_stata.csv
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_cancorr.py
│   │   │       │   │   │   ├── test_factor.py
│   │   │       │   │   │   ├── test_manova.py
│   │   │       │   │   │   ├── test_ml_factor.py
│   │   │       │   │   │   ├── test_multivariate_ols.py
│   │   │       │   │   │   └── test_pca.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── api.py
│   │   │       │   │   ├── cancorr.py
│   │   │       │   │   ├── factor.py
│   │   │       │   │   ├── manova.py
│   │   │       │   │   ├── multivariate_ols.py
│   │   │       │   │   ├── pca.py
│   │   │       │   │   └── plots.py
│   │   │       │   ├── nonparametric/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _kernel_base.cpython-312.pyc
│   │   │       │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   ├── bandwidths.cpython-312.pyc
│   │   │       │   │   │   ├── kde.cpython-312.pyc
│   │   │       │   │   │   ├── kdetools.cpython-312.pyc
│   │   │       │   │   │   ├── kernel_density.cpython-312.pyc
│   │   │       │   │   │   ├── kernel_regression.cpython-312.pyc
│   │   │       │   │   │   ├── kernels.cpython-312.pyc
│   │   │       │   │   │   ├── kernels_asymmetric.cpython-312.pyc
│   │   │       │   │   │   ├── smoothers_lowess.cpython-312.pyc
│   │   │       │   │   │   └── smoothers_lowess_old.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_asymmetric.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bandwidths.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_kde.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_kernel_density.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_kernel_regression.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_kernels.cpython-312.pyc
│   │   │       │   │   │   │   └── test_lowess.cpython-312.pyc
│   │   │       │   │   │   ├── results/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── results_kcde.csv
│   │   │       │   │   │   │   ├── results_kde.csv
│   │   │       │   │   │   │   ├── results_kde_fft.csv
│   │   │       │   │   │   │   ├── results_kde_univ_weights.csv
│   │   │       │   │   │   │   ├── results_kde_weights.csv
│   │   │       │   │   │   │   ├── results_kernel_regression.csv
│   │   │       │   │   │   │   ├── test_lowess_delta.csv
│   │   │       │   │   │   │   ├── test_lowess_frac.csv
│   │   │       │   │   │   │   ├── test_lowess_iter.csv
│   │   │       │   │   │   │   └── test_lowess_simple.csv
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_asymmetric.py
│   │   │       │   │   │   ├── test_bandwidths.py
│   │   │       │   │   │   ├── test_kde.py
│   │   │       │   │   │   ├── test_kernel_density.py
│   │   │       │   │   │   ├── test_kernel_regression.py
│   │   │       │   │   │   ├── test_kernels.py
│   │   │       │   │   │   └── test_lowess.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _kernel_base.py
│   │   │       │   │   ├── _smoothers_lowess.cp312-win_amd64.pyd
│   │   │       │   │   ├── api.py
│   │   │       │   │   ├── bandwidths.py
│   │   │       │   │   ├── kde.py
│   │   │       │   │   ├── kdetools.py
│   │   │       │   │   ├── kernel_density.py
│   │   │       │   │   ├── kernel_regression.py
│   │   │       │   │   ├── kernels.py
│   │   │       │   │   ├── kernels_asymmetric.py
│   │   │       │   │   ├── linbin.cp312-win_amd64.pyd
│   │   │       │   │   ├── smoothers_lowess.py
│   │   │       │   │   └── smoothers_lowess_old.py
│   │   │       │   ├── othermod/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   └── betareg.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── test_beta.cpython-312.pyc
│   │   │       │   │   │   ├── results/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── results_betareg.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── foodexpenditure.csv
│   │   │       │   │   │   │   ├── methylation-test.csv
│   │   │       │   │   │   │   ├── resid_methylation.csv
│   │   │       │   │   │   │   └── results_betareg.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── test_beta.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── api.py
│   │   │       │   │   └── betareg.py
│   │   │       │   ├── regression/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _prediction.cpython-312.pyc
│   │   │       │   │   │   ├── _tools.cpython-312.pyc
│   │   │       │   │   │   ├── dimred.cpython-312.pyc
│   │   │       │   │   │   ├── feasible_gls.cpython-312.pyc
│   │   │       │   │   │   ├── linear_model.cpython-312.pyc
│   │   │       │   │   │   ├── mixed_linear_model.cpython-312.pyc
│   │   │       │   │   │   ├── process_regression.cpython-312.pyc
│   │   │       │   │   │   ├── quantile_regression.cpython-312.pyc
│   │   │       │   │   │   ├── recursive_ls.cpython-312.pyc
│   │   │       │   │   │   └── rolling.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_cov.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_dimred.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_glsar_gretl.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_glsar_stata.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_lme.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_predict.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_processreg.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_quantile_regression.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_recursive_ls.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_regression.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_robustcov.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_rolling.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_theil.cpython-312.pyc
│   │   │       │   │   │   │   └── test_tools.cpython-312.pyc
│   │   │       │   │   │   ├── results/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── generate_lasso.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── generate_lme.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── glmnet_r_results.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── lme_r_results.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── macro_gr_corc_stata.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_grunfeld_ols_robust_cluster.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_macro_ols_robust.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_quantile_regression.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_regression.cpython-312.pyc
│   │   │       │   │   │   │   │   └── results_theil_textile.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── dietox.csv
│   │   │       │   │   │   │   ├── generate_lasso.py
│   │   │       │   │   │   │   ├── generate_lme.py
│   │   │       │   │   │   │   ├── glmnet_r_results.py
│   │   │       │   │   │   │   ├── lasso_data.csv
│   │   │       │   │   │   │   ├── leverage_influence_ols_nostars.txt
│   │   │       │   │   │   │   ├── lme00.csv
│   │   │       │   │   │   │   ├── lme01.csv
│   │   │       │   │   │   │   ├── lme02.csv
│   │   │       │   │   │   │   ├── lme03.csv
│   │   │       │   │   │   │   ├── lme04.csv
│   │   │       │   │   │   │   ├── lme05.csv
│   │   │       │   │   │   │   ├── lme06.csv
│   │   │       │   │   │   │   ├── lme07.csv
│   │   │       │   │   │   │   ├── lme08.csv
│   │   │       │   │   │   │   ├── lme09.csv
│   │   │       │   │   │   │   ├── lme10.csv
│   │   │       │   │   │   │   ├── lme11.csv
│   │   │       │   │   │   │   ├── lme_r_results.py
│   │   │       │   │   │   │   ├── macro_gr_corc_stata.py
│   │   │       │   │   │   │   ├── pastes.csv
│   │   │       │   │   │   │   ├── results_grunfeld_ols_robust_cluster.py
│   │   │       │   │   │   │   ├── results_macro_ols_robust.py
│   │   │       │   │   │   │   ├── results_quantile_regression.py
│   │   │       │   │   │   │   ├── results_regression.py
│   │   │       │   │   │   │   ├── results_rls_R.csv
│   │   │       │   │   │   │   ├── results_rls_stata.csv
│   │   │       │   │   │   │   ├── results_theil_textile.py
│   │   │       │   │   │   │   └── theil_textile_predict.csv
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_cov.py
│   │   │       │   │   │   ├── test_dimred.py
│   │   │       │   │   │   ├── test_glsar_gretl.py
│   │   │       │   │   │   ├── test_glsar_stata.py
│   │   │       │   │   │   ├── test_lme.py
│   │   │       │   │   │   ├── test_predict.py
│   │   │       │   │   │   ├── test_processreg.py
│   │   │       │   │   │   ├── test_quantile_regression.py
│   │   │       │   │   │   ├── test_recursive_ls.py
│   │   │       │   │   │   ├── test_regression.py
│   │   │       │   │   │   ├── test_robustcov.py
│   │   │       │   │   │   ├── test_rolling.py
│   │   │       │   │   │   ├── test_theil.py
│   │   │       │   │   │   └── test_tools.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _prediction.py
│   │   │       │   │   ├── _tools.py
│   │   │       │   │   ├── dimred.py
│   │   │       │   │   ├── feasible_gls.py
│   │   │       │   │   ├── linear_model.py
│   │   │       │   │   ├── mixed_linear_model.py
│   │   │       │   │   ├── process_regression.py
│   │   │       │   │   ├── quantile_regression.py
│   │   │       │   │   ├── recursive_ls.py
│   │   │       │   │   └── rolling.py
│   │   │       │   ├── robust/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── norms.cpython-312.pyc
│   │   │       │   │   │   ├── robust_linear_model.cpython-312.pyc
│   │   │       │   │   │   └── scale.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mquantiles.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_norms.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_rlm.cpython-312.pyc
│   │   │       │   │   │   │   └── test_scale.cpython-312.pyc
│   │   │       │   │   │   ├── results/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_norms.cpython-312.pyc
│   │   │       │   │   │   │   │   └── results_rlm.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── results_norms.py
│   │   │       │   │   │   │   └── results_rlm.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_mquantiles.py
│   │   │       │   │   │   ├── test_norms.py
│   │   │       │   │   │   ├── test_rlm.py
│   │   │       │   │   │   └── test_scale.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _qn.cp312-win_amd64.pyd
│   │   │       │   │   ├── norms.py
│   │   │       │   │   ├── robust_linear_model.py
│   │   │       │   │   └── scale.py
│   │   │       │   ├── sandbox/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── bspline.cpython-312.pyc
│   │   │       │   │   │   ├── descstats.cpython-312.pyc
│   │   │       │   │   │   ├── gam.cpython-312.pyc
│   │   │       │   │   │   ├── infotheo.cpython-312.pyc
│   │   │       │   │   │   ├── mle.cpython-312.pyc
│   │   │       │   │   │   ├── multilinear.cpython-312.pyc
│   │   │       │   │   │   ├── pca.cpython-312.pyc
│   │   │       │   │   │   ├── predict_functional.cpython-312.pyc
│   │   │       │   │   │   ├── rls.cpython-312.pyc
│   │   │       │   │   │   └── sysreg.cpython-312.pyc
│   │   │       │   │   ├── archive/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── linalg_covmat.cpython-312.pyc
│   │   │       │   │   │   │   ├── linalg_decomp_1.cpython-312.pyc
│   │   │       │   │   │   │   └── tsa.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── linalg_covmat.py
│   │   │       │   │   │   ├── linalg_decomp_1.py
│   │   │       │   │   │   └── tsa.py
│   │   │       │   │   ├── datarich/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── factormodels.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── factormodels.py
│   │   │       │   │   ├── distributions/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── estimators.cpython-312.pyc
│   │   │       │   │   │   │   ├── extras.cpython-312.pyc
│   │   │       │   │   │   │   ├── genpareto.cpython-312.pyc
│   │   │       │   │   │   │   ├── gof_new.cpython-312.pyc
│   │   │       │   │   │   │   ├── multivariate.cpython-312.pyc
│   │   │       │   │   │   │   ├── mv_measures.cpython-312.pyc
│   │   │       │   │   │   │   ├── mv_normal.cpython-312.pyc
│   │   │       │   │   │   │   ├── otherdist.cpython-312.pyc
│   │   │       │   │   │   │   ├── quantize.cpython-312.pyc
│   │   │       │   │   │   │   ├── sppatch.cpython-312.pyc
│   │   │       │   │   │   │   ├── transform_functions.cpython-312.pyc
│   │   │       │   │   │   │   ├── transformed.cpython-312.pyc
│   │   │       │   │   │   │   ├── try_max.cpython-312.pyc
│   │   │       │   │   │   │   └── try_pot.cpython-312.pyc
│   │   │       │   │   │   ├── examples/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── ex_extras.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── ex_fitfr.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── ex_gof.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── ex_mvelliptical.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── ex_transf2.cpython-312.pyc
│   │   │       │   │   │   │   │   └── matchdist.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── ex_extras.py
│   │   │       │   │   │   │   ├── ex_fitfr.py
│   │   │       │   │   │   │   ├── ex_gof.py
│   │   │       │   │   │   │   ├── ex_mvelliptical.py
│   │   │       │   │   │   │   ├── ex_transf2.py
│   │   │       │   │   │   │   └── matchdist.py
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── _est_fit.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── check_moments.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── distparams.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_extras.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_gof_new.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_multivariate.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_norm_expan.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_transf.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── _est_fit.py
│   │   │       │   │   │   │   ├── check_moments.py
│   │   │       │   │   │   │   ├── distparams.py
│   │   │       │   │   │   │   ├── test_extras.py
│   │   │       │   │   │   │   ├── test_gof_new.py
│   │   │       │   │   │   │   ├── test_multivariate.py
│   │   │       │   │   │   │   ├── test_norm_expan.py
│   │   │       │   │   │   │   └── test_transf.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── estimators.py
│   │   │       │   │   │   ├── extras.py
│   │   │       │   │   │   ├── genpareto.py
│   │   │       │   │   │   ├── gof_new.py
│   │   │       │   │   │   ├── multivariate.py
│   │   │       │   │   │   ├── mv_measures.py
│   │   │       │   │   │   ├── mv_normal.py
│   │   │       │   │   │   ├── otherdist.py
│   │   │       │   │   │   ├── quantize.py
│   │   │       │   │   │   ├── sppatch.py
│   │   │       │   │   │   ├── transform_functions.py
│   │   │       │   │   │   ├── transformed.py
│   │   │       │   │   │   ├── try_max.py
│   │   │       │   │   │   └── try_pot.py
│   │   │       │   │   ├── mcevaluate/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── arma.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── arma.py
│   │   │       │   │   ├── nonparametric/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── densityorthopoly.cpython-312.pyc
│   │   │       │   │   │   │   ├── dgp_examples.cpython-312.pyc
│   │   │       │   │   │   │   ├── kde2.cpython-312.pyc
│   │   │       │   │   │   │   ├── kdecovclass.cpython-312.pyc
│   │   │       │   │   │   │   ├── kernel_extras.cpython-312.pyc
│   │   │       │   │   │   │   ├── kernels.cpython-312.pyc
│   │   │       │   │   │   │   ├── smoothers.cpython-312.pyc
│   │   │       │   │   │   │   └── testdata.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── ex_gam_am_new.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── ex_gam_new.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── ex_smoothers.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_kernel_extras.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_smoothers.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── ex_gam_am_new.py
│   │   │       │   │   │   │   ├── ex_gam_new.py
│   │   │       │   │   │   │   ├── ex_smoothers.py
│   │   │       │   │   │   │   ├── test_kernel_extras.py
│   │   │       │   │   │   │   └── test_smoothers.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── densityorthopoly.py
│   │   │       │   │   │   ├── dgp_examples.py
│   │   │       │   │   │   ├── kde2.py
│   │   │       │   │   │   ├── kdecovclass.py
│   │   │       │   │   │   ├── kernel_extras.py
│   │   │       │   │   │   ├── kernels.py
│   │   │       │   │   │   ├── smoothers.py
│   │   │       │   │   │   └── testdata.py
│   │   │       │   │   ├── panel/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── correlation_structures.cpython-312.pyc
│   │   │       │   │   │   │   ├── mixed.cpython-312.pyc
│   │   │       │   │   │   │   ├── panel_short.cpython-312.pyc
│   │   │       │   │   │   │   ├── panelmod.cpython-312.pyc
│   │   │       │   │   │   │   ├── random_panel.cpython-312.pyc
│   │   │       │   │   │   │   └── sandwich_covariance_generic.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_random_panel.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── test_random_panel.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── correlation_structures.py
│   │   │       │   │   │   ├── mixed.py
│   │   │       │   │   │   ├── panel_short.py
│   │   │       │   │   │   ├── panelmod.py
│   │   │       │   │   │   ├── random_panel.py
│   │   │       │   │   │   └── sandwich_covariance_generic.py
│   │   │       │   │   ├── regression/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── anova_nistcertified.cpython-312.pyc
│   │   │       │   │   │   │   ├── ar_panel.cpython-312.pyc
│   │   │       │   │   │   │   ├── example_kernridge.cpython-312.pyc
│   │   │       │   │   │   │   ├── gmm.cpython-312.pyc
│   │   │       │   │   │   │   ├── kernridgeregress_class.cpython-312.pyc
│   │   │       │   │   │   │   ├── ols_anova_original.cpython-312.pyc
│   │   │       │   │   │   │   ├── onewaygls.cpython-312.pyc
│   │   │       │   │   │   │   ├── penalized.cpython-312.pyc
│   │   │       │   │   │   │   ├── predstd.cpython-312.pyc
│   │   │       │   │   │   │   ├── runmnl.cpython-312.pyc
│   │   │       │   │   │   │   ├── sympy_diff.cpython-312.pyc
│   │   │       │   │   │   │   ├── tools.cpython-312.pyc
│   │   │       │   │   │   │   ├── treewalkerclass.cpython-312.pyc
│   │   │       │   │   │   │   ├── try_catdata.cpython-312.pyc
│   │   │       │   │   │   │   ├── try_ols_anova.cpython-312.pyc
│   │   │       │   │   │   │   └── try_treewalker.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_gmm_griliches.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_gmm_griliches_iter.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_gmm_poisson.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_ivreg2_griliches.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_gmm.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_gmm_poisson.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── griliches76.dta
│   │   │       │   │   │   │   ├── racd10data_with_transformed.csv
│   │   │       │   │   │   │   ├── results_gmm_griliches.py
│   │   │       │   │   │   │   ├── results_gmm_griliches_iter.py
│   │   │       │   │   │   │   ├── results_gmm_poisson.py
│   │   │       │   │   │   │   ├── results_ivreg2_griliches.py
│   │   │       │   │   │   │   ├── test_gmm.py
│   │   │       │   │   │   │   └── test_gmm_poisson.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── anova_nistcertified.py
│   │   │       │   │   │   ├── ar_panel.py
│   │   │       │   │   │   ├── example_kernridge.py
│   │   │       │   │   │   ├── gmm.py
│   │   │       │   │   │   ├── kernridgeregress_class.py
│   │   │       │   │   │   ├── ols_anova_original.py
│   │   │       │   │   │   ├── onewaygls.py
│   │   │       │   │   │   ├── penalized.py
│   │   │       │   │   │   ├── predstd.py
│   │   │       │   │   │   ├── runmnl.py
│   │   │       │   │   │   ├── sympy_diff.py
│   │   │       │   │   │   ├── tools.py
│   │   │       │   │   │   ├── treewalkerclass.py
│   │   │       │   │   │   ├── try_catdata.py
│   │   │       │   │   │   ├── try_ols_anova.py
│   │   │       │   │   │   └── try_treewalker.py
│   │   │       │   │   ├── stats/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── contrast_tools.cpython-312.pyc
│   │   │       │   │   │   │   ├── diagnostic.cpython-312.pyc
│   │   │       │   │   │   │   ├── ex_newtests.cpython-312.pyc
│   │   │       │   │   │   │   ├── multicomp.cpython-312.pyc
│   │   │       │   │   │   │   ├── runs.cpython-312.pyc
│   │   │       │   │   │   │   ├── stats_dhuard.cpython-312.pyc
│   │   │       │   │   │   │   └── stats_mstats_short.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_multicomp.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_runs.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_multicomp.py
│   │   │       │   │   │   │   └── test_runs.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── contrast_tools.py
│   │   │       │   │   │   ├── diagnostic.py
│   │   │       │   │   │   ├── ex_newtests.py
│   │   │       │   │   │   ├── multicomp.py
│   │   │       │   │   │   ├── runs.py
│   │   │       │   │   │   ├── stats_dhuard.py
│   │   │       │   │   │   └── stats_mstats_short.py
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── maketests_mlabwrap.cpython-312.pyc
│   │   │       │   │   │   │   ├── savervs.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_gam.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pca.cpython-312.pyc
│   │   │       │   │   │   │   └── test_predict_functional.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── maketests_mlabwrap.py
│   │   │       │   │   │   ├── savervs.py
│   │   │       │   │   │   ├── test_gam.py
│   │   │       │   │   │   ├── test_pca.py
│   │   │       │   │   │   └── test_predict_functional.py
│   │   │       │   │   ├── tools/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── cross_val.cpython-312.pyc
│   │   │       │   │   │   │   ├── mctools.cpython-312.pyc
│   │   │       │   │   │   │   ├── tools_pca.cpython-312.pyc
│   │   │       │   │   │   │   └── try_mctools.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── cross_val.py
│   │   │       │   │   │   ├── mctools.py
│   │   │       │   │   │   ├── tools_pca.py
│   │   │       │   │   │   └── try_mctools.py
│   │   │       │   │   ├── tsa/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── diffusion.cpython-312.pyc
│   │   │       │   │   │   │   ├── diffusion2.cpython-312.pyc
│   │   │       │   │   │   │   ├── example_arma.cpython-312.pyc
│   │   │       │   │   │   │   ├── fftarma.cpython-312.pyc
│   │   │       │   │   │   │   ├── movstat.cpython-312.pyc
│   │   │       │   │   │   │   ├── try_arma_more.cpython-312.pyc
│   │   │       │   │   │   │   ├── try_fi.cpython-312.pyc
│   │   │       │   │   │   │   ├── try_var_convolve.cpython-312.pyc
│   │   │       │   │   │   │   └── varma.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── diffusion.py
│   │   │       │   │   │   ├── diffusion2.py
│   │   │       │   │   │   ├── example_arma.py
│   │   │       │   │   │   ├── fftarma.py
│   │   │       │   │   │   ├── movstat.py
│   │   │       │   │   │   ├── try_arma_more.py
│   │   │       │   │   │   ├── try_fi.py
│   │   │       │   │   │   ├── try_var_convolve.py
│   │   │       │   │   │   └── varma.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── bspline.py
│   │   │       │   │   ├── descstats.py
│   │   │       │   │   ├── gam.py
│   │   │       │   │   ├── infotheo.py
│   │   │       │   │   ├── mle.py
│   │   │       │   │   ├── multilinear.py
│   │   │       │   │   ├── pca.py
│   │   │       │   │   ├── predict_functional.py
│   │   │       │   │   ├── rls.py
│   │   │       │   │   └── sysreg.py
│   │   │       │   ├── src/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   └── __init__.py
│   │   │       │   ├── stats/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _adnorm.cpython-312.pyc
│   │   │       │   │   │   ├── _delta_method.cpython-312.pyc
│   │   │       │   │   │   ├── _diagnostic_other.cpython-312.pyc
│   │   │       │   │   │   ├── _inference_tools.cpython-312.pyc
│   │   │       │   │   │   ├── _knockoff.cpython-312.pyc
│   │   │       │   │   │   ├── _lilliefors.cpython-312.pyc
│   │   │       │   │   │   ├── _lilliefors_critical_values.cpython-312.pyc
│   │   │       │   │   │   ├── anova.cpython-312.pyc
│   │   │       │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   ├── base.cpython-312.pyc
│   │   │       │   │   │   ├── contingency_tables.cpython-312.pyc
│   │   │       │   │   │   ├── contrast.cpython-312.pyc
│   │   │       │   │   │   ├── correlation_tools.cpython-312.pyc
│   │   │       │   │   │   ├── descriptivestats.cpython-312.pyc
│   │   │       │   │   │   ├── diagnostic.cpython-312.pyc
│   │   │       │   │   │   ├── diagnostic_gen.cpython-312.pyc
│   │   │       │   │   │   ├── dist_dependence_measures.cpython-312.pyc
│   │   │       │   │   │   ├── effect_size.cpython-312.pyc
│   │   │       │   │   │   ├── gof.cpython-312.pyc
│   │   │       │   │   │   ├── inter_rater.cpython-312.pyc
│   │   │       │   │   │   ├── knockoff_regeffects.cpython-312.pyc
│   │   │       │   │   │   ├── mediation.cpython-312.pyc
│   │   │       │   │   │   ├── meta_analysis.cpython-312.pyc
│   │   │       │   │   │   ├── moment_helpers.cpython-312.pyc
│   │   │       │   │   │   ├── multicomp.cpython-312.pyc
│   │   │       │   │   │   ├── multitest.cpython-312.pyc
│   │   │       │   │   │   ├── multivariate.cpython-312.pyc
│   │   │       │   │   │   ├── multivariate_tools.cpython-312.pyc
│   │   │       │   │   │   ├── nonparametric.cpython-312.pyc
│   │   │       │   │   │   ├── oaxaca.cpython-312.pyc
│   │   │       │   │   │   ├── oneway.cpython-312.pyc
│   │   │       │   │   │   ├── outliers_influence.cpython-312.pyc
│   │   │       │   │   │   ├── power.cpython-312.pyc
│   │   │       │   │   │   ├── proportion.cpython-312.pyc
│   │   │       │   │   │   ├── rates.cpython-312.pyc
│   │   │       │   │   │   ├── regularized_covariance.cpython-312.pyc
│   │   │       │   │   │   ├── robust_compare.cpython-312.pyc
│   │   │       │   │   │   ├── sandwich_covariance.cpython-312.pyc
│   │   │       │   │   │   ├── stattools.cpython-312.pyc
│   │   │       │   │   │   ├── tabledist.cpython-312.pyc
│   │   │       │   │   │   └── weightstats.cpython-312.pyc
│   │   │       │   │   ├── libqsturng/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── make_tbls.cpython-312.pyc
│   │   │       │   │   │   │   └── qsturng_.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_qsturng.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── bootleg.dat
│   │   │       │   │   │   │   └── test_qsturng.py
│   │   │       │   │   │   ├── CH.r
│   │   │       │   │   │   ├── LICENSE.txt
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── make_tbls.py
│   │   │       │   │   │   └── qsturng_.py
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_anova.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_anova_rm.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_base.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_contingency_tables.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_contrast.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_correlation.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_corrpsd.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_deltacov.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_descriptivestats.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_diagnostic.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_diagnostic_other.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_dist_dependant_measures.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_effectsize.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_gof.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_groups_sw.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_influence.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_inter_rater.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_knockoff.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_lilliefors.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_mediation.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_meta.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_moment_helpers.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_multi.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_multivariate.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_nonparametric.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_oaxaca.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_oneway.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_outliers_influence.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_pairwise.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_panel_robustcov.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_power.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_proportion.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_qsturng.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_rates_poisson.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_regularized_covariance.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_robust_compare.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sandwich.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_statstools.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_tabledist.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_tost.cpython-312.pyc
│   │   │       │   │   │   │   └── test_weightstats.cpython-312.pyc
│   │   │       │   │   │   ├── results/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── lilliefors_critical_value_simulation.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_meta.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_multinomial_proportions.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_panelrobust.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_power.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_proportion.cpython-312.pyc
│   │   │       │   │   │   │   │   └── results_rates.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── binary_constrict.csv
│   │   │       │   │   │   │   ├── bootleg.csv
│   │   │       │   │   │   │   ├── contingency_table_r_results.csv
│   │   │       │   │   │   │   ├── data.dat
│   │   │       │   │   │   │   ├── framing.csv
│   │   │       │   │   │   │   ├── influence_lsdiag_R.json
│   │   │       │   │   │   │   ├── influence_measures_R.csv
│   │   │       │   │   │   │   ├── influence_measures_bool_R.csv
│   │   │       │   │   │   │   ├── lilliefors_critical_value_simulation.py
│   │   │       │   │   │   │   ├── results_influence_logit.csv
│   │   │       │   │   │   │   ├── results_meta.py
│   │   │       │   │   │   │   ├── results_multinomial_proportions.py
│   │   │       │   │   │   │   ├── results_panelrobust.py
│   │   │       │   │   │   │   ├── results_power.py
│   │   │       │   │   │   │   ├── results_proportion.py
│   │   │       │   │   │   │   ├── results_rates.py
│   │   │       │   │   │   │   ├── wspec1.csv
│   │   │       │   │   │   │   ├── wspec2.csv
│   │   │       │   │   │   │   ├── wspec3.csv
│   │   │       │   │   │   │   └── wspec4.csv
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_anova.py
│   │   │       │   │   │   ├── test_anova_rm.py
│   │   │       │   │   │   ├── test_base.py
│   │   │       │   │   │   ├── test_contingency_tables.py
│   │   │       │   │   │   ├── test_contrast.py
│   │   │       │   │   │   ├── test_correlation.py
│   │   │       │   │   │   ├── test_corrpsd.py
│   │   │       │   │   │   ├── test_data.txt
│   │   │       │   │   │   ├── test_deltacov.py
│   │   │       │   │   │   ├── test_descriptivestats.py
│   │   │       │   │   │   ├── test_diagnostic.py
│   │   │       │   │   │   ├── test_diagnostic_other.py
│   │   │       │   │   │   ├── test_dist_dependant_measures.py
│   │   │       │   │   │   ├── test_effectsize.py
│   │   │       │   │   │   ├── test_gof.py
│   │   │       │   │   │   ├── test_groups_sw.py
│   │   │       │   │   │   ├── test_influence.py
│   │   │       │   │   │   ├── test_inter_rater.py
│   │   │       │   │   │   ├── test_knockoff.py
│   │   │       │   │   │   ├── test_lilliefors.py
│   │   │       │   │   │   ├── test_mediation.py
│   │   │       │   │   │   ├── test_meta.py
│   │   │       │   │   │   ├── test_moment_helpers.py
│   │   │       │   │   │   ├── test_multi.py
│   │   │       │   │   │   ├── test_multivariate.py
│   │   │       │   │   │   ├── test_nonparametric.py
│   │   │       │   │   │   ├── test_oaxaca.py
│   │   │       │   │   │   ├── test_oneway.py
│   │   │       │   │   │   ├── test_outliers_influence.py
│   │   │       │   │   │   ├── test_pairwise.py
│   │   │       │   │   │   ├── test_panel_robustcov.py
│   │   │       │   │   │   ├── test_power.py
│   │   │       │   │   │   ├── test_proportion.py
│   │   │       │   │   │   ├── test_qsturng.py
│   │   │       │   │   │   ├── test_rates_poisson.py
│   │   │       │   │   │   ├── test_regularized_covariance.py
│   │   │       │   │   │   ├── test_robust_compare.py
│   │   │       │   │   │   ├── test_sandwich.py
│   │   │       │   │   │   ├── test_statstools.py
│   │   │       │   │   │   ├── test_tabledist.py
│   │   │       │   │   │   ├── test_tost.py
│   │   │       │   │   │   └── test_weightstats.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _adnorm.py
│   │   │       │   │   ├── _delta_method.py
│   │   │       │   │   ├── _diagnostic_other.py
│   │   │       │   │   ├── _inference_tools.py
│   │   │       │   │   ├── _knockoff.py
│   │   │       │   │   ├── _lilliefors.py
│   │   │       │   │   ├── _lilliefors_critical_values.py
│   │   │       │   │   ├── anova.py
│   │   │       │   │   ├── api.py
│   │   │       │   │   ├── base.py
│   │   │       │   │   ├── contingency_tables.py
│   │   │       │   │   ├── contrast.py
│   │   │       │   │   ├── correlation_tools.py
│   │   │       │   │   ├── descriptivestats.py
│   │   │       │   │   ├── diagnostic.py
│   │   │       │   │   ├── diagnostic_gen.py
│   │   │       │   │   ├── dist_dependence_measures.py
│   │   │       │   │   ├── effect_size.py
│   │   │       │   │   ├── gof.py
│   │   │       │   │   ├── inter_rater.py
│   │   │       │   │   ├── knockoff_regeffects.py
│   │   │       │   │   ├── mediation.py
│   │   │       │   │   ├── meta_analysis.py
│   │   │       │   │   ├── moment_helpers.py
│   │   │       │   │   ├── multicomp.py
│   │   │       │   │   ├── multitest.py
│   │   │       │   │   ├── multivariate.py
│   │   │       │   │   ├── multivariate_tools.py
│   │   │       │   │   ├── nonparametric.py
│   │   │       │   │   ├── oaxaca.py
│   │   │       │   │   ├── oneway.py
│   │   │       │   │   ├── outliers_influence.py
│   │   │       │   │   ├── power.py
│   │   │       │   │   ├── proportion.py
│   │   │       │   │   ├── rates.py
│   │   │       │   │   ├── regularized_covariance.py
│   │   │       │   │   ├── robust_compare.py
│   │   │       │   │   ├── sandwich_covariance.py
│   │   │       │   │   ├── stattools.py
│   │   │       │   │   ├── tabledist.py
│   │   │       │   │   └── weightstats.py
│   │   │       │   ├── tests/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── test_package.cpython-312.pyc
│   │   │       │   │   │   └── test_x13.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── test_package.py
│   │   │       │   │   └── test_x13.py
│   │   │       │   ├── tools/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _test_runner.cpython-312.pyc
│   │   │       │   │   │   ├── _testing.cpython-312.pyc
│   │   │       │   │   │   ├── catadd.cpython-312.pyc
│   │   │       │   │   │   ├── data.cpython-312.pyc
│   │   │       │   │   │   ├── decorators.cpython-312.pyc
│   │   │       │   │   │   ├── docstring.cpython-312.pyc
│   │   │       │   │   │   ├── eval_measures.cpython-312.pyc
│   │   │       │   │   │   ├── grouputils.cpython-312.pyc
│   │   │       │   │   │   ├── linalg.cpython-312.pyc
│   │   │       │   │   │   ├── numdiff.cpython-312.pyc
│   │   │       │   │   │   ├── parallel.cpython-312.pyc
│   │   │       │   │   │   ├── print_version.cpython-312.pyc
│   │   │       │   │   │   ├── rng_qrng.cpython-312.pyc
│   │   │       │   │   │   ├── rootfinding.cpython-312.pyc
│   │   │       │   │   │   ├── sequences.cpython-312.pyc
│   │   │       │   │   │   ├── sm_exceptions.cpython-312.pyc
│   │   │       │   │   │   ├── testing.cpython-312.pyc
│   │   │       │   │   │   ├── tools.cpython-312.pyc
│   │   │       │   │   │   ├── transform_model.cpython-312.pyc
│   │   │       │   │   │   ├── typing.cpython-312.pyc
│   │   │       │   │   │   └── web.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_catadd.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_data.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_decorators.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_docstring.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_eval_measures.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_grouputils.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_linalg.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_numdiff.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_parallel.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_rootfinding.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_sequences.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_testing.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_tools.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_transform_model.cpython-312.pyc
│   │   │       │   │   │   │   └── test_web.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_catadd.py
│   │   │       │   │   │   ├── test_data.py
│   │   │       │   │   │   ├── test_decorators.py
│   │   │       │   │   │   ├── test_docstring.py
│   │   │       │   │   │   ├── test_eval_measures.py
│   │   │       │   │   │   ├── test_grouputils.py
│   │   │       │   │   │   ├── test_linalg.py
│   │   │       │   │   │   ├── test_numdiff.py
│   │   │       │   │   │   ├── test_parallel.py
│   │   │       │   │   │   ├── test_rootfinding.py
│   │   │       │   │   │   ├── test_sequences.py
│   │   │       │   │   │   ├── test_testing.py
│   │   │       │   │   │   ├── test_tools.py
│   │   │       │   │   │   ├── test_transform_model.py
│   │   │       │   │   │   └── test_web.py
│   │   │       │   │   ├── validation/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── decorators.cpython-312.pyc
│   │   │       │   │   │   │   └── validation.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_validation.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── test_validation.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── decorators.py
│   │   │       │   │   │   └── validation.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _test_runner.py
│   │   │       │   │   ├── _testing.py
│   │   │       │   │   ├── catadd.py
│   │   │       │   │   ├── data.py
│   │   │       │   │   ├── decorators.py
│   │   │       │   │   ├── docstring.py
│   │   │       │   │   ├── eval_measures.py
│   │   │       │   │   ├── grouputils.py
│   │   │       │   │   ├── linalg.py
│   │   │       │   │   ├── numdiff.py
│   │   │       │   │   ├── parallel.py
│   │   │       │   │   ├── print_version.py
│   │   │       │   │   ├── rng_qrng.py
│   │   │       │   │   ├── rootfinding.py
│   │   │       │   │   ├── sequences.py
│   │   │       │   │   ├── sm_exceptions.py
│   │   │       │   │   ├── testing.py
│   │   │       │   │   ├── tools.py
│   │   │       │   │   ├── transform_model.py
│   │   │       │   │   ├── typing.py
│   │   │       │   │   └── web.py
│   │   │       │   ├── treatment/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   └── treatment_effects.cpython-312.pyc
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── test_teffects.cpython-312.pyc
│   │   │       │   │   │   ├── results/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── results_teffects.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── cataneo2.csv
│   │   │       │   │   │   │   └── results_teffects.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── test_teffects.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   └── treatment_effects.py
│   │   │       │   ├── tsa/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── _bds.cpython-312.pyc
│   │   │       │   │   │   ├── adfvalues.cpython-312.pyc
│   │   │       │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   ├── ar_model.cpython-312.pyc
│   │   │       │   │   │   ├── arima_model.cpython-312.pyc
│   │   │       │   │   │   ├── arima_process.cpython-312.pyc
│   │   │       │   │   │   ├── arma_mle.cpython-312.pyc
│   │   │       │   │   │   ├── coint_tables.cpython-312.pyc
│   │   │       │   │   │   ├── descriptivestats.cpython-312.pyc
│   │   │       │   │   │   ├── deterministic.cpython-312.pyc
│   │   │       │   │   │   ├── mlemodel.cpython-312.pyc
│   │   │       │   │   │   ├── seasonal.cpython-312.pyc
│   │   │       │   │   │   ├── stattools.cpython-312.pyc
│   │   │       │   │   │   ├── tsatools.cpython-312.pyc
│   │   │       │   │   │   ├── varma_process.cpython-312.pyc
│   │   │       │   │   │   └── x13.cpython-312.pyc
│   │   │       │   │   ├── ardl/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── model.cpython-312.pyc
│   │   │       │   │   │   │   └── pss_critical_values.cpython-312.pyc
│   │   │       │   │   │   ├── _pss_critical_values/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── pss-process.cpython-312.pyc
│   │   │       │   │   │   │   │   └── pss.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── pss-process.py
│   │   │       │   │   │   │   └── pss.py
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_ardl.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── test_ardl.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── model.py
│   │   │       │   │   │   └── pss_critical_values.py
│   │   │       │   │   ├── arima/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   │   ├── model.cpython-312.pyc
│   │   │       │   │   │   │   ├── params.cpython-312.pyc
│   │   │       │   │   │   │   ├── specification.cpython-312.pyc
│   │   │       │   │   │   │   └── tools.cpython-312.pyc
│   │   │       │   │   │   ├── datasets/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── brockwell_davis_2002/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── data/
│   │   │       │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   │   ├── dowj.cpython-312.pyc
│   │   │       │   │   │   │   │   │   │   ├── lake.cpython-312.pyc
│   │   │       │   │   │   │   │   │   │   ├── oshorts.cpython-312.pyc
│   │   │       │   │   │   │   │   │   │   └── sbl.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   │   ├── dowj.py
│   │   │       │   │   │   │   │   │   ├── lake.py
│   │   │       │   │   │   │   │   │   ├── oshorts.py
│   │   │       │   │   │   │   │   │   └── sbl.py
│   │   │       │   │   │   │   │   └── __init__.py
│   │   │       │   │   │   │   └── __init__.py
│   │   │       │   │   │   ├── estimators/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── burg.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── durbin_levinson.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── gls.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── hannan_rissanen.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── innovations.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── statespace.cpython-312.pyc
│   │   │       │   │   │   │   │   └── yule_walker.cpython-312.pyc
│   │   │       │   │   │   │   ├── tests/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_burg.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_durbin_levinson.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_gls.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_hannan_rissanen.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_innovations.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── test_statespace.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── test_yule_walker.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── test_burg.py
│   │   │       │   │   │   │   │   ├── test_durbin_levinson.py
│   │   │       │   │   │   │   │   ├── test_gls.py
│   │   │       │   │   │   │   │   ├── test_hannan_rissanen.py
│   │   │       │   │   │   │   │   ├── test_innovations.py
│   │   │       │   │   │   │   │   ├── test_statespace.py
│   │   │       │   │   │   │   │   └── test_yule_walker.py
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── burg.py
│   │   │       │   │   │   │   ├── durbin_levinson.py
│   │   │       │   │   │   │   ├── gls.py
│   │   │       │   │   │   │   ├── hannan_rissanen.py
│   │   │       │   │   │   │   ├── innovations.py
│   │   │       │   │   │   │   ├── statespace.py
│   │   │       │   │   │   │   └── yule_walker.py
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_model.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_params.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_specification.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_tools.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_model.py
│   │   │       │   │   │   │   ├── test_params.py
│   │   │       │   │   │   │   ├── test_specification.py
│   │   │       │   │   │   │   └── test_tools.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── api.py
│   │   │       │   │   │   ├── model.py
│   │   │       │   │   │   ├── params.py
│   │   │       │   │   │   ├── specification.py
│   │   │       │   │   │   └── tools.py
│   │   │       │   │   ├── base/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── datetools.cpython-312.pyc
│   │   │       │   │   │   │   ├── prediction.cpython-312.pyc
│   │   │       │   │   │   │   └── tsa_model.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_base.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_datetools.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_prediction.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_tsa_indexes.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_base.py
│   │   │       │   │   │   │   ├── test_datetools.py
│   │   │       │   │   │   │   ├── test_prediction.py
│   │   │       │   │   │   │   └── test_tsa_indexes.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── datetools.py
│   │   │       │   │   │   ├── prediction.py
│   │   │       │   │   │   └── tsa_model.py
│   │   │       │   │   ├── exponential_smoothing/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── base.cpython-312.pyc
│   │   │       │   │   │   │   ├── ets.cpython-312.pyc
│   │   │       │   │   │   │   └── initialization.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _ets_smooth.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── base.py
│   │   │       │   │   │   ├── ets.py
│   │   │       │   │   │   └── initialization.py
│   │   │       │   │   ├── filters/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _utils.cpython-312.pyc
│   │   │       │   │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   │   ├── bk_filter.cpython-312.pyc
│   │   │       │   │   │   │   ├── cf_filter.cpython-312.pyc
│   │   │       │   │   │   │   ├── filtertools.cpython-312.pyc
│   │   │       │   │   │   │   └── hp_filter.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_filters.cpython-312.pyc
│   │   │       │   │   │   │   ├── results/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── filter_results.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   └── filter_results.py
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── test_filters.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _utils.py
│   │   │       │   │   │   ├── api.py
│   │   │       │   │   │   ├── bk_filter.py
│   │   │       │   │   │   ├── cf_filter.py
│   │   │       │   │   │   ├── filtertools.py
│   │   │       │   │   │   └── hp_filter.py
│   │   │       │   │   ├── forecasting/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── stl.cpython-312.pyc
│   │   │       │   │   │   │   └── theta.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_stl.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_theta.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_stl.py
│   │   │       │   │   │   │   └── test_theta.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── stl.py
│   │   │       │   │   │   └── theta.py
│   │   │       │   │   ├── holtwinters/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _smoothers.cpython-312.pyc
│   │   │       │   │   │   │   ├── model.cpython-312.pyc
│   │   │       │   │   │   │   └── results.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_holtwinters.cpython-312.pyc
│   │   │       │   │   │   │   ├── results/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   └── housing-data.csv
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── test_holtwinters.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _exponential_smoothers.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _smoothers.py
│   │   │       │   │   │   ├── model.py
│   │   │       │   │   │   └── results.py
│   │   │       │   │   ├── innovations/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   │   └── arma_innovations.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_arma_innovations.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_cython_arma_innovations_fast.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_arma_innovations.py
│   │   │       │   │   │   │   └── test_cython_arma_innovations_fast.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _arma_innovations.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── api.py
│   │   │       │   │   │   └── arma_innovations.py
│   │   │       │   │   ├── interp/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── denton.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_denton.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   └── test_denton.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   └── denton.py
│   │   │       │   │   ├── regime_switching/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── markov_autoregression.cpython-312.pyc
│   │   │       │   │   │   │   ├── markov_regression.cpython-312.pyc
│   │   │       │   │   │   │   └── markov_switching.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_markov_autoregression.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_markov_regression.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_markov_switching.cpython-312.pyc
│   │   │       │   │   │   │   ├── results/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── mar_filardo.csv
│   │   │       │   │   │   │   │   ├── results_predict_fedfunds.csv
│   │   │       │   │   │   │   │   └── results_predict_rgnp.csv
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_markov_autoregression.py
│   │   │       │   │   │   │   ├── test_markov_regression.py
│   │   │       │   │   │   │   └── test_markov_switching.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _hamilton_filter.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _kim_smoother.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── markov_autoregression.py
│   │   │       │   │   │   ├── markov_regression.py
│   │   │       │   │   │   └── markov_switching.py
│   │   │       │   │   ├── statespace/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _pykalman_smoother.cpython-312.pyc
│   │   │       │   │   │   │   ├── _quarterly_ar1.cpython-312.pyc
│   │   │       │   │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   │   ├── cfa_simulation_smoother.cpython-312.pyc
│   │   │       │   │   │   │   ├── dynamic_factor.cpython-312.pyc
│   │   │       │   │   │   │   ├── dynamic_factor_mq.cpython-312.pyc
│   │   │       │   │   │   │   ├── exponential_smoothing.cpython-312.pyc
│   │   │       │   │   │   │   ├── initialization.cpython-312.pyc
│   │   │       │   │   │   │   ├── kalman_filter.cpython-312.pyc
│   │   │       │   │   │   │   ├── kalman_smoother.cpython-312.pyc
│   │   │       │   │   │   │   ├── mlemodel.cpython-312.pyc
│   │   │       │   │   │   │   ├── news.cpython-312.pyc
│   │   │       │   │   │   │   ├── representation.cpython-312.pyc
│   │   │       │   │   │   │   ├── sarimax.cpython-312.pyc
│   │   │       │   │   │   │   ├── simulation_smoother.cpython-312.pyc
│   │   │       │   │   │   │   ├── structural.cpython-312.pyc
│   │   │       │   │   │   │   ├── tools.cpython-312.pyc
│   │   │       │   │   │   │   └── varmax.cpython-312.pyc
│   │   │       │   │   │   ├── _filters/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── _conventional.cp312-win_amd64.pyd
│   │   │       │   │   │   │   ├── _inversions.cp312-win_amd64.pyd
│   │   │       │   │   │   │   ├── _univariate.cp312-win_amd64.pyd
│   │   │       │   │   │   │   └── _univariate_diffuse.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _smoothers/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── _alternative.cp312-win_amd64.pyd
│   │   │       │   │   │   │   ├── _classical.cp312-win_amd64.pyd
│   │   │       │   │   │   │   ├── _conventional.cp312-win_amd64.pyd
│   │   │       │   │   │   │   ├── _univariate.cp312-win_amd64.pyd
│   │   │       │   │   │   │   └── _univariate_diffuse.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── kfas_helpers.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_cfa_simulation_smoothing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_cfa_tvpvar.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_chandrasekhar.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_collapsed.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_concentrated.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_conserve_memory.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_decompose.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_dynamic_factor.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_dynamic_factor_mq.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_dynamic_factor_mq_frbny_nowcast.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_dynamic_factor_mq_monte_carlo.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_exact_diffuse_filtering.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_exponential_smoothing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_fixed_params.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_forecasting.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_impulse_responses.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_initialization.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_kalman.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_mlemodel.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_models.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_multivariate_switch_univariate.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_news.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_options.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_pickle.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_prediction.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_representation.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_sarimax.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_save.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_simulate.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_simulation_smoothing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_smoothing.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_structural.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_tools.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_univariate.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_var.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_varmax.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_weights.cpython-312.pyc
│   │   │       │   │   │   │   ├── results/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── results_dynamic_factor.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── results_kalman_filter.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── results_sarimax.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── results_structural.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── results_var_R.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── results_var_misc.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── results_varmax.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── frbny_nowcast/
│   │   │       │   │   │   │   │   │   ├── Nowcasting/
│   │   │       │   │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   │   ├── data/
│   │   │       │   │   │   │   │   │   │   │   ├── US/
│   │   │       │   │   │   │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   │   │   │   ├── 2016-06-29.csv
│   │   │       │   │   │   │   │   │   │   │   │   ├── 2016-07-29.csv
│   │   │       │   │   │   │   │   │   │   │   │   └── __init__.py
│   │   │       │   │   │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   │   │   └── __init__.py
│   │   │       │   │   │   │   │   │   │   ├── functions/
│   │   │       │   │   │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   │   │   └── __init__.py
│   │   │       │   │   │   │   │   │   │   └── __init__.py
│   │   │       │   │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   │   ├── test_dfm_111.mat
│   │   │       │   │   │   │   │   │   ├── test_dfm_112.mat
│   │   │       │   │   │   │   │   │   ├── test_dfm_11F.mat
│   │   │       │   │   │   │   │   │   ├── test_dfm_221.mat
│   │   │       │   │   │   │   │   │   ├── test_dfm_222.mat
│   │   │       │   │   │   │   │   │   ├── test_dfm_22F.mat
│   │   │       │   │   │   │   │   │   ├── test_dfm_blocks_111.mat
│   │   │       │   │   │   │   │   │   ├── test_dfm_blocks_112.mat
│   │   │       │   │   │   │   │   │   ├── test_dfm_blocks_221.mat
│   │   │       │   │   │   │   │   │   ├── test_dfm_blocks_222.mat
│   │   │       │   │   │   │   │   │   ├── test_news_112.mat
│   │   │       │   │   │   │   │   │   ├── test_news_222.mat
│   │   │       │   │   │   │   │   │   ├── test_news_blocks_112.mat
│   │   │       │   │   │   │   │   │   └── test_news_blocks_222.mat
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── cfa_tvpvar_Omega_11.csv
│   │   │       │   │   │   │   │   ├── cfa_tvpvar_Omega_22.csv
│   │   │       │   │   │   │   │   ├── cfa_tvpvar_S10.csv
│   │   │       │   │   │   │   │   ├── cfa_tvpvar_Si0.csv
│   │   │       │   │   │   │   │   ├── cfa_tvpvar_beta.csv
│   │   │       │   │   │   │   │   ├── cfa_tvpvar_invP.csv
│   │   │       │   │   │   │   │   ├── cfa_tvpvar_posterior_mean.csv
│   │   │       │   │   │   │   │   ├── cfa_tvpvar_state_variates.csv
│   │   │       │   │   │   │   │   ├── cfa_tvpvar_v10.csv
│   │   │       │   │   │   │   │   ├── cfa_tvpvar_vi0.csv
│   │   │       │   │   │   │   │   ├── clark1989.csv
│   │   │       │   │   │   │   │   ├── exponential_smoothing_params.csv
│   │   │       │   │   │   │   │   ├── exponential_smoothing_predict.csv
│   │   │       │   │   │   │   │   ├── exponential_smoothing_states.csv
│   │   │       │   │   │   │   │   ├── manufac.dta
│   │   │       │   │   │   │   │   ├── results_clark1989_R.csv
│   │   │       │   │   │   │   │   ├── results_dynamic_factor.py
│   │   │       │   │   │   │   │   ├── results_dynamic_factor_stata.csv
│   │   │       │   │   │   │   │   ├── results_exact_initial_common_level_R.csv
│   │   │       │   │   │   │   │   ├── results_exact_initial_common_level_restricted_R.csv
│   │   │       │   │   │   │   │   ├── results_exact_initial_dfm_R.csv
│   │   │       │   │   │   │   │   ├── results_exact_initial_local_level_R.csv
│   │   │       │   │   │   │   │   ├── results_exact_initial_local_linear_trend_R.csv
│   │   │       │   │   │   │   │   ├── results_exact_initial_local_linear_trend_missing_R.csv
│   │   │       │   │   │   │   │   ├── results_exact_initial_var1_R.csv
│   │   │       │   │   │   │   │   ├── results_exact_initial_var1_measurement_error_R.csv
│   │   │       │   │   │   │   │   ├── results_exact_initial_var1_missing_R.csv
│   │   │       │   │   │   │   │   ├── results_exact_initial_var1_mixed_R.csv
│   │   │       │   │   │   │   │   ├── results_intercepts_R.csv
│   │   │       │   │   │   │   │   ├── results_kalman_filter.py
│   │   │       │   │   │   │   │   ├── results_realgdpar_stata.csv
│   │   │       │   │   │   │   │   ├── results_sarimax.py
│   │   │       │   │   │   │   │   ├── results_sarimax_coverage.csv
│   │   │       │   │   │   │   │   ├── results_simulation_smoothing0.csv
│   │   │       │   │   │   │   │   ├── results_simulation_smoothing1.csv
│   │   │       │   │   │   │   │   ├── results_simulation_smoothing2.csv
│   │   │       │   │   │   │   │   ├── results_simulation_smoothing3.csv
│   │   │       │   │   │   │   │   ├── results_simulation_smoothing3_variates.csv
│   │   │       │   │   │   │   │   ├── results_simulation_smoothing4.csv
│   │   │       │   │   │   │   │   ├── results_simulation_smoothing5.csv
│   │   │       │   │   │   │   │   ├── results_simulation_smoothing6.csv
│   │   │       │   │   │   │   │   ├── results_smoothing2_R.csv
│   │   │       │   │   │   │   │   ├── results_smoothing3_R.csv
│   │   │       │   │   │   │   │   ├── results_smoothing_R.csv
│   │   │       │   │   │   │   │   ├── results_smoothing_generalobscov_R.csv
│   │   │       │   │   │   │   │   ├── results_structural.py
│   │   │       │   │   │   │   │   ├── results_var_R.py
│   │   │       │   │   │   │   │   ├── results_var_R_output.csv
│   │   │       │   │   │   │   │   ├── results_var_misc.py
│   │   │       │   │   │   │   │   ├── results_var_stata.csv
│   │   │       │   │   │   │   │   ├── results_varmax.py
│   │   │       │   │   │   │   │   ├── results_varmax_stata.csv
│   │   │       │   │   │   │   │   ├── results_wpi1_ar3_matlab_ssm.csv
│   │   │       │   │   │   │   │   ├── results_wpi1_ar3_stata.csv
│   │   │       │   │   │   │   │   ├── results_wpi1_missing_ar3_matlab_ssm.csv
│   │   │       │   │   │   │   │   └── sm-0.9-sarimax.pkl
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── kfas_helpers.py
│   │   │       │   │   │   │   ├── test_cfa_simulation_smoothing.py
│   │   │       │   │   │   │   ├── test_cfa_tvpvar.py
│   │   │       │   │   │   │   ├── test_chandrasekhar.py
│   │   │       │   │   │   │   ├── test_collapsed.py
│   │   │       │   │   │   │   ├── test_concentrated.py
│   │   │       │   │   │   │   ├── test_conserve_memory.py
│   │   │       │   │   │   │   ├── test_decompose.py
│   │   │       │   │   │   │   ├── test_dynamic_factor.py
│   │   │       │   │   │   │   ├── test_dynamic_factor_mq.py
│   │   │       │   │   │   │   ├── test_dynamic_factor_mq_frbny_nowcast.py
│   │   │       │   │   │   │   ├── test_dynamic_factor_mq_monte_carlo.py
│   │   │       │   │   │   │   ├── test_exact_diffuse_filtering.py
│   │   │       │   │   │   │   ├── test_exponential_smoothing.py
│   │   │       │   │   │   │   ├── test_fixed_params.py
│   │   │       │   │   │   │   ├── test_forecasting.py
│   │   │       │   │   │   │   ├── test_impulse_responses.py
│   │   │       │   │   │   │   ├── test_initialization.py
│   │   │       │   │   │   │   ├── test_kalman.py
│   │   │       │   │   │   │   ├── test_mlemodel.py
│   │   │       │   │   │   │   ├── test_models.py
│   │   │       │   │   │   │   ├── test_multivariate_switch_univariate.py
│   │   │       │   │   │   │   ├── test_news.py
│   │   │       │   │   │   │   ├── test_options.py
│   │   │       │   │   │   │   ├── test_pickle.py
│   │   │       │   │   │   │   ├── test_prediction.py
│   │   │       │   │   │   │   ├── test_representation.py
│   │   │       │   │   │   │   ├── test_sarimax.py
│   │   │       │   │   │   │   ├── test_save.py
│   │   │       │   │   │   │   ├── test_simulate.py
│   │   │       │   │   │   │   ├── test_simulation_smoothing.py
│   │   │       │   │   │   │   ├── test_smoothing.py
│   │   │       │   │   │   │   ├── test_structural.py
│   │   │       │   │   │   │   ├── test_tools.py
│   │   │       │   │   │   │   ├── test_univariate.py
│   │   │       │   │   │   │   ├── test_var.py
│   │   │       │   │   │   │   ├── test_varmax.py
│   │   │       │   │   │   │   └── test_weights.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _cfa_simulation_smoother.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _initialization.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _kalman_filter.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _kalman_smoother.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _pykalman_smoother.py
│   │   │       │   │   │   ├── _quarterly_ar1.py
│   │   │       │   │   │   ├── _representation.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _simulation_smoother.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── _tools.cp312-win_amd64.pyd
│   │   │       │   │   │   ├── api.py
│   │   │       │   │   │   ├── cfa_simulation_smoother.py
│   │   │       │   │   │   ├── dynamic_factor.py
│   │   │       │   │   │   ├── dynamic_factor_mq.py
│   │   │       │   │   │   ├── exponential_smoothing.py
│   │   │       │   │   │   ├── initialization.py
│   │   │       │   │   │   ├── kalman_filter.py
│   │   │       │   │   │   ├── kalman_smoother.py
│   │   │       │   │   │   ├── mlemodel.py
│   │   │       │   │   │   ├── news.py
│   │   │       │   │   │   ├── representation.py
│   │   │       │   │   │   ├── sarimax.py
│   │   │       │   │   │   ├── simulation_smoother.py
│   │   │       │   │   │   ├── structural.py
│   │   │       │   │   │   ├── tools.py
│   │   │       │   │   │   └── varmax.py
│   │   │       │   │   ├── stl/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   └── mstl.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_mstl.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_stl.cpython-312.pyc
│   │   │       │   │   │   │   ├── results/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── mstl_elec_vic.csv
│   │   │       │   │   │   │   │   ├── mstl_test_results.csv
│   │   │       │   │   │   │   │   ├── stl_co2.csv
│   │   │       │   │   │   │   │   └── stl_test_results.csv
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── test_mstl.py
│   │   │       │   │   │   │   └── test_stl.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _stl.cp312-win_amd64.pyd
│   │   │       │   │   │   └── mstl.py
│   │   │       │   │   ├── tests/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_adfuller_lag.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_ar.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_arima_process.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_bds.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_deterministic.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_exponential_smoothing.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_seasonal.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_stattools.cpython-312.pyc
│   │   │       │   │   │   │   ├── test_tsa_tools.cpython-312.pyc
│   │   │       │   │   │   │   └── test_x13.cpython-312.pyc
│   │   │       │   │   │   ├── results/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── arima111_css_results.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── arima111_results.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── arima111nc_css_results.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── arima111nc_results.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── arima112_css_results.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── arima112_results.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── arima112nc_css_results.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── arima112nc_results.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── arima211_css_results.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── arima211_results.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── arima211nc_css_results.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── arima211nc_results.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── datamlw_tls.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── make_arma.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_ar.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_arima.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_arma.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_arma_acf.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── results_process.cpython-312.pyc
│   │   │       │   │   │   │   │   └── savedrvs.cpython-312.pyc
│   │   │       │   │   │   │   ├── ARMLEConstantPredict.csv
│   │   │       │   │   │   │   ├── AROLSConstantPredict.csv
│   │   │       │   │   │   │   ├── AROLSNoConstantPredict.csv
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── arima111_css_results.py
│   │   │       │   │   │   │   ├── arima111_forecasts.csv
│   │   │       │   │   │   │   ├── arima111_results.py
│   │   │       │   │   │   │   ├── arima111nc_css_results.py
│   │   │       │   │   │   │   ├── arima111nc_results.py
│   │   │       │   │   │   │   ├── arima112_css_results.py
│   │   │       │   │   │   │   ├── arima112_results.py
│   │   │       │   │   │   │   ├── arima112nc_css_results.py
│   │   │       │   │   │   │   ├── arima112nc_results.py
│   │   │       │   │   │   │   ├── arima211_css_results.py
│   │   │       │   │   │   │   ├── arima211_results.py
│   │   │       │   │   │   │   ├── arima211nc_css_results.py
│   │   │       │   │   │   │   ├── arima211nc_results.py
│   │   │       │   │   │   │   ├── arima212_forecast.csv
│   │   │       │   │   │   │   ├── bds_data.csv
│   │   │       │   │   │   │   ├── bds_results.csv
│   │   │       │   │   │   │   ├── datamlw_tls.py
│   │   │       │   │   │   │   ├── fit_ets_results.json
│   │   │       │   │   │   │   ├── fit_ets_results_nonseasonal.json
│   │   │       │   │   │   │   ├── fit_ets_results_seasonal.json
│   │   │       │   │   │   │   ├── gnpdef.csv
│   │   │       │   │   │   │   ├── lutkepohl2.dta
│   │   │       │   │   │   │   ├── make_arma.py
│   │   │       │   │   │   │   ├── rand10000.csv
│   │   │       │   │   │   │   ├── resids_css_c.csv
│   │   │       │   │   │   │   ├── resids_css_nc.csv
│   │   │       │   │   │   │   ├── resids_exact_c.csv
│   │   │       │   │   │   │   ├── resids_exact_nc.csv
│   │   │       │   │   │   │   ├── results_ar.py
│   │   │       │   │   │   │   ├── results_ar_forecast_mle_dynamic.csv
│   │   │       │   │   │   │   ├── results_arima.py
│   │   │       │   │   │   │   ├── results_arima_exog_forecasts_css.csv
│   │   │       │   │   │   │   ├── results_arima_exog_forecasts_mle.csv
│   │   │       │   │   │   │   ├── results_arima_forecasts.csv
│   │   │       │   │   │   │   ├── results_arima_forecasts_all_css.csv
│   │   │       │   │   │   │   ├── results_arima_forecasts_all_css_diff.csv
│   │   │       │   │   │   │   ├── results_arima_forecasts_all_mle.csv
│   │   │       │   │   │   │   ├── results_arima_forecasts_all_mle_diff.csv
│   │   │       │   │   │   │   ├── results_arma.py
│   │   │       │   │   │   │   ├── results_arma_acf.py
│   │   │       │   │   │   │   ├── results_arma_forecasts.csv
│   │   │       │   │   │   │   ├── results_ccf.csv
│   │   │       │   │   │   │   ├── results_corrgram.csv
│   │   │       │   │   │   │   ├── results_process.py
│   │   │       │   │   │   │   ├── rgnp.csv
│   │   │       │   │   │   │   ├── rgnpq.csv
│   │   │       │   │   │   │   ├── savedrvs.py
│   │   │       │   │   │   │   ├── stkprc.csv
│   │   │       │   │   │   │   ├── y_arma_data.csv
│   │   │       │   │   │   │   ├── yhat_css_c.csv
│   │   │       │   │   │   │   ├── yhat_css_nc.csv
│   │   │       │   │   │   │   ├── yhat_exact_c.csv
│   │   │       │   │   │   │   └── yhat_exact_nc.csv
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── test_adfuller_lag.py
│   │   │       │   │   │   ├── test_ar.py
│   │   │       │   │   │   ├── test_arima_process.py
│   │   │       │   │   │   ├── test_bds.py
│   │   │       │   │   │   ├── test_deterministic.py
│   │   │       │   │   │   ├── test_exponential_smoothing.py
│   │   │       │   │   │   ├── test_seasonal.py
│   │   │       │   │   │   ├── test_stattools.py
│   │   │       │   │   │   ├── test_tsa_tools.py
│   │   │       │   │   │   └── test_x13.py
│   │   │       │   │   ├── vector_ar/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── api.cpython-312.pyc
│   │   │       │   │   │   │   ├── hypothesis_test_results.cpython-312.pyc
│   │   │       │   │   │   │   ├── irf.cpython-312.pyc
│   │   │       │   │   │   │   ├── output.cpython-312.pyc
│   │   │       │   │   │   │   ├── plotting.cpython-312.pyc
│   │   │       │   │   │   │   ├── svar_model.cpython-312.pyc
│   │   │       │   │   │   │   ├── util.cpython-312.pyc
│   │   │       │   │   │   │   ├── var_model.cpython-312.pyc
│   │   │       │   │   │   │   └── vecm.cpython-312.pyc
│   │   │       │   │   │   ├── tests/
│   │   │       │   │   │   │   ├── JMulTi_results/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── parse_jmulti_var_output.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── parse_jmulti_vecm_output.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_c.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_c_Sigmau.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_c_diag.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_c_fc5.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_c_granger_causality_realcons.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_c_granger_causality_realcons_realgdp.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_c_granger_causality_realcons_realinv.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_c_granger_causality_realgdp.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_c_granger_causality_realgdp_realinv.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_c_granger_causality_realinv.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_c_ir.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_c_lagorder.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cs.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cs_Sigmau.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cs_diag.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cs_fc5.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cs_granger_causality_realcons.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cs_granger_causality_realcons_realgdp.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cs_granger_causality_realcons_realinv.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cs_granger_causality_realgdp.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cs_granger_causality_realgdp_realinv.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cs_granger_causality_realinv.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cs_ir.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cs_lagorder.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cst.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cst_Sigmau.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cst_diag.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cst_fc5.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cst_granger_causality_realcons.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cst_granger_causality_realcons_realgdp.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cst_granger_causality_realcons_realinv.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cst_granger_causality_realgdp.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cst_granger_causality_realgdp_realinv.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cst_granger_causality_realinv.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cst_ir.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_cst_lagorder.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ct.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ct_Sigmau.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ct_diag.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ct_fc5.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ct_granger_causality_realcons.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ct_granger_causality_realcons_realgdp.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ct_granger_causality_realcons_realinv.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ct_granger_causality_realgdp.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ct_granger_causality_realgdp_realinv.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ct_granger_causality_realinv.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ct_ir.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ct_lagorder.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_nc.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_nc_Sigmau.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_nc_diag.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_nc_fc5.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_nc_granger_causality_realcons.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_nc_granger_causality_realcons_realgdp.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_nc_granger_causality_realcons_realinv.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_nc_granger_causality_realgdp.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_nc_granger_causality_realgdp_realinv.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_nc_granger_causality_realinv.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_nc_ir.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_nc_lagorder.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ncs.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ncs_Sigmau.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ncs_diag.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ncs_fc5.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ncs_granger_causality_realcons.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ncs_granger_causality_realcons_realgdp.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ncs_granger_causality_realcons_realinv.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ncs_granger_causality_realgdp.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ncs_granger_causality_realgdp_realinv.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ncs_granger_causality_realinv.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ncs_ir.txt
│   │   │       │   │   │   │   │   ├── macrodata_jmulti_ncs_lagorder.txt
│   │   │       │   │   │   │   │   ├── parse_jmulti_var_output.py
│   │   │       │   │   │   │   │   ├── parse_jmulti_vecm_output.py
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_ci.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_ci_Sigmau.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_ci_diag.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_ci_fc5.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_ci_granger_causality_dp_r.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_ci_granger_causality_r_dp.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_ci_inst_causality_dp_r.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_ci_inst_causality_r_dp.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_ci_ir.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_ci_lagorder.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cili.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cili_Sigmau.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cili_diag.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cili_fc5.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cili_granger_causality_dp_r.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cili_granger_causality_r_dp.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cili_inst_causality_dp_r.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cili_inst_causality_r_dp.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cili_ir.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cili_lagorder.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cis.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cis_Sigmau.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cis_diag.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cis_fc5.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cis_granger_causality_dp_r.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cis_granger_causality_r_dp.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cis_inst_causality_dp_r.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cis_inst_causality_r_dp.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cis_ir.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cis_lagorder.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cisli.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cisli_Sigmau.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cisli_diag.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cisli_fc5.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cisli_granger_causality_dp_r.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cisli_granger_causality_r_dp.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cisli_inst_causality_dp_r.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cisli_inst_causality_r_dp.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cisli_ir.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cisli_lagorder.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_co.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_co_Sigmau.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_co_diag.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_co_fc5.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_co_granger_causality_dp_r.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_co_granger_causality_r_dp.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_co_inst_causality_dp_r.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_co_inst_causality_r_dp.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_co_ir.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_co_lagorder.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_colo.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_colo_Sigmau.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_colo_diag.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_colo_fc5.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_colo_granger_causality_dp_r.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_colo_granger_causality_r_dp.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_colo_inst_causality_dp_r.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_colo_inst_causality_r_dp.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_colo_ir.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_colo_lagorder.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cos.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cos_Sigmau.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cos_diag.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cos_fc5.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cos_granger_causality_dp_r.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cos_granger_causality_r_dp.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cos_inst_causality_dp_r.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cos_inst_causality_r_dp.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cos_ir.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_cos_lagorder.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_coslo.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_coslo_Sigmau.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_coslo_diag.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_coslo_fc5.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_coslo_granger_causality_dp_r.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_coslo_granger_causality_r_dp.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_coslo_inst_causality_dp_r.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_coslo_inst_causality_r_dp.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_coslo_ir.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_coslo_lagorder.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_nc.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_nc_Sigmau.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_nc_diag.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_nc_fc5.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_nc_granger_causality_dp_r.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_nc_granger_causality_r_dp.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_nc_inst_causality_dp_r.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_nc_inst_causality_r_dp.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_nc_ir.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_nc_lagorder.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_ncs.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_ncs_Sigmau.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_ncs_diag.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_ncs_fc5.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_ncs_granger_causality_dp_r.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_ncs_granger_causality_r_dp.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_ncs_inst_causality_dp_r.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_ncs_inst_causality_r_dp.txt
│   │   │       │   │   │   │   │   ├── vecm_e6_jmulti_ncs_ir.txt
│   │   │       │   │   │   │   │   └── vecm_e6_jmulti_ncs_lagorder.txt
│   │   │       │   │   │   │   ├── Matlab_results/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   └── test_coint.csv
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── example_svar.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_coint.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_svar.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_var.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── test_var_jmulti.cpython-312.pyc
│   │   │       │   │   │   │   │   └── test_vecm.cpython-312.pyc
│   │   │       │   │   │   │   ├── results/
│   │   │       │   │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── results_svar.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── results_svar_st.cpython-312.pyc
│   │   │       │   │   │   │   │   │   ├── results_var.cpython-312.pyc
│   │   │       │   │   │   │   │   │   └── results_var_data.cpython-312.pyc
│   │   │       │   │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   │   ├── e1.dat
│   │   │       │   │   │   │   │   ├── e2.dat
│   │   │       │   │   │   │   │   ├── e3.dat
│   │   │       │   │   │   │   │   ├── e4.dat
│   │   │       │   │   │   │   │   ├── e5.dat
│   │   │       │   │   │   │   │   ├── e6.dat
│   │   │       │   │   │   │   │   ├── results_svar.py
│   │   │       │   │   │   │   │   ├── results_svar_st.py
│   │   │       │   │   │   │   │   ├── results_var.py
│   │   │       │   │   │   │   │   ├── results_var_data.py
│   │   │       │   │   │   │   │   └── vars_results.npz
│   │   │       │   │   │   │   ├── __init__.py
│   │   │       │   │   │   │   ├── example_svar.py
│   │   │       │   │   │   │   ├── test_coint.py
│   │   │       │   │   │   │   ├── test_svar.py
│   │   │       │   │   │   │   ├── test_var.py
│   │   │       │   │   │   │   ├── test_var_jmulti.py
│   │   │       │   │   │   │   └── test_vecm.py
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── api.py
│   │   │       │   │   │   ├── hypothesis_test_results.py
│   │   │       │   │   │   ├── irf.py
│   │   │       │   │   │   ├── output.py
│   │   │       │   │   │   ├── plotting.py
│   │   │       │   │   │   ├── svar_model.py
│   │   │       │   │   │   ├── util.py
│   │   │       │   │   │   ├── var_model.py
│   │   │       │   │   │   └── vecm.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── _bds.py
│   │   │       │   │   ├── _innovations.cp312-win_amd64.pyd
│   │   │       │   │   ├── adfvalues.py
│   │   │       │   │   ├── api.py
│   │   │       │   │   ├── ar_model.py
│   │   │       │   │   ├── arima_model.py
│   │   │       │   │   ├── arima_process.py
│   │   │       │   │   ├── arma_mle.py
│   │   │       │   │   ├── coint_tables.py
│   │   │       │   │   ├── descriptivestats.py
│   │   │       │   │   ├── deterministic.py
│   │   │       │   │   ├── mlemodel.py
│   │   │       │   │   ├── seasonal.py
│   │   │       │   │   ├── stattools.py
│   │   │       │   │   ├── tsatools.py
│   │   │       │   │   ├── varma_process.py
│   │   │       │   │   └── x13.py
│   │   │       │   ├── LICENSE.txt
│   │   │       │   ├── __init__.py
│   │   │       │   ├── _version.py
│   │   │       │   ├── api.py
│   │   │       │   ├── conftest.py
│   │   │       │   └── setup.cfg
│   │   │       ├── statsmodels-0.14.6.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE.txt
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── WHEEL
│   │   │       │   └── top_level.txt
│   │   │       ├── threadpoolctl-3.6.0.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   └── WHEEL
│   │   │       ├── typing_extensions-4.15.0.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   └── WHEEL
│   │   │       ├── typing_inspection/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── introspection.cpython-312.pyc
│   │   │       │   │   └── typing_objects.cpython-312.pyc
│   │   │       │   ├── __init__.py
│   │   │       │   ├── introspection.py
│   │   │       │   ├── py.typed
│   │   │       │   ├── typing_objects.py
│   │   │       │   └── typing_objects.pyi
│   │   │       ├── typing_inspection-0.4.2.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   └── WHEEL
│   │   │       ├── tzdata/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   └── __init__.cpython-312.pyc
│   │   │       │   ├── zoneinfo/
│   │   │       │   │   ├── Africa/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── Abidjan
│   │   │       │   │   │   ├── Accra
│   │   │       │   │   │   ├── Addis_Ababa
│   │   │       │   │   │   ├── Algiers
│   │   │       │   │   │   ├── Asmara
│   │   │       │   │   │   ├── Asmera
│   │   │       │   │   │   ├── Bamako
│   │   │       │   │   │   ├── Bangui
│   │   │       │   │   │   ├── Banjul
│   │   │       │   │   │   ├── Bissau
│   │   │       │   │   │   ├── Blantyre
│   │   │       │   │   │   ├── Brazzaville
│   │   │       │   │   │   ├── Bujumbura
│   │   │       │   │   │   ├── Cairo
│   │   │       │   │   │   ├── Casablanca
│   │   │       │   │   │   ├── Ceuta
│   │   │       │   │   │   ├── Conakry
│   │   │       │   │   │   ├── Dakar
│   │   │       │   │   │   ├── Dar_es_Salaam
│   │   │       │   │   │   ├── Djibouti
│   │   │       │   │   │   ├── Douala
│   │   │       │   │   │   ├── El_Aaiun
│   │   │       │   │   │   ├── Freetown
│   │   │       │   │   │   ├── Gaborone
│   │   │       │   │   │   ├── Harare
│   │   │       │   │   │   ├── Johannesburg
│   │   │       │   │   │   ├── Juba
│   │   │       │   │   │   ├── Kampala
│   │   │       │   │   │   ├── Khartoum
│   │   │       │   │   │   ├── Kigali
│   │   │       │   │   │   ├── Kinshasa
│   │   │       │   │   │   ├── Lagos
│   │   │       │   │   │   ├── Libreville
│   │   │       │   │   │   ├── Lome
│   │   │       │   │   │   ├── Luanda
│   │   │       │   │   │   ├── Lubumbashi
│   │   │       │   │   │   ├── Lusaka
│   │   │       │   │   │   ├── Malabo
│   │   │       │   │   │   ├── Maputo
│   │   │       │   │   │   ├── Maseru
│   │   │       │   │   │   ├── Mbabane
│   │   │       │   │   │   ├── Mogadishu
│   │   │       │   │   │   ├── Monrovia
│   │   │       │   │   │   ├── Nairobi
│   │   │       │   │   │   ├── Ndjamena
│   │   │       │   │   │   ├── Niamey
│   │   │       │   │   │   ├── Nouakchott
│   │   │       │   │   │   ├── Ouagadougou
│   │   │       │   │   │   ├── Porto-Novo
│   │   │       │   │   │   ├── Sao_Tome
│   │   │       │   │   │   ├── Timbuktu
│   │   │       │   │   │   ├── Tripoli
│   │   │       │   │   │   ├── Tunis
│   │   │       │   │   │   ├── Windhoek
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── America/
│   │   │       │   │   │   ├── Argentina/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── Buenos_Aires
│   │   │       │   │   │   │   ├── Catamarca
│   │   │       │   │   │   │   ├── ComodRivadavia
│   │   │       │   │   │   │   ├── Cordoba
│   │   │       │   │   │   │   ├── Jujuy
│   │   │       │   │   │   │   ├── La_Rioja
│   │   │       │   │   │   │   ├── Mendoza
│   │   │       │   │   │   │   ├── Rio_Gallegos
│   │   │       │   │   │   │   ├── Salta
│   │   │       │   │   │   │   ├── San_Juan
│   │   │       │   │   │   │   ├── San_Luis
│   │   │       │   │   │   │   ├── Tucuman
│   │   │       │   │   │   │   ├── Ushuaia
│   │   │       │   │   │   │   └── __init__.py
│   │   │       │   │   │   ├── Indiana/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── Indianapolis
│   │   │       │   │   │   │   ├── Knox
│   │   │       │   │   │   │   ├── Marengo
│   │   │       │   │   │   │   ├── Petersburg
│   │   │       │   │   │   │   ├── Tell_City
│   │   │       │   │   │   │   ├── Vevay
│   │   │       │   │   │   │   ├── Vincennes
│   │   │       │   │   │   │   ├── Winamac
│   │   │       │   │   │   │   └── __init__.py
│   │   │       │   │   │   ├── Kentucky/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── Louisville
│   │   │       │   │   │   │   ├── Monticello
│   │   │       │   │   │   │   └── __init__.py
│   │   │       │   │   │   ├── North_Dakota/
│   │   │       │   │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── Beulah
│   │   │       │   │   │   │   ├── Center
│   │   │       │   │   │   │   ├── New_Salem
│   │   │       │   │   │   │   └── __init__.py
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── Adak
│   │   │       │   │   │   ├── Anchorage
│   │   │       │   │   │   ├── Anguilla
│   │   │       │   │   │   ├── Antigua
│   │   │       │   │   │   ├── Araguaina
│   │   │       │   │   │   ├── Aruba
│   │   │       │   │   │   ├── Asuncion
│   │   │       │   │   │   ├── Atikokan
│   │   │       │   │   │   ├── Atka
│   │   │       │   │   │   ├── Bahia
│   │   │       │   │   │   ├── Bahia_Banderas
│   │   │       │   │   │   ├── Barbados
│   │   │       │   │   │   ├── Belem
│   │   │       │   │   │   ├── Belize
│   │   │       │   │   │   ├── Blanc-Sablon
│   │   │       │   │   │   ├── Boa_Vista
│   │   │       │   │   │   ├── Bogota
│   │   │       │   │   │   ├── Boise
│   │   │       │   │   │   ├── Buenos_Aires
│   │   │       │   │   │   ├── Cambridge_Bay
│   │   │       │   │   │   ├── Campo_Grande
│   │   │       │   │   │   ├── Cancun
│   │   │       │   │   │   ├── Caracas
│   │   │       │   │   │   ├── Catamarca
│   │   │       │   │   │   ├── Cayenne
│   │   │       │   │   │   ├── Cayman
│   │   │       │   │   │   ├── Chicago
│   │   │       │   │   │   ├── Chihuahua
│   │   │       │   │   │   ├── Ciudad_Juarez
│   │   │       │   │   │   ├── Coral_Harbour
│   │   │       │   │   │   ├── Cordoba
│   │   │       │   │   │   ├── Costa_Rica
│   │   │       │   │   │   ├── Coyhaique
│   │   │       │   │   │   ├── Creston
│   │   │       │   │   │   ├── Cuiaba
│   │   │       │   │   │   ├── Curacao
│   │   │       │   │   │   ├── Danmarkshavn
│   │   │       │   │   │   ├── Dawson
│   │   │       │   │   │   ├── Dawson_Creek
│   │   │       │   │   │   ├── Denver
│   │   │       │   │   │   ├── Detroit
│   │   │       │   │   │   ├── Dominica
│   │   │       │   │   │   ├── Edmonton
│   │   │       │   │   │   ├── Eirunepe
│   │   │       │   │   │   ├── El_Salvador
│   │   │       │   │   │   ├── Ensenada
│   │   │       │   │   │   ├── Fort_Nelson
│   │   │       │   │   │   ├── Fort_Wayne
│   │   │       │   │   │   ├── Fortaleza
│   │   │       │   │   │   ├── Glace_Bay
│   │   │       │   │   │   ├── Godthab
│   │   │       │   │   │   ├── Goose_Bay
│   │   │       │   │   │   ├── Grand_Turk
│   │   │       │   │   │   ├── Grenada
│   │   │       │   │   │   ├── Guadeloupe
│   │   │       │   │   │   ├── Guatemala
│   │   │       │   │   │   ├── Guayaquil
│   │   │       │   │   │   ├── Guyana
│   │   │       │   │   │   ├── Halifax
│   │   │       │   │   │   ├── Havana
│   │   │       │   │   │   ├── Hermosillo
│   │   │       │   │   │   ├── Indianapolis
│   │   │       │   │   │   ├── Inuvik
│   │   │       │   │   │   ├── Iqaluit
│   │   │       │   │   │   ├── Jamaica
│   │   │       │   │   │   ├── Jujuy
│   │   │       │   │   │   ├── Juneau
│   │   │       │   │   │   ├── Knox_IN
│   │   │       │   │   │   ├── Kralendijk
│   │   │       │   │   │   ├── La_Paz
│   │   │       │   │   │   ├── Lima
│   │   │       │   │   │   ├── Los_Angeles
│   │   │       │   │   │   ├── Louisville
│   │   │       │   │   │   ├── Lower_Princes
│   │   │       │   │   │   ├── Maceio
│   │   │       │   │   │   ├── Managua
│   │   │       │   │   │   ├── Manaus
│   │   │       │   │   │   ├── Marigot
│   │   │       │   │   │   ├── Martinique
│   │   │       │   │   │   ├── Matamoros
│   │   │       │   │   │   ├── Mazatlan
│   │   │       │   │   │   ├── Mendoza
│   │   │       │   │   │   ├── Menominee
│   │   │       │   │   │   ├── Merida
│   │   │       │   │   │   ├── Metlakatla
│   │   │       │   │   │   ├── Mexico_City
│   │   │       │   │   │   ├── Miquelon
│   │   │       │   │   │   ├── Moncton
│   │   │       │   │   │   ├── Monterrey
│   │   │       │   │   │   ├── Montevideo
│   │   │       │   │   │   ├── Montreal
│   │   │       │   │   │   ├── Montserrat
│   │   │       │   │   │   ├── Nassau
│   │   │       │   │   │   ├── New_York
│   │   │       │   │   │   ├── Nipigon
│   │   │       │   │   │   ├── Nome
│   │   │       │   │   │   ├── Noronha
│   │   │       │   │   │   ├── Nuuk
│   │   │       │   │   │   ├── Ojinaga
│   │   │       │   │   │   ├── Panama
│   │   │       │   │   │   ├── Pangnirtung
│   │   │       │   │   │   ├── Paramaribo
│   │   │       │   │   │   ├── Phoenix
│   │   │       │   │   │   ├── Port-au-Prince
│   │   │       │   │   │   ├── Port_of_Spain
│   │   │       │   │   │   ├── Porto_Acre
│   │   │       │   │   │   ├── Porto_Velho
│   │   │       │   │   │   ├── Puerto_Rico
│   │   │       │   │   │   ├── Punta_Arenas
│   │   │       │   │   │   ├── Rainy_River
│   │   │       │   │   │   ├── Rankin_Inlet
│   │   │       │   │   │   ├── Recife
│   │   │       │   │   │   ├── Regina
│   │   │       │   │   │   ├── Resolute
│   │   │       │   │   │   ├── Rio_Branco
│   │   │       │   │   │   ├── Rosario
│   │   │       │   │   │   ├── Santa_Isabel
│   │   │       │   │   │   ├── Santarem
│   │   │       │   │   │   ├── Santiago
│   │   │       │   │   │   ├── Santo_Domingo
│   │   │       │   │   │   ├── Sao_Paulo
│   │   │       │   │   │   ├── Scoresbysund
│   │   │       │   │   │   ├── Shiprock
│   │   │       │   │   │   ├── Sitka
│   │   │       │   │   │   ├── St_Barthelemy
│   │   │       │   │   │   ├── St_Johns
│   │   │       │   │   │   ├── St_Kitts
│   │   │       │   │   │   ├── St_Lucia
│   │   │       │   │   │   ├── St_Thomas
│   │   │       │   │   │   ├── St_Vincent
│   │   │       │   │   │   ├── Swift_Current
│   │   │       │   │   │   ├── Tegucigalpa
│   │   │       │   │   │   ├── Thule
│   │   │       │   │   │   ├── Thunder_Bay
│   │   │       │   │   │   ├── Tijuana
│   │   │       │   │   │   ├── Toronto
│   │   │       │   │   │   ├── Tortola
│   │   │       │   │   │   ├── Vancouver
│   │   │       │   │   │   ├── Virgin
│   │   │       │   │   │   ├── Whitehorse
│   │   │       │   │   │   ├── Winnipeg
│   │   │       │   │   │   ├── Yakutat
│   │   │       │   │   │   ├── Yellowknife
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── Antarctica/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── Casey
│   │   │       │   │   │   ├── Davis
│   │   │       │   │   │   ├── DumontDUrville
│   │   │       │   │   │   ├── Macquarie
│   │   │       │   │   │   ├── Mawson
│   │   │       │   │   │   ├── McMurdo
│   │   │       │   │   │   ├── Palmer
│   │   │       │   │   │   ├── Rothera
│   │   │       │   │   │   ├── South_Pole
│   │   │       │   │   │   ├── Syowa
│   │   │       │   │   │   ├── Troll
│   │   │       │   │   │   ├── Vostok
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── Arctic/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── Longyearbyen
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── Asia/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── Aden
│   │   │       │   │   │   ├── Almaty
│   │   │       │   │   │   ├── Amman
│   │   │       │   │   │   ├── Anadyr
│   │   │       │   │   │   ├── Aqtau
│   │   │       │   │   │   ├── Aqtobe
│   │   │       │   │   │   ├── Ashgabat
│   │   │       │   │   │   ├── Ashkhabad
│   │   │       │   │   │   ├── Atyrau
│   │   │       │   │   │   ├── Baghdad
│   │   │       │   │   │   ├── Bahrain
│   │   │       │   │   │   ├── Baku
│   │   │       │   │   │   ├── Bangkok
│   │   │       │   │   │   ├── Barnaul
│   │   │       │   │   │   ├── Beirut
│   │   │       │   │   │   ├── Bishkek
│   │   │       │   │   │   ├── Brunei
│   │   │       │   │   │   ├── Calcutta
│   │   │       │   │   │   ├── Chita
│   │   │       │   │   │   ├── Choibalsan
│   │   │       │   │   │   ├── Chongqing
│   │   │       │   │   │   ├── Chungking
│   │   │       │   │   │   ├── Colombo
│   │   │       │   │   │   ├── Dacca
│   │   │       │   │   │   ├── Damascus
│   │   │       │   │   │   ├── Dhaka
│   │   │       │   │   │   ├── Dili
│   │   │       │   │   │   ├── Dubai
│   │   │       │   │   │   ├── Dushanbe
│   │   │       │   │   │   ├── Famagusta
│   │   │       │   │   │   ├── Gaza
│   │   │       │   │   │   ├── Harbin
│   │   │       │   │   │   ├── Hebron
│   │   │       │   │   │   ├── Ho_Chi_Minh
│   │   │       │   │   │   ├── Hong_Kong
│   │   │       │   │   │   ├── Hovd
│   │   │       │   │   │   ├── Irkutsk
│   │   │       │   │   │   ├── Istanbul
│   │   │       │   │   │   ├── Jakarta
│   │   │       │   │   │   ├── Jayapura
│   │   │       │   │   │   ├── Jerusalem
│   │   │       │   │   │   ├── Kabul
│   │   │       │   │   │   ├── Kamchatka
│   │   │       │   │   │   ├── Karachi
│   │   │       │   │   │   ├── Kashgar
│   │   │       │   │   │   ├── Kathmandu
│   │   │       │   │   │   ├── Katmandu
│   │   │       │   │   │   ├── Khandyga
│   │   │       │   │   │   ├── Kolkata
│   │   │       │   │   │   ├── Krasnoyarsk
│   │   │       │   │   │   ├── Kuala_Lumpur
│   │   │       │   │   │   ├── Kuching
│   │   │       │   │   │   ├── Kuwait
│   │   │       │   │   │   ├── Macao
│   │   │       │   │   │   ├── Macau
│   │   │       │   │   │   ├── Magadan
│   │   │       │   │   │   ├── Makassar
│   │   │       │   │   │   ├── Manila
│   │   │       │   │   │   ├── Muscat
│   │   │       │   │   │   ├── Nicosia
│   │   │       │   │   │   ├── Novokuznetsk
│   │   │       │   │   │   ├── Novosibirsk
│   │   │       │   │   │   ├── Omsk
│   │   │       │   │   │   ├── Oral
│   │   │       │   │   │   ├── Phnom_Penh
│   │   │       │   │   │   ├── Pontianak
│   │   │       │   │   │   ├── Pyongyang
│   │   │       │   │   │   ├── Qatar
│   │   │       │   │   │   ├── Qostanay
│   │   │       │   │   │   ├── Qyzylorda
│   │   │       │   │   │   ├── Rangoon
│   │   │       │   │   │   ├── Riyadh
│   │   │       │   │   │   ├── Saigon
│   │   │       │   │   │   ├── Sakhalin
│   │   │       │   │   │   ├── Samarkand
│   │   │       │   │   │   ├── Seoul
│   │   │       │   │   │   ├── Shanghai
│   │   │       │   │   │   ├── Singapore
│   │   │       │   │   │   ├── Srednekolymsk
│   │   │       │   │   │   ├── Taipei
│   │   │       │   │   │   ├── Tashkent
│   │   │       │   │   │   ├── Tbilisi
│   │   │       │   │   │   ├── Tehran
│   │   │       │   │   │   ├── Tel_Aviv
│   │   │       │   │   │   ├── Thimbu
│   │   │       │   │   │   ├── Thimphu
│   │   │       │   │   │   ├── Tokyo
│   │   │       │   │   │   ├── Tomsk
│   │   │       │   │   │   ├── Ujung_Pandang
│   │   │       │   │   │   ├── Ulaanbaatar
│   │   │       │   │   │   ├── Ulan_Bator
│   │   │       │   │   │   ├── Urumqi
│   │   │       │   │   │   ├── Ust-Nera
│   │   │       │   │   │   ├── Vientiane
│   │   │       │   │   │   ├── Vladivostok
│   │   │       │   │   │   ├── Yakutsk
│   │   │       │   │   │   ├── Yangon
│   │   │       │   │   │   ├── Yekaterinburg
│   │   │       │   │   │   ├── Yerevan
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── Atlantic/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── Azores
│   │   │       │   │   │   ├── Bermuda
│   │   │       │   │   │   ├── Canary
│   │   │       │   │   │   ├── Cape_Verde
│   │   │       │   │   │   ├── Faeroe
│   │   │       │   │   │   ├── Faroe
│   │   │       │   │   │   ├── Jan_Mayen
│   │   │       │   │   │   ├── Madeira
│   │   │       │   │   │   ├── Reykjavik
│   │   │       │   │   │   ├── South_Georgia
│   │   │       │   │   │   ├── St_Helena
│   │   │       │   │   │   ├── Stanley
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── Australia/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── ACT
│   │   │       │   │   │   ├── Adelaide
│   │   │       │   │   │   ├── Brisbane
│   │   │       │   │   │   ├── Broken_Hill
│   │   │       │   │   │   ├── Canberra
│   │   │       │   │   │   ├── Currie
│   │   │       │   │   │   ├── Darwin
│   │   │       │   │   │   ├── Eucla
│   │   │       │   │   │   ├── Hobart
│   │   │       │   │   │   ├── LHI
│   │   │       │   │   │   ├── Lindeman
│   │   │       │   │   │   ├── Lord_Howe
│   │   │       │   │   │   ├── Melbourne
│   │   │       │   │   │   ├── NSW
│   │   │       │   │   │   ├── North
│   │   │       │   │   │   ├── Perth
│   │   │       │   │   │   ├── Queensland
│   │   │       │   │   │   ├── South
│   │   │       │   │   │   ├── Sydney
│   │   │       │   │   │   ├── Tasmania
│   │   │       │   │   │   ├── Victoria
│   │   │       │   │   │   ├── West
│   │   │       │   │   │   ├── Yancowinna
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── Brazil/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── Acre
│   │   │       │   │   │   ├── DeNoronha
│   │   │       │   │   │   ├── East
│   │   │       │   │   │   ├── West
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── Canada/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── Atlantic
│   │   │       │   │   │   ├── Central
│   │   │       │   │   │   ├── Eastern
│   │   │       │   │   │   ├── Mountain
│   │   │       │   │   │   ├── Newfoundland
│   │   │       │   │   │   ├── Pacific
│   │   │       │   │   │   ├── Saskatchewan
│   │   │       │   │   │   ├── Yukon
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── Chile/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── Continental
│   │   │       │   │   │   ├── EasterIsland
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── Etc/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── GMT
│   │   │       │   │   │   ├── GMT+0
│   │   │       │   │   │   ├── GMT+1
│   │   │       │   │   │   ├── GMT+10
│   │   │       │   │   │   ├── GMT+11
│   │   │       │   │   │   ├── GMT+12
│   │   │       │   │   │   ├── GMT+2
│   │   │       │   │   │   ├── GMT+3
│   │   │       │   │   │   ├── GMT+4
│   │   │       │   │   │   ├── GMT+5
│   │   │       │   │   │   ├── GMT+6
│   │   │       │   │   │   ├── GMT+7
│   │   │       │   │   │   ├── GMT+8
│   │   │       │   │   │   ├── GMT+9
│   │   │       │   │   │   ├── GMT-0
│   │   │       │   │   │   ├── GMT-1
│   │   │       │   │   │   ├── GMT-10
│   │   │       │   │   │   ├── GMT-11
│   │   │       │   │   │   ├── GMT-12
│   │   │       │   │   │   ├── GMT-13
│   │   │       │   │   │   ├── GMT-14
│   │   │       │   │   │   ├── GMT-2
│   │   │       │   │   │   ├── GMT-3
│   │   │       │   │   │   ├── GMT-4
│   │   │       │   │   │   ├── GMT-5
│   │   │       │   │   │   ├── GMT-6
│   │   │       │   │   │   ├── GMT-7
│   │   │       │   │   │   ├── GMT-8
│   │   │       │   │   │   ├── GMT-9
│   │   │       │   │   │   ├── GMT0
│   │   │       │   │   │   ├── Greenwich
│   │   │       │   │   │   ├── UCT
│   │   │       │   │   │   ├── UTC
│   │   │       │   │   │   ├── Universal
│   │   │       │   │   │   ├── Zulu
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── Europe/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── Amsterdam
│   │   │       │   │   │   ├── Andorra
│   │   │       │   │   │   ├── Astrakhan
│   │   │       │   │   │   ├── Athens
│   │   │       │   │   │   ├── Belfast
│   │   │       │   │   │   ├── Belgrade
│   │   │       │   │   │   ├── Berlin
│   │   │       │   │   │   ├── Bratislava
│   │   │       │   │   │   ├── Brussels
│   │   │       │   │   │   ├── Bucharest
│   │   │       │   │   │   ├── Budapest
│   │   │       │   │   │   ├── Busingen
│   │   │       │   │   │   ├── Chisinau
│   │   │       │   │   │   ├── Copenhagen
│   │   │       │   │   │   ├── Dublin
│   │   │       │   │   │   ├── Gibraltar
│   │   │       │   │   │   ├── Guernsey
│   │   │       │   │   │   ├── Helsinki
│   │   │       │   │   │   ├── Isle_of_Man
│   │   │       │   │   │   ├── Istanbul
│   │   │       │   │   │   ├── Jersey
│   │   │       │   │   │   ├── Kaliningrad
│   │   │       │   │   │   ├── Kiev
│   │   │       │   │   │   ├── Kirov
│   │   │       │   │   │   ├── Kyiv
│   │   │       │   │   │   ├── Lisbon
│   │   │       │   │   │   ├── Ljubljana
│   │   │       │   │   │   ├── London
│   │   │       │   │   │   ├── Luxembourg
│   │   │       │   │   │   ├── Madrid
│   │   │       │   │   │   ├── Malta
│   │   │       │   │   │   ├── Mariehamn
│   │   │       │   │   │   ├── Minsk
│   │   │       │   │   │   ├── Monaco
│   │   │       │   │   │   ├── Moscow
│   │   │       │   │   │   ├── Nicosia
│   │   │       │   │   │   ├── Oslo
│   │   │       │   │   │   ├── Paris
│   │   │       │   │   │   ├── Podgorica
│   │   │       │   │   │   ├── Prague
│   │   │       │   │   │   ├── Riga
│   │   │       │   │   │   ├── Rome
│   │   │       │   │   │   ├── Samara
│   │   │       │   │   │   ├── San_Marino
│   │   │       │   │   │   ├── Sarajevo
│   │   │       │   │   │   ├── Saratov
│   │   │       │   │   │   ├── Simferopol
│   │   │       │   │   │   ├── Skopje
│   │   │       │   │   │   ├── Sofia
│   │   │       │   │   │   ├── Stockholm
│   │   │       │   │   │   ├── Tallinn
│   │   │       │   │   │   ├── Tirane
│   │   │       │   │   │   ├── Tiraspol
│   │   │       │   │   │   ├── Ulyanovsk
│   │   │       │   │   │   ├── Uzhgorod
│   │   │       │   │   │   ├── Vaduz
│   │   │       │   │   │   ├── Vatican
│   │   │       │   │   │   ├── Vienna
│   │   │       │   │   │   ├── Vilnius
│   │   │       │   │   │   ├── Volgograd
│   │   │       │   │   │   ├── Warsaw
│   │   │       │   │   │   ├── Zagreb
│   │   │       │   │   │   ├── Zaporozhye
│   │   │       │   │   │   ├── Zurich
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── Indian/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── Antananarivo
│   │   │       │   │   │   ├── Chagos
│   │   │       │   │   │   ├── Christmas
│   │   │       │   │   │   ├── Cocos
│   │   │       │   │   │   ├── Comoro
│   │   │       │   │   │   ├── Kerguelen
│   │   │       │   │   │   ├── Mahe
│   │   │       │   │   │   ├── Maldives
│   │   │       │   │   │   ├── Mauritius
│   │   │       │   │   │   ├── Mayotte
│   │   │       │   │   │   ├── Reunion
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── Mexico/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── BajaNorte
│   │   │       │   │   │   ├── BajaSur
│   │   │       │   │   │   ├── General
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── Pacific/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── Apia
│   │   │       │   │   │   ├── Auckland
│   │   │       │   │   │   ├── Bougainville
│   │   │       │   │   │   ├── Chatham
│   │   │       │   │   │   ├── Chuuk
│   │   │       │   │   │   ├── Easter
│   │   │       │   │   │   ├── Efate
│   │   │       │   │   │   ├── Enderbury
│   │   │       │   │   │   ├── Fakaofo
│   │   │       │   │   │   ├── Fiji
│   │   │       │   │   │   ├── Funafuti
│   │   │       │   │   │   ├── Galapagos
│   │   │       │   │   │   ├── Gambier
│   │   │       │   │   │   ├── Guadalcanal
│   │   │       │   │   │   ├── Guam
│   │   │       │   │   │   ├── Honolulu
│   │   │       │   │   │   ├── Johnston
│   │   │       │   │   │   ├── Kanton
│   │   │       │   │   │   ├── Kiritimati
│   │   │       │   │   │   ├── Kosrae
│   │   │       │   │   │   ├── Kwajalein
│   │   │       │   │   │   ├── Majuro
│   │   │       │   │   │   ├── Marquesas
│   │   │       │   │   │   ├── Midway
│   │   │       │   │   │   ├── Nauru
│   │   │       │   │   │   ├── Niue
│   │   │       │   │   │   ├── Norfolk
│   │   │       │   │   │   ├── Noumea
│   │   │       │   │   │   ├── Pago_Pago
│   │   │       │   │   │   ├── Palau
│   │   │       │   │   │   ├── Pitcairn
│   │   │       │   │   │   ├── Pohnpei
│   │   │       │   │   │   ├── Ponape
│   │   │       │   │   │   ├── Port_Moresby
│   │   │       │   │   │   ├── Rarotonga
│   │   │       │   │   │   ├── Saipan
│   │   │       │   │   │   ├── Samoa
│   │   │       │   │   │   ├── Tahiti
│   │   │       │   │   │   ├── Tarawa
│   │   │       │   │   │   ├── Tongatapu
│   │   │       │   │   │   ├── Truk
│   │   │       │   │   │   ├── Wake
│   │   │       │   │   │   ├── Wallis
│   │   │       │   │   │   ├── Yap
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── US/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── Alaska
│   │   │       │   │   │   ├── Aleutian
│   │   │       │   │   │   ├── Arizona
│   │   │       │   │   │   ├── Central
│   │   │       │   │   │   ├── East-Indiana
│   │   │       │   │   │   ├── Eastern
│   │   │       │   │   │   ├── Hawaii
│   │   │       │   │   │   ├── Indiana-Starke
│   │   │       │   │   │   ├── Michigan
│   │   │       │   │   │   ├── Mountain
│   │   │       │   │   │   ├── Pacific
│   │   │       │   │   │   ├── Samoa
│   │   │       │   │   │   └── __init__.py
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   ├── CET
│   │   │       │   │   ├── CST6CDT
│   │   │       │   │   ├── Cuba
│   │   │       │   │   ├── EET
│   │   │       │   │   ├── EST
│   │   │       │   │   ├── EST5EDT
│   │   │       │   │   ├── Egypt
│   │   │       │   │   ├── Eire
│   │   │       │   │   ├── Factory
│   │   │       │   │   ├── GB
│   │   │       │   │   ├── GB-Eire
│   │   │       │   │   ├── GMT
│   │   │       │   │   ├── GMT+0
│   │   │       │   │   ├── GMT-0
│   │   │       │   │   ├── GMT0
│   │   │       │   │   ├── Greenwich
│   │   │       │   │   ├── HST
│   │   │       │   │   ├── Hongkong
│   │   │       │   │   ├── Iceland
│   │   │       │   │   ├── Iran
│   │   │       │   │   ├── Israel
│   │   │       │   │   ├── Jamaica
│   │   │       │   │   ├── Japan
│   │   │       │   │   ├── Kwajalein
│   │   │       │   │   ├── Libya
│   │   │       │   │   ├── MET
│   │   │       │   │   ├── MST
│   │   │       │   │   ├── MST7MDT
│   │   │       │   │   ├── NZ
│   │   │       │   │   ├── NZ-CHAT
│   │   │       │   │   ├── Navajo
│   │   │       │   │   ├── PRC
│   │   │       │   │   ├── PST8PDT
│   │   │       │   │   ├── Poland
│   │   │       │   │   ├── Portugal
│   │   │       │   │   ├── ROC
│   │   │       │   │   ├── ROK
│   │   │       │   │   ├── Singapore
│   │   │       │   │   ├── Turkey
│   │   │       │   │   ├── UCT
│   │   │       │   │   ├── UTC
│   │   │       │   │   ├── Universal
│   │   │       │   │   ├── W-SU
│   │   │       │   │   ├── WET
│   │   │       │   │   ├── Zulu
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── iso3166.tab
│   │   │       │   │   ├── leapseconds
│   │   │       │   │   ├── tzdata.zi
│   │   │       │   │   ├── zone.tab
│   │   │       │   │   ├── zone1970.tab
│   │   │       │   │   └── zonenow.tab
│   │   │       │   ├── __init__.py
│   │   │       │   └── zones
│   │   │       ├── tzdata-2025.3.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   ├── licenses/
│   │   │       │   │   │   └── LICENSE_APACHE
│   │   │       │   │   └── LICENSE
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── WHEEL
│   │   │       │   └── top_level.txt
│   │   │       ├── uvicorn/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   ├── _subprocess.cpython-312.pyc
│   │   │       │   │   ├── _types.cpython-312.pyc
│   │   │       │   │   ├── config.cpython-312.pyc
│   │   │       │   │   ├── importer.cpython-312.pyc
│   │   │       │   │   ├── logging.cpython-312.pyc
│   │   │       │   │   ├── main.cpython-312.pyc
│   │   │       │   │   ├── server.cpython-312.pyc
│   │   │       │   │   └── workers.cpython-312.pyc
│   │   │       │   ├── lifespan/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── off.cpython-312.pyc
│   │   │       │   │   │   └── on.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── off.py
│   │   │       │   │   └── on.py
│   │   │       │   ├── loops/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── asyncio.cpython-312.pyc
│   │   │       │   │   │   ├── auto.cpython-312.pyc
│   │   │       │   │   │   └── uvloop.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── asyncio.py
│   │   │       │   │   ├── auto.py
│   │   │       │   │   └── uvloop.py
│   │   │       │   ├── middleware/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── asgi2.cpython-312.pyc
│   │   │       │   │   │   ├── message_logger.cpython-312.pyc
│   │   │       │   │   │   ├── proxy_headers.cpython-312.pyc
│   │   │       │   │   │   └── wsgi.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── asgi2.py
│   │   │       │   │   ├── message_logger.py
│   │   │       │   │   ├── proxy_headers.py
│   │   │       │   │   └── wsgi.py
│   │   │       │   ├── protocols/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   └── utils.cpython-312.pyc
│   │   │       │   │   ├── http/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── auto.cpython-312.pyc
│   │   │       │   │   │   │   ├── flow_control.cpython-312.pyc
│   │   │       │   │   │   │   ├── h11_impl.cpython-312.pyc
│   │   │       │   │   │   │   └── httptools_impl.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── auto.py
│   │   │       │   │   │   ├── flow_control.py
│   │   │       │   │   │   ├── h11_impl.py
│   │   │       │   │   │   └── httptools_impl.py
│   │   │       │   │   ├── websockets/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── auto.cpython-312.pyc
│   │   │       │   │   │   │   ├── websockets_impl.cpython-312.pyc
│   │   │       │   │   │   │   └── wsproto_impl.cpython-312.pyc
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── auto.py
│   │   │       │   │   │   ├── websockets_impl.py
│   │   │       │   │   │   └── wsproto_impl.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   └── utils.py
│   │   │       │   ├── supervisors/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── basereload.cpython-312.pyc
│   │   │       │   │   │   ├── multiprocess.cpython-312.pyc
│   │   │       │   │   │   ├── statreload.cpython-312.pyc
│   │   │       │   │   │   ├── watchfilesreload.cpython-312.pyc
│   │   │       │   │   │   └── watchgodreload.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── basereload.py
│   │   │       │   │   ├── multiprocess.py
│   │   │       │   │   ├── statreload.py
│   │   │       │   │   ├── watchfilesreload.py
│   │   │       │   │   └── watchgodreload.py
│   │   │       │   ├── __init__.py
│   │   │       │   ├── __main__.py
│   │   │       │   ├── _subprocess.py
│   │   │       │   ├── _types.py
│   │   │       │   ├── config.py
│   │   │       │   ├── importer.py
│   │   │       │   ├── logging.py
│   │   │       │   ├── main.py
│   │   │       │   ├── py.typed
│   │   │       │   ├── server.py
│   │   │       │   └── workers.py
│   │   │       ├── uvicorn-0.29.0.dist-info/
│   │   │       │   ├── licenses/
│   │   │       │   │   └── LICENSE.md
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── REQUESTED
│   │   │       │   ├── WHEEL
│   │   │       │   └── entry_points.txt
│   │   │       ├── wheel/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── __main__.cpython-312.pyc
│   │   │       │   │   ├── _bdist_wheel.cpython-312.pyc
│   │   │       │   │   ├── _setuptools_logging.cpython-312.pyc
│   │   │       │   │   ├── bdist_wheel.cpython-312.pyc
│   │   │       │   │   ├── macosx_libfile.cpython-312.pyc
│   │   │       │   │   ├── metadata.cpython-312.pyc
│   │   │       │   │   ├── util.cpython-312.pyc
│   │   │       │   │   └── wheelfile.cpython-312.pyc
│   │   │       │   ├── cli/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── convert.cpython-312.pyc
│   │   │       │   │   │   ├── pack.cpython-312.pyc
│   │   │       │   │   │   ├── tags.cpython-312.pyc
│   │   │       │   │   │   └── unpack.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── convert.py
│   │   │       │   │   ├── pack.py
│   │   │       │   │   ├── tags.py
│   │   │       │   │   └── unpack.py
│   │   │       │   ├── vendored/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   └── __init__.cpython-312.pyc
│   │   │       │   │   ├── packaging/
│   │   │       │   │   │   ├── __pycache__/
│   │   │       │   │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   │   ├── _elffile.cpython-312.pyc
│   │   │       │   │   │   │   ├── _manylinux.cpython-312.pyc
│   │   │       │   │   │   │   ├── _musllinux.cpython-312.pyc
│   │   │       │   │   │   │   ├── _parser.cpython-312.pyc
│   │   │       │   │   │   │   ├── _structures.cpython-312.pyc
│   │   │       │   │   │   │   ├── _tokenizer.cpython-312.pyc
│   │   │       │   │   │   │   ├── markers.cpython-312.pyc
│   │   │       │   │   │   │   ├── requirements.cpython-312.pyc
│   │   │       │   │   │   │   ├── specifiers.cpython-312.pyc
│   │   │       │   │   │   │   ├── tags.cpython-312.pyc
│   │   │       │   │   │   │   ├── utils.cpython-312.pyc
│   │   │       │   │   │   │   └── version.cpython-312.pyc
│   │   │       │   │   │   ├── LICENSE
│   │   │       │   │   │   ├── LICENSE.APACHE
│   │   │       │   │   │   ├── LICENSE.BSD
│   │   │       │   │   │   ├── __init__.py
│   │   │       │   │   │   ├── _elffile.py
│   │   │       │   │   │   ├── _manylinux.py
│   │   │       │   │   │   ├── _musllinux.py
│   │   │       │   │   │   ├── _parser.py
│   │   │       │   │   │   ├── _structures.py
│   │   │       │   │   │   ├── _tokenizer.py
│   │   │       │   │   │   ├── markers.py
│   │   │       │   │   │   ├── requirements.py
│   │   │       │   │   │   ├── specifiers.py
│   │   │       │   │   │   ├── tags.py
│   │   │       │   │   │   ├── utils.py
│   │   │       │   │   │   └── version.py
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   └── vendor.txt
│   │   │       │   ├── __init__.py
│   │   │       │   ├── __main__.py
│   │   │       │   ├── _bdist_wheel.py
│   │   │       │   ├── _setuptools_logging.py
│   │   │       │   ├── bdist_wheel.py
│   │   │       │   ├── macosx_libfile.py
│   │   │       │   ├── metadata.py
│   │   │       │   ├── util.py
│   │   │       │   └── wheelfile.py
│   │   │       ├── wheel-0.45.1.dist-info/
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── LICENSE.txt
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── REQUESTED
│   │   │       │   ├── WHEEL
│   │   │       │   └── entry_points.txt
│   │   │       ├── xgboost/
│   │   │       │   ├── __pycache__/
│   │   │       │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   ├── _data_utils.cpython-312.pyc
│   │   │       │   │   ├── _typing.cpython-312.pyc
│   │   │       │   │   ├── callback.cpython-312.pyc
│   │   │       │   │   ├── collective.cpython-312.pyc
│   │   │       │   │   ├── compat.cpython-312.pyc
│   │   │       │   │   ├── config.cpython-312.pyc
│   │   │       │   │   ├── core.cpython-312.pyc
│   │   │       │   │   ├── data.cpython-312.pyc
│   │   │       │   │   ├── federated.cpython-312.pyc
│   │   │       │   │   ├── libpath.cpython-312.pyc
│   │   │       │   │   ├── plotting.cpython-312.pyc
│   │   │       │   │   ├── sklearn.cpython-312.pyc
│   │   │       │   │   ├── tracker.cpython-312.pyc
│   │   │       │   │   └── training.cpython-312.pyc
│   │   │       │   ├── dask/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── data.cpython-312.pyc
│   │   │       │   │   │   └── utils.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── data.py
│   │   │       │   │   └── utils.py
│   │   │       │   ├── lib/
│   │   │       │   │   └── xgboost.dll
│   │   │       │   ├── spark/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── core.cpython-312.pyc
│   │   │       │   │   │   ├── data.cpython-312.pyc
│   │   │       │   │   │   ├── estimator.cpython-312.pyc
│   │   │       │   │   │   ├── params.cpython-312.pyc
│   │   │       │   │   │   ├── summary.cpython-312.pyc
│   │   │       │   │   │   └── utils.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── core.py
│   │   │       │   │   ├── data.py
│   │   │       │   │   ├── estimator.py
│   │   │       │   │   ├── params.py
│   │   │       │   │   ├── summary.py
│   │   │       │   │   └── utils.py
│   │   │       │   ├── testing/
│   │   │       │   │   ├── __pycache__/
│   │   │       │   │   │   ├── __init__.cpython-312.pyc
│   │   │       │   │   │   ├── basic_models.cpython-312.pyc
│   │   │       │   │   │   ├── callbacks.cpython-312.pyc
│   │   │       │   │   │   ├── collective.cpython-312.pyc
│   │   │       │   │   │   ├── continuation.cpython-312.pyc
│   │   │       │   │   │   ├── dask.cpython-312.pyc
│   │   │       │   │   │   ├── data.cpython-312.pyc
│   │   │       │   │   │   ├── data_iter.cpython-312.pyc
│   │   │       │   │   │   ├── federated.cpython-312.pyc
│   │   │       │   │   │   ├── interaction_constraints.cpython-312.pyc
│   │   │       │   │   │   ├── metrics.cpython-312.pyc
│   │   │       │   │   │   ├── monotone_constraints.cpython-312.pyc
│   │   │       │   │   │   ├── ordinal.cpython-312.pyc
│   │   │       │   │   │   ├── params.cpython-312.pyc
│   │   │       │   │   │   ├── parse_tree.cpython-312.pyc
│   │   │       │   │   │   ├── plotting.cpython-312.pyc
│   │   │       │   │   │   ├── predict.cpython-312.pyc
│   │   │       │   │   │   ├── quantile_dmatrix.cpython-312.pyc
│   │   │       │   │   │   ├── ranking.cpython-312.pyc
│   │   │       │   │   │   ├── shared.cpython-312.pyc
│   │   │       │   │   │   ├── updater.cpython-312.pyc
│   │   │       │   │   │   ├── utils.cpython-312.pyc
│   │   │       │   │   │   └── with_skl.cpython-312.pyc
│   │   │       │   │   ├── __init__.py
│   │   │       │   │   ├── basic_models.py
│   │   │       │   │   ├── callbacks.py
│   │   │       │   │   ├── collective.py
│   │   │       │   │   ├── continuation.py
│   │   │       │   │   ├── dask.py
│   │   │       │   │   ├── data.py
│   │   │       │   │   ├── data_iter.py
│   │   │       │   │   ├── federated.py
│   │   │       │   │   ├── interaction_constraints.py
│   │   │       │   │   ├── metrics.py
│   │   │       │   │   ├── monotone_constraints.py
│   │   │       │   │   ├── ordinal.py
│   │   │       │   │   ├── params.py
│   │   │       │   │   ├── parse_tree.py
│   │   │       │   │   ├── plotting.py
│   │   │       │   │   ├── predict.py
│   │   │       │   │   ├── quantile_dmatrix.py
│   │   │       │   │   ├── ranking.py
│   │   │       │   │   ├── shared.py
│   │   │       │   │   ├── updater.py
│   │   │       │   │   ├── utils.py
│   │   │       │   │   └── with_skl.py
│   │   │       │   ├── VERSION
│   │   │       │   ├── __init__.py
│   │   │       │   ├── _data_utils.py
│   │   │       │   ├── _typing.py
│   │   │       │   ├── callback.py
│   │   │       │   ├── collective.py
│   │   │       │   ├── compat.py
│   │   │       │   ├── config.py
│   │   │       │   ├── core.py
│   │   │       │   ├── data.py
│   │   │       │   ├── federated.py
│   │   │       │   ├── libpath.py
│   │   │       │   ├── plotting.py
│   │   │       │   ├── py.typed
│   │   │       │   ├── sklearn.py
│   │   │       │   ├── tracker.py
│   │   │       │   └── training.py
│   │   │       ├── xgboost-3.1.2.dist-info/
│   │   │       │   ├── INSTALLER
│   │   │       │   ├── METADATA
│   │   │       │   ├── RECORD
│   │   │       │   ├── REQUESTED
│   │   │       │   └── WHEEL
│   │   │       ├── distutils-precedence.pth
│   │   │       ├── numpy-2.0.2-cp312-cp312-win_amd64.whl
│   │   │       ├── pylab.py
│   │   │       ├── scipy-1.16.3-cp312-cp312-win_amd64.whl
│   │   │       ├── six.py
│   │   │       ├── threadpoolctl.py
│   │   │       └── typing_extensions.py
│   │   ├── Scripts/
│   │   │   ├── Activate.ps1
│   │   │   ├── activate
│   │   │   ├── activate.bat
│   │   │   ├── deactivate.bat
│   │   │   ├── f2py.exe
│   │   │   ├── fonttools.exe
│   │   │   ├── numpy-config.exe
│   │   │   ├── pip.exe
│   │   │   ├── pip3.12.exe
│   │   │   ├── pip3.exe
│   │   │   ├── pyftmerge.exe
│   │   │   ├── pyftsubset.exe
│   │   │   ├── python.exe
│   │   │   ├── pythonw.exe
│   │   │   ├── ttx.exe
│   │   │   ├── uvicorn.exe
│   │   │   └── wheel.exe
│   │   ├── share/
│   │   │   ├── man/
│   │   │       ├── man1/
│   │   │           └── ttx.1
│   │   └── pyvenv.cfg
│   ├── Dockerfile
│   ├── README.md
│   └── requirements.txt
├── README.md
└── docker-compose.yml

```

## Functionalities
- Predict - Tells if a flight is gonna be on time or delayed.
- Statistics - Show how many predictions were made, and how much were delayed or on time.
- Airlines - Show the Airline with most prediction flights on time or delayed, by year or from all time.
- Routes - Bring the route with most delayed or on time predictions. 

### Requirements for running
- Docker 29.1.2 or +.
### Requirements for developing
- Java 21 or +;
- Python 3.12.10 or +;
- Maven;

## How to use:
- Open the terminal on the root of the project
- Enter the command: ```docker-compose up --build```
- Open your browser and type ```http://localhost:8080/swagger-ui.html```

## Technologies
- Backend: Spring Boot 4, fastAPI
- Language: Java 21
- Database: MySQL 8+
- Documentation: SpringDoc
- Tests: JUnit 5, Mockito
- Versioning: Git, GitHub
- Build: Maven
