import ExpandMoreIcon from "@mui/icons-material/ExpandMore";
import Accordion from "@mui/material/Accordion";
import AccordionDetails from "@mui/material/AccordionDetails";
import AccordionSummary from "@mui/material/AccordionSummary";
import * as React from "react";
import "../css/Engines.css";

export default function Engines() {
  return (
    <div>
      <Accordion className="accordion-main">
        <AccordionSummary
          expandIcon={<ExpandMoreIcon />}
          aria-controls="panel1-content"
          id="panel1-header"
          className="heading"
        >
          Just in Time compilation
        </AccordionSummary>
        <AccordionDetails>
          <strong>
            Now the question arises if javascript is actually an interpreted
            language or a compiled language
          </strong>{" "}
          <br />
          <br />
          Well from what I have learned it is kind of both because it will first
          interpret it line by line and while it is getting interpreted line by
          line and generated into byte code before execution the compiler also
          keeps talking to it and tries to optimize the code as much as
          possible.
          <br />
          <br />
          It is a combination of both interpreter and compiler so it will first
          interpret the code line by line and then it will compile the code and
          then it will execute the code so it is a combination of both
          interpreter and compiler
        </AccordionDetails>
      </Accordion>

      <Accordion className="accordion-main">
        <AccordionSummary
          expandIcon={<ExpandMoreIcon />}
          aria-controls="panel2-content"
          id="panel2-header"
          className="heading"
        >
          Ahead of time compilation
        </AccordionSummary>
        <AccordionDetails>
          <strong>
            It is a compilation process where the code is compiled before the
            execution of the code so it is a compilation process that happens
            before the execution of the code
          </strong>{" "}
          <br />
          <br />
          We have stuffs like `inlining`, `copy elision`, `dead code
          elimination` and so on. So these are the things that are happening
          inside the compilation phase and then we will be getting the optimized
          code and then we will be executing the code and then we will be
          getting the output of the code that we have written.
        </AccordionDetails>
      </Accordion>
    </div>
  );
}
