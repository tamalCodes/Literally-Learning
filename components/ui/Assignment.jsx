const Assignment = ({ isQuestion, details }) => {
  //The solution would be to replace the `+` with `*` in the line `totalCost := costPerMessage + numMessages` and you're done.
  // replace `+` with <code>+</code>
  // replace `*` with <code>*</code>
  // replace `totalCost := costPerMessage + numMessages` with <code>totalCost := costPerMessage + numMessages</code>
  // Final rendered output:
  // The solution would be to replace the <code>+</code> with <code>*</code> in the line <code>totalCost := costPerMessage + numMessages</code> and you're done.

  // There can be anything between the backticks, including backticks themselves, as long as it's not the same number of backticks you're using to wrap the string.

  function replaceAll(str, find, replace) {
    return str.replace(new RegExp(find, "g"), replace);
  }

  const regex = /`([^`]+)`/g;
  const matches = details.match(regex);
  if (matches) {
    matches.forEach((match) => {
      const newMatch = replaceAll(match, "`", "");
      details = details.replace(
        match,
        `<code class="language-unknown">${newMatch}</code>`
      );
    });
  }

  return (
    <>
      {isQuestion ? (
        <div className="question">
          <p
            dangerouslySetInnerHTML={{ __html: details }}
            className="bg-purple-900 px-3 py-1 rounded-[4px]"
          ></p>
        </div>
      ) : (
        <div className="answer">
          <p
            dangerouslySetInnerHTML={{ __html: details }}
            className="bg-green-900 px-3 py-1  rounded-[4px]"
          ></p>
        </div>
      )}
    </>
  );
};

export default Assignment;
